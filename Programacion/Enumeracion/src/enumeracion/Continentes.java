/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracion;

import com.sun.nio.sctp.Association;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    AMERICA(34),
    ASIA(44),
    OCEANIA(14);

    private final int paises;

    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
    
    

}
