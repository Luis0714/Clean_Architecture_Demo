package com.example.demo.Domain.Enums;

public enum EnumTypePerson {
    Natural(1),
    Juridica(2);

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private int valor;
    EnumTypePerson(int valor){
        this.valor = valor;
    }
}
