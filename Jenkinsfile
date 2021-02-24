pipeline{
    agent any
	
	stages{
	  stage('Compile Stage'){
			steps{
				
					sh '''
          
          mvn compile 
    '''
		    }
	    }
	    
	    stage('QA test Stage'){
			steps{
					sh '''
          
          mvn clean test package sonar:sonar
    '''
				}
		    }
		     stage('Junit test Stage'){
			steps{
				
				junit 'target/surefire-reports/*.xml'
		    }
	    }
	 // stage('ansible-deploy'){
	     // steps{
		   //   sh 'ansible-playbook Student/Test.yml'
		  
	        // ansiblePlaybook credentialsId: 'Ansible', disableHostKeyChecking: true, installation: 'AnsibleTest', inventory: 'Student/dev.inv', playbook: 'Student/Test.yml'
	    //  }
	  //}
	    
	}
}
