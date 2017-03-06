name := """play_metrics_example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "io.dropwizard.metrics" % "metrics-core" % "3.1.2",
  "de.khamrakulov.metrics-reporter-play" %% "reporter-core" % "1.0.4",
  "de.khamrakulov" %% "metrics-annotation-play" % "1.0.4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

