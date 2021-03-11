package yaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

// DATE: 2021/3/9-13:14  Happy Every Day
@Component
public class User {
    @Value("${account.id}")
    private Integer id;
    @Value("${account.name}")
    private String name;
//    @Value("${list}")
    @Value("#{'${list}'.split(',')}")
    private List<Integer> xh;
    public User() {
    }

    public User(Integer id, String name, List xh) {
        this.id = id;
        this.name = name;
        this.xh = xh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getXh() {
        return xh;
    }

    public void setXh(List xh) {
        this.xh = xh;
    }
}
