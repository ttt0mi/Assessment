import java.util.Scanner;

public class Nokia{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	String phoneStart = """
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
			""";
	
	System.out.println(phoneStart);
	int userInput = input.nextInt();
	
	switch(userInput){
	case 1: {	
		String phonebook = """
		Phone Book
		Select a number
		1. Search
		2. Services Nos
		3. Add Name
		4. Erase
		5. Edit
		6. Assign Tone
		7. Send B'card
		8. Options
		9. Speed Dials
		10. Voice Tags
			""";
			
		System.out.println(phonebook);
		int newUserInput1 = input.nextInt();
				
		switch(newUserInput1){
			case 1: 		
				System.out.println("Search"); break;
			case 2: 		
				System.out.println("Service Nos."); break;
			case 3:		
				System.out.println("Add Name"); break;
			case 4:	
				System.out.println("Erase"); break;
			case 5: 		
				System.out.println("Edit"); break;
			case 6:		
				System.out.println("Assign Tone"); break;
			case 7:		
				System.out.println("Send B'card"); break;
			case 8: {

				String option = """
				Option
				Select a number
				1. Type Of View
				2. Memory Status
						""";

				System.out.println(option);
				int newUserInput1_8 = input.nextInt();
			
				switch(newUserInput1_8){
					case 1: 		
						System.out.println("Type Of View"); break;
					case 2: 		
						System.out.println("Memory Status"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 9:		
				System.out.println("Speed Dials"); break;
			case 10:		
				System.out.println("Voice Tags"); break;
			default:
				System.out.println("Invalid Input!"); 
		
			
		}
		

	break;
	}

	case 2: {	
		
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
				""";

		System.out.println(messages);
		int newUserInput2 = input.nextInt();

		switch(newUserInput2){
			case 1: 		
				System.out.println("Write Message"); break;
			case 2: 		
				System.out.println("Inbox"); break;
			case 3:		
				System.out.println("Outbox"); break;
			case 4:	
				System.out.println("Picture Message"); break;
			case 5: 		
				System.out.println("Templates"); break;
			case 6:		
				System.out.println("Smileys"); break;
			case 7: {	

				String messageSettings = """
				Message Settings
				Select a number
				1. Set 1
				2. Common
					""";

				System.out.println(messageSettings);
				int newUserInput2_7 = input.nextInt();
		
				switch(newUserInput2_7){
					case 1: {
						
						String set1 = """
						Set1
						Select a number
						1. Message Center Number
						2. Message Sent As
						3.Message Validity
								""";

						System.out.println(set1);
						int newUserInput2_7_1 = input.nextInt();

						switch(newUserInput2_7_1){
							case 1: System.out.println("Message Center Number"); break;

							case 2: System.out.println("Message Sent As"); break;

							case 3: System.out.println("Message Center Number"); break;

							default: System.out.println("Invalid Input!"); 
						}
					break;
					}
					case 2: {	

						String common = """
						Common
						Select a number
						1. Delivery Reports
						2. Reply Via Same Centre
						3. Character Supoort
								""";

						System.out.println(common);
						int newUserInput2_7_2 = input.nextInt();

						switch(newUserInput2_7_2){
							case 1: System.out.println("Delivery Reports"); break;

							case 2: System.out.println("Reply Via Same Centre"); break;

							case 3: System.out.println("Character Support"); break;

							default: System.out.println("Invalid Input!"); 
						}
					break;
					}
					default:
						System.out.println("Invalid Input!");

				}
			break;
			}
			case 8: 		
				System.out.println("Info Service"); break;
			case 9:		
				System.out.println("Voice Mailbox Number"); break;
			case 10: 	
				System.out.println("Service Command Editor"); break;
			default: 
				System.out.println("Invalid Input!"); 
		}

	break;
	}

	case 3: 		
		System.out.println("Chat"); break;

	case 4: {		

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
				""";
			
		System.out.println(callRegister);
		int newUserInput4 = input.nextInt();
				
		switch(newUserInput4){
			case 1: 		
				System.out.println("Missed Calls"); break;
			case 2: 		
				System.out.println("Recieved Calls"); break;
			case 3:		
				System.out.println("Dialled Numbers"); break;
			case 4:	
				System.out.println("Erase Recent Call Lists"); break;
			case 5: {

				String showCallDuration= """
				Show Call Duration
				Select a number
				1. Last Call Duration
				2. All Calls' Duration
				3. Recieved Calls' Duration
				4. Dialled Calls' Duration
				5. Clear Times
						""";

				System.out.println(showCallDuration);
				int newUserInput4_5 = input.nextInt();
			
				switch(newUserInput4_5){
					case 1: 		
						System.out.println("Last Call Duration"); break;
					case 2: 		
						System.out.println("All Calls' Duration"); break;
					case 3: 		
						System.out.println("Recieved Calls' Duration"); break;
					case 4: 		
						System.out.println("Dialled Calls' Duration"); break;
					case 5: 		
						System.out.println("Clear Times"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 6: {

				String showCallCosts= """
				Show Call Costs
				Select a number
				1. Last Call Cost
				2. All Calls' Cost
				3. Clear Counters
						""";

				System.out.println(showCallCosts);
				int newUserInput4_6 = input.nextInt();
			
				switch(newUserInput4_6){
					case 1: 		
						System.out.println("Last Call Cost"); break;
					case 2: 		
						System.out.println("All Calls' Cost"); break;
					case 3: 		
						System.out.println("Clear Counters"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 7:{

				String callCostSettings= """
				Call Cost Settings
				Select a number
				1. Call Cost Limit
				2. Show Costs in
						""";

				System.out.println(callCostSettings);
				int newUserInput4_7 = input.nextInt();
			
				switch(newUserInput4_7){
					case 1: 		
						System.out.println("Call Cost Limit"); break;
					case 2: 		
						System.out.println("Show Costs in"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 8:		
				System.out.println("Prepaid Credit"); break;
			default:
				System.out.println("Invalid Input!");

		}
		
	break;
	}
	case 5: {	

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
				""";

		System.out.println(Tones);
		int newUserInput5 = input.nextInt();

		switch(newUserInput5){
			case 1: 		
				System.out.println("Ringing Tone"); break;
			case 2: 		
				System.out.println("Ringing Volume"); break;
			case 3:		
				System.out.println("Incoming Call Alert"); break;
			case 4:	
				System.out.println("Composer"); break;
			case 5: 		
				System.out.println("Message Alert Tone"); break;
			case 6:		
				System.out.println("Key Tones"); break;
			case 7:		
				System.out.println("Warning and Game Tones"); break;
			case 8:		
				System.out.println("Vibrating Alert"); break;
			case 9:		
				System.out.println("Screen Saver"); break;
			default: 
				System.out.println("Invalid Input!"); 
		}
	break;
	}

	case 6: {	

		String settings = """
		Settings
		Select a number
		1. Call Settings
		2. Phone Settings
		3. Security Settings
		4. Restore Factory Settings
				""";
			
		System.out.println(settings);
		int newUserInput6 = input.nextInt();
				
		switch(newUserInput6){

			case 1: {

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
				int newUserInput6_1 = input.nextInt();
			
				switch(newUserInput6_1){
					case 1: 		
						System.out.println("Automatic Redial"); break;
					case 2: 		
						System.out.println("Speed Dialling"); break;
					case 3: 		
						System.out.println("Call Waiting Options"); break;
					case 4: 		
						System.out.println("Own Number Sending"); break;
					case 5: 		
						System.out.println("Phone Line in Use"); break;
					case 6: 		
						System.out.println("Automatic Answer"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 2: {

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
				int newUserInput6_2 = input.nextInt();
			
				switch(newUserInput6_2){
					case 1: 		
						System.out.println("Language"); break;
					case 2: 		
						System.out.println("Call Info Display"); break;
					case 3: 		
						System.out.println("Welcome Notes"); break;
					case 4: 		
						System.out.println("Network Selection"); break;
					case 5: 		
						System.out.println("Lights"); break;
					case 6: 		
						System.out.println("Confirm SIM Service Actions"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 3: {

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
				int newUserInput6_3 = input.nextInt();
			
				switch(newUserInput6_3){
					case 1: 		
						System.out.println("Pin Code Request"); break;
					case 2: 		
						System.out.println("Call Barring Service"); break;
					case 3: 		
						System.out.println("Fixed Dialling"); break;
					case 4: 		
						System.out.println("Closed User Group"); break;
					case 5: 		
						System.out.println("Phone Security"); break;
					case 6: 		
						System.out.println("Change Access Codes"); break;
					default:
						System.out.println("Invalid Input!");
				}
			break;
			}

			case 4:		
				System.out.println("Restore Factory Settings"); break;
			default:
				System.out.println("Invalid Input!");

		}
		
	break;
	}

	case 7: 	
		System.out.println("Call Divert"); break;
	
	case 8: 	
		System.out.println("Games"); break;
	
	case 9: 	
		System.out.println("Calculator"); break;
	
	case 10: 	
		System.out.println("Reminders"); break;
	
	case 11: {		

		String clock = """
		Clock
		Select a number
		1. Alarm Clock
		2. Clock Settings
		3. Date Settings
		4. Stopwatch
		5. Countdown Timer
		6. Auto Update Date and Time
					""";

		System.out.println(clock);
		int newUserInput11 = input.nextInt();

		switch(newUserInput11){
			case 1: 		
				System.out.println("Alarm Clock"); break;
			case 2: 		
				System.out.println("Clock Settings"); break;
			case 3:		
				System.out.println("Date Settings"); break;
			case 4:	
				System.out.println("Stopwatch"); break;
			case 5: 		
				System.out.println("Countdown Timer"); break;
			case 6:		
				System.out.println("Auto Update Date and Time"); break;
			default: 
				System.out.println("Invalid Input!"); 
		}
	break;
	}
	case 12: 	
		System.out.println("Profiles"); break;
	
	case 13: 	
		System.out.println("SIM Services"); break;
	
	default: 
		System.out.println("Invalid Input!");

	}



}}
















/*	
switch(userInput){
		case 1: {		
			System.out.println(" ");
		}
		case 2: {		
			System.out.println(" ");
		}
		case 3: {		
			System.out.println(" ");
		}
		case 4: {		
			System.out.println(" ");
		}
		case 5: {		
			System.out.println(" ");
		}
		case 6: {		
			System.out.println(" ");
		}
		case 7: {		
			System.out.println(" ");
		}
		case 8: {		
			System.out.println(" ");
		}
		case 9: {		
			System.out.println(" ");
		}
		case 10: {		
			System.out.println(" ");
		}
		default {
			System.out.println(" invalid Input!"); break;
		}
	}
*/