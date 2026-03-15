package com.scan;

public class ScoreDetail {

	private int math;
	private int physics;
	private int chemistry;
	private int graphics;
	private int mechanics;
	private boolean valid = true;

	public void setMath(int math) {
		if (math < 0 || math > 100) {
			System.out.println("Invalid Marks");
			valid = false;
		}
		this.math = math;
	}

	public void setPhysics(int physics) {
		if (physics < 0 || physics > 100) {
			System.out.println("Invalid Marks");
			valid = false;
		}
		this.physics = physics;
	}

	public void setChemistry(int chemistry) {
		if (chemistry < 0 || chemistry > 100) {
			System.out.println("Invalid Marks");
			valid = false;
		}
		this.chemistry = chemistry;
	}

	public void setGraphics(int graphics) {
		if (graphics < 0 || graphics > 100) {
			System.out.println("Invalid Marks");
			valid = false;
		}
		this.graphics = graphics;
	}

	public void setMechanics(int mechanics) {
		if (mechanics < 0 || mechanics > 100) {
			System.out.println("Invalid Marks");
			valid = false;
		}
		this.mechanics = mechanics;
	}

	public void myResult() {

		if (!valid) {
			System.out.println("Result can't be Calculated due to Invalid Marks");
			return;
		}

		int total = math + physics + chemistry + graphics + mechanics;
		float percentage = ((float) total / 500) * 100;

		System.out.println("The total Marks Student has obtain = 500/" + total);
		System.out.println("The Percentage of Student is = " + percentage);

		boolean isPass = true;
		int failCount = 0;
		for (int i = 1; i <= 5; i++) {
			if (i == 1 && math < 35) {
				System.out.println("Failed in Maths");
				isPass = false;
				failCount++;
			}

			if (i == 2 && physics < 35) {
				System.out.println("Failed in Physics");
				isPass = false;
				failCount++;
			}

			if (i == 3 && chemistry < 35) {
				System.out.println("Failed in Chemistry");
				isPass = false;
				failCount++;
			}

			if (i == 4 && graphics < 35) {
				System.out.println("Failed in Graphics");
				isPass = false;
				failCount++;
			}

			if (i == 5 && mechanics < 35) {
				System.out.println("Failed in Mechanics");
				isPass = false;
				failCount++;
			}
		}

		if (isPass) {
			System.out.println("The Student is Pass.....!!");
		} else {
			System.out.println("The Student is Fail...!!");
			System.out.println("Student Fail in " + failCount + " Subjects");
		}
	}
}
