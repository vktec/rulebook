# Rulebook

Additional Minecraft gamerules to allow greater customization of the game.

## Rules

- `fillVolume` - maximum volume of a /filled area
- `viewDistance` - server view distance (overrides view-distance in server.properties)

## Compatibility with fabric-carpet

Rulebook duplicates some of Carpet's functionality, and hence conflicts with Carpet on those features.
Carpet's equivalents may not integrate properly with Rulebook's gamerules, or may cease to function entirely.

Use Rulebook's options instead of Carpet's and everything should be fine.

(Note: at present, launching rulebook together with carpet will result in a mixin conflict. [This PR][fix] will fix the issue when merged)
[fix]: https://github.com/gnembon/fabric-carpet/pull/781
