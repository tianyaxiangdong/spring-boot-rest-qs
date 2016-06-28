package api.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cactus on 2016/6/28.
 */
@Service
public class TestService {

    public Map<String, Object> makeUser(String name, int age) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("age", age);
        return map;
    }
}
