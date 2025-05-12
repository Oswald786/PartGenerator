package com.ethan.model;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class PcPart {

    public PcPart(String partName, int msrp, String partCatagory,String partTier) {
        this.partName = partName;
        this.msrp = msrp;
        this.partCatagory = partCatagory;
        this.partTier = partTier;
    }

    public String getPartName() {
        return partName;
    }

    public int getMsrp() {
        return msrp;
    }

    public String getPartCatagory() {
        return partCatagory;
    }

    public String getPartTier() {
        return partTier;
    }

    private String partName;
    private int msrp;
    private String partCatagory;
    private String partTier;


}
