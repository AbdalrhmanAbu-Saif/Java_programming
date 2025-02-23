package JavaProgramming2.Part8.SimilarityOfObjects.VehicleRegistry;

import JavaProgramming2.Part8.SimilarityOfObjects.SameDate.SameDate;
import java.util.Objects;

public class LicensePlate {

        private final String liNumber;
        private final String country;

        public LicensePlate(String country, String liNumber) {
            this.liNumber = liNumber;
            this.country = country;
        }
        public boolean equals(Object object){

        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
            LicensePlate d = (LicensePlate) object;
        return this.country.equals(d.country) && this.liNumber.equals(d.liNumber) ;
    }

    @Override
    public int hashCode(){
        return this.liNumber.length()+this.liNumber.length()%(5);
    }


    @Override
    public String toString() {
        return "LicensePlate{" +
                "liNumber='" + liNumber + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
