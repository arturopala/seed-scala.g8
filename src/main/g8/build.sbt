name := "$name$"

organization := "$organization$"

version := "1.0-SNAPSHOT"

startYear := Some($year$)

headerLicense := Some(HeaderLicense.MIT("$year$", "$developer$"))

description := ""

scalaVersion := "2.12.4"

developers := List(Developer("$developerId$","$developer$","$developerEmail$",url("$developerUrl$")))

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

val compileDependencies = Seq(

)

val testDependencies = Seq(
   "org.scalatest" %% "scalatest" % "3.0.4" % Test,
   "org.scalacheck" %% "scalacheck" % "1.13.5" % Test
)

libraryDependencies ++= compileDependencies ++ testDependencies

connectInput in run := true

outputStrategy := Some(StdoutOutput)

lazy val myProject = project
  .in(file("."))
  .enablePlugins(AutomateHeaderPlugin)
