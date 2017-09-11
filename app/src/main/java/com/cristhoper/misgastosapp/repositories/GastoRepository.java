package com.cristhoper.misgastosapp.repositories;

import com.cristhoper.misgastosapp.models.Gasto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cris on 10/09/2017.
 */

public class GastoRepository {

    private static GastoRepository _INSTANCE = null;

    private GastoRepository(){}

    public static GastoRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new GastoRepository();
        return _INSTANCE;
    }

    private List<Gasto> gastos = new ArrayList<>();

    public List<Gasto> getGastos(){
        return this.gastos;
    }

    public void agregarGasto(Gasto gasto){
        this.gastos.add(gasto);
    }
}
