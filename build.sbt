import org.jetbrains.sbtidea.Keys._
lazy val root =
  project
    .in(file("."))
    .enablePlugins(SbtIdeaPlugin)
    .settings(
      version := "0.0.1-SNAPSHOT",
      scalaVersion := "3.1.3",
      ThisBuild / intellijPluginName := "FooBrowser",
      ThisBuild / intellijBuild := "213.6777.52",
      ThisBuild / intellijPlatform := IntelliJPlatform.IdeaCommunity,
      Global / intellijAttachSources := true,
      Compile / javacOptions ++= "--release" :: "11" :: Nil,
      intellijPlugins += "com.intellij.properties".toPlugin,
      libraryDependencies ++=
        Seq(
          "com.eclipsesource.minimal-json" % "minimal-json" % "0.9.5" withSources (),
          "org.scala-lang.modules" % "scala-swing_3" % "3.0.0", //"2.1.1" ,
          "org.scala-lang" % "scala3-library_3" % "3.1.3",
          "org.typelevel" % "cats-effect_3" % "3.3.12"
        ),
      Compile / unmanagedResourceDirectories += baseDirectory.value / "resources",
      Test / unmanagedResourceDirectories += baseDirectory.value / "testResources",
//      packageLibraryMappings += "org.typelevel" %% "cats*" % ".*" -> Some("lib/cats.jar"),
    )
