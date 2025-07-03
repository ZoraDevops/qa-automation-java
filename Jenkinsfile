pipeline {
  agent any

  parameters {
    choice(name: 'ENVIRONMENT', choices: ['QA', 'UAT', 'PROD'], description: 'Select test environment')
  }

  stages {
    stage('Checkout') {
      steps {
        git 'https://your-git-repo-url.git'
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn clean test -Denv=' + params.ENVIRONMENT
      }
    }
  }
}

// This Jenkinsfile defines a pipeline that checks out code from a Git repository,
// runs tests using Maven, and allows the user to select an environment for testing.