name := """play-scala-slick-example"""

version := "2.7.x"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
    "mysql" % "mysql-connector-java" % "8.0.17",
    "com.typesafe.play" %% "play-slick" % "4.0.2",
    "com.typesafe.play" %% "play-slick-evolutions" % "4.0.2",
    "com.typesafe.slick" %% "slick-codegen" % "3.3.2",
    guice,
    ws,
    "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-Xfatal-warnings"
)
