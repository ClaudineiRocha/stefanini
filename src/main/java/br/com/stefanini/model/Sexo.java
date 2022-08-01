package br.com.stefanini.model;

public enum Sexo {

    MASCULINO(0),
    FEMININO(1),
    OUTROS(2);

    public int cdSexo;

    Sexo(int valor) {
        cdSexo = valor;
    }
}
