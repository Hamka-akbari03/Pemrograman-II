package com.tugas.ui;

import com.tugas.service.IUserService;
import com.tugas.util.IInputHelper;

// === DESIGN PATTERN: TEMPLATE METHOD (Behavioral) ===

// SOLID - OCP (Open/Closed Principle):
public abstract class BaseMenu implements IMenu {
    protected IUserService userService;
    protected IInputHelper inputHelper;

    public BaseMenu(IUserService userService, IInputHelper inputHelper) {
        this.userService = userService;
        this.inputHelper = inputHelper;
    }

    protected abstract void printTitle();
    protected abstract void executeLogic();

    @Override
    public void show() {
        System.out.println("\n----------------------------------------");
        printTitle();
        System.out.println("----------------------------------------");

        executeLogic();

        System.out.println("\n(Tekan Enter untuk kembali ke menu...)");
        inputHelper.getString("");
    }
}