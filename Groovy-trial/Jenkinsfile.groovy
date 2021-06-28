job('First_maven_project_via groovy_script_DSL')
{
   
	
	 scm
	   {
			git 'https://github.com/sampathsrcm/Mavenproj-test.git'
	   
	   }
	   
	   triggers
	   {
		   
		  scm('* * * * *')
	   }
	   
	   steps {
		   maven('clean package','C:/Users/sampy/git/Mavenproj-test/art01/pom.xml')
	   }
	   publishers {
		   
		   archiveArtifacts '**/*.jar'
	   }
										  
									 
											   
 }