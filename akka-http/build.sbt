import akka._

Dependencies.http
OSGi.http
scalacOptions in Compile += "-language:_"

//disablePlugins(MimaPlugin) // still experimental
enablePlugins(spray.boilerplate.BoilerplatePlugin)
