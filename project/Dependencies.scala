import sbt._

object Version {
  val scala     = "2.10.2"
  val sprayJson = "1.2.5"
  val scalaTest = "2.0.RC1-SNAP4"
}

object Library {
  val sprayJson      = "io.spray"          %% "spray-json"      % Version.sprayJson
  val scalaTest      = "org.scalatest"     %% "scalatest"       % Version.scalaTest
}

object Dependencies {

  import Library._

  val demoEquality = List(
    sprayJson,
    scalaTest % "test"
  )
}
