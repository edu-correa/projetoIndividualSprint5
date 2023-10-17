package org.example;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import java.io.*;
import java.util.List;

public class Gathering {
    public Looca looca = new Looca();

    public Double getUsoProcessador(){
        return looca.getProcessador().getUso();
    }

    public Double getUsoMemoria(){
        return looca.getMemoria().getEmUso().doubleValue();
    }

    public Double getTotalDisco(){
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
        List<Disco> discos = grupoDeDiscos.getDiscos();
        Long total = 0L;
        for (Disco disco : discos) {
            total += disco.getTamanho();
        }
        Double novoTotal = total / (1024.0 * 1024 * 1024);
        File file = new File("C:\\");
        Double size = file.getFreeSpace() / (1024.0 * 1024 * 1024);
        return total / size * 100;
    }
}
