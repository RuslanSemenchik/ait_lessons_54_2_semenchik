package de.ait.homework33;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static de.ait.homework33.GiftCategory.TOYS;


public class GiftManager {
    private static final Logger log = LoggerFactory.getLogger(GiftManager.class);
    private List<Gift> gifts;

    public GiftManager() {
        gifts = new ArrayList<>();
    }

    public List<Gift> getGifts() {
        return new ArrayList<>(gifts);
    }

    public void addGift(Gift gift) {
        if (gift == null) {
            System.out.println("Gift is null");
            log.warn("Gift is  null");
        } else if (gift.getName() == null || gift.getName().trim().isEmpty() || gift.getCategory() == null
                || gift.getStatus() == null) {
            System.out.println("Gift is invalid");
        } else {
            gifts.add(gift);
            System.out.println("Gift " + gift.getName() + " added");
        }
    }

    public List<Gift> filterByCategory(GiftCategory category) {

        if (category == null ) {
            System.out.println("Category is null");
            log.warn("Category is null");
            return null;
        } else {
            int counter = 1;

            List<Gift> giftsByCategory = getGifts();
            for (Gift gift : giftsByCategory) {
                if (gift.getCategory()==category) {
                    System.out.println( counter+ " ."+ gift.getName()+", Категория :"+ gift.getCategory()+ ", Статус:"+ gift.getStatus());
                    counter++;
                }

            }

            log.info(" List of gifts by category: " + category + " created");
            return giftsByCategory;
        }


    }

    public void updateGiftStatus(String giftName, GiftStatus newStatus) {
        boolean found = false;

        if (giftName == null || giftName.trim().isEmpty() || newStatus == null) {
            System.out.println("Gift name : " + giftName + " or " + " new status : " + newStatus + " is null or empty");

        } else {
            for (Gift gift : gifts) {
                if (gift.getName().equals(giftName)) {
                    gift.setStatus(newStatus);
                    System.out.println(" Status  of gift name : " + giftName + " to " + newStatus + " updated");
                    found = true;
                    log.info(" Status  of gift name : " + giftName + " to " + newStatus + " updated");
                    break;
                }

            }
            if (!found) {
                System.out.println("Gift with name : " + giftName + " not found");
                log.info("Gift with name : " + giftName + " not found");
            }

        }

    }

    public void showGifts() {
        System.out.println("Список всех подарков: ");
        List<Gift> showGiftslist =  getGifts();
        if (showGiftslist.isEmpty()){
            System.out.println("Gift list is empty");
        log.warn("Gift list is empty");
    }
        else {
            int counter = 1;

            for (Gift gift : showGiftslist) {
                System.out.println( counter+ " ."+ gift.getName()+", Категория :"+ gift.getCategory()+ ", Статус:"+ gift.getStatus());
                counter++;
            }


        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftManager that = (GiftManager) o;
        return Objects.equals(gifts, that.gifts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gifts);
    }
}






