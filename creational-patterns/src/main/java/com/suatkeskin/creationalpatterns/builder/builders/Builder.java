package com.suatkeskin.creationalpatterns.builder.builders;

import com.suatkeskin.creationalpatterns.builder.cars.Type;
import com.suatkeskin.creationalpatterns.builder.components.Engine;
import com.suatkeskin.creationalpatterns.builder.components.GPSNavigator;
import com.suatkeskin.creationalpatterns.builder.components.Transmission;
import com.suatkeskin.creationalpatterns.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
