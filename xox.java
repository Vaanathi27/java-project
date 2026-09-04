import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char player1;
	    char player2;
	    char arr[][] = new char[3][3];

	    for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = ' ';
            }
        }

	    System.out.println("player1 choose your coin X or O");
	    player1 = sc.next().charAt(0);
	    if(player1 == 'X'){
	        player2 = 'O';
	    }
	    else{
	        player2 = 'X';
	        player1 = 'O';
	    }
	    System.out.println("player1 is"+player1);
	    System.out.println("player2 is"+player2);

	    for(int c = 1; c<= 9; c++){
	        int pos;
	        char play;

       if(c % 2 != 0){
        System.out.println("player1 Enter Position:");
        pos = sc.nextInt();
        play = player1;
       }
       else{
        System.out.println("Player2 Enter Position:");   
        pos = sc.nextInt();
        play = player2;

       }
   int row = 0;
  int col = 0;
  if(pos==1){
      row = 0;
      col = 0;
  }
  if(pos==2){
          row = 0;
          col = 1;
      }
  if(pos==3){ 
          row = 0;
          col = 2;
      }
  if(pos==4){
          row = 1;
          col = 0;
      }
  if(pos==5){
          row = 1;
          col = 1;
      }
    if(pos==6){
          row = 1;
          col = 2;
      }
    if(pos==7){
          row = 2;
          col = 0;
      }
    if(pos==8){
          row = 2;
          col = 1;
      }
    if(pos==9){
          row = 2;
          col = 2;
      }
	
  if (arr[row][col] == ' ') {
    arr[row][col] = play;
    } 
    else {
    System.out.println("filled ");

    }
  

	    for(int i=0;i<3;i++){
	         System.out.println("*---*---*---*");
	        for(int j=0;j<3;j++){
	            System.out.print("|"+arr[i][j]+"  "  );
	            
	        }
	        System.out.println("|");
	    }
		System.out.println("*---*---*---*");
	    }
  }
}

