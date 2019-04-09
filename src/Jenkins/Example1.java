/**
1. Download Tomcat
2. Jenkin War file download
3. After download all files > Copy jenkin war file & paste it under Tomcat > webapps
4. localhost:8080/jenkins
5. Go to jenkins > Manage jenkins > global tool configuraiton > configure JDK
6. configure Maven Home


--How to create job & clone project from GIT
1. download git for windows
2. go to git.exe location & copy in global tool configuration
3. Now to jenkins > manage jenkins > manage plugins
4. Available plugin & search for testng > install it
5. search Selenium HTML report > install
6. search HTML publisher plugin > install

Create Project 
1. create a new project
2. select GIT option > paste the git project url & paste it
3. click on advance option & put 30 min 
4. scroll down & search build > select invoke top-level maven scripts
5. Select maven home > enter pom= pom.xml> goals= clean install
6. post buld actions 
7. select testng result xml
8. Now click on build now
9. Go to workspace > See clone project

How to run POM.xml from Jenkins
1. <plugins> <plugin>
we need to add the "maven compiler plugin" and "Maven surefire plugin" & configure test suit file path
**/