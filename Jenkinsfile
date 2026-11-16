
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out Amazon project'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Amazon Maven application'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Amazon application tests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment stage completed'
            }
        }
    }
}

