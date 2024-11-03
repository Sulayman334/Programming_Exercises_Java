package Misscellaneous.LoginSystem;

import java.util.HashMap;
import java.util.Map;

public class IdAndPasswords {

    HashMap<String,String> loginInfo = new HashMap<>();
    public IdAndPasswords() {
        loginInfo.put("Saul", "Sully");
        loginInfo.put("Lamin", "Lello");
        loginInfo.put("Bamba","Ahmad");
    }

    protected HashMap<String, String> getLoginInfo(){
        return loginInfo;
    }
}
