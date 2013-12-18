import sbt._

object Version {
  val scala     = "2.10.3"
  val scalaTest = "2.0"
}

object Library {
  val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest
}

object Dependencies {

  import Library._

  val demoEquality = List(
    scalaTest % "test"
  )
}
