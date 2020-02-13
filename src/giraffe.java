public class giraffe extends animal {
    public giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food) {
        if(favoriteFood.equals(food)){
            System.out.println(name+ " eats "+food);
            System.out.println("yum! "+ name+ " wants more " +food);
            sleep();
        }else{
            System.out.println("yuck!! "+ name+ " will not eat "+ food);
        }

    }
}
