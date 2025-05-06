import java.util.Scanner;

public class NokiaModdedTest2{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int userInput = -1;
	while(userInput != 0){

	String phoneStart = """
	NOKIA
	Select a number
	1. Phone Book
	2. Messages
	3. Chat
	4. Call Register
	5. Tones
	6. Settings
	7. Call Divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM Services
	0. Phone Off

			""";
	
	System.out.println(phoneStart);
	userInput = input.nextInt();
	
	switch(userInput){

	case 1: 
		int newUserInput1 = 1;
		while(newUserInput1 != 0){

			String phonebook = """

			Phone Book
			Select a number
			1. Search
			2. Services Nos.
			3. Add Name
			4. Erase
			5. Edit
			6. Assign Tone
			7. Send B'card
			8. Options
			9. Speed Dials
			10. Voice Tags
			0. Back

					""";
			
			System.out.println(phonebook);
			newUserInput1 = input.nextInt();

			switch(newUserInput1){
	
				case 1: 	
	
					int newUserInput1_1 = -1;
					while(newUserInput1_1 != 0){
	
						String search = """

						Search
						0. Back

							""";

						System.out.println(search);
						newUserInput1_1 = input.nextInt();
				
						switch(newUserInput1_1){
							case 0: newUserInput1_1 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_1 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Search while loop ends
					break;


				case 2: 	

					int newUserInput1_2 = -1;
					while(newUserInput1_2 != 0){
	
						String servicesNos = """

						Services Nos.
						0. Back

							""";

						System.out.println(servicesNos);
						newUserInput1_2 = input.nextInt();
				
						switch(newUserInput1_2){
							case 0: newUserInput1_2 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_2 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Services Nos while loop ends
					break;

				
				case 3:		
				
					int newUserInput1_3 = -1;
					while(newUserInput1_3 != 0){
		
						String addName = """

						Add Name
						0. Back

							""";

						System.out.println(addName);
						newUserInput1_3 = input.nextInt();
				
						switch(newUserInput1_3){
							case 0: newUserInput1_3 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_3 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Add Name while loop ends
					break;


				case 4:	
					
					int newUserInput1_4 = -1;
					while(newUserInput1_4 != 0){
	
						String erase = """

						Erase
						0. Back

							""";

						System.out.println(erase);
						newUserInput1_4 = input.nextInt();
				
						switch(newUserInput1_4){
							case 0: newUserInput1_4 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_4 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Erase while loop ends
					break;


				case 5: 	

					int newUserInput1_5 = -1;
					while(newUserInput1_5 != 0){
	
						String edit = """

						Edit
						0. Back

							""";

						System.out.println(edit);
						newUserInput1_5 = input.nextInt();
				
						switch(newUserInput1_5){
							case 0: newUserInput1_5 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_5 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Edit while loop ends
					break;
	

				case 6:		
				
					int newUserInput1_6 = -1;
					while(newUserInput1_6 != 0){
	
						String assignTone = """

						Assign Tone
						0. Back

							""";

						System.out.println(assignTone);
						newUserInput1_6 = input.nextInt();
				
						switch(newUserInput1_6){
							case 0: newUserInput1_6 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_6 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Assign Tone while loop ends
					break;


				case 7: 	
	
					int newUserInput1_7 = -1;
					while(newUserInput1_7 != 0){
	
						String sendBcard = """

						Send B'card
						0. Back

							""";

						System.out.println(sendBcard);
						newUserInput1_7 = input.nextInt();
				
						switch(newUserInput1_7){
							case 0: newUserInput1_7 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_7 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Send B'card while loop ends
					break;


				case 8: 	
	
					int newUserInput1_8 = -1;
					while(newUserInput1_8 != 0){
	
						String options = """

						Options
						Select a number
						1.Type of View
						2. Memory Status
						0. Back

							""";

						System.out.println(options);
						newUserInput1_8 = input.nextInt();
				
						switch(newUserInput1_8){
							case 1: 
								int newUserInput1_8_1 = -1;
								while(newUserInput1_8_1 != 0){
	
									String typeOfView = """

									Type of View
									0. Back

										""";

									System.out.println(typeOfView);
									newUserInput1_8_1 = input.nextInt();
				
									switch(newUserInput1_8_1){
										case 0: newUserInput1_8_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput1_8_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Type of View while loop ends
								break;


							case 2: 
								int newUserInput1_8_2 = -1;
								while(newUserInput1_8_2 != 0){
	
									String memoryStatus = """

									Memory Status
									0. Back

										""";

									System.out.println(memoryStatus);
									newUserInput1_8_2 = input.nextInt();
				
									switch(newUserInput1_8_2){
										case 0: newUserInput1_8_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput1_8_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Memory Status while loop ends
								break;

	
							default: if(newUserInput1_8 != 0) System.out.println("Invalid Input! Try Again..");

						}
			
					}//Options while loop end
					break;


				case 9: 	
	
					int newUserInput1_9 = -1;
					while(newUserInput1_9 != 0){
	
						String speedDials = """

						Speed Dials
						0. Back

							""";

						System.out.println(speedDials);
						newUserInput1_9 = input.nextInt();
				
						switch(newUserInput1_9){
							case 0: newUserInput1_9 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_9 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Speed Dials while loop ends
					break;


				case 10: 	
	
					int newUserInput1_10 = -1;
					while(newUserInput1_10 != 0){
	
						String voiceTags = """

						Voice Tags
						0. Back

							""";

						System.out.println(voiceTags);
						newUserInput1_10 = input.nextInt();
				
						switch(newUserInput1_10){
							case 0: newUserInput1_10 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput1_10 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Voice Tags while loop ends
					break;


				default: 
					if(newUserInput1 != 0) System.out.println("Invalid Input! Try Again..");
				
			}//switch end for phonebook

		}//Phonebook while loop ends
		break;

	
	case 2: 
		int newUserInput2 = -1;
		while(newUserInput2 != 0){

			String messages  = """
			Messages
			Select a number
			1. Write Message
			2. Indox
			3. Outbox
			4. Picture Message
			5. Templates
			6. Smileys
			7. Message Settings
			8. Info Service
			9. Voice Mailbox Number
			10. Service Command Editor
			0. Back

				""";

			System.out.println(messages);
			newUserInput2 = input.nextInt();

			switch(newUserInput2){


				case 1: 	
	
					int newUserInput2_1 = -1;
					while(newUserInput2_1 != 0){
	
						String writeMessage = """

						Write Message
						0. Back

							""";

						System.out.println(writeMessage);
						newUserInput2_1 = input.nextInt();
				
						switch(newUserInput2_1){
							case 0: newUserInput2_1 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_1 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Write Message while loop ends
					break;


				case 2: 	

					int newUserInput2_2 = -1;
					while(newUserInput2_2 != 0){
	
						String inbox = """

						Inbox
						0. Back

							""";

						System.out.println(inbox);
						newUserInput2_2 = input.nextInt();
				
						switch(newUserInput2_2){
							case 0: newUserInput2_2 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_2 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Inbox while loop ends
					break;

				
				case 3:		
				
					int newUserInput2_3 = -1;
					while(newUserInput2_3 != 0){
		
						String outbox = """

						Outbox
						0. Back

							""";

						System.out.println(outbox);
						newUserInput2_3 = input.nextInt();
				
						switch(newUserInput2_3){
							case 0: newUserInput2_3 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_3 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Outbox while loop ends
					break;


				case 4:	
					
					int newUserInput2_4 = -1;
					while(newUserInput2_4 != 0){
	
						String pictureMessage = """

						Picture Message
						0. Back

							""";

						System.out.println(pictureMessage);
						newUserInput2_4 = input.nextInt();
				
						switch(newUserInput2_4){
							case 0: newUserInput2_4 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_4 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Picture Message while loop ends
					break;


				case 5: 	

					int newUserInput2_5 = -1;
					while(newUserInput2_5 != 0){
	
						String templates = """

						Templates
						0. Back

							""";

						System.out.println(templates);
						newUserInput2_5 = input.nextInt();
				
						switch(newUserInput2_5){
							case 0: newUserInput2_5 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_5 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Templates while loop ends
					break;
	

				case 6:		
				
					int newUserInput2_6 = -1;
					while(newUserInput2_6 != 0){
	
						String smileys = """

						Smileys
						0. Back

							""";

						System.out.println(smileys);
						newUserInput2_6 = input.nextInt();
				
						switch(newUserInput2_6){
							case 0: newUserInput2_6 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_6 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Smileys while loop ends
					break;


				case 7:
					
					int newUserInput2_7 = -1;
					while(newUserInput2_7 != 0){
	
						String messageSettings = """

						Message Settings 
						Select a number
						1.Set1
						2. Common
						0. Back

							""";

						System.out.println(messageSettings);
						newUserInput2_7 = input.nextInt();
				
						switch(newUserInput2_7){
							case 1: 
								int newUserInput2_7_1 = -1;
								while(newUserInput2_7_1 != 0){
	
									String set1 = """

									Set1
									1. Message Centre Number
									2. Messages Sent As
									3. Message Validity
									0. Back

										""";

									System.out.println(set1);
									newUserInput2_7_1 = input.nextInt();
				
									switch(newUserInput2_7_1){
										case 1:
											int newUserInput2_7_1_1 = -1;
											while(newUserInput2_7_1_1 != 0){

												String messageCentreNum ="""

												Message Centre Number
												0. Back

													""";

												System.out.println(messageCentreNum);
												newUserInput2_7_1_1 = input.nextInt();

												switch(newUserInput2_7_1_1){
													case 0: newUserInput2_7_1_1= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_1_1 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;

										case 2:  
											int newUserInput2_7_1_2 = -1;
											while(newUserInput2_7_1_2 != 0){

												String messageSentAs ="""

												Message Sent As
												0. Back

													""";

												System.out.println(messageSentAs);
												newUserInput2_7_1_2 = input.nextInt();

												switch(newUserInput2_7_1_2){
													case 0: newUserInput2_7_1_2= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_1_2 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;

										case 3:
											int newUserInput2_7_1_3 = -1;
											while(newUserInput2_7_1_3 != 0){

												String messageValidity ="""

												Message Validity
												0. Back

													""";

												System.out.println(messageValidity);
												newUserInput2_7_1_3 = input.nextInt();

												switch(newUserInput2_7_1_3){
													case 0: newUserInput2_7_1_3= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_1_3 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;


										default: if(newUserInput2_7_1 != 0) System.out.println("Invalid Input! Try Again..");

									}
			
								}//Set1 while loop ends
								break;


							case 2: 
								int newUserInput2_7_2 = -1;
								while(newUserInput2_7_2 != 0){
	
									String common = """

									Common
									1. Delivery Reports
									2. Reply Via Same Centre
									3. Character Support
									0. Back

										""";

									System.out.println(common);
									newUserInput2_7_2 = input.nextInt();
				
									switch(newUserInput2_7_2){

										case 1:
											int newUserInput2_7_2_1 = -1;
											while(newUserInput2_7_2_1 != 0){

												String deliveryReports="""

												Delivery Reports
												0. Back

													""";

												System.out.println(deliveryReports);
												newUserInput2_7_2_1 = input.nextInt();

												switch(newUserInput2_7_2_1){
													case 0: newUserInput2_7_2_1= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_2_1 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;

										case 2:  
											int newUserInput2_7_2_2 = -1;
											while(newUserInput2_7_2_2 != 0){

												String reply ="""

												Reply Via Same Centre
												0. Back

													""";

												System.out.println(reply);
												newUserInput2_7_2_2 = input.nextInt();

												switch(newUserInput2_7_2_2){
													case 0: newUserInput2_7_2_2= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_2_2 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;

										case 3:
											int newUserInput2_7_2_3 = -1;
											while(newUserInput2_7_2_3 != 0){

												String characterSupport ="""

												Character Support
												0. Back

													""";

												System.out.println(characterSupport);
												newUserInput2_7_2_3 = input.nextInt();

												switch(newUserInput2_7_2_3){
													case 0: newUserInput2_7_2_3= 0; //reduntant, just to fill case 0 with something
													default: if(newUserInput2_7_2_3 != 0) System.out.println("Invalid Input! Try Again..");
												}			                                     

											}
											break;


										default: if(newUserInput2_7_2 != 0) System.out.println("Invalid Input! Try Again..");

									}

									
			
								}//Common while loop ends
								break;

	
							default: if(newUserInput2_7 != 0) System.out.println("Invalid Input! Try Again..");

						}
			
					}//Message Settings while loop end
					break;




				case 8: 	
	
					int newUserInput2_8 = -1;
					while(newUserInput2_8 != 0){
	
						String infoService = """

						Info Service
						0. Back

							""";

						System.out.println(infoService);
						newUserInput2_8 = input.nextInt();
				
						switch(newUserInput2_8){
							case 0: newUserInput2_8 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_8 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Info Service while loop ends
					break;


				case 9: 	

					int newUserInput2_9 = -1;
					while(newUserInput2_9 != 0){
	
						String voiceMailboxNumber = """

						Voice Mailbox Number 
						0. Back

							""";

						System.out.println(voiceMailboxNumber);
						newUserInput2_9 = input.nextInt();
				
						switch(newUserInput2_9){
							case 0: newUserInput2_9 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_9 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Voice Mailbox Number while loop ends
					break;

				
				case 10:		
				
					int newUserInput2_10 = -1;
					while(newUserInput2_10 != 0){
		
						String serviceCommandEditor = """

						Service Command Editor 
						0. Back

							""";

						System.out.println(serviceCommandEditor);
						newUserInput2_10 = input.nextInt();
				
						switch(newUserInput2_10){
							case 0: newUserInput2_10 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput2_10 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Service Command Editor while loop ends
					break;


				default: 
					if(newUserInput2 != 0) System.out.println("Invalid Input! Try Again..");

			}
		
		}//messages while loop end

		break;
	

	case 3: 	
	
		int newUserInput3 = -1;
		while(newUserInput3 != 0){
	
			String chat = """

			Chat
			0. Back

				""";

			System.out.println(chat);
			newUserInput3 = input.nextInt();
				
			switch(newUserInput3){
				case 0: newUserInput3 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput3 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Chat while loop ends
		break;





	case 4: 		

		int newUserInput4 = -1;
		while(newUserInput4 != 0){

			String callRegister = """
			Call Register
			Select a number
			1. Missed Calls
			2. Recieved Calls
			3. Dialled Numbers
			4. Erase Recent Call Lists
			5. Show Call Duration
			6. Show Call Costs
			7. Call Cost Settings
			8. Prepaid Credit
			0. Back

					""";
			
			System.out.println(callRegister);
			newUserInput4 = input.nextInt();
				
			switch(newUserInput4){
				case 1: 	
	
					int newUserInput4_1 = -1;
					while(newUserInput4_1 != 0){
	
						String missedCalls = """

						Missed Calls
						0. Back

							""";

						System.out.println(missedCalls);
						newUserInput4_1 = input.nextInt();
				
						switch(newUserInput4_1){
							case 0: newUserInput4_1 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput4_1 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Missed Calls while loop ends
					break;


				case 2: 	

					int newUserInput4_2 = -1;
					while(newUserInput4_2 != 0){
	
						String recievedCalls = """

						Recieved Calls
						0. Back

							""";

						System.out.println(recievedCalls);
						newUserInput4_2 = input.nextInt();
				
						switch(newUserInput4_2){
							case 0: newUserInput4_2 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput4_2 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Recieved Calls while loop ends
					break;

				
				case 3:		
				
					int newUserInput4_3 = -1;
					while(newUserInput4_3 != 0){
		
						String dialledNumbers = """

						Dialled Numbers
						0. Back

							""";

						System.out.println(dialledNumbers);
						newUserInput4_3 = input.nextInt();
				
						switch(newUserInput4_3){
							case 0: newUserInput4_3 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput4_3 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Dialled Numbers while loop ends
					break;


				case 4:	
					
					int newUserInput4_4 = -1;
					while(newUserInput4_4 != 0){
	
						String eraseRecentCallLists = """

						Erase Recent Call Lists
						0. Back

							""";

						System.out.println(eraseRecentCallLists);
						newUserInput4_4 = input.nextInt();
				
						switch(newUserInput4_4){
							case 0: newUserInput4_4 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput4_4 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Erase Recent Call Lists while loop ends
					break;


				case 5: 	

					int newUserInput4_5 = -1;
					while(newUserInput4_5 != 0){
	
						String showCallDuration = """

						Show Call Duration
						1. Last Call Duration
						2. All Calls' Duration
						3. Recieved Call Duration
						4. Dialled Calls Duration
						5. Clear Times
						0. Back

							""";

						System.out.println(showCallDuration);
						newUserInput4_5 = input.nextInt();
				
						switch(newUserInput4_5){
							case 1:
								int newUserInput4_5_1 = -1;
								while(newUserInput4_5_1 != 0){
	
									String lastCallDuration = """

									Last Call Duration
									0. Back

										""";

									System.out.println(lastCallDuration);
									newUserInput4_5_1 = input.nextInt();
				
									switch(newUserInput4_5_1){
										case 0: newUserInput4_5_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_5_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Last Call Duration while loop ends
								break;


							case 2: 
								int newUserInput4_5_2 = -1;
								while(newUserInput4_5_2 != 0){
	
									String allCallsDuration = """

									All Calls' Duration
									0. Back

										""";

									System.out.println(allCallsDuration);
									newUserInput4_5_2 = input.nextInt();
				
									switch(newUserInput4_5_2){
										case 0: newUserInput4_5_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_5_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//All Calls' Durationwhile loop ends
								break;


							case 3: 
								int newUserInput4_5_3 = -1;
								while(newUserInput4_5_3 != 0){
	
									String recievedCallsDuration = """

									Recieved Calls' Duration
									0. Back

										""";

									System.out.println(recievedCallsDuration);
									newUserInput4_5_3 = input.nextInt();
				
									switch(newUserInput4_5_3){
										case 0: newUserInput4_5_3 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_5_3 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Recieved Calls' Duration while loop ends
								break;


							case 4: 
								int newUserInput4_5_4 = -1;
								while(newUserInput4_5_4 != 0){
	
									String dialledCallsDuration = """

									Dialled Calls' Duration
									0. Back

										""";

									System.out.println(dialledCallsDuration );
									newUserInput4_5_4 = input.nextInt();
				
									switch(newUserInput4_5_4){
										case 0: newUserInput4_5_4 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_5_4 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Dailled Calls' Duration while loop ends
								break;


							case 5: 
								int newUserInput4_5_5 = -1;
								while(newUserInput4_5_5 != 0){
	
									String clearTimes = """

									Clear Times
									0. Back

										""";

									System.out.println(clearTimes );
									newUserInput4_5_5 = input.nextInt();
				
									switch(newUserInput4_5_5){
										case 0: newUserInput4_5_5 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_5_5 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Clear Times while loop ends
								break;


							default: if(newUserInput4_5 != 0) System.out.println("Invalid Input! Try Again..");

						}
			
					}//Show Call Duration while loop end
					break;
	

				case 6:		
				
					int newUserInput4_6 = -1;
					while(newUserInput4_6 != 0){
	
						String showCallCosts= """

						Show Call Costs
						1. Last Call Cost
						2. All Calls' Cost
						3. Clear Counters
						0. Back

							""";

						System.out.println(showCallCosts);
						newUserInput4_6 = input.nextInt();
				
						switch(newUserInput4_6){
							case 1:
								int newUserInput4_6_1 = -1;
								while(newUserInput4_6_1 != 0){
	
									String lastCallCost = """

									Last Call Cost
									0. Back

										""";

									System.out.println(lastCallCost);
									newUserInput4_6_1 = input.nextInt();
				
									switch(newUserInput4_6_1){
										case 0: newUserInput4_6_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_6_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Last Call Cost while loop ends
								break;


							case 2: 
								int newUserInput4_6_2 = -1;
								while(newUserInput4_6_2 != 0){
	
									String allCallsCost = """

									All Calls' Cost
									0. Back

										""";

									System.out.println(allCallsCost);
									newUserInput4_6_2 = input.nextInt();
				
									switch(newUserInput4_6_2){
										case 0: newUserInput4_6_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_6_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//All Calls' Cost while loop ends
								break;


							case 3: 
								int newUserInput4_6_3 = -1;
								while(newUserInput4_6_3 != 0){
	
									String clearCounters = """

									Clear Counters
									0. Back

										""";

									System.out.println(clearCounters);
									newUserInput4_6_3 = input.nextInt();
				
									switch(newUserInput4_6_3){
										case 0: newUserInput4_6_3 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_6_3 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Clear Counters while loop ends
								break;

	
							default: if(newUserInput4_6 != 0) System.out.println("Invalid Input! Try Again..");

						}


			
					}//Show Call Costs while loop end
					break;


				case 7: 	
	
					int newUserInput4_7 = -1;
					while(newUserInput4_7 != 0){
	
						String callCostSettings = """
						
						Call Cost Settings
						Select a number
						1. Call Cost Limit
						2. Show Costs in
						0. Back

							""";

						System.out.println(callCostSettings);
						newUserInput4_7 = input.nextInt();
				
						switch(newUserInput4_7){
							case 1: 
								int newUserInput4_7_1 = -1;
								while(newUserInput4_7_1 != 0){
	
									String callCostLimit = """

									Call Cost Limit
									0. Back

										""";

									System.out.println(callCostLimit);
									newUserInput4_7_1 = input.nextInt();
				
									switch(newUserInput4_7_1){
										case 0: newUserInput4_7_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_7_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Call Cost Limit while loop ends
								break;


							case 2: 
								int newUserInput4_7_2 = -1;
								while(newUserInput4_7_2 != 0){
	
									String showCostIn = """

									Show Cost in 
									0. Back

										""";

									System.out.println(showCostIn);
									newUserInput4_7_2 = input.nextInt();
				
									switch(newUserInput4_7_2){
										case 0: newUserInput4_7_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput4_7_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Show Cost in  while loop ends
								break;

	
							default: if(newUserInput4_7 != 0) System.out.println("Invalid Input! Try Again..");

						}
			
					}//Call Cost Settings while loop end
					break;


				case 8: 	
	
					int newUserInput4_8 = -1;
					while(newUserInput4_8 != 0){
	
						String prepaidCredit = """

						Prepaid Credit
						0. Back

							""";

						System.out.println(prepaidCredit);
						newUserInput4_8 = input.nextInt();
				
						switch(newUserInput4_8){
							case 0: newUserInput4_8 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput4_8 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Prepaid Credit while loop ends
					break;


				default: 
					if(newUserInput4 != 0) System.out.println("Invalid Input! Try Again..");
				
			}//switch end for call register

		}//Call Register while loop ends
		break;


	case 5: 	

		int newUserInput5 = -1;
		while(newUserInput5 != 0){

			String Tones = """
			Tones
			Select a number
			1. Ringing Tone
			2. Ringing Volume
			3. Incoming Call Alert
			4. Composer
			5. Message Alert Tone
			6. Key Tones
			7. Warning and Game Tones
			8. Vibrating Alert
			9. Screen Saver
			0. Back

					""";

			System.out.println(Tones);
			newUserInput5 = input.nextInt();

			switch(newUserInput5){
				case 1: 	
	
					int newUserInput5_1 = -1;
					while(newUserInput5_1 != 0){
	
						String ringingTone = """

						Ringing Tone
						0. Back

							""";

						System.out.println(ringingTone);
						newUserInput5_1 = input.nextInt();
				
						switch(newUserInput5_1){
							case 0: newUserInput5_1 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_1 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Ringing Tone while loop ends
					break;


				case 2: 	

					int newUserInput5_2 = -1;
					while(newUserInput5_2 != 0){
	
						String ringingVolume = """

						Ringing Volume
						0. Back

							""";

						System.out.println(ringingVolume);
						newUserInput5_2 = input.nextInt();
				
						switch(newUserInput5_2){
							case 0: newUserInput5_2 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_2 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Ringing Volume Nos while loop ends
					break;

				
				case 3:		
				
					int newUserInput5_3 = -1;
					while(newUserInput5_3 != 0){
		
						String incomingCall = """

						Incoming Call Alert
						0. Back

							""";

						System.out.println(incomingCall);
						newUserInput5_3 = input.nextInt();
				
						switch(newUserInput5_3){
							case 0: newUserInput5_3 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_3 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Incoming Call Alert  while loop ends
					break;


				case 4:	
					
					int newUserInput5_4 = -1;
					while(newUserInput5_4 != 0){
	
						String composer = """

						Composer
						0. Back

							""";

						System.out.println(composer);
						newUserInput5_4 = input.nextInt();
				
						switch(newUserInput5_4){
							case 0: newUserInput5_4 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_4 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Composer while loop ends
					break;


				case 5: 	

					int newUserInput5_5 = -1;
					while(newUserInput5_5 != 0){
	
						String messageAlert = """

						Message Alert Tone
						0. Back

							""";

						System.out.println(messageAlert);
						newUserInput5_5 = input.nextInt();
				
						switch(newUserInput5_5){
							case 0: newUserInput5_5 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_5 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Message Alert Tone while loop ends
					break;
	

				case 6:		
				
					int newUserInput5_6 = -1;
					while(newUserInput5_6 != 0){
	
						String keyTones = """

						Key Tones
						0. Back

							""";

						System.out.println(keyTones);
						newUserInput5_6 = input.nextInt();
				
						switch(newUserInput5_6){
							case 0: newUserInput5_6 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_6 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Key Tones while loop ends
					break;


				case 7: 	
	
					int newUserInput5_7 = -1;
					while(newUserInput5_7 != 0){
	
						String warning = """

						Warning and Game Tones 
						0. Back

							""";

						System.out.println(warning);
						newUserInput5_7 = input.nextInt();
				
						switch(newUserInput5_7){
							case 0: newUserInput5_7 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_7 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Warning and Game Tones while loop ends
					break;


				case 8: 	
	
					int newUserInput5_8 = -1;
					while(newUserInput5_8 != 0){
	
						String vibratingAlert = """

						Vibrating Alert
						0. Back

							""";

						System.out.println(vibratingAlert);
						newUserInput5_8 = input.nextInt();
				
						switch(newUserInput5_8){
							case 0 : newUserInput5_8 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_8 != 0) System.out.println("Invalid Input! Try Again..");

						}
			
					}//Vibrating Alert while loop end
					break;


				case 9: 	
	
					int newUserInput5_9 = -1;
					while(newUserInput5_9 != 0){
	
						String screenSaver = """

						Screen Saver
						0. Back

							""";

						System.out.println(screenSaver);
						newUserInput5_9 = input.nextInt();
				
						switch(newUserInput5_9){
							case 0: newUserInput5_9 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput5_9 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}//Screen Saver while loop ends
					break;


				default: 
					if(newUserInput5 != 0) System.out.println("Invalid Input! Try Again..");
				
			}//switch end for Tones

		}//Tones while loop ends
		break;

	case 6: 

		int newUserInput6 = -1;
		while(newUserInput6 != 0){

			String settings = """
			Settings
			Select a number
			1. Call Settings
			2. Phone Settings
			3. Security Settings
			4. Restore Factory Settings
			0: Back

				""";
			
			System.out.println(settings);
			newUserInput6 = input.nextInt();
				
			switch(newUserInput6){  
				case 1: 
	
					int newUserInput6_1 = -1;
					while(newUserInput6_1 != 0){
						String callSettings= """
						Call Settings
						Select a number
						1. Automatic Redial
						2. Speed Dialling
						3. Call Waiting Options
						4. Own Number Sending
						5. Phone Line in Use
						6. Automatic Answer

								""";

						System.out.println(callSettings);
						newUserInput6_1 = input.nextInt();
			
						switch(newUserInput6_1){  
							case 1: 
								int newUserInput6_1_1 = -1;
								while(newUserInput6_1_1 != 0){
	
									String automaticRedial = """

									Automatic Redial
									0. Back

										""";

									System.out.println(automaticRedial);
									newUserInput6_1_1 = input.nextInt();
				
									switch(newUserInput6_1_1){
										case 0: newUserInput6_1_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Automatic Redial while loop ends
								break;


							case 2: 
								int newUserInput6_1_2 = -1;
								while(newUserInput6_1_2 != 0){
	
									String speedDialling = """

									Speed Dialling
									0. Back

										""";

									System.out.println(speedDialling);
									newUserInput6_1_2 = input.nextInt();
				
									switch(newUserInput6_1_2){
										case 0: newUserInput6_1_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Speed Dialling while loop ends
								break;



							case 3: 
								int newUserInput6_1_3 = -1;
								while(newUserInput6_1_3 != 0){
	
									String callWaiting = """

									Call Waiting Options
									0. Back

										""";

									System.out.println(callWaiting);
									newUserInput6_1_3 = input.nextInt();
				
									switch(newUserInput6_1_3){
										case 0: newUserInput6_1_3 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_3 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Call Waiting Options while loop ends
								break;



							case 4: 
								int newUserInput6_1_4 = -1;
								while(newUserInput6_1_4 != 0){
	
									String ownNumber = """

									Own Number Sending 
									0. Back

										""";

									System.out.println(ownNumber);
									newUserInput6_1_4 = input.nextInt();
				
									switch(newUserInput6_1_4){
										case 0: newUserInput6_1_4 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_4 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Own Number Sending while loop ends
								break;



							case 5: 
								int newUserInput6_1_5 = -1;
								while(newUserInput6_1_5 != 0){
	
									String phoneLine = """

									Phone Line in Use
									0. Back

										""";

									System.out.println(phoneLine);
									newUserInput6_1_2 = input.nextInt();
				
									switch(newUserInput6_1_2){
										case 0: newUserInput6_1_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Phone Line in Use while loop ends
								break;


							case 6: 
								int newUserInput6_1_6 = -1;
								while(newUserInput6_1_6 != 0){
	
									String autoAnswer = """

									Automatic Answer 
									0. Back

										""";

									System.out.println(autoAnswer );
									newUserInput6_1_2 = input.nextInt();
				
									switch(newUserInput6_1_2){
										case 0: newUserInput6_1_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_1_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Automatic Answer while loop ends
								break;
	
							default: if(newUserInput6_1 != 0) System.out.println("Invalid Input! Try Again..");


						}//end switch for call settings
						
					}
					break;

				case 2: 
			
					int newUserInput6_2 = -1;
					while(newUserInput6_2 != 0){

						String phoneSettings= """
						Phone Settings
						Select a number
						1. Language
						2. Cell Info Display
						3. Welcome Note
						4. Network Selection
						5. Lights
						6. Confirm SIM Service Actions

								""";

						System.out.println(phoneSettings);
						newUserInput6_2 = input.nextInt();
			
						switch(newUserInput6_2){


							case 1: 
								int newUserInput6_2_1 = -1;
								while(newUserInput6_2_1 != 0){
	
									String language = """

									Language
									0. Back

										""";

									System.out.println(language);
									newUserInput6_2_1 = input.nextInt();
				
									switch(newUserInput6_2_1){
										case 0: newUserInput6_2_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Language while loop ends
								break;


							case 2: 
								int newUserInput6_2_2 = -1;
								while(newUserInput6_2_2 != 0){
	
									String callInfoDisplay = """

									Call Info Display
									0. Back

										""";

									System.out.println(callInfoDisplay);
									newUserInput6_2_2 = input.nextInt();
				
									switch(newUserInput6_2_2){
										case 0: newUserInput6_2_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Call Info Display while loop ends
								break;



							case 3: 
								int newUserInput6_2_3 = -1;
								while(newUserInput6_2_3 != 0){
	
									String welcomeNotes = """

									 Welcome Note
									0. Back

										""";

									System.out.println(welcomeNotes);
									newUserInput6_2_3 = input.nextInt();
				
									switch(newUserInput6_2_3){
										case 0: newUserInput6_2_3 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_3 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//welcome Notes  while loop ends
								break;



							case 4: 
								int newUserInput6_2_4 = -1;
								while(newUserInput6_2_4 != 0){
	
									String networkSelection = """
									Network Selection
									0. Back

										""";

									System.out.println(networkSelection);
									newUserInput6_2_4 = input.nextInt();
				
									switch(newUserInput6_2_4){
										case 0: newUserInput6_2_4 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_4 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Network Selection while loop ends
								break;


							case 5: 
								int newUserInput6_2_5 = -1;
								while(newUserInput6_2_5 != 0){
	
									String lights = """

									Lights
									0. Back

										""";

									System.out.println(lights);
									newUserInput6_2_5 = input.nextInt();
				
									switch(newUserInput6_2_5){
										case 0: newUserInput6_2_5 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_5 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Lights while loop ends
								break;


							case 6: 
								int newUserInput6_2_6 = -1;
								while(newUserInput6_2_6 != 0){
	
									String simServiceAction = """

									Confirm SIM Service Actions
									0. Back

										""";

									System.out.println(simServiceAction);
									newUserInput6_2_6 = input.nextInt();
				
									switch(newUserInput6_2_6){
										case 0: newUserInput6_2_6 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_2_6 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Confirm SIM Service Actions while loop ends
								break;


	
							default: if(newUserInput6_2 != 0) System.out.println("Invalid Input! Try Again..");


						}//end switch for phone settings
			
					}
					break;

				case 3:

					int newUserInput6_3 = -1;
					while(newUserInput6_3 != 0){


						String securitySettings= """
						Security Settings
						Select a number
						1. Pin Code Request
						2. Call Barring Service
						3. Fixed Dialling
						4. Closed User Group
						5. Phone Security
						6. Change Access Codes

								""";

						System.out.println(securitySettings);
						newUserInput6_3 = input.nextInt();
			
						switch(newUserInput6_3){


							case 1: 
								int newUserInput6_3_1 = -1;
								while(newUserInput6_3_1 != 0){
	
									String pinCodeRequest = """

									Pin Code Request
									0. Back

										""";

									System.out.println(pinCodeRequest);
									newUserInput6_3_1 = input.nextInt();
				
									switch(newUserInput6_3_1){
										case 0: newUserInput6_3_1 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_1 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Pin Code Request while loop ends
								break;


							case 2: 
								int newUserInput6_3_2 = -1;
								while(newUserInput6_3_2 != 0){
	
									String callBarringService = """

									Call Barring Service
									0. Back

										""";

									System.out.println(callBarringService);
									newUserInput6_3_2 = input.nextInt();
				
									switch(newUserInput6_3_2){
										case 0: newUserInput6_3_2 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_2 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Call Barring Service while loop ends
								break;


							case 3: 
								int newUserInput6_3_3 = -1;
								while(newUserInput6_3_3 != 0){
	
									String fixedDialling = """

									Fixed Dialling 
									0. Back

										""";

									System.out.println(fixedDialling);
									newUserInput6_3_3 = input.nextInt();
				
									switch(newUserInput6_3_3){
										case 0: newUserInput6_3_3 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_3 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Fixed Dialling Notes  while loop ends
								break;



							case 4: 
								int newUserInput6_3_4 = -1;
								while(newUserInput6_3_4 != 0){
	
									String closedUserGroup = """
									Closed User Group
									0. Back

										""";

									System.out.println(closedUserGroup);
									newUserInput6_3_4 = input.nextInt();
				
									switch(newUserInput6_3_4){
										case 0: newUserInput6_3_4 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_4 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Closed User Group while loop ends
								break;



							case 5: 
								int newUserInput6_3_5 = -1;
								while(newUserInput6_3_5 != 0){
	
									String phoneSecurity  = """

									Phone Security
									0. Back

										""";

									System.out.println(phoneSecurity);
									newUserInput6_3_5 = input.nextInt();
				
									switch(newUserInput6_3_5){
										case 0: newUserInput6_3_5 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_5 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Phone Security while loop ends
								break;


							case 6: 
								int newUserInput6_3_6 = -1;
								while(newUserInput6_3_6 != 0){
	
									String changeAccessCodes = """

									Change Access Codes
									0. Back

										""";

									System.out.println(changeAccessCodes);
									newUserInput6_3_6 = input.nextInt();
				
									switch(newUserInput6_3_6){
										case 0: newUserInput6_3_6 = 0; //reduntant, just to fill case 0 with something
										default: if(newUserInput6_3_6 != 0) System.out.println("Invalid Input! Try Again..");
									}
			
								}//Change Access Codes while loop ends
								break;
	
							default: if(newUserInput6_3 != 0) System.out.println("Invalid Input! Try Again..");

						}//end switch for Security Settings
						
					}
					break;


				case 4:	

					int newUserInput6_4 = -1;
					while(newUserInput6_4 != 0){
	
						String factorySettings = """
				
						Restore Factory Settings
						0. Back

							""";

						System.out.println(factorySettings);
						newUserInput6_4 = input.nextInt();

						switch(newUserInput6_4){
							case 0: newUserInput6_4 = 0; //redundant
							default: if(newUserInput6_4 != 0) System.out.println("Invalid Input! Try Again..");

						}

					}
					break;

				default:
					if(newUserInput6 != 0) System.out.println("Invalid Input! Try Again..");


			}	
	
		}//Settings while loop end
		break;

	case 7: 	

		int newUserInput7 = -1;
		while(newUserInput7 != 0){
	
			String callDivert = """

			Call Divert
			0. Back

				""";

			System.out.println(callDivert);
			newUserInput7 = input.nextInt();
				
			switch(newUserInput7){
				case 0: newUserInput7 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput7 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Call Divert while loop ends
		break;

	
	case 8: 	
		
		int newUserInput8 = -1;
		while(newUserInput8 != 0){
	
			String games = """

			Games
			0. Back

				""";

			System.out.println(games);
			newUserInput8 = input.nextInt();
				
			switch(newUserInput8){
				case 0: newUserInput8 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput8 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Games while loop ends
		break;


	case 9: 	
		
		int newUserInput9 = -1;
		while(newUserInput9 != 0){
	
			String calculator = """

			Calculator
			0. Back

				""";

			System.out.println(calculator);
			newUserInput9 = input.nextInt();
				
			switch(newUserInput9){
				case 0: newUserInput9 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput9 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Calculator while loop ends
		break;

	
	case 10: 	
		
		int newUserInput10 = -1;
		while(newUserInput10 != 0){
	
			String reminders = """

			Reminders
			0. Back

				""";

			System.out.println(reminders);
			newUserInput10 = input.nextInt();
				
			switch(newUserInput10){
				case 0: newUserInput10 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput10 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Reminders while loop ends
		break;


	case 11:		

		int newUserInput11 = 1;
		while(newUserInput11 != 0){

			String clock = """

			Clock
			Select a number
			1. Alarm Clock
			2. Clock Settings
			3. Date Settings
			4. Stopwatch
			5. Countdown Timer
			6. Auto Update Date and Time
			0. Back

					""";

			System.out.println(clock);
			newUserInput11 = input.nextInt();

			switch(newUserInput11){
	
				case 1: 	
	
					int newUserInput11_1 = -1;
					while(newUserInput11_1 != 0){
	
						String alarmClock = """

						Alarm Clock
						0. Back

							""";

						System.out.println(alarmClock);
						newUserInput11_1 = input.nextInt();
				
						switch(newUserInput11_1){
							case 0: newUserInput11_1 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_1 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;


				case 2: 	

					int newUserInput11_2 = -1;
					while(newUserInput11_2 != 0){
	
						String clockSettings = """

						Clock Settings
						0. Back

							""";

						System.out.println(clockSettings);
						newUserInput11_2 = input.nextInt();
				
						switch(newUserInput11_2){
							case 0: newUserInput11_2 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_2 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;

				
				case 3:		
				
					int newUserInput11_3 = -1;
					while(newUserInput11_3 != 0){
		
						String dateSettings = """

						Date Settings
						0. Back

							""";

						System.out.println(dateSettings);
						newUserInput11_3 = input.nextInt();
				
						switch(newUserInput11_3){
							case 0: newUserInput11_3 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_3 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;


				case 4:	
					
					int newUserInput11_4 = -1;
					while(newUserInput11_4 != 0){
	
						String stopwatch = """

						Stopwatch
						0. Back

							""";

						System.out.println(stopwatch);
						newUserInput11_4 = input.nextInt();
				
						switch(newUserInput11_4){
							case 0: newUserInput11_4 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_4 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;


				case 5: 	

					int newUserInput11_5 = -1;
					while(newUserInput11_5 != 0){
	
						String countdownTimer = """

						Countdown Timer
						0. Back

							""";

						System.out.println(countdownTimer);
						newUserInput11_5 = input.nextInt();
				
						switch(newUserInput11_5){
							case 0: newUserInput11_5 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_5 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;
	

				case 6:		
				
					int newUserInput11_6 = -1;
					while(newUserInput11_6 != 0){
	
						String autoUpdate = """

						Auto Update Date and Time
						0. Back

							""";

						System.out.println(autoUpdate);
						newUserInput11_6 = input.nextInt();
				
						switch(newUserInput11_6){
							case 0: newUserInput11_6 = 0; //reduntant, just to fill case 0 with something
							default: if(newUserInput11_6 != 0) System.out.println("Invalid Input! Try Again..");
						}
			
					}
					break;


				default: 
					if(newUserInput11 != 0) System.out.println("Invalid Input! Try Again..");

				
			}//switch end for Clock

		}//Clock while loop ends
		break;
	

	case 12: 	

		int newUserInput12 = -1;
		while(newUserInput12 != 0){
	
			String profiles = """

			Profiles
			0. Back

				""";

			System.out.println(profiles);
			newUserInput12 = input.nextInt();
				
			switch(newUserInput12){
				case 0: newUserInput12 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput12 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//Profiles while loop ends
		break;

	
	case 13: 	
		
		int newUserInput13 = -1;
		while(newUserInput13 != 0){
	
			String simServices = """

			SIM Services
			0. Back

				""";

			System.out.println(simServices);
			newUserInput13 = input.nextInt();
				
			switch(newUserInput13){
				case 0: newUserInput13 = 0; //reduntant, just to fill case 0 with something
				default: if(newUserInput13 != 0) System.out.println("Invalid Input! Try Again..");
			}
			
		}//SIM Services while loop ends
		break;

	
	default: 
		if(userInput != 0) System.out.println("Invalid Input! Try Again..");

	}//switch end for main phone menu


	}//phone menu while loop end

 System.out.println("Goodbye.");

}}





/*
	System.out.println("Press 1 to Turn On.");
	userInputPOWER = input.nextInt();

	if(userInputPOWER == 1){
		userInput = 
		System.out.println("Welcome.");
	}
	else
*/