pipeline {
    agent any
    stages {
        stage('---deploy---') {
            steps {
                sh "mvn package"
            }
        }
    }
}
