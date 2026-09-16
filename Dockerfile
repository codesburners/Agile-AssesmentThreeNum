# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java file into the container
COPY GreatestOfThreeNumbers.java .

# Compile the Java class
RUN javac GreatestOfThreeNumbers.java

# Keep the container ready to accept input via standard input
CMD ["java", "GreatestOfThreeNumbers"]