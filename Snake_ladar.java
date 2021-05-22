import java.util.*;
public class Snake_ladar {
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	static int player1_Position= 0;
	static int player2_Position= 0;
	public void dice() {
		while(player1_Position<100 && player2_Position<100) {
			option = (int) ((Math.random()*10)%3);
			System.out.println("chance : "+option);
			rollDie_1 = (int) (Math.floor(Math.random()*(6)+1));
			switch(option) {
			case noPlay: 
				System.out.println("pass the chance");
				break;
			case ladder:
				rollDie_1 = (int) (Math.floor(Math.random()*(6)+1));
				rollDie_2 = (int) (Math.floor(Math.random()*(6)+1));
				System.out.println("your dice shows : "+rollDie_1);
				System.out.println("your dice shows : "+rollDie_2);
				System.out.println("you got ladder");
				if(player1_Position+rollDie_1<=100) {
					player1_Position=player1_Position+rollDie_1;
					System.out.println("your dice postion is " +player1_Position);
				}else {
					System.out.println("your dice postion is " +player1_Position);
					break;
			}
			count=count+1;
				if(player1_Position+rollDie_2<=100) {
					player2_Position=player2_Position+rollDie_2;
					System.out.println("your dice postion is " +player2_Position);
				}else {
					System.out.println("your dice postion is " +player2_Position);
					break;
				}
				break;
		case snake:
				System.out.println("you got a snake");
				player1_Position=player1_Position-rollDie_1;
				player2_Position=player2_Position-rollDie_2;
				if(player1_Position<0 || player2_Position<0) {
					player1_Position=0;
					player2_Position=0;
					System.out.println("your dice postion is " +player1_Position);
					System.out.println("your dice postion is " +player2_Position);
				}
				else {
					System.out.println("your dice postion is " +player1_Position);
					System.out.println("your dice postion is " +player2_Position);
				}
				count=count+1;    
			}
		}
	public static void main(String[] args) {
		SnakeLadderDemo s = new SnakeLadderDemo();
		s.dice();
	}
}

