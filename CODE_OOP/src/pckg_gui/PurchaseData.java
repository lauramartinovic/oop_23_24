package pckg_gui;

public class PurchaseData {

    private String category;
    private String payment;
    private String delivery;
    private boolean giftCard;
    private boolean giftBox;
    private boolean specialGift;

    public PurchaseData(String category, String payment, String delivery, boolean giftCard, boolean giftBox, boolean specialGift){
        this.category = category;
        this.delivery = delivery;
        this.payment = payment;
        this.giftCard = giftCard;
        this.giftBox = giftBox;
        this.specialGift = specialGift;
    }

    @Override
    public String toString() {
        return "PurchaseData{" +
                "category='" + category + '\'' +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", giftCard=" + giftCard +
                ", giftBox=" + giftBox +
                ", specialGift=" + specialGift +
                '}';
    }
}
