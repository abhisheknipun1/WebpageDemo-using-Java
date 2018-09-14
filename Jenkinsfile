pipeline {
  agent any
   stages {
    stage('Git Checkin') 
	{
      steps {
        git(url: 'https://github.com/abhisheknipun1/WebpageDemo-using-Java', poll: true)
      }
	 }
	     stage('Compile')
         {
		     steps {
           bat 'mvn clean compile'
            }
         }
       stage('Test') 
       {
           steps{
             parallel (
		        	  Unit Test : { bat 'mvn clean test' },
		        	  Functional Test : { bat 'mvn clean verify' }
			    )
        }
		}
         stage('Artifacts')
         {
		       steps {
             bat 'mvn package'
          }
	    }
  }
}
