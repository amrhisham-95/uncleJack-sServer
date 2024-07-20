
val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.ktor.plugin") version "2.3.11"

    id("com.github.johnrengelman.shadow") version "7.1.2"

//for post plugin
    kotlin("plugin.serialization") version "2.0.0-RC3"
}

group = "com.example"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

ktor {
    fatJar {
        archiveFileName.set("fat.jar")
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-config-yaml:2.3.11")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation("io.ktor:ktor-server-core:2.3.1")
    implementation("io.ktor:ktor-server-netty:2.3.1")
    implementation("ch.qos.logback:logback-classic:1.2.1")
    implementation("io.ktor:ktor-serialization:2.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.1")

    //Ktorm
    implementation("org.ktorm:ktorm-core:4.0.0")
    implementation("com.mysql:mysql-connector-j:8.4.0")

    //ktor client
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-serialization:$ktor_version")
}
