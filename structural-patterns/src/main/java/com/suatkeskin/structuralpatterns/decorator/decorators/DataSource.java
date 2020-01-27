package com.suatkeskin.structuralpatterns.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
