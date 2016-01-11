import sbt._
import sbt.Keys._

object TwitchlovescatsBuild extends Build {

  lazy val twitchlovescats = Project(
    id = "twitchlovescats",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "TwitchLovesCats",
      organization := "org.example",
      version := "0.0.1",
      scalaVersion := "2.11.6"
      // add other settings here
    )
  )
}
