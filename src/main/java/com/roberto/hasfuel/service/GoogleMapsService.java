package com.roberto.hasfuel.service;

import com.roberto.hasfuel.domain.models.GetGasStationsModel;
import com.roberto.hasfuel.domain.models.GoogleLocalsModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;

@Service
@Transactional
public class GoogleMapsService {
    private final Logger log = LoggerFactory.getLogger(GoogleMapsService.class);

    public GoogleMapsService() {}

    protected boolean validarGetGasStations(GetGasStationsModel getGasStationsModel) {
        if (getGasStationsModel == null) {
            return false;
        }
        if (getGasStationsModel.getKey().equals("")) {
            return false;
        }
        if (getGasStationsModel.getRadius() == 0) {
            return false;
        }
        if (getGasStationsModel.getLatitude() == 0.0) {
            return false;
        }
        if (getGasStationsModel.getLongitude() == 0.0) {
            return false;
        }

        return true;
    }

    public LinkedList<GoogleLocalsModel> getGasStations(GetGasStationsModel getGasStationsModel) throws Exception {
        try {
            boolean modelValido = validarGetGasStations(getGasStationsModel);
            if (!modelValido) {
                throw new Exception("Nem todos os parâmetros enviados são válidos.");
            }



            return new LinkedList<GoogleLocalsModel>();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
