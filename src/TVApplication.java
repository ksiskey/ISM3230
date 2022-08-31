import java.util.Scanner;   //importing scanner to take info

public class TVApplication { 
//TV application works as a remote control that maniputlates TV and preforms commands based on user input

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Main method used to preform all the tasks of the remote control
        Scanner input = new Scanner(System.in); //scanner used to take in user info
        int nOption = 0;                        //int used to assign commands to option number
        TV tv1 = null;                          //TV object to create a tv
        int nVolume = 1;                        //volume number set to 1 as default, used to dispaly volume level
        int nChannel = 1;                       //channel number set to 1 as default, used to display channel number
        boolean bOn = false;                    //boolean used to say if the TV is on or off
        
        
        
        System.out.println("TV PROCESSIGN MENU");   //menu options
        System.out.println("1. Create new TV - default TV object");
        System.out.println("2. Create new TV - information available");
        System.out.println("3. Turn on TV");
        System.out.println("4. Turn off TV");
        System.out.println("5. Set channel (1-120)");
        System.out.println("6. Set Volume level (1-7)");
        System.out.println("7. Increase the channel");
        System.out.println("8. Decrease the channel");
        System.out.println("9. Increase the volume");
        System.out.println("10. Decrease the volume");
        System.out.println("11. Show volume level");
        System.out.println("12. Show current channel");
        System.out.println("13. Print TV status");
        System.out.println("14. Print TV details");
        System.out.println("15. Exit");
        System.out.println(" ");
        
        System.out.print("Please select an option: ");
        nOption = input.nextInt();      //scanner used to take in user info
        
        while (nOption != 15) {     //while loop of all possible options
            if (nOption == 1) {     //if user inputs option 1
            tv1 = new TV();         //creates new tv object
            tv1.printTVDetails();   //printTVDetails method to display TV details
            System.out.println(" ");
        }                           //end option 1 if loop
            
            else if (nOption == 2) {    //if user enters option 2
                System.out.print("Enter channel: ");
                nChannel = input.nextInt();     //intakes user input and applies it to nChannel
                System.out.print("Enter volume level: ");
                nVolume = input.nextInt();      //intakes user input and applies it to nVolume
                System.out.print("Enter true to On or false to Off: ");
                bOn = input.nextBoolean();      //intakes true or false and applies it to nOn 
                tv1 = new TV(nChannel, nVolume, bOn);       //creates tv object
            tv1.printTVDetails();   //displays the tv information   
            System.out.println(" ");
        }   //end option 2 if loop
        
            else if (nOption == 3) {    //if user enters option 3
            tv1.trunOn();       //calls turnOn method applied to tv1
            System.out.println(" ");
        }       //end option 3 if loop
            
            else if (nOption == 4) {    //if user enters option 4
            tv1.turnOff();      //calls turn Off method applied to tv1
            System.out.println(" ");
        }       //end option 4 if loop
            
            else if (nOption == 5) {    //if user enters option 5
                System.out.print("Enter the channel: ");
                nChannel = input.nextInt();     //input is applied to nChannel
            tv1.setChannel(nChannel);   //setChannel method is called and takes nChannel for tv1
            tv1.getChannel();           //getChannel method is called to return channel number
            System.out.println(" ");
        }       //end option 5 if loop
            
            else if (nOption == 6) {    //if user enters option 6
                System.out.print("Enter the volume: ");
                nVolume = input.nextInt();      //input is applied to nVolume
            tv1.setVolume(nVolume);     //setVolume method is called and takes nVolume for tv1
            tv1.getVolume();            //getVolume method is called to return volume number 
            System.out.println(" ");
        }       //end option 6 if loop
            
            else if (nOption == 7) {    //if user enters option 7
                tv1.channelUp(nChannel);    //channelUp method is called for tv1 using nChannel
                System.out.println(" ");
        }       //end option 7 if loop
            
            else if (nOption == 8) {    //if user enters option 8
                tv1.channelDown(nChannel);  //channelDown method is called for tv1 using nChannel
                System.out.println(" ");
        }       //end option 8 if loop
            
            else if (nOption == 9) {    //is user enters option 9
                tv1.volumeUp(nVolume);      //volumeUp method is called for tv1 using nVolume
                System.out.println(" ");
        }       //end option 9 if loop
            
            else if (nOption == 10) {   //if user enters option  10
                tv1.volumeDown(nVolume);    //volumeDown method is called for tv1 using nVolume
                System.out.println(" ");
        }       //end option 10 if loop
            
            else if (nOption == 11) {   //if user enters option 11
            System.out.println("The current volume is: " + tv1.getVolume());
            //display volume using getVolume method
            System.out.println(" ");
        }       //end option 11 if loop
                
            else if (nOption == 12) {   //if user enters option 12
            System.out.println("The current channel is: " + tv1.getChannel());
            //display channel using getChannel method
            System.out.println(" ");
        }       //end option 12 if loop
            
            else if (nOption == 13) {   //if user enters option 13
                if (tv1.getOn() == true) {  //loop for if getOn is true
                    System.out.println("The TV is ON");
                    System.out.println(" ");}
                else {  //loop for if getOn is false
                    System.out.println("The TV is OFF");
                    System.out.println(" "); }
        }       //end option 13 loop
            
            else if (nOption == 14) {   //if user enters option 14
            tv1.printTVDetails();       //print TV details for tv1
            System.out.println(" ");
        }       //end option 14 loop
            
        
        System.out.print("Please select another option: ");
        nOption = input.nextInt();

        input.close();
        
        } //end while loop for options
    } //end main method 
    
} //end public class
