import java.util.HashMap;

public class IDAndPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();

    IDAndPasswords() {
        loginInfo.put("Bro", "Pizza");
        loginInfo.put("Bromitius", "PASSWORD");
        loginInfo.put("Brocode", "Milk");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
