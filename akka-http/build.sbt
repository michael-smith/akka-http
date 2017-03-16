import akka._

Dependencies.http
OSGi.http
scalacOptions in Compile += "-language:_"

enablePlugins(spray.boilerplate.BoilerplatePlugin)
