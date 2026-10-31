
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import com.qualcomm.robotcore.hardware.CRServo;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.hardware.sparkfun.SparkFunOTOS;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


public class drivetrain {
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    
    DcMotor[] motors;
    
    public drivetrain(DcMotor backLeft, DcMotor backRight, DcMotor frontLeft, DcMotor frontRight) {
        this.backLeft = backLeft;
        this.backRight = backRight;
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        
        this.motors = new DcMotor[]{this.backLeft, this.backRight, this.frontLeft, this.frontRight};
    }
    
    public void setPowerAll(double power) {
        for (DcMotor motor : motors) {
            motor.setPower(power);
        }
    }
    
    public void powerMotors(double [] power) {
        backLeft.setPower(power[0]);
        backRight.setPower(power[1]);
        frontLeft.setPower(power[2]);
        frontRight.setPower(power[3]);
    }
    
    public void driveForward(double power) {
        for (DcMotor motor : motors) {
            motor.setPower(power);
        }
    }
    
    public void driveLeftForward(double power) {
        motors[3].setPower(power);
        motors[0].setPower(power);
    }
    
    public void driveRightForward(double power) {
        motors[2].setPower(power);
        motors[1].setPower(power);
    }
    
    public void strafe(double power) {
        motors[0].setPower(power);
        motors[1].setPower(-power);
        motors[2].setPower(-power);
        motors[3].setPower(power);
    }
    
    public void turn(double power) {
        motors[0].setPower(-power);
        motors[1].setPower(power);
        motors[2].setPower(-power);
        motors[3].setPower(-power);
    }
}

