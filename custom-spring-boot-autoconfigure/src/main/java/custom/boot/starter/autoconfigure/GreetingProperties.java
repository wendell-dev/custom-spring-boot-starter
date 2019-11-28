package custom.boot.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 打招呼功能的配置属性
 *
 * @author wendell
 */
@ConfigurationProperties(prefix = "greeting")
public class GreetingProperties {

    /**
     * GreetingProperties 开关
     */
    private boolean enable = false;

    /**
     * 需要打招呼的成员列表
     */
    private List<String> members = new ArrayList<>();

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
