/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.9.6-eclipse-temurin-17-alpine' } }
    stages {
        stage('build') {
            agent any
            steps {
                sh 'mvn --version'
                sh './gradlew check'
            }
        }
        post {
            always {
                archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
                junit 'build/reports/**/*.xml'
            }
            success {
                echo 'Succeeded! :)'
            }
            unstable {
                echo 'Unstable :|'
            }
            failure {
                echo 'Failed :('
            }
            changed {
                echo 'Change detected !'
            }
        }
    }
}
