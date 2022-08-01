package br.com.stefanini.model;

public enum TipoDocumento {

    CPF(0),
    CNPJ(1),
    OUTROS(2);

    public int cdDocumento;

    TipoDocumento(int valor) {
        cdDocumento = valor;
    }
}
