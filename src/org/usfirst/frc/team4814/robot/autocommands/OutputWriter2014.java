package org.usfirst.frc.team4814.robot.autocommands;

import com.sun.squawk.microedition.io.FileConnection;
import edu.wpi.first.wpilibj.Timer;
import java.io.DataOutputStream;
import java.io.PrintStream;
import javax.microedition.io.Connector;



public class OutputWriter2014 {

	private String data = new String();

	public OutputWriter2014() {

	}
    private double lastTime = 0;
	public void writeText(double forwardPower, double turnPower,
	double armPower, double elevatorPower) {
        if (lastTime == 0){
            lastTime = Timer.getFPGATimestamp();
        }
		System.out.println(forwardPower + "," + turnPower + "," + armPower + "," + elevatorPower + " " +(Timer.getFPGATimestamp()-lastTime));
        
		//writes to variable to text file to store motions 
		data = data.concat(forwardPower + "," + turnPower + "," + armPower + "," + elevatorPower +","+ (Timer.getFPGATimestamp()-lastTime)+"\n");
	}

	public void save() { //writes to text file
		System.out.println("data" + data);
		PrintStream out;
		DataOutputStream theFile;
		FileConnection fc;

		try {
			fc = (FileConnection) Connector.open("file:///output.txt", Connector.WRITE);
			fc.create();
			theFile = fc.openDataOutputStream();
			out = new PrintStream(theFile);
			out.print(data);
			out.close();
//hi hi
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}