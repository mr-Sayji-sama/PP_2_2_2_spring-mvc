package web.model;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int series;
    private String fabric;

    public Car() {
    }

    public Car(String model, int series, String fabric) {
        this.model = model;
        this.series = series;
        this.fabric = fabric;
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

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return String.format("Car = model: %s, series: %d, fabric: %s", this.model, this.series, this.fabric);
    }
}
