pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        jdk "jdk17-0-5"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Delattrecamille/demo_retourdevances.git'
                sh "chmod +x ./gradlew"
                sh "./gradlew build"

            }
        
        }
        stage('coucou') {
            steps {
                // Get some code from a GitHub repository
                sh "echo 'coucou'"

            }
    }
}
}
