package com.roberto.controle.utils;

import java.security.*;

public class MD5Utils {
    private MessageDigest messageDigest;

    public MD5Utils() {

    }
    public static byte[] encriptarSenha(String senha) throws Exception {
         = MessageDigest.getInstance("MD5");
        byte[] stringBytes = senha.getBytes("UTF-8");
        return md.digest(stringBytes);
    }
}
