/**
 *  <Tugas w6: Polimorphism>
 *  Author  : Nobby Dharma Khaulid
 *  NIM     : 231524020
 *  Tanggal : 16 Maret 2023
 */


/**
 * Commission class represents an employee who earns a commission based on their total sales.
 * It extends the Hourly class.
 */
public class Commission extends Hourly 
{
    private double totalSales; // Total sales made by the employee
    private double commissionRate; // Commission rate for the employee

    /**
     * Constructs a Commission object with the specified parameters.
     */
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    /**
     * Adds the specified sales amount to the total sales of the employee.
     */
    public void addSales(double totalSales)
    {
        this.totalSales += totalSales;
    }

    /**
     * Calculates and returns the payment for the employee, including hourly pay and commission.
     * Resets the total sales to zero after calculating the payment.
     */
    @Override
    public double pay()
    {
        double payment = super.pay() + totalSales * commissionRate;
    
        totalSales = 0; // Reset total sales to zero after payment calculation

        return payment;
    }

    // Getters and setters for totalSales and commissionRate
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * Returns a string representation of the Commission object, including total sales.
     */
    @Override
    public String toString()
    {
        String result = super.toString();

        result += "\nCurrent Total Sales: " + totalSales;

        return result;
    }
}
