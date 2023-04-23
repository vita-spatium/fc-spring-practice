plugins {
    id("java")
    id("war")
}

group = "com.fc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")

    implementation("org.springframework:spring-webmvc:5.3.27")

    testImplementation("org.springframework:spring-test:5.3.27")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}