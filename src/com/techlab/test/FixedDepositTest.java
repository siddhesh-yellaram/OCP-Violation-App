package com.techlab.test;

import com.techlab.model.FestivalType;
import com.techlab.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101, "Star", 5000, 6000, 3, FestivalType.HOLI);
		System.out.println("Simple Interest: "+fd.calculateSI());
	}

}
