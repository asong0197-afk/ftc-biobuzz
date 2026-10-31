# FTC 2026 Biobuzz
Autonomous - The code for autonomous section of the game. The robot can't park yet, but
it does move away from the wall.

TeleOp - The code for the robot when it is controlled by a controller. It can move forward,
strafe, and turn. Left stick controls movement, right stick controls turning.

Drivetrain - The code that handles the mecanum drivetrain. Other scripts call on this class,
like strafe(), driveForward(), and turn(). All of the functions inside take motor power as
an input, from -1.0 to 1.0.
