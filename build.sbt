name := "AndroidOps"

version := "0.1"

organization := "com.liz"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-encoding", "UTF-8")

javaOptions ++= Seq("-encoding", "UTF-8")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "com.google.android" % "android" % "4.1.1.4"
)

crossPaths := false

autoScalaLibrary := false

publishMavenStyle := true