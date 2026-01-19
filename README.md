build.version --> BUILD_VERSION (converion called relaxed binding)

java -jar -accounts-service-0.0.1-SNAPSHOT.jar --build.version="1.1"

//for adding profile using command line arguments (highest priority)\
right click on Application starter file go to modify run configuration and program arguments

--spring.profiles.active=prod --build.version=1.1


//for JVM System properties \ 
-Dspring.profiles.active=prod -Dbuild.version=1.1

//using environment variables (lowest Priority)
SPRING_PROFILES.ACTIVE=prod;BUILD_VERSION=1.8