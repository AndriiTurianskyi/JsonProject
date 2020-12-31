package Model;

public class Codebeautify {
    General GeneralObject;
    Device DeviceObject;
    InitialReporter InitialReporterObject;
    Manufacturers ManufacturersObject;
    DeviceManufacturers DeviceManufacturersObject;


    // Getter Methods

    public General getGeneral() {
        return GeneralObject;
    }

    public Device getDevice() {
        return DeviceObject;
    }

    public InitialReporter getInitialReporter() {
        return InitialReporterObject;
    }

    public Manufacturers getManufacturers() {
        return ManufacturersObject;
    }

    public DeviceManufacturers getDeviceManufacturers() {
        return DeviceManufacturersObject;
    }

    // Setter Methods

    public void setGeneral(General generalObject) {
        this.GeneralObject = generalObject;
    }

    public void setDevice(Device deviceObject) {
        this.DeviceObject = deviceObject;
    }

    public void setInitialReporter(InitialReporter initialReporterObject) {
        this.InitialReporterObject = initialReporterObject;
    }

    public void setManufacturers(Manufacturers manufacturersObject) {
        this.ManufacturersObject = manufacturersObject;
    }

    public void setDeviceManufacturers(DeviceManufacturers deviceManufacturersObject) {
        this.DeviceManufacturersObject = deviceManufacturersObject;
    }

}
