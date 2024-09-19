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

}

tasks.test {
    useJUnitPlatform()
}