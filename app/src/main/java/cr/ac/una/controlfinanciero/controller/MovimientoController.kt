package cr.ac.una.controlfinanciero.controller

import cr.ac.una.controlfinanciero.entity.Movimiento

class MovimientoController {

    var movimientos :ArrayList<Movimiento> = arrayListOf()

    fun insertMovimiento(movimiento: Movimiento){
        movimientos.add(movimiento)
    }
}