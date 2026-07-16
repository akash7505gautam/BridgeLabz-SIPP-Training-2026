interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code);
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "OFF", "WELCOME", "ABC", "DISCOUNT20"};

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            if (cart.validateCoupon(code)) {
                System.out.println(code + " : Valid");
            } else {
                System.out.println(code + " : Invalid");
            }
        }
    }
}