default:
    just --list

# Creates a new project with Maven
create-project:
    docker run -it --rm -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.9.11 mvn \
        archetype:generate \
        -DgroupId=com.davante.app \
        -DartifactId=hello-world \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DarchetypeVersion=1.5 \
        -DinteractiveMode=false

# Builds the project with Maven
build:
    docker run -it --rm -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.9.11 mvn package

# Runs the project
run name="com.davante.app.App":
    docker run -it --rm -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.9.11 mvn exec:java -Dexec.mainClass="{{name}}"

# Tests the project with Maven
test:
    docker run -it --rm -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.9.11 mvn test
