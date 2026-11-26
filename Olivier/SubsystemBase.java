public class SubsystemBase{
    // Name of the subsystem
    private String name;
    // The id of the CAN connected mechanism
    private int canId;
    // The current limit in amps
    private int currentLimitAmps;

    /**
    * Constructs default SubsystemBase object.
    */
    public SubsystemBase(String name, int canId, int currentLimitAmps){
        this.name = name;
        this.canId = canId;
        this.currentLimitAmps = currentLimitAmps;
    }

    /**
    * Constructs a new SubsystemBase object with the only default parameter being currentLimitAmps.
    */
    public SubsystemBase(String name, int canId){
        this.name = name;
        this.canId = canId;
        this.currentLimitAmps = 40;
    }
}