organization := "name.heikoseeberger"

name := "demo-equality"

version := "1.0.0"

scalaVersion := Version.scala

libraryDependencies ++= Dependencies.demoEquality

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

(initialCommands in Compile) := "import name.heikoseeberger.demoequality._"
