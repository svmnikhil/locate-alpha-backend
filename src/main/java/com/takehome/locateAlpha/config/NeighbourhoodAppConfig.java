package com.takehome.locateAlpha.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.takehome.locateAlpha.custom.CustomUGeojsonSerializer;
import org.locationtech.jts.geom.Geometry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NeighbourhoodAppConfig {

    @Bean
    public ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Geometry.class, new CustomUGeojsonSerializer());
        objectMapper.registerModule(simpleModule);
        return objectMapper;
    }
}
