class Ecommerce {

    String component;
    int price;
}

public class EcommerceObjectReferenceAssignment {

    public static void main(String args[]) {

        Ecommerce e1 = new Ecommerce();

        e1.component = "laptop";
        e1.price = 5000;

        Ecommerce e2 = e1;

        e2.price = 45000;

        System.out.println(e1.price);
        System.out.println(e2.price);
    }
}