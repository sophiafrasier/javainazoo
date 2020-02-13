public class zookeeper {
    public String name;

    public zookeeper(String name){
        this.name=name;
    }

    public void feedAnimals(animal[] animals, String food){
        System.out.println(name+ " is feeding "+ food+ " to "+ animals.length+ " animals." + " of "+ animal.population + " total animals.");
        for(int i=0; i<animals.length; i++){
            animals[i].eat(food);
        }
    }
}
