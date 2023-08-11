pipeline {
  agent { label 'mavenqa' }
  stages {
    stage('Run mavenqa') {
      steps {
       container('mavenqa') {
	  echo 'Pipeline Script with PodTemplate from Cristian GitHub SCM'
        }
      }
    }
  }
}
