public class ArrayFactory {
    private int num;
    public ArrayFactory(int x){
        this.num = x;
    }
    public int[] oneDimension(){
        return new int[num];
    }
    public int[][] twoDimensions(){
        //druga opcja
//        int[][] array = new int[num][];
//        for(int i = 0; i < size; i++) {
//            array[i] = new int[num];
//        }
//        return array;
        return new int[num][num];
    }
}
