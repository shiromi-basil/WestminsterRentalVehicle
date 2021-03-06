import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The Vehicle class implements all the attributes and methods
 * of vehicle object.
 * <p>
 *
 * @author Shiromi Basil
 * @version 1.0
 * @since 15-11-2019
 */
@Entity
public class Motorbike extends Vehicle implements Serializable {
    private double mPetrolCapacity;
    private String mType;
    private int mModelYear;

    public Motorbike() {
        super();
    }

    public Motorbike(String vPlateNo, String vMake, String vModel, String vTransmission
            , BigDecimal vRatePerDay, double mPetrolCapacity,
                     String mType, int mModelYear) {
        super(vPlateNo, vMake, vModel, vTransmission, vRatePerDay);
        this.mPetrolCapacity = mPetrolCapacity;
        this.mType = mType;
        this.mModelYear = mModelYear;
    }

    public double getmPetrolCapacity() {
        return mPetrolCapacity;
    }

    public String getmType() {
        return mType;
    }

    public int getmModelYear() { return mModelYear; }

    @Override
    public String toString() {
        return "" + super.toString() +
                " Motorbike {" +
                "mPetrolCapacity=" + mPetrolCapacity +
                ", mType='" + mType + '\'' +
                ", mModelYear='" + mModelYear + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Motorbike motorbike = (Motorbike) o;

        if (Double.compare(motorbike.mPetrolCapacity, mPetrolCapacity) != 0)
            return false;
        if (mModelYear != motorbike.mModelYear)
            return false;
        return mType.equals(motorbike.mType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(mPetrolCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + mType.hashCode();
        result = 31 * result + mModelYear;
        return result;
    }
}
