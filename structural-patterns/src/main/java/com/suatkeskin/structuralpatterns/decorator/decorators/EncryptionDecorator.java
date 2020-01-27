package com.suatkeskin.structuralpatterns.decorator.decorators;

import java.util.Base64;
import java.util.stream.IntStream;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String encoded = encode(data);
        super.writeData(encoded);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decode(data);
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        IntStream.range(0, result.length).forEach(i -> result[i] += (byte) 1);
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        IntStream.range(0, result.length).forEach(i -> result[i] -= (byte) 1);
        return new String(result);
    }
}
