package web.model;

public class Cars {
    private String user;
    private String model;
    private int series;

    public Cars(String user,String model, int series) {
        this.model = model;
        this.series = series;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "user='" + user + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
