package com.roberto.hasfuel.test.service;

import com.roberto.hasfuel.domain.models.GetGasStationsModel;
import org.junit.Before;
import org.junit.Test;

import com.roberto.hasfuel.service.GoogleMapsService;

public class GoogleMapsServiceTest {
    GoogleMapsService googleMapsService = null;
    GetGasStationsModel getGasStationsModel = null;

    @Before
    public void inicializarObjetos() {
        googleMapsService = new GoogleMapsService();
        getGasStationsModel = new GetGasStationsModel();
    }

    @Test(expected=Exception.class)
    public void garantirQueValidarGetGasStationsNaoAceitaInstanciaNula() throws Exception {
        googleMapsService.getGasStations(getGasStationsModel);
    }
}
