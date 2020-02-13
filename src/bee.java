public class bee extends animal {
    public bee(String name){
        super(name, "pollen");
    }

    public void sleep(){
        System.out.println(name+ " never sleeps.");
    }

    public void eat(String food) {
        if(favoriteFood.equals(food)){
            System.out.println("yum! "+ name+ " wants more " +food);
            sleep();
        }else{
            System.out.println("yuck!! "+ name+ " will not eat "+ food);
        }

    }
}
