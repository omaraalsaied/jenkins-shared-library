#!/usr/bin/env groovy


def call() {
     echo "building docker image .. "
    withCredentials([usernamePassword(credentialsId: 'dockerhub-repo', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
        sh 'docker build -t omaraalsaied/java-maven-app:1.2 .'
        sh "echo $PWD | docker login -u $USER --password-stdin" 
        sh 'docker push omaraalsaied/java-maven-app:1.2'
    }
}
