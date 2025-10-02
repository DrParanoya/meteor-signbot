# SignBot Meteor Add-on 🪧🤖

**SignBot** is a Meteor Client add-on for Minecraft. It scans loaded signs, filters out unwanted ones, and sends Baritone `#goto` commands to valid sign locations. It now supports autonomous dispatching, sign destruction, and persistent logging for debugging.

- **Author:** [MrRogersOG](https://github.com/MrRogersOG)  
- **Powered by:** [Meteor Client](https://meteorclient.com/)  
  _Special thanks to the Meteor Team for their add-on framework!_

---

## Features

- 🔍 Scans all loaded sign blocks
- 🚫 Ignores blank signs and `"codysmile11 was here:)"` tags
- 📦 Queues valid signs for Baritone pathfinding
- 🚶‍♂️ Auto-dispatches `#goto` commands with configurable delay
- ⏯️ Keybind to skip current sign and dispatch the next
- 👊 Automatically punches signs on arrival
- 💬 Chat summary after each scan
- 📝 Persistent log file (`signbot-log.txt`) for debugging

---

## Install

1. Build with `./gradlew build`  
2. Place the resulting `.jar` in your `.minecraft/mods` folder (Meteor Client must be installed)

---

## Usage

- Enable the **SignBot** module in Meteor Client  
- Use the module’s keybind or GUI to scan signs and dispatch Baritone commands  
- Toggle auto-dispatch and configure delay in the module settings  
- Use the skip keybind to cancel current path and jump to the next sign  
- Signs are automatically destroyed on arrival  
- All major events are logged to `logs/signbot-log.txt`

---

## Credits

- Code by [MrRogersOG](https://github.com/MrRogersOG)  
- Meteor Client & add-on system by Meteor Team

---

## License

This project is released under the [CC0 1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/) license.

---
