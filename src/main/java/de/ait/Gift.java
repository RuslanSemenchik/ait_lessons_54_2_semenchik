package de.ait;

public class Gift {
    private String name;
    private double price;
    private boolean isWrapped;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            }
        else {
            System.out.println("Стоимость не может быть отрицательной");
        }




        }

    public void wrapGift(){
        if(price != 0) {
            isWrapped = true;
            System.out.println("может быть завернут");
        }
        else {
            System.out.println("низкая стоимость");
        }
    }

    public void unwrapGift() {
        isWrapped = false;
        System.out.println("не может быть завернут");
    }



}






    }







}













