
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**************************************************** 
Program Name: Customer.java 
Programmer's Name: Edward Alvarado
Program Description: The Customer class object used throughout the program. 
***********************************************************/
public class Customer 
{
    //attributes
    private int customerID;
    private String name;
    private String address;
    private String yardType;
    private double width;
    private double length;
    private double totalCost;
    
    //constructors
    public Customer() 
    {
        customerID = 0;
        name = "N/A";
        address = "N/A";
        yardType = "N/A";
        length = 0.0;
        width = 0.0;
        totalCost = 0.0;
    }

    public Customer(int customerID, String name, String address, String yardType, double width, double length, double totalCost) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.yardType = yardType;
        this.width = width;
        this.length = length;
        this.totalCost = totalCost;
    }
    
    //behaviors
    @Override
    public String toString()
    {
        return name;   //only shows customer name
    }
    
    public String getDetails()
    {
        DecimalFormat fmt = new DecimalFormat("$#,##0.00");
        String output = name + "\n";
        output += address + "\n";
        output += "Type: " + yardType + "\n";
        output += "Width: " + width + "\n";
        output += "Length: " + length + "\n";
        output += "Total Cost: " + fmt.format(totalCost); // currency
        
        return output;
    }
    
    // getters and setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYardType() {
        return yardType;
    }

    public void setYardType(String yardType) {
        this.yardType = yardType;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    
    
} //end of customer class
