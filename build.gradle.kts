import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.20"
	kotlin("plugin.spring") version "1.9.20"
	id("org.ec4j.editorconfig") version "0.0.3"
	id ("com.github.ben-manes.versions") version "0.50.0"
}

group = "com.glinboy.demo"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

val locatorVersion = "0.50"
val bootstrapVersion = "5.3.2"
val fontawesomeVersion = "6.4.2"
val jQueryVersion = "3.7.1"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.webjars:webjars-locator:${locatorVersion}")
	implementation("org.webjars:bootstrap:${bootstrapVersion}")
	implementation("org.webjars:font-awesome:${fontawesomeVersion}")
	implementation("org.webjars:jquery:${jQueryVersion}")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "21"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
