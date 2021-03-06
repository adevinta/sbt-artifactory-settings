sys.props.get("plugin.version") match {
  case Some(pluginVersion) => addSbtPlugin("com.github.adevinta" % "sbt-artifactory-settings" % pluginVersion)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

addSbtPlugin("com.github.daniel-shuy" % "sbt-scripted-scalatest" % "1.1.1")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
