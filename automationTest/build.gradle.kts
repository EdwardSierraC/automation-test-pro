repositories {
    mavenCentral()
    mavenLocal()
}

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:2.3.4")
    }
}

plugins {
    id("java")
    id("idea")
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testImplementation ("org.assertj:assertj-core:3.23.1")
    testImplementation ("org.slf4j:slf4j-simple:2.0.5")
    testImplementation ("net.serenity-bdd:serenity-core:3.4.3")
    testImplementation ("net.serenity-bdd:serenity-junit:3.4.3")
    implementation("net.serenity-bdd:serenity-ensure:3.4.3")
    implementation("net.serenity-bdd:serenity-cucumber6:2.6.0")
    implementation("net.serenity-bdd:serenity-screenplay:3.4.3")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:3.4.3")
    implementation("io.cucumber:cucumber-core:7.2.3")
    implementation("io.cucumber:cucumber-junit:7.2.3")
    implementation("org.reflections:reflections:0.10.2")
    //implementation("serenity-core:1.9.9")
    //implementation("serenity-junit:1.9.9")
    //implementation("serenity-cucumber:1.9.5")
    //implementation("serenity-screenplay:1.9.9")
    //implementation("serenity-screenplay-webdriver:1.9.9")
}

gradle.startParameter.isContinueOnFailure = true