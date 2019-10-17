import java.util.ArrayList;

public class Civilization {
    private String name;
    private ArrayList<Planet> planets;

    public Civilization(String name) {
        this.name = name;
        this.planets = new ArrayList<Planet>();
    }

    public void addPlanet(Planet p) {
        p.setColonized(true);
        this.planets.add(p);
    }

    public float getColdest() {
        float coldest = Float.MAX_VALUE;

        for (int i = 0; i < this.planets.size(); i++) {
            if (this.planets.get(i).getTemperature() < coldest) {
                coldest = this.planets.get(i).getTemperature();
            }
        }

        return coldest;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Planet> getPlanets() {
        return this.planets;
    }
}