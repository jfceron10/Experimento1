/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arquitesos.satt.servicios;

import dto.Boletin;
import dto.Evento;
import dto.Sensor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import logica.interfaces.IServicioBoletinLocal;
import logica.interfaces.IServicioMonitoreoLocal;

/**
 *
 * @author jf.ceron10
 */
@Path("/evento")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BoletinService {
    /**
     * Referencia al Ejb
     */
    @EJB
    private IServicioBoletinLocal boletinEjb;
    
    @POST
    @Path("generar/")
    public Evento generarEvento(Evento e) {
        return boletinEjb.generarEvento(e);
    }
    
    @GET
    @Path("boletines/")
    public List<Boletin> getBoletines() {
        return boletinEjb.getBoletines();
    }
    
    @GET
    @Path("eventos/")
    public List<Evento> getEventos() {
        return boletinEjb.getEventos();
    }
}
