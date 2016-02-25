import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/25/2016.
 */

    public class ProductionWorker extends exceptionProject
    {
        private int shift;
        private double hourlyPay;


        public ProductionWorker(String name, int idNum, int hireDate, int shift, double hourlyPay)
        {
            super(name,idNum,hireDate);
            this.shift = shift;
            this.hourlyPay = hourlyPay;

        }

        public int getShift()
        {
            return shift;
        }

        public double getHourlyPay()
        {
            return hourlyPay;
        }

        public void getInfo(int shift, double hourlyPay)
        {
            DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
            this.shift = shift;
            this.hourlyPay = hourlyPay;
            System.out.println("Name: " + getName());
            System.out.println("Employee number: " + getIdNum());
            System.out.println("Hire Date: October " + getHireDate() + " 2007");
            System.out.println("Shift number: " + shift);
            System.out.println("Hourly pay: " + decFormat.format(hourlyPay));
            System.out.println("-------------------------------------------");

        }
}
