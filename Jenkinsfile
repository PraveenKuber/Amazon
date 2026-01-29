pipeline {
    agent { label 'built-in' }

    environment {
        git_branch = 'master'
        git_url = 'https://github.com/Chandanacps/Amazon.git'
    }

    stages {
        stage('Clone') {
            steps {
                git branch: "${git_branch}", url: "${git_url}", credentialsId: 'github-ssh'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn -f Amazon/pom.xml compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -f Amazon/pom.xml test'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn -f Amazon/pom.xml clean install'
            }
        }
    }
}
