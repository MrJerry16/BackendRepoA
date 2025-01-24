pipeline {
    agent any
    tools {
        maven 'Maven3'  // The Maven tool defined in Global Tool Configuration
        jdk 'JDK21'     // The JDK tool defined in Global Tool Configuration
    }
    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/MrJerry16/BackendRepoA.git'
            }
        }
        stage('Build Backend') {
            steps {
                bat '''
                REM Install dependencies and build the project
                mvn clean install
                '''
            }
        }
        stage('Verify Build Artifacts') {
            steps {
                bat 'dir C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\backkkkkkkk\\target\\'  // List the files in the target directory to confirm the JAR file
            }
        }
        stage('Run Backend') {
            steps {
                bat '''
                REM Check if the jar file exists in the target directory
                if exist C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\backkkkkkkk\\target\\crud-0.0.1-SNAPSHOT.jar (
                    java -jar C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\backkkkkkkk\\target\\crud-0.0.1-SNAPSHOT.jar
                ) else (
                    echo "Jar file not found!"
                )
                '''
            }
        }
    }
}
