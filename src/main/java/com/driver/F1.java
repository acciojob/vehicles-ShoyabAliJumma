package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // this();
        super(name,4,2,6,isManual,"sport",1);
    }


    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed=getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         *
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop();
setCurrentGear(1);
        } else if (newSpeed>=1 && newSpeed<=50) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);

        } else if (newSpeed>=51 && newSpeed<=100) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(2);

        } else if (newSpeed<=150 && newSpeed>=101) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);
        } else if (newSpeed>=151 && newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);

        } else if (newSpeed>=201 && newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
        } else if (newSpeed>250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }


}
