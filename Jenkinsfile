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
        stage('Run Backend') {
            steps {
                bat '''
                REM Start the server
                java -jar target\\*.jar
                '''
            }
        }
    }
}
