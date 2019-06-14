package com.zy.mongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 502341194@gmail.com
 * @ClassName MongoDBConfig
 * @date 2019/6/14 10:28
 * @Description TODO
 * @Version 1.0
 **/
@Configuration
@ImportResource(locations = {"classpath:application-mongo.xml"})
public class MongoDBConfig {
}
