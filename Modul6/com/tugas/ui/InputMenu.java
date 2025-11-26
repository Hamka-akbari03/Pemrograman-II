package com.tugas.ui;

import com.tugas.service.IUserService;
import com.tugas.util.IInputHelper;

public class InputMenu extends BaseMenu {

    public InputMenu(IUserService userService, IInputHelper inputHelper) {
        super(userService, inputHelper);
    }

    @Override
    protected void printTitle() {
        System.out.println("   📝 FORMULIR TAMBAH PENGGUNA");
    }

    @Override
    protected void executeLogic() {
        String name = inputHelper.getString("Masukkan Nama");
        String email = inputHelper.getString("Masukkan Email");

        // Memanggil service (Proxy akan menangkap ini dulu untuk logging)
        userService.addUser(name, email);
        System.out.println("✅ Data berhasil disimpan ke sistem!");
    }
}