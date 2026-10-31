package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;
import com.qualcomm.robotcore.hardware.HardwareMap;
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

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class biobuzz_autonomous_2026 extends LinearOpMode {
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    
    GoBildaPinpointDriver odometry;
    
    @Override
    public void runOpMode() throws InterruptedException {
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        
        odometry = hardwareMap.get(GoBildaPinpointDriver.class, "odometry");
        
        DcMotor[] motors = {backLeft, backRight, frontLeft, frontRight};
        
        drivetrain drivetrain = new drivetrain(motors[0], motors[1], motors[2],motors[3]);
        
        
        //double[] rotations = {0,0,0,0};
        
        //for (DcMotor motor : motors) {
            //motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            //motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //}
        
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Drivetrain",drivetrain);
            telemetry.addData("Odometry",odometry);
            telemetry.update();
            
            drivetrain.setPowerAll(0.0);
            
            sleep(1000);
            
            drivetrain.setPowerAll(0.0);
            
            return;
            
            //for (int i=0; i<4; i++) {
            //    rotations[i] = motors[i].getCurrentPosition(); 
            //}
            
            //telemetry.addData("Rotations: ", rotations[0]);
            //telemetry.addData("Rotations: ", rotations[1]);
            //telemetry.addData("Rotations: ", rotations[2]);
            //telemetry.addData("Rotations: ", rotations[3]);
            //telemetry.update();
        }
    }
}

