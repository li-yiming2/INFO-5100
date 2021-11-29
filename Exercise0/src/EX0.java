public class mySelf {
}
class property {
    private String car;
    private String house;
    private int money;
    private String bike;
    private String bankAccountName;
    private String land;
    private String businessProperty;
    private String investment;


    public property(String car, String house, int money, String bankAccountName) {
        this.car = car;
        this.house = house;
        this.money = money;
        this.bankAccountName = bankAccountName;
        this.bike = "none";
        this.land = "none";
        this.investment = "none";
        System.out.println("Property class has been created!");
    }

    public String getCar() {
        return this.car;
    }
    public String getHouse() {
        return this.house;
    }
    public int getMoney() {
        return this.money;
    }
}

class cat {
    private String name;
    private String bornDate;
    private String hairColor;
    //Not initialized because this exercise only
    private String years;
    private String breed;
    private String bornLocation;
    private String eyeColor;
    private String weight;


    public cat(String name, String bornDate, String hairColor) {
        this.name = name;
        this.bornDate = bornDate;
        this.hairColor = hairColor;
        System.out.println("Cat class has been created!");
    }

    public String getName() {
        return this.name;
    }
    public String getBornDate() {
        return this.bornDate;
    }
    public String getHairColor() {
        return this.hairColor;
    }
}

class dog {
    private String name;
    private String bornDate;
    private String hairColor;

    private String years;
    private String breed;
    private String bornLocation;
    private String eyeColor;
    private String weight;


    public dog(String name, String bornDate, String hairColor) {
        this.name = name;
        this.bornDate = bornDate;
        this.hairColor = hairColor;
        System.out.println("Dog class has been created!");
    }

    public String geName() {
        return this.name;
    }
    public String getBornDate() {
        return this.bornDate;
    }
    public String getHairColor() {
        return this.hairColor;
    }
}

class kitchen {
    private int numOfBowl;
    private int numOfCup;
    private int numOfBottle;
    //Not initialized because this exercise only
    private int numOfSpoon;
    private int numOfKnive;
    private int numOfGlass;
    private int numOfWine;
    private int numOfWineGlass;


    public kitchen(int numOfBowl, int numOfBottle, int numOfCup) {
        this.numOfBowl = numOfBowl;
        this.numOfBottle = numOfBottle;
        this.numOfCup = numOfCup;
        System.out.println("Cat class has been created!");
    }

    public int getNumOfBowl() {
        return this.numOfBowl;
    }
    public int getNumOfBottle() {
        return this.numOfBottle;
    }
    public int getHairColor() {
        return this.numOfCup;
    }
}