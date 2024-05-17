package com.cavapy.operaciones.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

@Data
public class TituloValor {

    private String agenteCodificador;

    private String codigoDeValor;

    private String codigoAlterno;

    private String esPrepago;

    private String codigoValorOrigen;

    private String adquiriblePorFCI;

    private String descripcionValor;

    private BigDecimal valorNominalInicial;

    private GregorianCalendar fechaDeEmision;

    private GregorianCalendar fechaDeInscripcion;

    private String tipoPersona;

    private String origenDelInversionista;

}
