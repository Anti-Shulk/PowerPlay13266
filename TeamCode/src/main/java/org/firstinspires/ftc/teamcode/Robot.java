package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot {
    DcMotor leftMotorFront;
    DcMotor leftMotorBack;
    DcMotor rightMotorFront;
    DcMotor rightMotorBack;
    Servo rightGripper;
    Servo leftGripper;

    public Robot(HardwareMap hardwareMap) {
        leftMotorFront = hardwareMap.get(DcMotor.class, "leftMotorFront");
        leftMotorBack = hardwareMap.get(DcMotor.class, "leftMotorBack");
        rightMotorFront = hardwareMap.get(DcMotor.class, "rightMotorFront");
        rightMotorBack = hardwareMap.get(DcMotor.class, "rightMotorBack");

        rightGripper = hardwareMap.get(Servo.class, "rightGripper");
        leftGripper = hardwareMap.get(Servo.class, "leftGripper");

        leftMotorFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftMotorBack.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotorFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightMotorBack.setDirection(DcMotorSimple.Direction.REVERSE);

        leftGripper.setDirection(Servo.Direction.FORWARD);
        rightGripper.setDirection(Servo.Direction.REVERSE);
    }
}
