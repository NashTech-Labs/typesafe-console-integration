name:="typesafe-console-integration"

version:="1.0"

scalaVersion:="2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")


resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/",
  "spray nightly repo" at "http://nightlies.spray.io",
   "opencast-public" at "http://repository.opencastproject.org/nexus/content/repositories/public/"
)


// Add multiple dependencies
libraryDependencies ++= Seq(
	"org.scalatest" 		%% 	"scalatest" 		% 	"1.9.2",
	"junit" 				% 	"junit" 			% 	"4.11"   %	"test",
	"org.mongodb" 			%% 	"casbah" 			% 	"2.6.3",
	"com.typesafe.akka" 	%% 	"akka-actor" 		%	"2.2.3",
	"com.typesafe.akka" 	%%	"akka-remote" 		% 	"2.2.3",
	"com.typesafe.akka" 	%% 	"akka-testkit" 		% 	"2.2.3"  %	"test",
	"com.typesafe.akka" 	%%	"akka-kernel" 		% 	"2.2.3",
	"com.typesafe.akka"		%% 	"akka-cluster" 		% 	"2.2.3",
	"com.typesafe.akka"     %%  "akka-slf4j"        %   "2.2.3",
	"com.typesafe.akka"     %% 	"akka-contrib"      %   "2.2.3",
    "com.typesafe.atmos"    %%   "atmos-trace"      % "1.3.0"
    )    

  
atmosSettings

atmosTestSettings