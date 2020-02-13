public class animal {
    public String name;
    public String favoriteFood;
    public static int population;

    public animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;

    }

    public void sleep() {
        System.out.println(name+ " sleeps for 8 hours");

    }


    public void eat(String food) {
        System.out.println(name+ " eats "+ food);
        if(favoriteFood.equals(food)){
            System.out.println("yum! "+ name+ " wants more " +food);
        }else{
            sleep();
        }

    }

    public int population(animal[] animals){
        for(int a=0; a<animals.length; a++){
            animal.population= animal.population+1;
        }
        return animal.population;
    }



}
