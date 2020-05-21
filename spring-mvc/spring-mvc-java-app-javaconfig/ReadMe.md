## MVC WEB APP XML Java Config ##
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
4. Open Browser := http://localhost:8089/spring-mvc/
5. Application redirect to default page => first.jsp reading from request mapping available in LoginServlet Controller.
6. Page display with href for new request mapping of login servered by LoginServlet controller.
7. Provide Username and Password and submit login page will be displayed.
8. config of dispatcher servlet => web.xml
9. config of spring mvc configuration => todo-servlet.xml
10. 	<mvc:resources mapping="/resources/**" location="/WEB-INF/image/" /> resource folder indicate WEB-INF/image
		and static image are refered from here .
11.   View resolver  <bean
        class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix">
            <value>/WEB-INF/view/</value>
        </property>
        <property name="suffix">
            <value>.jsp</value>
        </property>
    </bean>
12. 	<properties>
		<failOnMissingWebXml>false</failOnMissingWebXml>
	</properties> 
	For war generation as web.xml is missing.

===========================================================================================================================