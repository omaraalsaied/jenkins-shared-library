#!/usr/bin/env groovy

def call() {
    def dockerCmd = 'docker run -p8080:8080 -d --name java-app-2 omaraalsaied/java-maven-app:1.1.3-27'
    echo 'deploying the application'
    sshagent(['ec2-server-key']) {
        sh "ssh -o StrictHostKeyChecking ec2-user@13.38.251.191 ${dockerCmd}"
    }
 }
