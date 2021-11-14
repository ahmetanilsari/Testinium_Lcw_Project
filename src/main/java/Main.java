public class Main {
    public static void main(String[] args) {
        Ecommerce eCommerce = new Ecommerce();
        eCommerce.start(); //Projenin ChromeDriver tanımlanması ve get komutu ile LCW sitesine yönlendirme
        eCommerce.LoginPage(); // Login page kısmının açılması
        eCommerce.login(); // Login işlemlerinin yapıldığı kısım
        eCommerce.productSearch(); // Ürün arama kısmı
        eCommerce.randomProduct();  //
        eCommerce.addToProduct(); //
        eCommerce.finder(); //
        eCommerce.increase(); //
        eCommerce.delete(); //
    }

}