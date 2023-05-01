#!/usr/bin/env groovy

def call() {
    echo "building the application for branch BRANCH_NAME"
    sh 'mvn package'
}
//mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit
// triple / when in groovy scripts/Jenkinsfile like \\\${}
// def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
// def version = matcher[0][1]
// env.IMAGE_NAME = "$version-$BUILD_NUMBER"