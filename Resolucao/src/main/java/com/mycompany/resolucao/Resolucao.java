package com.mycompany.resolucao;

import java.awt.Toolkit;

public class Resolucao {

    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        System.out.println("A resulução da tela é");
        System.out.println(resolucao.getScreenSize());
    }
}
