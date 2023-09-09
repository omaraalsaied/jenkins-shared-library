#!/usr/bin/env groovy


def call(String imageName, Float imageTag ) {
     echo "building docker image .. "
    withCredentials([usernamePassword(credentialsId: 'dockerhub-repo', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
        sh "docker build -t $imageName:$imageTag ."
        sh "echo $PWD | docker login -u $USER --password-stdin" 
        sh "docker push $imageName:$imageTag"
    }
}
