package com.example.praktos2;

public class State {

    private String name;
    private String capital;
    private int flagResource;
    private String description;

    public State(String name, String capital, int flag, String description) {
        this.name = name;
        this.capital = capital;
        this.flagResource = flag;
        this.description = description;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getCapital() { return this.capital; }

    public void setCapital(String capital) { this.capital = capital; }

    public int getFlagResource() { return this.flagResource; }

    public void setFlagResource(int flagResource) { this.flagResource = flagResource; }

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }
}
