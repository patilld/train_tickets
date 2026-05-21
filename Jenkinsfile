pipeline {
    agent any;
    options {
        buildDiscarder(logRotator(numToKeepStr:'3', dayToKeepStr:'5', artifactToKeepStr:'3', artfactDaysToKeepStr:'5'))
    }
    stages {
        stage('Code Compilation') {
            steps {
                echo 'Code Compilation stage'
                sh 'mvn clean compile'
                echo 'Code compilation completed sucessfully!!!'
            }
        }
        stage('Code Junit Testing') {
            steps {
                echo 'Code test stage'
                sh 'mvn test'
                echo 'COde testing completed successfully!!!'
            }
        }
        stage('Code Package') {
            steps {
                echo 'Code package step'
                sh 'mvn package'
                echo 'COde packaging competed successfully!!!'
            }
        }
     }
}