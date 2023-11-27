plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    //testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.springframework/spring-beans
    implementation("org.springframework:spring-beans:6.0.12")
    // https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation("org.springframework:spring-context:6.0.12")

}

tasks.test {
    useJUnitPlatform()
}