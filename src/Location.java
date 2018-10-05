public class Location {
    public int row;
    public int collumn;
    public double maxValue;

    public Location() {

    }

    public Location(int row, int collumn) {
        this.row = row;
        this.collumn = collumn;
    }

    public int getRow() {
        return row;
    }

    public int getCollumn() {
        return collumn;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                    location.setRow(i);
                    location.setCollumn(j);
                    location.setMaxValue(max);
                }
            }
        }

        return location;
    }


}
