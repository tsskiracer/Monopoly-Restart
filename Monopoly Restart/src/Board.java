import java.util.ArrayList;

public class Board
	{
		private String name;
		private int cost;
		private int rent;
		private int housePrice;
		private int hr1;
		private int hr2;
		private int hr3;
		private int hr4;
		private int hotelCost;
		private int hotelRent;
		static ArrayList<Board> position = new ArrayList<Board>();

		public Board(String n, int c, int r, int hP, int h1, int h2, int h3, int h4, int hC, int hR)
			{
				name = n;
				cost = c;
				rent = r;
				housePrice = hP;
				hr1 = h1;
				hr2 = h2;
				hr3 = h3;
				hr4 = h4;
				hotelCost = hC;
				hotelRent = hR;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getCost()
			{
				return cost;
			}

		public void setCost(int cost)
			{
				this.cost = cost;
			}

		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public static void fillList()
			{
				position.add(new Board("Go", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Dagobah: Yoda's Hut", 60, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Dagobah: Swamp", 60, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Docking Tax", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Tie Fighter", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Hoth: North Ridge", 100, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Hoth: Echo Base", 100, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Hoth: Frozen Plains", 120, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Just Visiting", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Tatooine: Mos Eisley", 140, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Reactor Core", 150, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Tatooine: Spaceport", 140, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Tatooine: Last Homestead", 160, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Millennium Falcon", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Yavin 4: Temple Throne Room", 180, 14, 100, 70, 200, 550, 750, 100, 950));
				position.add(new Board("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Yavin 4: War Room", 180, 14, 100, 70, 200, 550, 750, 100, 950));
				position.add(new Board("Yavin 4: Massassi Temple", 200, 15, 100, 80, 220, 600, 800, 100, 1000));
				position.add(new Board("Free Space", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Cloud City: Reactor Control Room", 220, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Cloud City: Landing Platform", 220, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Cloud City: Carbon Freezing Chamber", 240, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("X-Wing Fighter", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Death Star: Throne Room", 260, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Death Star: Central Core", 260, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Moisture Farm", 150, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Death Star: Landing Bay", 280, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Go To Jail", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Endor: Ewok Village", 300, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Endor: Forest", 300, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Endor: Shield Generator", 320, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Star Destroyer", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Coruscant: Monument Square", 350, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Bounty", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Board("Coruscant: Imperial Palace", 400, 50, 200, 200, 600, 1400, 1700, 200, 2000));
			}

	}