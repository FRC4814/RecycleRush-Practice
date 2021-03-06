package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;



public class Intake extends Command {
    private RobotDrive myRobot;
    //private double leftPower;
    //private double rightPower;        
   private double power;

    Victor[] IntakeMotor;	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake(double importedPower) {
            myRobot = new RobotDrive(RobotMap.INTAKE_MOTOR[0],RobotMap.INTAKE_MOTOR[1]); //Ummmm what????
		//IntakeMotor = new Victor[2];
		//IntakeMotor[0] = new Victor(RobotMap.INTAKE_MOTOR[0]);
		//IntakeMotor[1] = new Victor(RobotMap.INTAKE_MOTOR[1]);
            lift(importedPower);
	}
	
        //
        
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    /*public void lift(double left, double right){
    	this.leftPower = left;				
    	this.rightPower = right;
        IntakeMotor[0].set(leftPower);
	IntakeMotor[1].set(rightPower);
    }*/
    
    public void lift(double power){
        this.power = power;
        IntakeMotor[0].set(power);
        IntakeMotor[1].set(-power);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected void end() {
    }

    protected void interrupted() {
    }

    protected boolean isFinished() {
        return false;
    }

}