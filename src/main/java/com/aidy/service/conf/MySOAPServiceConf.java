package com.aidy.service.conf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aidy.service.MySOAPService;

@Configuration
public class MySOAPServiceConf {
    @Autowired
    private Bus bus;
    @Autowired
    private MySOAPService mySOAPService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, mySOAPService);
        endpoint.publish("/MySOAPService");
        return endpoint;
    }
}