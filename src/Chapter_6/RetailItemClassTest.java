package Chapter_6;

public class RetailItemClassTest {
    public static void main(String[] args) {

        RetailItemClass item1 = new RetailItemClass("Widget", 2, 10);
        RetailItemClass item2 = new RetailItemClass("Gadget", 3, 15);
        RetailItemClass item3 = new RetailItemClass("Clothing", 4,200);

        System.out.println("Item # \t"+"Description\t\t"+"Units on Hand\t\t"+"Price");
        System.out.println("__________________________________________________");
        System.out.println("1\t\t"+item1.getDescription()+"\t\t\t\t"
                +item1.getUnitsOnHand()+"\t\t\t\t"+item1.getPrice());

        System.out.println("2\t\t"+item2.getDescription()+"\t\t\t\t"
                +item2.getUnitsOnHand()+"\t\t\t\t"+item2.getPrice());

        System.out.println("3\t\t"+item3.getDescription()+"\t\t\t"
                +item3.getUnitsOnHand()+"\t\t\t\t"+item3.getPrice());
    }
}
