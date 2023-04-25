// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields
    private int numOfStrings;
    private int numOfFrets;
    private boolean isBowed;
    
    // TODO: Define mutator methods - 
    //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
    public void setNumOfStrings(int num) {
       this.numOfStrings = num;
    }
    
    public void setNumOfFrets(int num) {
       this.numOfFrets = num;
    }
    
    public void setIsBowed(boolean isBowed) {
       this.isBowed = isBowed;
    }
    // TODO: Define accessor methods - 
    //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
    public int getNumOfStrings() {
       return this.numOfStrings;
    }
    
    public int getNumOfFrets() {
       return this.numOfFrets;
    }
    
    public boolean getIsBowed() {
       return this.isBowed;
    }
 }
 
 