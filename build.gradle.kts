plugins {
    java
    `maven-publish`
    id("io.github.goooler.shadow") version "8.1.7"
}

repositories {
    mavenLocal()
    maven("https://repo.maven.apache.org/maven2/")
}

dependencies {
    implementation("org.lz4:lz4-java:1.8.0")
    implementation("com.github.luben:zstd-jni:1.5.6-4")
    implementation("it.unimi.dsi:fastutil:8.5.14")
    implementation("org.slf4j:slf4j-api:2.0.16")
    testImplementation("org.slf4j:slf4j-simple:2.0.16")
    val brotli4jVersion = "1.16.0"
    implementation ( group = "com.aayushatharva.brotli4j", name = "brotli4j", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-windows-x86_64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-windows-aarch64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-x86_64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-aarch64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-armv7", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-ppc64le", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-riscv64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-linux-s390x", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-osx-x86_64", version = brotli4jVersion )
    runtimeOnly ( group = "com.aayushatharva.brotli4j", name = "native-osx-aarch64", version = brotli4jVersion )
}

group = "ca.spottedleaf"
version = "1.3-SNAPSHOT"
description = "sectortool"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
