# SignBot Meteor Add-on 🪧🤖

**SignBot** is a Meteor Client add-on for Minecraft. It scans loaded signs, filters out unwanted ones, and sends Baritone `#goto` commands to valid sign locations.

- **Author:** [MrRogersOG](https://github.com/MrRogersOG)
- **Powered by:** [Meteor Client](https://meteorclient.com/)  
  _Special thanks to the Meteor Team for their add-on framework!_

## Features

- Scans all loaded sign blocks
- Ignores blank signs and "codysmile11 was here:)" tags
- Queues valid signs for Baritone pathfinding
- Sends one `#goto` command at a time
- Chat summary after each scan

## Install

1. Build with `./gradlew build`
2. Put the resulting `.jar` in your `.minecraft/mods` folder (with Meteor Client installed).

## Usage

- Enable the **SignBot** module in Meteor Client.
- Use the module’s keybind or click to scan for signs and dispatch Baritone commands.

## Credits

- Code by [MrRogersOG](https://github.com/MrRogersOG)
- Meteor Client & add-on system by Meteor Team

## License

MIT License