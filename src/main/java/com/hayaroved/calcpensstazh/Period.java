/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hayaroved.calcpensstazh;

/**
 *
 * @author Эдуард
 */
public class Period {
    private String dataBegin;
    private String dataEnd;
    private String tU;
    private String dU;

    public Period(String dataBegin, String dataEnd, String tU, String dU) {
        this.dataBegin = dataBegin;
        this.dataEnd = dataEnd;
        this.tU = tU;
        this.dU = dU;
    }

    public String getDataBegin() {
        return dataBegin;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public String gettU() {
        return tU;
    }

    public String getdU() {
        return dU;
    }
    
    
      
    
}
