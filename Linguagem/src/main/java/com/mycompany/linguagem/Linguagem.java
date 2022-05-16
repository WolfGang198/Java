package com.mycompany.linguagem;

import java.util.Locale;

public class Linguagem {

    public static void main(String[] args) {
     Locale language = Locale.getDefault();
        System.out.println("A linguagem do sistema é");
        System.out.println(language.getDisplayLanguage());
    }
}
