package api.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cactus on 2016/6/28.
 */
public class Message {
    boolean result;
    Map<String, Object> data = new HashMap<String, Object>();

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
