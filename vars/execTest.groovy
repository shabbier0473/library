def call(String command) {
	if (command == "test") 
	{
pipeline{
    agent any 
    parameters{
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'origin/master', name: 'BRANCH', type: 'PT_BRANCH'
    }
    stages{
        stage ('master') {
            when { 
                expression {GIT_BRANCH == 'origin/master'  }
            }
            steps{
                echo "master"
            }
        }
        stage ('release'){
            when {
                expression {GIT_BRANCH == 'origin/release'  }
            }
            steps{
                    echo 'release' }
        }
    }
}
	}
}
