public class Main {
    public static void main(String[] args) {
        IDAndPasswords idAndPass = new IDAndPasswords();
        LoginPage loginPage = new LoginPage(idAndPass.getLoginInfo());
    } 
}
