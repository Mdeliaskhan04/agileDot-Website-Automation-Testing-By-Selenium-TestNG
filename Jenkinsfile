pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Git রিপোজিটরি থেকে কোড ক্লোন করা
                git 'https://github.com/your-username/your-repository.git'
            }
        }
        stage('Build') {
            steps {
                // Maven কমান্ড চালিয়ে বিল্ড করা
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Maven টেস্ট কমান্ড চালানো
                sh 'mvn test'
            }
        }
        stage('Report') {
            steps {
                // Allure রিপোর্ট জেনারেট করা
                allure([
                    includeProperties: false,
                    jdk: '',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
    }
}
