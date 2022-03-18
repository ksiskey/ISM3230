
public class TV {       //public class to store all methods for tv
    private int nChannel = 1;       //nChannel to hold channel number, initalized to 1
    private int nVolumeLevel = 1;   //nVolume to hold volume level, initialized to 1
    private boolean bOn = false;    //bOn boolean to hold if TV is on or off
    
    //default constructors
    public TV() { //default constructor has default attributes
        bOn = false;
        nVolumeLevel = 1;
        nChannel = 1;
    } //end default constructor
    
    //overloaded constructor
    public TV (int nStartChannel, int nStartVolumeLevel, boolean bStartOn) {    //overloaded constructor intakes nStartChannel, nStartVolumeLevel, and bStartOn from nChannel, nVolume, and nOn in TV application
        if (nStartChannel>=1 && nStartChannel<=120 && nStartVolumeLevel>=1 && nStartVolumeLevel<=7) {   //if nChannel inputed is between 1 and 120, nVolume inputed is between 1 and 7, and bOn inputed is on
            nChannel = nStartChannel;   //nChannel takes nStartChannel value
            nVolumeLevel = nStartVolumeLevel;   //nVolumeLevel takes nStartVolumeLevel value
            bOn = bStartOn;     //bOn takes bStartOn value
        } //end if true statement
        else {  //if one of the criteria above isnt met
            System.out.println("One of the parameters is incorrect; the TV will be created using the default values");
            nChannel = nChannel;    //nChannel takes default value
            nVolumeLevel = nVolumeLevel;    //nVolumeLevel takes default value
            bOn = bOn;  //bOn takes default value
        }   //end if false statement
    } //end overloaded constructor
    
    public void trunOn() { //method to turn TV on
        bOn = true;
    } //end turnOn method
    
    public void turnOff() { //method to turn TV off
        bOn = false;
    } //end turnOff method
    
    public void setChannel(int nNewChannel) {   //method to set the channel takes from nChannel in TV application
        if (bOn==true && nNewChannel >=1 && nNewChannel <=120) { //if TV is on and the channel inputed is between 1 and 120
            nChannel = nNewChannel; //nChannel takes new value
        } // end if true statement
        else {  //if criteria above is not met
            System.out.println("Make sure the TV is ON and enter a channel between 1 & 120");
        }   //end if false statement
    }   //end setChannel method
    
    public void setVolume(int nNewVolume) { //setVolume method takes from nVolume in TV application
        if (bOn==true && nNewVolume >=1 && nNewVolume <=7)  //if TV is on and volume inputed is between 1 and 7
            nVolumeLevel = nNewVolume; //nVolumeLevel takes new value
        else    //if criteria above is not met
            System.out.println("Make sure the TV is ON and enter a volume level between 1 & 7");
    }   //end setVolume method
    
    public void channelUp(int nChannelNum) {    //channelUp method used to increase the channel, takes nChannel from TV application
        if (bOn == true && nChannel < 120)      //if TV is on and channel is less than 120
            nChannel++; //increase nChannel by 1
        else   //if above criteria is not met
            System.out.println("TV is off or channel is 120");
    }   //end channelUp method
    
    public void channelDown(int nChannelNum) {  //channelDown method used to decrease the channel, takes nChannel from TV appliction
        if (bOn == true && nChannel > 1) //if TV is on and channel is greater than 1
            nChannel--; //channel is decreased by 1
        else //if above criteria is not met
            System.out.println("TV is off or channel is 1"); 
    }   //end channelDown method
    
    public void volumeUp(int nVolNum) { //volumeUp method used to increase the volume level, takes nVolume from TV application
        if (bOn == true && nVolumeLevel < 7) //if TV is on and volume is less than 7
            nVolumeLevel++; //volume is increased by 1
        else //if above criteria is not met
            System.out.println("TV is off or volume level 7"); 
    } //end volumeUp method
    
    public void volumeDown(int nVolNum) {   //volumeDown method used to decrease the volume level, takes nVolume from TV application
        if (bOn == true && nVolumeLevel > 1)  //if TV is on and volume is greater than 1
            nVolumeLevel--; //volume is decreased by 1
        else //if above criteria is not met
            System.out.println("TV is off or volume level 1"); 
    } //end volumeDown method
    
    public int getChannel() {   //method used to return the channel
        return nChannel;
    }                           //end getChannel method
    
    public int getVolume() {    //method used to return the volume level
        return nVolumeLevel;
    }                           //end getVolume method
    
    public boolean getOn() {    //method used to return if TV is on
        return bOn;
    }                           //end getOn method
    
    public void printTVDetails() {  //method used to print all the TV details
        System.out.println("TV detail");
        System.out.println("----------");
        if (bOn == true)   //if loop to say if TV is on, print ON
            System.out.println("The TV is ON"); 
        else                //if TV is off, print OFF
            System.out.println("The TV is OFF"); 
        System.out.println("Current volume level: " + nVolumeLevel);
        System.out.println("Current channel: " + nChannel);
    }   //end printTVDetails method
    
    



}






