# LumyREI 1.20.1 Backport (Unofficial)

An unofficial Fabric backport of the Cobblemon brewing recipe display from [LumyREI](https://github.com/LUMYVERSE/LumyREI) for Minecraft 1.20.1, Cobblemon 1.5.2 and REI 12.1.785.

This port adapts the recipe integration to Cobblemon 1.5.2's built-in brewing recipe API. It does not add or change gameplay recipes.

## Included

- Displays Cobblemon's built-in brewery recipes in a dedicated REI category.
- Shows the base brew, Cobblemon reagent, brewing fuel, and resulting item.
- Uses the brewing stand as the REI workstation.

## Not included

- Campfire Pot recipes and screen integration: Cobblemon 1.5.2 for Minecraft 1.20.1 has no Campfire Pot recipe system.
- Optional LumyMon Stark Forge integration: this backport does not include it.
- The upstream 1.21.1-specific MMO Realms Campfire Pot workaround.

## Requirements

- Minecraft 1.20.1, Fabric Loader 0.15.11 or newer, Java 17 or newer
- Fabric API
- Cobblemon 1.5.2 for Fabric
- Fabric Language Kotlin 1.12.3 or newer
- Roughly Enough Items (REI) 12.1.785 or newer

Install on the client alongside the listed mods. The integration does not add server-side gameplay behavior.

## Credits and license

Based on [LumyREI by LUMYVERSE](https://github.com/LUMYVERSE/LumyREI), upstream revision `61c36758dbe6d28fe2d49751fe56c84e19fd464f`. The upstream source and this backport are licensed under GNU GPL-3.0-only; see [LICENSE](LICENSE). This is an unofficial port maintained by JustHari01 and is not affiliated with or endorsed by LUMYVERSE.

The retained upstream icon and four interface textures have separate attribution in [ATTRIBUTION.md](ATTRIBUTION.md); the texture license notice is included under [THIRD_PARTY_LICENSES](THIRD_PARTY_LICENSES/).

## Support

For a backport-specific issue, report it on the platform page where you downloaded this file. Include Minecraft, Fabric Loader, Cobblemon, REI and LumyREI versions, plus the relevant `latest.log` excerpt.

AI disclosure: AI assistance was used to adapt the Cobblemon brewing recipe integration for Minecraft 1.20.1 Fabric and prepare this source description. This disclosure does not describe the upstream authors' work.
