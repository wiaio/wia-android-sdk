package io.wia;

public class WiaCreateDeviceRequest {
    private String name;
    private int deviceTypeId;
    private String spaceId;
    private String serialNumber;

    private Space space;
    private class Space {
        private String id;
    }

    public WiaCreateDeviceRequest(String name, int deviceTypeId, String spaceId, String serialNumber) {
        Space spaceObj = new Space();
        spaceObj.id = spaceId;
        this.space = spaceObj;
        this.name = name;
        this.deviceTypeId = deviceTypeId;
        this.serialNumber = serialNumber;
    }
}