name := "$name$"

version := "1.0-SNAPSHOT"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

startYear := Some(2017)

description := "$description$"

scalaVersion := "2.12.4"

developers := List(Developer("arturopala","Artur Opala","opala.artur@gmail.com",url("https://pl.linkedin.com/in/arturopala")))

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
