package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


/**
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@TeleOp(name="PracticeLinearOpMode", group="Linear Opmode")
//@Disabled
public class PracticeLinearOpMode extends LinearOpMode {

    private DcMotor rightFront;
    private DcMotor leftFront;
    private DcMotor leftBack;
    private DcMotor rightBack;



    @Override
    public void runOpMode() {

        leftFront = hardwareMap.get(DcMotor.class, "LF");
        rightFront = hardwareMap.get(DcMotor.class, "RF");
        leftBack =  hardwareMap.get(DcMotor.class, "LB");
        rightBack = hardwareMap.get(DcMotor.class, "RB");
        Auton auton = new Auton(leftFront, leftBack, rightFront, rightBack);

        // run until the end of the match (driver presses STOP)
        waitForStart();
        while (opModeIsActive()) {

            rightFront.setPower(0.7);
            sleep(5000);
            rightFront.setPower(0);


//            setRightPower(gamepad1.right_stick_y);
//            setLeftPower(gamepad1.left_stick_x);

            telemetry.update ();

        }
    }

    public void setRightPower(double rightPower){

        rightFront.setPower(rightPower);
        rightBack.setPower(rightPower);
        telemetry.addLine("hello world"); //used to display text on the program's interface
    }

    public void setLeftPower(double leftPower){

        leftFront.setPower(leftPower);
        leftBack.setPower(leftPower);



    }


}