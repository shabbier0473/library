def call(String command) {
	if (command == "test") 
	{
    pipeline{
        agent any
        stages{
            stage("hello"){
                steps{
                    echo "hello"
                }
            }
        }
    }
}
}
