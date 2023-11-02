package pe.maxz.demoarrayparam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import pe.maxz.demoarrayparam.conf.Querys;

@Service
@Log4j2
public class DemoService {

    @Autowired
    Querys query;

    @Value("${environment}")
    String environment;

    public void print(){
        log.info("Value env:" +environment );
        for (var object : query.getQuerys()) {
            log.info(object.getSql());
        }
    }
}
