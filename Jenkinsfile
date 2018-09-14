pipeline {
  agent any
  stages {
    stage('Git Checkin') {
      steps {
        git(url: 'https://github.com/abhisheknipun1/WebpageDemo-using-Java', poll: true)
      }
    }
  }
}