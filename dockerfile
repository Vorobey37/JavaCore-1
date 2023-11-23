FROM bellsoft/liberica-openjdk-alpine
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/main/java/lesson1/mainClass/Main.java
CMD java -classpath ./out main.java.lesson1.mainClass.Main
