plugins {
    java
    id("org.springframework.boot") version "3.3.1"
    id("io.spring.dependency-management") version "1.1.5"
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    testImplementation("junit:junit:4.+")
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    compileOnly ("org.projectlombok:lombok:1.18.22")
    annotationProcessor ("org.projectlombok:lombok:1.18.22")
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly ("org.postgresql:postgresql")
}

tasks.withType<Test> {
    useJUnitPlatform()
}