public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppings=150;
    private int backPack=20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg)
        {
            this.price=300;
        }
        else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese()
    {
        //System.out.println("Extra Cheese Added!");
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }
    public void addExtraToppings()
    {
        //System.out.println("Extra Toppings Added!");
        isExtraToppingsAdded=true;
        this.price+=extraToppings;
    }
    public void takeAway()
    {
        //System.out.println("Take away opted.");
        isOptedForTakeAway=true;
        this.price+=backPack;
    }
    public void getBill()
    {
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice+"₹");
        if(isExtraCheeseAdded)
        {
            bill+="Extra cheese added: "+extraCheesePrice+"₹"+"\n";
        }
        if(isExtraToppingsAdded)
        {
            bill+="Extra toppings added: "+extraToppings+"₹"+"\n";
        }
        if(isOptedForTakeAway)
        {
            bill+="Take away: "+backPack+"₹"+"\n";
        }
        bill+="Bill: "+this.price+"₹"+"\n";
        System.out.println(bill);
    }

}
