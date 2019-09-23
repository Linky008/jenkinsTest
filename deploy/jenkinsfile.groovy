#!groovy
pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '10001', url: 'https://github.com/Linky008/jenkinsTest']]])
            }
        }
        stage('Auto Test') {
            steps {
                echo 'testing now...'
            }
        }
        stage('Deploy') {
            steps {
                sh 'dotnet publish -c:Release -o ${WORKSPACE}/deploy/jenkins_publish/ CoreWeb/CoreWeb.csproj'
            }
        }
    }
}