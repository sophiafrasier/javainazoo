public class unicorn extends animal {
    public unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(){
        System.out.println(name+ " sleeps in a cloud");
    }

    public void eat(String food) {
        System.out.println(name+ " eats "+ food);
        if(favoriteFood.equals(food)){
            System.out.println("yum! "+ name+ " wants more " +food);
            sleep();
        }

    }
}
