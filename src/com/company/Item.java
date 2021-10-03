package com.company;

public class Item {

    String Name;
    String Quantity;
    String Price;

    public Item(String string) {

        String subQuantity = string.substring(string.indexOf("#")+1);
        Quantity = subQuantity.substring(0, subQuantity.indexOf(" "));
        String subName = string.substring(string.indexOf("@")+1);
        Name = subName.substring(0, subName.indexOf(" "));
        Price = string.substring(string.indexOf("$")+1);

    }

    public void getTotal() {

        double price = Double.parseDouble(Price);
        int quantity = Integer.parseInt(Quantity);
        double totalPrice = price * quantity;

        System.out.println("\nName: " + Name + "\nQuantity: " + quantity + "\nPrice: $" + price + "\nTotal: $" + totalPrice);

    }
}
