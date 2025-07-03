pipeline {
  agent any

  tools {
    maven 'Maven 3' // must match the name in Jenkins config
  }

  parameters {
    choice(name: 'ENVIRONMENT', choices: ['QA', 'UAT', 'PROD'], description: 'Select test environment')
  }

  environment {
    TEST_ENV = "${params.ENVIRONMENT}"
  }

  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/ZoraDevops/qa-automation-java.git'
      }
    }

    stage('Build & Test') {
      steps {
        sh "mvn clean test -Denv=${TEST_ENV}"
      }
    }
  }
}
