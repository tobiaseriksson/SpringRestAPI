name := "SpringRestAPI"

version := "0.1"

scalaVersion := "2.13.7"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.5.6"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-validation" % "2.5.6"

// https://mvnrepository.com/artifact/org.springframework/spring-webmvc
libraryDependencies += "org.springframework" % "spring-webmvc" % "5.3.13"

// https://mvnrepository.com/artifact/junit/junit
libraryDependencies += "junit" % "junit" % "4.13.2" % Test

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-test" % "2.5.6" % Test

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-webflux
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-webflux" % "2.5.6" % Test

