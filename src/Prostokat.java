public class Prostokat {
    private double lenght;
    private double height;
    public double pole(){
        return lenght*height;
    }
    public double obwod(){
        return 2*height+2*lenght;
    }
    public double przekatna(){
        return Math.sqrt(height*height+lenght*lenght);
    }
    public Prostokat(double height, double lenght){
        this.height= height;
        this.lenght= lenght;
    }
}
