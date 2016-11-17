name := """play_metrics_example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "de.khamrakulov.metrics-reporter-play" %% "reporter-core" % "1.0.0",
  "de.khamrakulov" %% "metrics-annotation-play" % "1.0.2",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

