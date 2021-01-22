

/**
 *
 * @author MMK
 */
public class ArrayPractice 
{
    public static void main(String[] args)
    {
        // One Dimentional Array
        int[] myarray = new int[5];
        myarray [0] = 1;
        myarray [1] = 5;
        myarray [3] = 20;
        myarray [4] = 59;
        myarray [2] = 79;
        
        
        System.out.println(myarray[3]);
        
        // One dimentional array using loop 
        int[] myarray2 = new int[5];
     
        for (int i = 0; i<myarray2.length; i++ )
        {
        myarray2[i] = i;
        System.out.println(myarray2[i]);
        }
        
        
        // MultiDimentional Array
        double[][] myarray3 = new double[4][3];
        myarray3[0][0] = 5; myarray3[0][1] = 10; myarray3[0][2] = 25;
        myarray3[1][0] = 2; myarray3[1][1] = 12; myarray3[1][2] = 22;
        myarray3[2][0] = 3; myarray3[2][1] = 13; myarray3[2][2] = 33;
        myarray3[3][0] = 4; myarray3[3][1] = 14; myarray3[3][2] = 44;
        
        System.out.println(myarray3[1][0]);
        
        
        // Two dimentional array using loop 
        int[][] myarray4 = { {1,2,3},{4,5,6} };
        
        for (int row = 0; row < myarray4.length; row++ )
        {
            for(int col = 0; col < myarray4[0].length; col++)
            {
                System.out.println(myarray4[row][col]);
            }
        }
        
        
}
}