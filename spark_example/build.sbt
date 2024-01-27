
scalaVersion := "2.12.18"

name := "sparktutorial"
organization := "com.example"
version := "1.0"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "3.5.0" % "provided",
	"org.apache.spark" %% "spark-sql" % "3.5.0" % "provided"
)

fork := true

assembly / assemblyMergeStrategy := {
    case PathList("META-INF", "services", _*) => MergeStrategy.concat
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
}

