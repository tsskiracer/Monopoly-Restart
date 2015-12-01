import java.util.ArrayList;

public abstract class Player
	{
		private String name;
		private String token;
		private int money;
		static ArrayList<Player> players = new ArrayList<Player>();
		public Player(String n, String t, int m)
		{
			name=n;
			token=t;
			money=m;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getToken()
			{
				return token;
			}
		public void setToken(String token)
			{
				this.token = token;
			}
		public int getMoney()
			{
				return money;
			}
		public void setMoney(int money)
			{
				this.money = money;
			}
		public static void fillList()
		{
			players.add(new Player("Trip", "Race Car", 1500));
		}
		
		
	}
