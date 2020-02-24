public class MyNumber {
    private double myNumber;
    public MyNumber(double n){
        this.myNumber= n;
    }
    public boolean isOdd(){
//        boolean odd;
//        i
//            odd=true;
//        else
//            odd=false;
        return (myNumber%2==1);
    }
    public boolean isEvem(){
        return !isOdd();
    }
    public double sqrt(){
        return Math.sqrt(myNumber);
    }
    public MyNumber pow(MyNumber x){
        return new MyNumber(Math.pow(myNumber, x.myNumber));
    }
    public MyNumber add(MyNumber x){
        return new MyNumber(myNumber+x.myNumber);
    }
    public MyNumber subtract(MyNumber x){
        return  new MyNumber(myNumber-x.myNumber);
    }
    @Override
    public String toString() {
        return String.valueOf(myNumber);
    }
}
