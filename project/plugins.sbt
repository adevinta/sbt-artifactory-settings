// https://github.com/scoverage/sbt-scoverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.1.1")
// https://github.com/scalastyle/scalastyle-sbt-plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// https://github.com/sbt/sbt-header
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")

// https://github.com/sbt/sbt-dynver
addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.0.1")
// https://github.com/sbt/sbt-pgp
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
// https://github.com/xerial/sbt-sonatype
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.11.3")

// Let's select 2.3.0 and hope for the best 🤞
// https://github.com/sbt/sbt/issues/6997
// [error] 	* org.scala-lang.modules:scala-xml_2.12:2.3.0 (early-semver) is selected over 1.0.6
//[error] 	    +- org.scoverage:scalac-scoverage-reporter_2.12:2.1.1 (depends on 2.3.0)
//[error] 	    +- org.scalariform:scalariform_2.12:0.2.0             (depends on 1.0.6)
ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
