pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
		 stage('Test') {
            steps {
                echo 'Test World'
            }
        }
		 stage('deploy') {
            steps {
                echo 'deploy World'
            }
        }
    }
	post{
	always{
	  build 'kk'
	}
	}
	
}

	}
}
}
