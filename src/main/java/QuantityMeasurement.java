public class QuantityMeasurement {
    public double unitConversion(Units units, double value) {
        if (value < 0) {
            throw new Exception(Exception.ExceptionType.ENTER_VALID_INPUT, "Value Should Be poistive");
        } else {
            return value * units.unit;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() == obj.getClass())
            return true;
        return super.equals(obj);
    }
}
