package com.example.ecopowerhub;

import java.util.Random;

public class Consumo
{
    private String mes;
    private int energia;

    static String[] mesesDelAno = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"
    };

    public Consumo(String mes, int energia)
    {
        this.mes = mes;
        this.energia = energia;
    }

    public String getMes()
    {
        Random random = new Random();
        int index = random.nextInt(mesesDelAno.length);
        return mesesDelAno[index];
    }

    public void setMes(String mes)
    {
        this.mes = mes;
    }

    public int getEnergia()
    {
        return (int) (Math.random() * 1000) + 1;
    }

    public void setEnergia(int energia)
    {
        this.energia = energia;
    }
}