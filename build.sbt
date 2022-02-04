import org.jetbrains.sbtidea.Keys._

lazy val firstIdeaPlugin =
  project
    .in(file("."))
    .enablePlugins(SbtIdeaPlugin)
    .settings(
      version := "0.0.1-SNAPSHOT",
      scalaVersion := "3.1.1",
      ThisBuild / intellijPluginName := "FooBrowser",
      ThisBuild / intellijBuild := "213.6777.52",
      ThisBuild / intellijPlatform := IntelliJPlatform.IdeaCommunity,
      Global / intellijAttachSources := true,
      Compile / javacOptions ++= "--release" :: "11" :: Nil,
      intellijPlugins += "com.intellij.properties".toPlugin,
      libraryDependencies ++=
        Seq(
          "com.eclipsesource.minimal-json" % "minimal-json" % "0.9.5" withSources (),
          "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
          "org.typelevel" %% "cats-effect" % "3.3.5"
        ),
      Compile / unmanagedResourceDirectories += baseDirectory.value / "resources",
      Test / unmanagedResourceDirectories += baseDirectory.value / "testResources"
    )
