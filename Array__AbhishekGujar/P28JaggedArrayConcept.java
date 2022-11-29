package Array__AbhishekGujar;
//JAGGED ARRAY CONCEPT WHERE THE SIZE OF THE EVERY INTERNAL ARRAY IS DIFFERENT
public class P28JaggedArrayConcept {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        a[0]=new int[4];
        a[1]=new int[2];
        a[2]=new int[9];

        for (int i=0;i<a.length;i++){
            System.out.println(a[i].length);
        }
    }
}
