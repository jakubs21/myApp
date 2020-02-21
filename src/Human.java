public class Human {
    private int age;
    private double weight;
    private double height;
    private String name;
    private boolean isMale;

    public double getBMI(){
        return weight/(height*height/10000);
    }
    public boolean isMale() {
        return isMale;
    }
    public int getAge(){
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public Human(int age, double weight, int height, String name, boolean isMale){
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.name=name;
        this.isMale=isMale;
    }
}
