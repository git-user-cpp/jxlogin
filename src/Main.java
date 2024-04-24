public class Main {
    public static void main(String[] args) {
        IDAndPasswords idAndPass = new IDAndPasswords();
        new LoginPage(idAndPass.getLoginInfo());
    } 
}
