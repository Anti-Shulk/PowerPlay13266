package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class AlphaAutoPeriod extends LinearOpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void runOpMode() throws InterruptedException {


        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);


        waitForStart();

        movingMotor(0.25, 0.25);
        stopMotor();
        movingMotor(0.25, -0.25);
        stopMotor();
        movingMotor(-0.25, -0.25);
        stopMotor();

        while(opModeIsActive()) {

        }
    }

    void movingMotor(double leftPower, double rightPower) {
        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);

        sleep(1000);
    }

    void stopMotor() {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
}
