scalaVersion := "2.13.12"

Compile / paradoxProperties ++= Map(
  "snip.g8root.base_dir" -> "../../../../src/main/g8",
  "snip.g8src.base_dir" -> "../../../../src/main/g8/src/main/",
  "snip.g8srctest.base_dir" -> "../../../../src/main/g8/src/test/"
)
