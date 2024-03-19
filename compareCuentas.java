/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodelbienestar;

import java.util.Comparator;

class compareCuentas {
    //Estoy 100 % seguro que hay otra manera de hacer esto pero que weba
};
class compareNumeroCuenta implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta a, Cuenta b) {
        return a.getNumCuenta().compareTo(b.getNumCuenta());
    }
}

class compareNombre implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta a, Cuenta b) {
        return a.getNombreCliente().compareTo(b.getNombreCliente());
    }
}