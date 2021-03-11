package com.cts.bank;

public interface Manager {

	void openAccount();

	void closeAccount();

	double withDraw(double amt);

	void deposit(double amt);

	void openLocker();

}