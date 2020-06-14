def call(string command){
    if(command == "hello")
    {
        pipeline{
        agents any 
        stages{
            stage(){
                steps{
                    echo "hello"
                    }
                }
            }
        }
}
}
