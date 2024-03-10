package store;

/**
 * This is the Manager class file extends AbstractStoreEmployee.
 *
 * @author Nobby Dharma Khaulid
 */

public class PartTime extends AbstractStoreEmployee{

    private final double hoursTarget;

    /**
     * This is a argument constructor which Initializes variable salesRate and
     * need to call its super class to initialize other variables
     *
     * @param hoursTarget - The parameter everyday target of hours worked
     * is passed.
     * @param numberOfHoursWorked - The parameter Number of hours worked is
     * passed.
     * @param hourlyRate - The parameter Hourly Rate is passed.
     * @param storeDetails - The parameter Details of the Store is passed.
     * @param PartTimeName - The parameter Name of the Sales Associate is
     * passed.
     * @param basePay - The parameter Base pay is passed.
     */

     public PartTime(double hoursTarget, double numberOfHoursWorked, double hourlyRate, String storeDetails, double basepay, String PartTimeName){
        super(numberOfHoursWorked, hourlyRate, storeDetails, basepay, PartTimeName);
        this.hoursTarget = hoursTarget;
     }

     public double gethoursTarget(){
        return hoursTarget;
    }

     /**
     * Returns calculated Pay of the Sales Associate. The calculated pay is the
     * sum of basePay, commission and the product of number of hours worked and
     * hourly rate.
     *
     * @return - This method returns Payment of the Part Time.
     */
     @Override
     public double calculatePay() {
        return super.getBasePay() + calculateCommission() + (super.getNumberOfHoursWorked() * super.getHourlyRate());
     }

    /**
     * Checks if the employee should be awarded with a promotion.
     *
     * @return - This method returns boolean the eligibility status for
     * promotion for an employee.
     */
     @Override
     public boolean checkPromotionEligibility() {
        if (getNumberOfHoursWorked() > gethoursTarget() ){
            return true;
        }else{
            return false;
        }
     }

     @Override
     public boolean getTraining(){
         if((getNumberOfHoursWorked()+1) >= gethoursTarget()){
             return true;
         }
             return false;
     }

     @Override
     public String toString(){
        return super.toString() + "Hours target per day : " + gethoursTarget() + "hrs";
     }

     @Override
     public boolean getAppreciation(){
        if (gethoursTarget() > getNumberOfHoursWorked()){
            return true;
        }else {
            return false;
        }
}   }
