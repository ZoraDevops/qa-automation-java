pipeline {
  agent any

  tools {
    maven 'Maven 3' // Must match Jenkins tool name
  }

  parameters {
    choice(name: 'ENVIRONMENT', choices: ['QA', 'UAT', 'PROD'], description: 'Select test environment')
  }

  environment {
    TEST_ENV = "${params.ENVIRONMENT}"
  }

  stages {
    stage('Clone') {
      steps {
        // This clones the code and gives Jenkins better tracking of changes
        checkout([$class: 'GitSCM',
          branches: [[name: '*/main']],
          userRemoteConfigs: [[url: 'https://github.com/ZoraDevops/qa-automation-java.git']]
        ])
      }
    }

    stage('Build & Test') {
      steps {
        sh "mvn clean test -Denv=${TEST_ENV}"
      }
    }
  }
}
