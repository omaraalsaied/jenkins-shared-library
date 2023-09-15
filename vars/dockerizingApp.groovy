#!/usr/bin/env groovy


def call(imageName) {
     echo "building docker image .. "
    // withCredentials([usernamePassword(credentialsId: 'dockerhub-repo', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
    //     sh "docker build -t $imageName ."
    //     sh "echo $PWD | docker login -u $USER --password-stdin" 
    //     sh "docker push $imageName"
    // }
}
