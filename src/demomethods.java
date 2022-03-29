
public class demomethods {
   public static void main(String args[])
   {
	   String playername = "john";
	   int score = 800;
	   int levelcompleted = 5;
	   int bonus = 100;
	   boolean gameover = true;
	   if(gameover) {
		   int finalscore = score +(levelcompleted * bonus);
		   System.out.println("player:" +playername + ", your final score was" +finalscore);
	   }
	   CalculateScore();
	   CalculateScore1();
	   
   }

	   public static void CalculateScore()
	   {
		   String playername = "max";
		   int score = 500;
		   int levelcompleted = 5;
		   int bonus = 100;
		   boolean gameover = true;
		   if(gameover) {
			   int finalscore = score +(levelcompleted * bonus);
			   System.out.println("player:" +playername + ", your final score was" +finalscore);
		   }
	   }
				   
		   public static void CalculateScore1()
		   {
			   String playername = "max";
			   int score = 500;
			   int levelcompleted = 5;
			   int bonus = 100;
			   boolean gameover = true;
			   if(gameover) {
				   int finalscore = score +(levelcompleted * bonus);
				   System.out.println("player:" +playername + ", your final score was" +finalscore);
			   }
		   }
		   
			   
   
}
