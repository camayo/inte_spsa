@Library('kenlib') _

//pipeline script
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                //echo 'Hello World'
                helloWorldSimple( "Cristian", "Pipeline Script from Cristian GitHub SCM")
            }
        }
    }
}
