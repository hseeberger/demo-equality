organization := "de.heikoseeberger"
name         := "demo-equality"
version      := "1.0.0"

scalaVersion  := "2.11.7"
scalacOptions := List(
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8",
  "-language:_"
)

import scalariform.formatter.preferences._
scalariformSettings
scalariformPreferences := scalariformPreferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(DoubleIndentClassDeclaration, true)

initialCommands := "import de.heikoseeberger.demoequality._"
