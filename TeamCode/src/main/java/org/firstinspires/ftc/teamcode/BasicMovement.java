package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()

public class BasicMovement extends OpMode {

    double movementMultiplier=1;

    public DcMotor LEFT_FRONT;
    public DcMotor RIGHT_FRONT;
    public DcMotor RIGHT_REAR;
    public DcMotor LEFT_REAR;

/*Test override in RoboSapiens*/

    @Override
    public void init() {

        LEFT_FRONT = hardwareMap.dcMotor.get("LEFT_FRONT");
        RIGHT_FRONT = hardwareMap.dcMotor.get("RIGHT_FRONT");
        RIGHT_REAR = hardwareMap.dcMotor.get("RIGHT_REAR");
        LEFT_REAR = hardwareMap.dcMotor.get("LEFT_REAR");

        LEFT_REAR.setDirection(DcMotor.Direction.REVERSE);

        LEFT_FRONT.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RIGHT_FRONT.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RIGHT_REAR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LEFT_REAR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }
@Override
   public void loop() {
    double horizontal = movementMultiplier * gamepad1.left_stick_x;
    double vertical = -movementMultiplier * gamepad1.left_stick_y;
    double turn = -movementMultiplier * gamepad1.right_stick_x;


    LEFT_REAR.setPower(turn + horizontal - vertical);
    LEFT_FRONT.setPower(turn - horizontal - vertical);
    RIGHT_REAR.setPower(turn + horizontal + vertical);
    RIGHT_FRONT.setPower(turn - horizontal + vertical);



}




    }



