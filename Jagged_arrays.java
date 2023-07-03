package Lecture17;
public class Jagged_arrays {
    static void print_jaggu(int A[][])
{
        //printing jagged array properly
        
 	//all rows in separate lines
        for(int i=0;i<A.length;i++){ //rows 
            for(int j=0;j<A[i].length;j++)
		{                                        //coloums
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int A[][]=new int[3][];
        A[0]=new int[3];
        A[1]=new int[2];
        A[2]=new int[3];
        print_jaggu(A);
        int arr[][]=new int[3][];

        // we can't use initializer list here, since it doesn't create an object
        // A[0]={1,2,3};

        // A[1]={4,5};
        // A[2]={6,7,8};
        arr[0]=new int[] {1,2,3};
        arr[1]=new int[] {4,5};
        arr[2]=new int[] {6,7,8};

        System.out.println("-----------------------------------");
        print_jaggu(arr);
    }
}