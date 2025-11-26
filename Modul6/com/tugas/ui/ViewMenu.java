package com.tugas.ui;

import com.tugas.model.User;
import com.tugas.service.IUserService;
import com.tugas.util.IInputHelper;

public class ViewMenu extends BaseMenu {

    public ViewMenu(IUserService userService, IInputHelper inputHelper) {
        super(userService, inputHelper);
    }

    @Override
    protected void printTitle() {
        System.out.println("   👀 DAFTAR PENGGUNA TERDAFTAR");
    }

    @Override
    protected void executeLogic() {
        if (userService.isEmpty()) {
            System.out.println("⚠️  Belum ada data pengguna.");
        } else {
            for (User u : userService.getAllUsers()) {
                System.out.println(u);
            }
        }
    }
}
