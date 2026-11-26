/** 
* Models a 12V SLA robot battery tracked in the pits.
*/
public class Battery{
    // The ID of the battery
    private String batteryId;
    // The voltage of the battery
    private double voltage;
    // The number of charge cycles
    private int cycles;
    // Whether the battery is only for practice or not
    private boolean isPracticeOnly;

    /**
    * Constructs a new Battery object with all provided parameters.
    */
   public Battery(String batteryId, double voltage, int cycles, boolean isPracticeOnly){
        this.batteryId = batteryId;
        this.voltage = voltage;
        this.cycles = cycles;
        this.isPracticeOnly = isPracticeOnly;
    }

    /** 
    * Constructs a new Battery object with default values for new competition batteries.
    */
    public Battery(String batteryId){
        this.batteryId = batteryId;
        this.voltage = 13.1;
        this.cycles = 0;
        this.isPracticeOnly = false;
    }
    
    /**
    * Returns true only if voltage >= 12.7 and isPracticeOnly is false. 
    */
    public boolean isMatchReady(){
        if (this.voltage >= 12.7 && isPracticeOnly == false){
            return true;
        }
        return false;
    }
}