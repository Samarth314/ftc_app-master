package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class Auton {

    public Auton(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack){

        leftFront = leftFront;
        rightFront = rightFront;
        leftBack = leftBack;
        rightBack = rightBack;

    }

}
