package org.example.data;

public class Plane {
    private String model;
    private String origin;
    private Chars chars;
    private Parameters parameters;
    private double price;

    public Plane(String model, String origin, Chars chars, Parameters parameters, double price) {
        this.model = model;
        this.origin = origin;
        this.chars = chars;
        this.parameters = parameters;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
