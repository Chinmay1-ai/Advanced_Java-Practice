//package com.config;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//
//@ComponentScan("com.tka")
//@EnableAspectJAutoProxy
//public class ConfigClass {
//
//}


package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan("com.*")
@EnableAspectJAutoProxy
public class ConfigClass {

}