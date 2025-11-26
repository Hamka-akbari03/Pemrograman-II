package com.tugas.ui;

import com.tugas.service.IUserService;
import com.tugas.util.IInputHelper;

// === DESIGN PATTERN: FACTORY METHOD (Creational) ===
// SOLID - SRP:
public class MenuFactory {

    public static IMenu createMenu(String type, IUserService service, IInputHelper helper) {
        if (type.equalsIgnoreCase("INPUT")) {
            return new InputMenu(service, helper);
        } else if (type.equalsIgnoreCase("VIEW")) {
            return new ViewMenu(service, helper);
        }
        return null;
    }
}