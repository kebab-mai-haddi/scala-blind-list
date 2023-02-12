ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "scala-blind-list"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
