import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "assignment8",
    libraryDependencies ++= Seq(
      scalaTest % Test,
    )
  )
