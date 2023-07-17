import java.util.HashMap;

public class UserPassword {

    HashMap<String,String> info=new HashMap<>();

    public UserPassword() {
        this.info = info;
        info.put("hesam","sandwich");
        info.put("reza","gholi");
        info.put("ali","1234");
    }
    public HashMap getInfo(){

        return info;
    }
}
