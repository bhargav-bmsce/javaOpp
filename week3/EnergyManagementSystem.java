abstract class EnergySource {
    String sourceId;
    String sourceName;
    double energyGenerated; 
    
    EnergySource(String sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    
    abstract double calculateEfficiency();

    
    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.printf("Efficiency: %.2f\n", calculateEfficiency());
        System.out.println("-----------------------------------");
    }
}


class SolarEnergy extends EnergySource {

    SolarEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    
    double calculateEfficiency() {
        return (energyGenerated / 5000.0) * 100.0;
    }
}


class WindEnergy extends EnergySource {

    WindEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000.0) * 100.0;
    }
}


public class EnergyManagementSystem {
    public static void main(String[] args) {
        
        EnergySource ref;
       
        ref = new SolarEnergy("SOL-101", "Sahara Solar Park", 3750.0);
        ref.displayDetails(); 

        
        ref = new WindEnergy("WND-202", "Alta Wind Energy Center", 5600.0);
        ref.displayDetails(); 
    }
}