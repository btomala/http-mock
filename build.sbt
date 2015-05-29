net.virtualvoid.sbt.graph.Plugin.graphSettings

organization := "btomala"

name := "teapot"

version := "0.1"

scalaVersion := "2.11.6"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil

val libVersion = Map(
 "akka-http" → "1.0-RC3",
 "scalaTest" → "2.2.4",
  "dispatch" → "0.11.2"
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka"       %% "akka-http-core-experimental"           % libVersion("akka-http"),
  "com.typesafe.akka"       %% "akka-http-testkit-experimental"        % libVersion("akka-http") % "test",
  "net.databinder.dispatch" %% "dispatch-core"                         % libVersion("dispatch")  % "test",
  "org.scalatest"           %% "scalatest"                             % libVersion("scalaTest") % "test"
)

