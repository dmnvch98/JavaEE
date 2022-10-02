docker run --rm \
   --name tomcat \
   -p 8080:8080 \
   --network demo_network \
   -v "C:\Users\ydzemyanovich\IdeaProjects\JavaEE\target\JavaEE-1.0-SNAPSHOT.war:/usr/local/tomcat/webapps/servlet.war" \
   tomcat:9.0.53-jdk11-openjdk

docker run --network=demo_network --rm curlimages/curl:7.84.0 -X POST http://tomcat:8080/servlet/counter