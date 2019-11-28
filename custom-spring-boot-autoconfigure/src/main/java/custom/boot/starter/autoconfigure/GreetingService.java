package custom.boot.starter.autoconfigure;

import java.util.ArrayList;
import java.util.List;

/**
 * 打招呼功能服务, 在配置文件里面可配置多个member，然后输出这些member
 *
 * @author wendell
 */
public class GreetingService {

    public GreetingService(List<String> members) {
        this.members = members;
    }

    private List<String> members = new ArrayList<>();

    public void sayHello() {
        members.forEach(s -> System.out.println("hello " + s));
    }

}
