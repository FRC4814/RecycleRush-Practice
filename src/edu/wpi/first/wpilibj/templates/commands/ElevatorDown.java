package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 */
public class ElevatorDown extends Command {

    public ElevatorDown() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//if (Robot.elevator.getCurrentElevatorLevel() == 0)
    		Robot.elevator.lift(0.8);
    	//else 
    	//	Robot.elevator.lift(Robot.oi.driverRightStick.getThrottle());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return Robot.elevator.getLimitSwitch(0);
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.lift(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
