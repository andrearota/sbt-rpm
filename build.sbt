name:="sbt-rpm"

scalaVersion:="2.10.6"

version:="1.0"

enablePlugins(JavaAppPackaging, RpmPlugin)

rpmVendor:="andrearota.com"
rpmLicense:= Some("MIT")
