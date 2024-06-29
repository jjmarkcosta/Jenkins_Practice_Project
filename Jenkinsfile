pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/jjmarkcosta/Jenkins_Practice_Project.git'
                bat "mvn compile"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                bat "mvn package"
            }
        }
    }
}
