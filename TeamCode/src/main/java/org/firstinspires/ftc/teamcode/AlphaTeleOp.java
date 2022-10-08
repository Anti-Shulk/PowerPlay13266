package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class AlphaTeleOp extends OpMode {
    DcMotor leftMotorFront;
    DcMotor leftMotorBack;
    DcMotor rightMotorFront;
    DcMotor rightMotorBack;
    double rightPower;
    double leftPower;


    @Override
    public void init() {
        leftMotorFront = hardwareMap.get(DcMotor.class, "leftMotorFront");
        leftMotorBack = hardwareMap.get(DcMotor.class, "leftMotorBack");
        rightMotorFront = hardwareMap.get(DcMotor.class, "rightMotorFront");
        rightMotorBack = hardwareMap.get(DcMotor.class, "rightMotorBack");

        leftMotorFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftMotorBack.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotorFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightMotorBack.setDirection(DcMotorSimple.Direction.REVERSE);

        telemetry.addLine("Iggy was here");

    }

    @Override
    public void loop() {

        rightPower = -gamepad1.left_stick_y - gamepad1.right_stick_x;
        leftPower = -gamepad1.left_stick_y + gamepad1.right_stick_x;

        // POV Drive
        leftMotorFront.setPower(leftPower);
        rightMotorFront.setPower(rightPower);
        leftMotorBack.setPower(leftPower);
        rightMotorBack.setPower(rightPower);

        telemetry.addData("leftMotor", leftPower);
        telemetry.addData("rightMotor", rightPower);

    }
}
