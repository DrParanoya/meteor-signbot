package me.mrrogersog.signbot.modules;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class SignBotModule extends Module {
    private final List<BlockPos> signQueue = new ArrayList<>();

    public SignBotModule() {
        super(Category.Misc, "SignBot", "Scans signs and sends Baritone #goto commands.");
    }

    @Override
    public void onActivate() {
        scanSigns();
        ChatUtils.info("[SignBot] Scanned and queued valid signs.");
    }

    @EventHandler
    private void onTick(TickEvent.Post event) {
        // Optional: Add logic here to auto-dispatch Baritone commands for queued signs, if desired.
    }

    private void scanSigns() {
        if (mc.world == null || mc.player == null) return;

        signQueue.clear();
        int total = 0, ignored = 0, blank = 0, valid = 0;

        for (BlockEntity entity : mc.world.blockEntities) {
            if (entity instanceof SignBlockEntity sign) {
                total++;
                String line1 = sign.getTextOnRow(0, false).getString().trim();
                String line2 = sign.getTextOnRow(1, false).getString().trim();
                String line3 = sign.getTextOnRow(2, false).getString().trim();
                String line4 = sign.getTextOnRow(3, false).getString().trim();

                boolean isBlank = line1.isEmpty() && line2.isEmpty() && line3.isEmpty() && line4.isEmpty();
                boolean isCody = line1.equals("codysmile11") && line2.startsWith("was here:)");

                BlockPos pos = sign.getPos();

                if (isBlank) {
                    blank++;
                } else if (isCody) {
                    ignored++;
                } else {
                    valid++;
                    signQueue.add(pos);
                }
            }
        }

        // Summary in chat
        ChatUtils.info("[SignBot] Scan complete: " + total + " signs detected");
        ChatUtils.info("[SignBot] " + ignored + " codysmile11 signs ignored 😎");
        ChatUtils.info("[SignBot] " + blank + " blank signs skipped");
        ChatUtils.info("[SignBot] " + valid + " valid signs added to queue");
        ChatUtils.info("[SignBot] Finished scan ✅");
    }

    // ToDo: Add a method to dispatch Baritone commands for the next sign using Meteor or Baritone API.
}