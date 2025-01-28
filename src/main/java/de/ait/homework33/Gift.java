package de.ait.homework33;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gift {
    private static final Logger log = LoggerFactory.getLogger(Gift.class);

    private String name;// название подарка
    private GiftCategory category; // категория подарка (используйте enum GiftCategory)
    private GiftStatus status;     //  статус подарка (используйте enum GiftStatus)

    public Gift (String name, GiftCategory category, GiftStatus status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }



    public String getName() {
        return name;
    }

    public GiftCategory getCategory() {
        return category;
    }

    public GiftStatus getStatus() {
        return status;
    }



    public void setCategory(GiftCategory category) {
        if (category == null){
            System.out.println("Caterory : "+ category + " is null");
            log.warn("Caterory : "+ category + " is null");
        }
        else {
            this.category = category;
        }
    }

    public void setStatus(GiftStatus status) {
        if (status == null) {
            System.out.println("Status : "+ status + " is null");
        }
        else {
            this.status = status;
        }
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }
}
