package com.driver;

public class Pizza {

    public int cheesePrice;

    public  int basePrice;

    public int toppingsPrice;

    public int paperBagPrice;

    String bill;

    public int totalPrice;

    boolean isCheeseAdded;

    boolean isToppingsAdded;

    boolean isPaperBagAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        // your code goes here

        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
        }
        else{
            basePrice = 400;
            toppingsPrice = 120;
        }

        paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;

        totalPrice = basePrice;



        bill = "Base Price Of The Pizz: "+basePrice+ "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!isCheeseAdded){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            totalPrice = totalPrice + toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(isPaperBagAdded == false){
            totalPrice = totalPrice + paperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false){
            if(isCheeseAdded == true){
                bill = bill + "Extra Cheese Added: "+cheesePrice + "\n";

            }
            if(isToppingsAdded){
                bill = bill + "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded){
                bill = bill + "Paperbag Added: "+paperBagPrice + "\n";
            }
            bill = bill + "Total Price: "+totalPrice+"\n";
            isBillGenerated = true;
        }

        return bill;
    }
}
