package com.giraldo.pooclasesabstratas.form.elementos;

import com.giraldo.pooclasesabstratas.form.InputForm;
import com.giraldo.pooclasesabstratas.form.SelectForm;
import com.giraldo.pooclasesabstratas.form.TextareaForm;
import com.giraldo.pooclasesabstratas.form.select.Opcion;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        InputForm username= new InputForm("username");
        InputForm password= new InputForm("clave","password");
        InputForm email= new InputForm("email","email");
        InputForm edad= new InputForm("edad", "number ");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        username.setValor("cris096");
        password.setValor("cgb096");
        email.setValor("cris@gmail.com");
        edad.setValor("30");
        java.setValor("true");

    }
}