package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class AlphaTeleOp extends OpMode {
    Robot robot;
    double rightPower;
    double leftPower;
    final double CLOSE_POSITION = 0;
    final double OPEN_POSITION = 1;


    @Override
    public void init() {
        robot = new Robot(hardwareMap);

        telemetry.addLine("Iggy was here");

    }

    @Override
    public void loop() {

        rightPower = -gamepad1.left_stick_y - gamepad1.right_stick_x;
        leftPower = -gamepad1.left_stick_y + gamepad1.right_stick_x;

        if (gamepad1.a) {
            robot.leftGripper.setPosition(OPEN_POSITION);
            robot.rightGripper.setPosition(OPEN_POSITION);
        }
        else if (gamepad1.b) {
            robot.leftGripper.setPosition(CLOSE_POSITION);
            robot.rightGripper.setPosition(CLOSE_POSITION);
        }

        // POV Drive
        robot.leftMotorFront.setPower(leftPower);
        robot.rightMotorFront.setPower(rightPower);
        robot.leftMotorBack.setPower(leftPower);
        robot.rightMotorBack.setPower(rightPower);


        telemetry.addData("leftMotor", leftPower);
        telemetry.addData("rightMotor", rightPower);

    }
}
