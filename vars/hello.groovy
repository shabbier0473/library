def call(String command) {						
	if (command == "build") 					
	{					
		pipeline {				
			agent any			
			stages 			
			{			
				stage("Build") 		
				{		
					tools { maven "MAVEN_HOME"}	
					steps 	
					{	
						echo "hello"
					}	
				}		
			}			
		}				
	}					
}
}
