name := "jodie"
organization := "com.github.mrpowers"

version := "0.0.1"

scalaVersion := "2.12.12"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "3.3.1" % "provided"

libraryDependencies += "io.delta" %% "delta-core" % "2.1.0" % "provided"
libraryDependencies += "com.github.mrpowers" %% "spark-daria" % "0.38.2"
libraryDependencies += "com.github.mrpowers" %% "spark-fast-tests" % "1.0.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.7.1" % "test"
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "3.3.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-azure" % "3.3.1"
libraryDependencies += "com.microsoft.azure" % "azure-data-lake-store-sdk" % "2.3.10"

// test suite settings
fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
// Show runtime of tests
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")

// JAR file settings

// don't include Scala in the JAR file
//assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

// Add the JAR file naming conventions described here: https://github.com/MrPowers/spark-style-guide#jar-files
// You can add the JAR file naming conventions by running the shell script
