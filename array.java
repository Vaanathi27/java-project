import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first D");
        int f = sc.nextInt();
        System.out.println("enter the second D");
        int s = sc.nextInt();
        System.out.println("enter the third D");
        int t = sc.nextInt();
        System.out.println("enter the fourth D");
        int o = sc.nextInt();
        int arr[][][][] = new int[f][s][t][o];
        int sum = 0;
        int count = 0;
        int largest = arr[0][0][0][0];
        int smallest = arr[0][0][0][0];
        int average =  0;
        int evencount = 0;
        int oddcount = 0;
        System.out.println("enter the elements in array");
        for(int i=0;i<f;i++){
            for(int j=0;j<s;j++){
                for(int k=0;k<t;k++){
                    for(int l=0;l<o;l++){
                        arr[i][j][k][l] = sc.nextInt();
                    }
                }
            }
        }
         for(int i=0;i<f;i++){
            for(int j=0;j<s;j++){
                for(int k=0;k<t;k++){
                    for(int l=0;l<o;l++){
                        int value =  arr[i][j][k][l];
                        sum+= value;
                        count++;
                        if(value > largest){
                            largest = value;
                        }
                        if(value<smallest){
                            smallest =  value;
                        }
                        if(value%2==0){
                            evencount++;
                        }
                        else {
                            oddcount++;
                        }
                        average = sum/count;
                        
                    }
                }
        }   }
        System.out.println("sum of the array : " + sum);
        System.out.println("count of the elements in the array :"+count);
        System.out.println(" the largest value in the array :"+ largest);
        System.out.println("the smallest value in the array :"+smallest);
        System.out.println("the even count in the array :"+evencount);
        System.out.println("the odd count in the array :" +oddcount);
        System.out.println("the average of the array :" + average);
    }
}