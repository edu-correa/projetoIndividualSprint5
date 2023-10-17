package org.example;

public class Interface {
    private Inserts ins;

    public Interface(String usuario) {
        this.ins = new Inserts(usuario);
    }

    public void salvarDados(String usuario){
        Integer contador = 0;
        while (contador < 20){
            contador++;
            ins.inserirDados();
        }
    }
}
