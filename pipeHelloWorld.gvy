@Library('kenlib') _

//pipeline script
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                //echo 'Hello World'
                helloWorldSimple( "Dragan", "Friday")
            }
        }
    }
}
