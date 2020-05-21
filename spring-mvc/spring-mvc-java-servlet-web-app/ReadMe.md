## SERVLET WEB APP ##
===========================================================================================================================
1. Maven Install
2. Maven Build : Command tomcat7:run.
3. Server configuration => 
			<plugin>
					<groupId>org.apache.tomcat.maven</groupId>
					<artifactId>tomcat7-maven-plugin</artifactId>
					<version>2.2</version>
					<configuration>
						<path>/</path>
						<port>8089</port>
						<contextReloadable>true</contextReloadable>
					</configuration>
				</plugin>
4. Open Browser := http://localhost:8089/
5. Application redirect to default page => login.html
6. Provide Username and Password and submit login page will be displayed.
===========================================================================================================================