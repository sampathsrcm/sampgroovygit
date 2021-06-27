job('First_maven_project_via groovy_script_DSL')
{
   description("First maven job generated by DSL on ${new Date()}, small maven proj on github")
   
    {
    


      scm 
       {
                                     
            git("https://github.com/sampathsrcm/Mavenproj-test.git", master)
       
       }
       
       triggers 
       {
           
          scm('* * * * *') 
           
       }
       
       steps {
           
           maven('clean package' ,'C:\\Users\\sampy\\git\\sampygroovy\\groovyturorial\\pom.xml' )
       }
       
       publishers {
           
           archiveArtifacts '**/*.jar'
       }


      
                                     
   
   
                                          
    }                                                     
                                                 
                                               
 }                               
                                     
                                     
                                     

