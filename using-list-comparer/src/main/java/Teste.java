import java.math.BigDecimal;
import java.math.BigInteger;

public class Teste {
    public static void main(String[] args) {
        User user = new User();
        user.setId(BigInteger.valueOf(1));
        //user.setName("João");
        System.out.println(user);
        System.out.println();

        var product = new Product();
        product.setId(BigInteger.valueOf(1));
        //product.setDescription("Product 1");
        product.setPrice(BigDecimal.valueOf(10.0));
        System.out.println(product);
    }
}
