package com.roberto.controle.test.utils;

import org.junit.Assert;
import org.junit.Test;
import com.roberto.controle.utils.MD5Utils;

public class MD5UtilsTest {

    @Test
    public void garantirQueUmaStringSempreGeraMesmoMD5() throws Exception {
        Assert.assertEquals(MD5Utils.encriptarSenha("Roberto"),MD5Utils.encriptarSenha("Roberto"));
    }
}
