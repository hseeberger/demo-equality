organization := "name.heikoseeberger"

name := "demo-equality"

version := "1.0.0"

scalaVersion := "2.10.2"

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
