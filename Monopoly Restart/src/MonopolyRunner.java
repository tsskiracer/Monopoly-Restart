import java.util.*;

public class MonopolyRunner
	{
		public static void main(String[] args)
			{
				Board.fillList();
				int bankAccount=1500;
				int turns = 0;
				int location = 0;
				int counter = 0;
				int x = 1;
				String uProperties[] = new String[x];
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello and welcome to single player Monopoly where you cannot lose.");
				System.out.println("Would you like to continue? Type 'y' for yes and 'n' for no.");
				String endGame = userInput.next();

				do
					{
						System.out.println("User is on " + Board.position.get(location).getName());
						int diceRoll1 = ((int) ((Math.random() * 6) + 1));
						int diceRoll2 = ((int) ((Math.random() * 6) + 1));
						int diceRoll = diceRoll1 + diceRoll2;
						System.out.println("Hit 'r' to roll the dice.");
						String roll = userInput.next();
						counter++;
						if ((location + diceRoll) > 39)
							{
								location = location + diceRoll - 40;
							}

						else
							{
								location += diceRoll;
							}
						if (roll.equalsIgnoreCase("R"))
							{
								System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2 + ". You landed on " +  Board.position.get(location).getName() + ".");
								if ( Board.position.get(location).getName().equals("Imperial"))
									{
										int chanceAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += chanceAmt;
										System.out
												.println("You have landed on chance. You have recieved $" + chanceAmt);

									}
								if ( Board.position.get(location).getName().equals("Rebels"))
									{
										int ccAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += ccAmt;
										System.out.println(
												"You have landed on Community Chest. You have recieved $" + ccAmt);

									}
								if ( Board.position.get(location).getName().equals("Go") && counter > 0)
									{
										System.out.println("You landed on go and have recieved $200");
										bankAccount += 200;
									} else
									{
										System.out.println("Would you like to buy the property? It costs $" + Board.position.get(location).getRent() + ". If yes, type 'y'. If not, type 'n'.");
										String buy = userInput.next();
										if (buy.equalsIgnoreCase("y"))
											{
												System.out.println("You have now purchased this property. It has been added to your inventory.");
												uProperties[x] =  Board.position.get(location).getName();
												bankAccount -=  Board.position.get(location).getRent();
												x++;
											} else
											{
												System.out.println("You will have a chance to buy it if you land on it again.");
											}
									}
								if (location == 30)

									{

										location = 10;
										System.out.println();
										System.out.println("You are in Jail.");

										do

											{
												System.out.println("Type 'r' when you are ready to roll.");
												String jRoll = userInput.next();
												if (jRoll.equalsIgnoreCase("r"))
													{

														int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

														int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

														System.out.println("You rolled a " + diceRollJ1 + " and a "
																+ diceRollJ2 + ".");

														if (diceRollJ1 == diceRollJ2)

															{

																location = diceRollJ1 + diceRollJ2 + 10;

																System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Board.position.get(location).getName() + ".");

															}

														else

															{

																System.out.println("Sorry, you cannot leave yet.");

															}
														if (turns == 2)
															{
																location = diceRollJ1 + diceRollJ2 + 10;
																System.out.println("You must pay $50 to get out.");
																System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Board.position.get(location).getName() + ".");
																bankAccount-= 50;
															}
														turns++;
													}

											} while (location == 10 && turns < 3);

									}

							}
						System.out.println("You have $" + bankAccount + " in your bank account.");
						System.out.print("You own ");
						if (x > 0)
							{
								for (int i = 0; i < uProperties.length; i++)
									{
										System.out.print(uProperties[i] + ",");
									}
							} else
							{
								System.out.println("nothing.");
							}
						System.out.println(".");

					} while (endGame.equalsIgnoreCase("y"));
			}
	}