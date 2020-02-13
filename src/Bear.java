public class Bear extends animal {

    public Bear(String name) {
        super(name, "fish");
    }

    public void sleep(){
        System.out.println(name+ " hibernates for 4 months.");
    }

}
