import korlibs.korge.gradle.*

plugins {
    //alias(libs.plugins.korge)
    id("com.soywiz.korge") version "4.0.3"
}

korge {
    id = "org.korge.samples.demoldtk"

// To enable all targets at once

    //targetAll()

// To enable targets based on properties/environment variables
    //targetDefault()

// To selectively enable targets

    targetJvm()
    targetJs()
    targetDesktop()
    //targetDesktopCross()
    targetIos()
    targetAndroid()

    serializationJson()
}

dependencies {
    add("commonMainApi", project(":deps"))
    //add("commonMainApi", project(":korge-dragonbones"))
}
