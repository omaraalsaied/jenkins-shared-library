#!/usr/bin/env groovy

def call() {
    echo 'deploying the application'
    def dockerCmd = "docker run -p8080:8080 -d  omaraalsaied/java-maven-app:${IMAGE_NAME}"
    sshagent(['ec2-server-key']) {
        sh "ssh -o StrictHostKeyChecking=no ec2-user@13.38.251.191 ${dockerCmd}"
    }
 }
