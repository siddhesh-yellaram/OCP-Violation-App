package com.techlab.model;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	private FestivalType festival;
	
	public FixedDeposit(int accNo, String accName, double amount, double principle, int years, FestivalType festival) {
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getAmount() {
		return amount;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}
	
	public double calculateSI() {
		if(this.festival == this.festival.NORMAL) {
			return (this.principle * 0.06 * this.years) / 100;
		}else if(this.festival == this.festival.HOLI) {
			return (this.principle * 0.075 * this.years) / 100;
		}else {
			return (this.principle * 0.08 * this.years) / 100;
		}
	}
}
