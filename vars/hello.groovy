pipeline{
    agents any 
    stages{
        stage('hello'){
            steps{
                echo "hello"
            }
        }
    }
}
