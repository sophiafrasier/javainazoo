public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        unicorn rarity = new unicorn("rarity");
        rarity.eat("marshmallows");
        giraffe gemma = new giraffe("gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        bee stinger = new bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        animal[] animals= {tigger, pooh, rarity, gemma, stinger};

        zookeeper zoebot= new zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "meat");
    }

}
