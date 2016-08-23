val pathToEngine = "../CobbleStoneEngine"

val scalaVer = "2.11.8"

val dependencies = Seq(

)

lazy val engine = RootProject(file(pathToEngine))

lazy val GrifBall = (project in file(".")).settings(
    name := "GrifBall",
    organization := "com.cobble.grifBall",
    scalaVersion := scalaVer,
    libraryDependencies ++= dependencies,
    crossPaths := false
).dependsOn(engine)