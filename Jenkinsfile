pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post {
        success {
            echo 'I succeeded'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
            mail to: 'team@example.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
