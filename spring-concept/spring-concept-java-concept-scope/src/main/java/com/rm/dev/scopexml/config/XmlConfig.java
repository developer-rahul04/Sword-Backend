package com.rm.dev.scopexml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.rm.dev.scopexml")
@ImportResource({"classpath*:applicationScopeContext.xml"})
public class XmlConfig {

}

