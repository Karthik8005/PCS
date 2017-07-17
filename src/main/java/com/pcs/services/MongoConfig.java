package com.pcs.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "pcs";
	}

	@Override
	@Bean
	public MongoClient mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient("localhost",27017);
	}
	
	@Override
	@Bean
	protected String getMappingBasePackage(){
		return  "com.pcs.services.entities";
	}

	@Override
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		// TODO Auto-generated method stub
		return new SimpleMongoDbFactory(mongo(),getDatabaseName());
	}

	@Override
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		// TODO Auto-generated method stub
		return new MongoTemplate(mongoDbFactory());
	}

}
