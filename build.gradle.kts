plugins {
    id("java")
}

group = "com.selenium.twentyfour"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("com.codeborne:selenide:7.5.0")
    testRuntimeOnly ("org.slf4j:slf4j-simple:2.0.16")
    implementation ("io.qameta.allure:allure-selenide:2.29.0")


}

tasks.test {
    useJUnitPlatform()
}