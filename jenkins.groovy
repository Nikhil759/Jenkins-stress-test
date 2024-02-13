pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from a Git repository
                git branch: 'main', url: 'https://github.com/Nikhil759/Jenkins-stress-test/blob/main/jenkins.groovy'
            }
        }
        stage('Add Files to Workspace') {
            steps {
                // Copy files from a specific directory to the workspace
                sh 'cp -r blaze_demo.jmx .'
            }
        }
        stage('Build') {
            steps {
                // Your build steps here
                echo 'Building...'
            }
        }
        // Add more stages as needed
    }

    post {
        // Define post-build actions if necessary
    }
}
