public class Space {

    public static Civilization getOverlords(Civilization c1, Civilization c2) {
        return c1.getPlanets().size() > c2.getPlanets().size() ? c1 : c2;
    }
}