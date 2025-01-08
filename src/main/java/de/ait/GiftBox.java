package de.ait;

import java.util.ArrayList;

public class GiftBox {
    ArrayList<Gift> gifts = new ArrayList<>();
    public void addGift(Gift gift) {
        if (gift!= null) {
            System.out.println("Не корректый ввод");
        }
        else{
            gifts.add(gift);

        }
    }
  public  void removeGift(Gift gift){
        boolean isFound =
  }
}
