package com.suatkeskin.creationalpatterns.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Helm's Deep, White Mountains of Middle Earth";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
