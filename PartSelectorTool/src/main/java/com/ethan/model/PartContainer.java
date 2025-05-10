package com.ethan.model;

import java.util.ArrayList;

public class PartContainer {
    private ArrayList<PcPart> containerContents;

    public String containerName;

    public String getContainerName() {
        return containerName;
    }

    public PartContainer(String containerName) {
        this.containerContents = new ArrayList<>();
        this.containerName = containerName;
    }

    public ArrayList<PcPart> getContainerContents() {
        return containerContents;
    }

    public void addPart(PcPart partToAdd){
        this.containerContents.add(partToAdd);
    }

    public void removePart(PcPart partToRemove){
        for (PcPart part: this.getContainerContents()){
            if (part == partToRemove){
                this.getContainerContents().remove(partToRemove);
            }
        }
    }

    public PcPart findPart(PcPart partToFind){
        for (PcPart part: this.getContainerContents()){
            if (part == partToFind){
                return part;
            }
        }
        return null;
    }
}
