plugins {
    java
    id("io.moderne.rewrite") version("0.12.0")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}


tasks.register("aggregateAsts", Jar::class.java) {
    from(project.getTasksByName("moderneAst", true))
    from(project.tasks.named("rewriteScmProperties"))
}
