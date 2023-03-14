public class JaggedArray {
    public static void main(String[] args) {
        int jaggArray[][] = new int[2][];

        jaggArray[0] = new int[3];
        jaggArray[1] = new int[2];

        jaggArray[0][1] = 11;

        for(int i=0; i<jaggArray.length; i++){
            for(int j=0; j<jaggArray[i].length; j++){
                System.out.print(jaggArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}