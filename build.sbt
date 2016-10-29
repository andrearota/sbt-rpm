name:="sbt-rpm"

scalaVersion:="2.10.6"

version:="1.1"

enablePlugins(JavaAppPackaging, RpmPlugin)

rpmVendor:="typesafe"
rpmLicense:= Some("MIT")
rpmPrefix:= Some("/opt/foo")
rpmBrpJavaRepackJars:= false
