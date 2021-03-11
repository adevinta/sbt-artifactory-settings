import sbt.ScriptedPlugin.autoImport.scriptedBufferLog

inThisBuild(Seq(
  
  name := "prometheus-datadog-bridge",
  organization := "com.adevinta.unicron",
  description := "SBT plugin to manage Artifactory configuration",
  
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
  homepage := Some(url(s"https://github.com/adevinta/${name.value}")),
  developers := List(Developer("cre-team", "CRE Team", "gp.gt.cre@adevinta.com", url("https://github.com/orgs/adevinta/teams/cre"))),
  scmInfo := Some(ScmInfo(url(s"https://github.com/adevinta/${name.value}"), s"scm:git:git@github.com:adevinta/${name.value}.git")),

  scalaVersion := "2.12.12",
  sbtPlugin.withRank(KeyRanks.Invisible) := true,

  usePgpKeyHex("E362921A4CE8BD97916B06CEC6DDC7B1869C9349"),

  // sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
  // sonatypeCredentialHost:= "s01.oss.sonatype.org",
  dynverSonatypeSnapshots := true,
))

lazy val root = Project(id = "sbt-artifactory-settings", base = file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    publishMavenStyle := true,
    publishTo := sonatypePublishToBundle.value,
    scriptedBufferLog := false,
    scriptedLaunchOpts ++= Seq("-Xmx1024M", s"-Dplugin.version=${version.value}")
  )
