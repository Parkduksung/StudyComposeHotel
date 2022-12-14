pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StudyComposeHotel"
include(":app")
include(":domain")
include(":core-data")
include(":core-database")
include(":core-network")
include(":core-model")
include(":core-ui")
include(":core-common")
include(":core-navigation")
include(":core-testing")
include(":core-data-test")
include(":feature-list")
include(":feature-bookmark")

