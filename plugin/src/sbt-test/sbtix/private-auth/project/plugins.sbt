if (sys.props.contains("plugin.version")) {
  addSbtPlugin("se.nullable.sbtix" % "sbtix" % sys.props("plugin.version"))
} else {
  addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")
}

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

