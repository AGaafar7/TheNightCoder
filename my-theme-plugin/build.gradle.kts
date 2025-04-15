plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    id = "org.agaafar.thenightcoder"

    // STEP 2: set up the sensible metadata for your plugin
    metadata {
        readableName = "The Night Coder"
        description = "a theme build for night coders that love red and black"
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
