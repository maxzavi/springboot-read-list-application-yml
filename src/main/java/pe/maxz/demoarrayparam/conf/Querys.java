package pe.maxz.demoarrayparam.conf;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties
@Configuration
public class Querys {
    private List<Item> querys;

    public List<Item> getQuerys() {
        return querys;
    }

    public void setQuerys(List<Item> querys) {
        this.querys = querys;
    }


}
