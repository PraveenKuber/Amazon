# Base image with Tomcat and JDK
FROM tomcat:9.0-jdk17

# Remove default applications
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file into Tomcat
COPY Amazon.war /usr/local/tomcat/webapps/Amazon.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]

