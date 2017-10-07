package org.firstinspires.ftc.Tempest_2017_2018.teamcode.Manipulators;

/**
 * Created by Molly on 10/7/2017.
 */
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
<<<<<<< HEAD
import com.qualcomm.robotcore.hardware.Servo;
public class Glyph_Arm
{
=======
public class Glyph_Arm
{
    DcMotor.RunMode encMode = DcMotor.RunMode.RUN_USING_ENCODER;
    DcMotor liftArm;
    DcMotor grabArm;
>>>>>>> 4f8b23bb54452a2619318a5fb37a14078d3ed9c3

    int speed = 140*4;
    double liftPower = 0.5;
    double lowerPower = -0.5;
    double grabPower = 0.2;

    HardwareMap HWMap;

    public Glyph_Arm(){}

    public void init(HardwareMap newHWMap)
    {
        HWMap = newHWMap;

        //We can reverse the motor directions if we need to in order to get the motor to run in the correct direction
        liftArm = HWMap.dcMotor.get("liftArm");
        liftArm.setMode(encMode);
        liftArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        liftArm.setMaxSpeed(speed);

        grabArm = HWMap.dcMotor.get("grabArm");
        grabArm.setMode(encMode);
        grabArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        grabArm.setMaxSpeed(speed);
    }

    public void lift()
    {
        liftArm.setPower(liftPower);
    }
    public void lower()
    {
        liftArm.setPower(lowerPower);
    }
    public void stopLifting()
    {
        liftArm.setPower(0);
    }
    public void grab()
    {
        grabArm.setPower(grabPower);
    }
    public void release()
    {
        grabArm.setPower(-grabPower);
    }
    public void holdGrabPosition()
    {
        grabArm.setPower(0);
    }
}