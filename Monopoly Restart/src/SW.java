
public class SW
	{
		static int bankAccount=1500;
		public static void imperial()
			{
				int chanceAmt = (int) ((Math.random() * 750) + 100);
				bankAccount += chanceAmt;
				System.out.println("You have landed on Imperial and recieved $" + chanceAmt + " as a bribe to destroy the rebels.");
			}
		public static void rebels()
			{
				int ccAmt = (int) ((Math.random() * 750) + 100);
				bankAccount += ccAmt;
				System.out.println("You have landed on Rebels and have recieved $" + ccAmt + "as a gift for protecting the galaxy.");
			}
	}
