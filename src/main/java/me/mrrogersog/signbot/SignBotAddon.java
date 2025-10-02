package me.mrrogersog.signbot;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import me.mrrogersog.signbot.modules.SignBotModule;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class SignBotAddon extends MeteorAddon {
    @Override
    public void onInitialize() {
        Modules.get().add(new SignBotModule());
    }

    @Override
    public String getPackage() {
        return "me.mrrogersog.signbot";
    }
}