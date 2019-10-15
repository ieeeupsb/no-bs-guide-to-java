public class Test {
    public static void main(String[] args) {
        
        // Test #001
        Planet p1 = new Planet("Earth", 288);
        
        if (p1.getName().equals("Earth") && p1.getTemperature() == 288) {
            System.out.println("Passed test 1/5!");
        }

        // Test #002
        Civilization c1 = new Civilization("Earthlings");
        Planet p2 = new Planet("Mars", 210);
        c1.addPlanet(p1);
        c1.addPlanet(p2);

        if (c1.getPlanets().size() == 2 && c1.getPlanets().get(1) == p2) {
            System.out.println("Passed test 2/5!");
        } 
        
        // Test #003
        Planet p3 = new Planet("Jupiter", 165);
        Planet p4 = new Planet("Saturn", 134);
        c1.addPlanet(p4);

        if (!p3.getColonized() && p4.getColonized()) {
            System.out.println("Passed test 3/5!");
        }

        // Test #004
        if (c1.getColdest() == 134) {
            System.out.println("Passed test 4/5!");
        }   

        // Test #005
        Civilization c2 = new Civilization("Martians");
        c2.addPlanet(p3);
        Civilization c = Space.getOverlords(c1, c2);

        if (c.getName().equals("Earthlings")) {
            System.out.println("Passed test 5/5!");
        }
    }
}