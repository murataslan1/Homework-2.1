
public class UserManager {
    public void login(User user) {

        System.out.println("Kullanıcı kodu : " + user.getKod() + " Başarıyla giriş yapıldı !");
    }

    public void logout(User user) {
        System.out.println("Kullanıcı kodu : " + user.getKod() + " Başarıyla çıkış yapıldı !");
    }
}