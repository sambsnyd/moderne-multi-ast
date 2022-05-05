plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {

}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
