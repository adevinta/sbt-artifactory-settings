sys.props.get("plugin.version") match {
  case Some(pluginVersion) => addSbtPlugin("com.github.adevinta" % "sbt-artifactory-settings" % pluginVersion)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

addSbtPlugin("com.github.daniel-shuy" % "sbt-scripted-scalatest" % "2.0.0")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"

// Let's select 2.3.0 and hope for the best 🤞
// https://github.com/sbt/sbt/issues/6997
ThisBuild / libraryDependencySchemes ++= Seq("org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always)
