# Generated by Buildr 1.4.6, change to your liking
require 'buildr/scala'


# Version number for this release
VERSION_NUMBER = "0.0.1"
# Group identifier for your projects
GROUP = "rara"
COPYRIGHT = "none"

# Specify Maven 2.0 remote repositories here, like this:
repositories.remote << "http://www.ibiblio.org/maven2/"

desc "The Rara project"
define "rara" do

  project.version = VERSION_NUMBER
  project.group = GROUP
  manifest["Implementation-Vendor"] = COPYRIGHT
  
  package :jar
end
