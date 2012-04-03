name := "FizzBuzz Kata"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  // ScalaTest and JUnit
  "org.scalatest" %% "scalatest" % "1.7.1" % "test",
  "junit" % "junit" % "4.9" % "test",
  // Specs2
  "org.specs2" %% "specs2" % "1.8.2" % "test"
)
