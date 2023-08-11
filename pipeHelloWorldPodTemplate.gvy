pipeline {
  agent { label 'new1' }
  stages {
    stage('Run maven') {
      steps {
       container('new1') {
	  echo 'Pipeline Script with PodTemplate from Cristian GitHub SCM'
        }
      }
    }
  }
}
