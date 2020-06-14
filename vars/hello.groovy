def call(String command){
    if(command=="hello")
    {
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
}
}
