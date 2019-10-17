public class Planet {
    private String name;
    private float temperature;
    private boolean colonized;

    public Planet(String name, float temperature) {
        this.name = name;
        this.temperature = temperature;
        this.colonized = false;
    }

    public String getName() {
        return this.name;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setColonized(boolean status) {
        this.colonized = status;
    }

    public boolean getColonized() {
        return this.colonized;
    }
}