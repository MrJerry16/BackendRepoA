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
                bat 'dir target\\'
            }
        }
        stage('Run Backend') {
            steps {
                bat '''
                REM Start the server
                java -jar target crud-0.0.1-SNAPSHOT.jar
                '''
            }
        }
    }
}
