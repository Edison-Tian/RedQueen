package com.jd.fms.rq.test;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 田继东 on 2017/11/6 15:12
 */
public class DockerTest {

    @Test
    public void test(){
        DockerClientConfig clientConfig = null;
        try {
            InputStream inputStream = new FileInputStream("classpath:docker-java.properties");
            Properties properties = new Properties();
            properties.loadFromXML(inputStream);
            clientConfig = DefaultDockerClientConfig.createDefaultConfigBuilder().withProperties(properties).build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DockerClient docker = DockerClientBuilder.getInstance(clientConfig).build();


    }
}
