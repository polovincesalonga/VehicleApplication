import javax.swing.JOptionPane; 
import javax.swing.JFormattedTextField; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.text.NumberFormat; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout;
import javax.swing.JTextArea; 
import java.awt.Insets; 
import javax.swing.JScrollPane; 
import java.text.DecimalFormat;





public class VehicleGUI extends JFrame implements ActionListener { 

    private JLabel firstNameLabel; 
    private JLabel lastNameLabel; 
    private JLabel phoneLabel; 
    private JLabel vehicleNumLabel; 
    private JLabel vehicleNumTanksLabel; 


    private JTextField firstNameField; 
    private JTextField lastNameField; 
    private JTextField phoneField; 
    private JTextField vehicleNumField; 
    private JTextField vehicleNumTanksField; 

 
    private JFormattedTextField phoneInput; 
    private JFormattedTextField vehicleNumInput; 
    private JFormattedTextField vehicleTanksInput;
    private JFormattedTextField firstNameInput; 
    private JFormattedTextField lastNameInput;


    private JButton enter;

    private JTextArea outputArea; 



    VehicleGUI() 
    {
        GridBagConstraints layout = null;
        JScrollPane scrollPane = null; 

        setTitle("Car Rental Application");  


        //labels 
        firstNameLabel = new JLabel("First Name"); 
        lastNameLabel = new JLabel("Last Name"); 
        phoneLabel = new JLabel("Phone"); 
        vehicleNumLabel = new JLabel("Number of Vehicle"); 
        vehicleNumTanksLabel = new JLabel("Number of tanks");

        //text fields input fields
        firstNameField = new JTextField(15); 
        firstNameField.setEditable(false); 

        lastNameField = new JTextField(15); 
        lastNameField.setEditable(false); 

        phoneField = new JTextField(15); 
        phoneField.setEditable(false); 

        vehicleNumField = new JTextField(15); 
        vehicleNumField .setEditable(false); 

        vehicleNumTanksField = new JTextField(15); 
        vehicleNumTanksField.setEditable(false);  


        //formatted inputs for phone, vehicle num, and tanks 
        vehicleNumInput = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
        vehicleNumInput.setEditable(true); 
        vehicleNumInput.setValue(0); 
        vehicleNumInput.setColumns(15);  


        vehicleTanksInput = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
        vehicleTanksInput.setEditable(true); 
        vehicleTanksInput.setValue(0); 
        vehicleTanksInput.setColumns(15); 


        firstNameInput = new JFormattedTextField(""); 
        firstNameInput.setEditable(true); 
        firstNameInput.setColumns(15); 


        lastNameInput = new JFormattedTextField(""); 
        lastNameInput.setEditable(true); 
        lastNameInput.setColumns(15); 


        phoneInput = new JFormattedTextField(""); 
        phoneInput.setEditable(true); 
        phoneInput.setColumns(15);


        //button 
        enter = new JButton("Enter");
        enter.setBackground(Color.CYAN);
        enter.setOpaque(true);
        enter.setSize(10,10);
        enter.addActionListener(this);


        //layout 
        setLayout(new GridBagLayout());


        //text area 
        outputArea = new JTextArea(10,15); 
        scrollPane = new JScrollPane(outputArea); 
        outputArea.setEditable(false);

        //position of the first name label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 0; 
        add(firstNameLabel,layout); 


        //position the first name input field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10);
        layout.gridx = 1; 
        layout.gridy = 0; 
        add(firstNameInput,layout);


        //position the last name label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 1; 
        add(lastNameLabel,layout); 


        //position the last name field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 1; 
        add(lastNameInput,layout); 


        //position of the phone label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 2;
        add(phoneLabel,layout); 


        //position for the phone input field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 2; 
        add(phoneInput,layout); 


        //position for the vehicle number 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10);
        layout.gridx = 0; 
        layout.gridy = 3; 
        add(vehicleNumLabel,layout); 

        //input field for vehicle num 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 3; 
        add(vehicleNumInput,layout); 


        //label for tanks 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10);
        layout.gridx = 0; 
        layout.gridy = 4; 
        add(vehicleNumTanksLabel,layout); 


        //input for tanks 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 4; 
        add(vehicleTanksInput,layout); 


        //position the button 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 5; 
        add(enter,layout);  


        //position the outputarea 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 5; 
        add(outputArea,layout); 


        //position the scrollpane 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridx = 6; 
        add(scrollPane,layout);


    }

    @Override 
    public void actionPerformed(ActionEvent event) 
    {
        CalcCost calculate = new CalcCost(); 
        DecimalFormat df = new DecimalFormat("$#, ##0.00");

        String firstName; 
        String lastName;
        String fullName;
        String phone; 
        String formattedPhone; 

        int numberOfVehicles;
        int numberOfTanks; 

        double vehicleCost;
        double tankCost;
        double subtotal;
        double tax;
        double total;
       


        firstName = firstNameInput.getText(); 
        lastName = lastNameInput.getText();
        phone = phoneInput.getText();  

        numberOfVehicles = ((Number) vehicleNumInput.getValue()).intValue();
        numberOfTanks = ((Number) vehicleTanksInput.getValue()).intValue(); 


        vehicleCost = calculate.calcManuFactureCost(numberOfVehicles); 
        tankCost = calculate.calcFuelTankCost(numberOfVehicles, numberOfTanks); 
        subtotal = calculate.calcSubtotal(vehicleCost,tankCost); 

        tax = calculate.calcTax(subtotal);
        total = calculate.calcTotal(subtotal);

        
        fullName = firstName + " " + lastName;
        formattedPhone = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)","($1) $2-$3");

        outputArea.setText(""); 

        outputArea.append("Full Name: " + fullName + "\nPhone: " + formattedPhone + 
        "\nNumber of Vehicles: " + numberOfVehicles + "\nNumber of Tanks: " + numberOfTanks 
        + "\nVehicle Cost($500.19/vehicle): " + df.format(vehicleCost) + 
        "\nTank Cost ($2.15 / fuel cell): " + df.format(tankCost) + "\nSubtotal: "  + df.format(subtotal) + 
        "\nTax(7.25%): " + df.format(tax) + "\nTotal: " + df.format(total));
    }

    
    
}
