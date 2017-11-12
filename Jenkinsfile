pipeline {
  agent any
  stages {
    stage('Pull and Virtual Merge') {
      steps {
        git(url: 'https://github.com/virtualadrian/virtualadrian-springboot-docker-starter.git', branch: 'master', changelog: true)
      }
    }
    stage('Build and Containerize') {
      steps {
        readMavenPom(file: 'pom.xml')
      }
    }
  }
}