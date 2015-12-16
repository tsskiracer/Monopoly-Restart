import java.util.*;
public class JustVisiting
	{
		static int bankAccount=1500;
		static int turns = 0;
		static int location = 0;
		static int counter = 0;
		static int x = 1;
		
		public static void jV()
			{
					{
						Scanner userInput = new Scanner(System.in);
						System.out.println("You are now going backwards.");
						do
						{
							System.out.println("User is on " + Property.position.get(location).getName());
							int diceRolljv1 = ((int) ((Math.random() * 6) + 1));
							int diceRolljv2 = ((int) ((Math.random() * 6) + 1));
							int diceRolljv = 0-(diceRolljv1 + diceRolljv2);
							System.out.println("Hit 'r' to roll the dice.");
							String rolljv = userInput.next();
							
							
							if ((location + diceRolljv) <0)
								{
									location = location + diceRolljv + 40;
									
								}

							else
								{
									location += diceRolljv;
								}
								
							if (roll.equalsIgnoreCase("R"))
								{
									System.out.println("You rolled a " + diceRolljv1 + " and a " + diceRolljv2 + ". You landed on " +  Property.position.get(location).getName() + ".");
									if ( Property.position.get(location).getName().equals("Imperial"))
										{
											int chanceAmt = (int) ((Math.random() * 750) + 100);
											bankAccount += chanceAmt;
											System.out.println("You have landed on Imperial and recieved $" + chanceAmt + " as a bribe to destroy the rebels.");

										}
									else if (Property.position.get(location).getName().equals("Docking Tax") || Property.position.get(location).getName().equals("Bounty"))
										{
											System.out.println("You have landed on " + Property.position.get(location).getName() + " and must pay $200.");
											bankAccount-=200;
										}
									else if ( Property.position.get(location).getName().equals("Rebels"))
										{
											int ccAmt = (int) ((Math.random() * 750) + 100);
											bankAccount += ccAmt;
											System.out.println(
													"You have landed on Rebels and have recieved $" + ccAmt + "as a gift for protecting the galaxy.");

										}
									else if (Property.position.get(location).getName().equals("Free Space"))
										{
											System.out.println("You have landed on Free Space. $400 has been added to your account.");
											bankAccount+=400;
										}
			
									else if ( Property.position.get(location).getName().equals("Go") && counter > 0)
										{
											System.out.println("You landed on go.");
										}
									else if (location == 30)

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

																	System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Property.position.get(location).getName() + ".");

																}

															else

																{

																	System.out.println("Sorry, you cannot leave yet.");

																}
															if (turns == 2)
																{
																	location = diceRollJ1 + diceRollJ2 + 10;
																	System.out.println("You must pay $50 to get out.");
																	System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Property.position.get(location).getName() + ".");
																	bankAccount-= 50;
																}
															turns++;
														}

												} while (location == 10 && turns < 3);
										}

									else
										{
											System.out.println("Would you like to buy the property? It costs $" + Property.position.get(location).getCost() + ". If yes, type 'y'. If not, type 'n'.");
											String buy = userInput.next();
											if (buy.equalsIgnoreCase("y"))
												{
													System.out.println("You have now purchased this property. It has been added to your inventory.");
													inventory.add(Property.position.get(location));
													bankAccount -=  Property.position.get(location).getCost();
													x++;
												} else
												{
													System.out.println("You will have a chance to buy it if you land on it again.");
												}
										}
									
										}

							System.out.println("You have $" + bankAccount + " in your bank account.");
							System.out.print("You own ");
							if (x > 1)
								{
									for (int i = 0; i < inventory.size(); i++)
										{
											System.out.print(inventory.get(i).getName() + ", ");
										}
								} else
								{
									System.out.print("nothing");
								}
							System.out.println(".");
							counter++;
							System.out.println();
							System.out.println();
							
						} while (location!=10);
						}
			}
	}
