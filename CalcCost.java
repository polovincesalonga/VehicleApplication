public class CalcCost { 

    private int numberOfVehicles = 0; 
    private int numberOfTanks = 0; 

    private double manufactureCost = 0; 
    private double fuelTankCost = 0; 
    private double subtotal = 0; 
    private double tax = 0; 
    private double total = 0; 


    private final double VEHICLE_PRICE = 500.19; 
    private final double FUELCELL_PRICE = 2.15; 
    private final double TAX_RATE = 0.0725; 
    private final int FUEL_CELL_PER_VEHICLE = 12; 


    public double calcManuFactureCost(int numberOfVehicles) 
    {
        manufactureCost = numberOfVehicles * VEHICLE_PRICE;

        return manufactureCost;
    }

    public double calcFuelTankCost(int numberOfVehicles, int numberOfTanks) 
    {
        fuelTankCost = numberOfVehicles * numberOfTanks * FUEL_CELL_PER_VEHICLE * FUELCELL_PRICE;

        return fuelTankCost;
    } 

    public double calcSubtotal(double manufactureCost, double fuelTankCost) 
    {
        subtotal = manufactureCost + fuelTankCost; 

        return subtotal;
    }

    public double calcTax(double subtotal) 
    {
        tax = subtotal * TAX_RATE;
        
        return tax;
    }

    public double calcTotal(double subtotal) 
    {
        total = subtotal + tax; 
        
        return total;
    }


    
}
