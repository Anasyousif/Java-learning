public class CarsAssemble {    

    public double productionRatePerHour(int speed) {

        

          

        int carsPerHour = 221;

        

          

        double successRate;

        

          


        

          

        if (speed >= 1 && speed <= 4) {

        

          

            successRate = 1.0;  

        

          

        } else if (speed >= 5 && speed <= 8) {

        

          

            successRate = 0.9;  

        

          

        } else if (speed == 9) {

        

          

            successRate = 0.8;  

        

          

        } else if (speed == 10) {

        

          

            successRate = 0.77; 

        

          

        } else {

        

          

            return 0; 

        

          

        }

        

          


        

          

        return speed * carsPerHour * successRate;

        

          

    }

        

          


        

          

    public int workingItemsPerMinute(int speed) {

        

          

       return (int) (productionRatePerHour(speed) / 60);

        

          

    }

        

          

}