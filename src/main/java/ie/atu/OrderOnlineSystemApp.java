package ie.atu;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        MenuItem[] menuItems = new MenuItem[]{
                new Burger("chicken cheese burger", 8.50, "pickles,chicken,mayonnaise,cheese"),
                new Pizza("chicken and bacon pizza",15.00,"mozzarella cheese,chicken,bacon,tomato sauce"),
                new Salad("Chicken salad",12.40,"boiled eggs,lattice, croutons,grated cheese,chicken goujons"),
                new Dessert("Chocolate Pudding",6.00,"chocolate sponge cake, vanilla ice cream")
        };

        for(MenuItem menuItem : menuItems){
            System.out.println("Name:" + menuItem.getName()+ "\nDescription:" + menuItem.getDescription() + "\nPrice:" +menuItem.getPrice() +"\n");
        }
        double totalCost =0;
        for(MenuItem menuItem : menuItems){
            totalCost += menuItem.getPrice();
        }
        System.out.println(";Total Cost: £" + totalCost);
    }
}
