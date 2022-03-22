package BLC2.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class helloWorld {

    @PostConstruct
    public void init() throws Exception{
        System.out.println("Bean has been instantiated and I'm a init() method");
    }

    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Container has been closed and I'm a destroy method");
    }
}
