package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class MecanumAuto extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(hardwareMap);

        waitForStart();

        mecanumDriveTrain(0.25, -0.25, -0.25, 0.25); // Mecanum Drivetrain moves right

        mecanumUp(0.25);
        stopMotor();
        mecanumDown(0.25);
        stopMotor();
        mecanumStrafeLeft(0.25);
        stopMotor();
        mecanumStrafeRight(0.25);
        stopMotor();
        mecanumTurnLeft(0.25);
        stopMotor();
        mecanumTurnRight(0.25);
        stopMotor();

    }

    void mecanumDriveTrain(double frontLeftPower, double backLeftPower, double frontRightPower, double backRightPower) {
        robot.leftMotorFront.setPower(frontLeftPower);
        robot.leftMotorBack.setPower(backLeftPower);
        robot.rightMotorFront.setPower(frontRightPower);
        robot.rightMotorBack.setPower(backRightPower);
        sleep(1000);
    }
    void mecanumUp(double power) {
        mecanumDriveTrain(power, power, power, power);
        sleep(1000);
    }
    void mecanumDown(double power) {
        mecanumDriveTrain(-power, -power, -power, -power);
        sleep(1000);
    }
    void mecanumStrafeLeft(double power) {
        mecanumDriveTrain(-power, power, power, -power);
        sleep(1000);
    }
    void mecanumStrafeRight(double power) {
        mecanumDriveTrain(power, -power, -power, power);
        sleep(1000);
    }
    void mecanumTurnLeft(double power) {
        mecanumDriveTrain(-power, -power, power, power);
    }
    void mecanumTurnRight(double power) {
        mecanumDriveTrain(power, power, -power, -power);
    }
    void stopMotor() {
        robot.leftMotorFront.setPower(0);
        robot.leftMotorBack.setPower(0);
        robot.rightMotorFront.setPower(0);
        robot.rightMotorBack.setPower(0);
    }
}
