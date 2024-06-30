package Repository;

public class CartPageRepository {
    public static String productXpath = "//*[@id=\"cartformpage\"]/div/div/div/div[2]/div[1]/a/h3";
    public static String addNumberXpath = "//*[@id=\"cartformpage\"]/div/div/div/div[2]/div[2]/div[2]/div/button[2]";
    public static String deleteButtonXpath = "//*[@id=\"cartformpage\"]/div/div/div/div[1]/div[2]/div/a";
    public static String totalPriceXpath = "//*[@id=\"cart-buy-order-box\"]/section[4]/div[3]/span[2]";
    public static String emptyCartXpath = "//*[@id=\"cart-buy-order-box\"]/section[2]/div/div/div/text()";
}
