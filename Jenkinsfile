pipeline {
    agent any;
    tools {
        maven 'maven-3.9.16'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr:'3', daysToKeepStr:'5', artifactNumToKeepStr:'3', artifactDaysToKeepStr:'5'))
    }
    stages {
        stage ('Tool version') {
            steps {
                echo 'Java and Maven version'
                sh 'java --version'
                sh 'mvn --version'
                echo 'Java and Maven version completed successfully!!!'
            }
        }
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