package org.example;

import org.checkerframework.common.returnsreceiver.qual.This;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Inserts {
    private JdbcTemplate conexao;
    private Gathering gath;
    private String user;
    private String comp1;
    private String comp2;
    private String comp3;

    public Inserts(String user) {
        Connection con = new Connection();
        this.conexao = con.getCon();
        gath = new Gathering();
        comp1 = "Memória";
        comp2 = "CPU";
        comp3 = "Disco";
        this.user = user;
    }

    public void inserirDados(){
        System.out.println(gath.getTotalDisco());
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println("Iniciando inserção");
        conexao.update("CALL inserirDadosMaquina (?, ?, ?, ?, ?, ?, ?, now())", user, comp1, gath.getUsoMemoria(), comp2, gath.getUsoProcessador(), comp3, gath.getTotalDisco());
        System.out.println("Inserção finalizada");
    }
}
