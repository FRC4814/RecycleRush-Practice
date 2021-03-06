/*package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeWheels extends Command {

    public IntakeWheels() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double forwardPower = Robot.oi.operatorStick.getDeadY();
    	double turnMod = Robot.oi.operatorStick.getDeadX();
        
        if(forwardPower > 0){
           Robot.intake.lift(.95,-.95); 
        }
    	if(forwardPower < 0){
           Robot.intake.lift(-.95,.95); 
        }
        if(turnMod > 0){
           Robot.intake.lift(.95,.95); 
        }
        if(turnMod < 0){
           Robot.intake.lift(-.95,-.95); 
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.lift(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}*/
