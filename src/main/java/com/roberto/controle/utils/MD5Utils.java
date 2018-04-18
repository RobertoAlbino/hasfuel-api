package com.roberto.controle.utils;


import java.security.*;

public class MD5Utils {

    public static byte[] encriptarSenha(String senha) throws Exception {
        return MessageDigest.getInstance("MD5").digest(senha.getBytes("UTF-8"));
    }


}
