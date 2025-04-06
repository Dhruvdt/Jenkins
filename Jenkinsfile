pipeline {
    agent any
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Jenkins-maven"
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/Dhruvdt/Jenkins.git'
            }

        
        }
		stage('Build') {
            steps {
                // Get some code from a GitHub repository
               sh 'mvn clean package'
            }

        
        }
		stage('Test') {
            steps {
                // Get some code from a GitHub repository
              sh 'echo Deployed'
              // sh 'mvn test'
            }
			post{
				//always{
				//	junit '**/target/sunfire-reports/Test-*.xml'
			//	}
			}

        
        }
		stage('Deploy') {
            steps {
                // Transfer the jar to remote server
               sh 'echo Deployed'
            }

        
        }
    }
}
