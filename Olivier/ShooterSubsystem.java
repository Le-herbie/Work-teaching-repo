/**
* Extends Subsystem for a flywheel/launcher mechanism.
*/
public class ShooterSubsystem extends SubsystemBase{
 private int targetRpm;
 private boolean hasHood;

/**
* Full constructor for ShooterSubsystem object.
*/
 public ShooterSubsystem(String name, int canId, int currentLimitAmps, int targetRpm, boolean hasHood){
    super(name, canId, currentLimitAmps);
    this.targetRpm = targetRpm;
    this.hasHood = hasHood;
 }

/**
* Fixed-Hood Constructor for ShooterSubsystem object.
*/
 public ShooterSubsystem(String name, int canId, int targetRpm){
   super(name, canId, 60);
    this.targetRpm = targetRpm;
    this.hasHood = false;
 }
}
