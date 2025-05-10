package com.ethan.services;

import com.ethan.model.PcPart;
import com.ethan.model.PartContainer;

import java.util.ArrayList;
import java.util.Objects;

public class ContainerManagment {
    ArrayList<PartContainer> containersAvailible = new ArrayList<>();

    public ContainerManagment() {
        generateContainers();
        generateParts();
    }
    private void generateContainers(){
            containersAvailible.add(new PartContainer("lowTierContainer"));
            containersAvailible.add(new PartContainer("midTierContainer"));
            containersAvailible.add(new PartContainer("highTierContainer"));
            containersAvailible.add(new PartContainer("legendaryTierContainer"));
            containersAvailible.add(new PartContainer("allPartsContainer"));

    }

    private void generateParts() {
        PartContainer allPartsContainer = getContainer("allPartsContainer");
        // All Parts
        allPartsContainer.addPart(new PcPart("Intel Core i3-13100", 120, "CPU", "low"));
        allPartsContainer.addPart(new PcPart("NVIDIA GTX 1650", 160, "GPU", "low"));
        allPartsContainer.addPart(new PcPart("Kingston Fury 16GB DDR4", 45, "RAM", "low"));
        allPartsContainer.addPart(new PcPart("Crucial P3 500GB NVMe SSD", 40, "Storage", "low"));
        allPartsContainer.addPart(new PcPart("MSI B660M PRO-VDH WiFi", 110, "Motherboard", "low"));
        allPartsContainer.addPart(new PcPart("Cooler Master MasterBox Q300L", 65, "Case", "low"));

        allPartsContainer.addPart(new PcPart("AMD Ryzen 5 7600", 230, "CPU", "mid"));
        allPartsContainer.addPart(new PcPart("NVIDIA RTX 4060", 300, "GPU", "mid"));
        allPartsContainer.addPart(new PcPart("Corsair Vengeance 32GB DDR5", 110, "RAM", "mid"));
        allPartsContainer.addPart(new PcPart("Samsung 980 1TB NVMe SSD", 80, "Storage", "mid"));
        allPartsContainer.addPart(new PcPart("ASUS TUF Gaming B650-PLUS", 190, "Motherboard", "mid"));
        allPartsContainer.addPart(new PcPart("NZXT H510 Flow", 80, "Case", "mid"));

        allPartsContainer.addPart(new PcPart("Intel Core i7-14700K", 400, "CPU", "high"));
        allPartsContainer.addPart(new PcPart("NVIDIA RTX 4070 Ti Super", 800, "GPU", "high"));
        allPartsContainer.addPart(new PcPart("G.SKILL Trident Z5 32GB DDR5", 150, "RAM", "high"));
        allPartsContainer.addPart(new PcPart("WD Black SN850X 2TB NVMe SSD", 160, "Storage", "high"));
        allPartsContainer.addPart(new PcPart("ASUS ROG Strix Z790-E", 400, "Motherboard", "high"));
        allPartsContainer.addPart(new PcPart("Fractal Design Meshify 2", 150, "Case", "high"));

        allPartsContainer.addPart(new PcPart("AMD Ryzen 9 7950X3D", 620, "CPU", "legendary"));
        allPartsContainer.addPart(new PcPart("NVIDIA RTX 4090", 1600, "GPU", "legendary"));
        allPartsContainer.addPart(new PcPart("Corsair Dominator Titanium 64GB DDR5", 300, "RAM", "legendary"));
        allPartsContainer.addPart(new PcPart("Sabrent Rocket 4 Plus 4TB NVMe SSD", 400, "Storage", "legendary"));
        allPartsContainer.addPart(new PcPart("ASUS ROG Crosshair X670E Hero", 700, "Motherboard", "legendary"));
        allPartsContainer.addPart(new PcPart("Lian Li PC-O11 Dynamic XL", 230, "Case", "legendary"));

        // Sort into respective containers
        for (PcPart part : allPartsContainer.getContainerContents()) {
            switch (part.getPartTier()) {
                case "low":
                    getContainer("lowTierContainer").addPart(part);
                    break;
                case "mid":
                    getContainer("midTierContainer").addPart(part);
                    break;
                case "high":
                    getContainer("highTierContainer").addPart(part);
                    break;
                case "legendary":
                    getContainer("legendaryTierContainer").addPart(part);
                    break;
            }
        }
    }

    public PartContainer getContainer(String desiredContainer){
        for (PartContainer container: this.containersAvailible){
            if (Objects.equals(container.getContainerName(), desiredContainer)){
                return container;
            }
        }
        return null;
    }
}

//public class ContainerManagment {
//    List<PcPart> allParts = new ArrayList<>();
//
//    private final ArrayList<PcPart> partListLowTier = new ArrayList<>();
//
//    private final ArrayList<PcPart> partListMidTier = new ArrayList<>();
//
//    private final ArrayList<PcPart> partListHighTier = new ArrayList<>();
//
//    private final ArrayList<PcPart> partListLegandaryTier = new ArrayList<>();
//
//    public ContainerManagment() {
//        generateParts();
//    }
//
//    private void generateParts() {
//        // Low Tier
//        allParts.add(new PcPart("Intel Core i3-13100", 120, "CPU", "low"));
//        allParts.add(new PcPart("NVIDIA GTX 1650", 160, "GPU", "low"));
//        allParts.add(new PcPart("Kingston Fury 16GB DDR4", 45, "RAM", "low"));
//        allParts.add(new PcPart("Crucial P3 500GB NVMe SSD", 40, "Storage", "low"));
//        allParts.add(new PcPart("MSI B660M PRO-VDH WiFi", 110, "Motherboard", "low"));
//        allParts.add(new PcPart("Cooler Master MasterBox Q300L", 65, "Case", "low"));
//
//// Mid Tier
//        allParts.add(new PcPart("AMD Ryzen 5 7600", 230, "CPU", "mid"));
//        allParts.add(new PcPart("NVIDIA RTX 4060", 300, "GPU", "mid"));
//        allParts.add(new PcPart("Corsair Vengeance 32GB DDR5", 110, "RAM", "mid"));
//        allParts.add(new PcPart("Samsung 980 1TB NVMe SSD", 80, "Storage", "mid"));
//        allParts.add(new PcPart("ASUS TUF Gaming B650-PLUS", 190, "Motherboard", "mid"));
//        allParts.add(new PcPart("NZXT H510 Flow", 80, "Case", "mid"));
//
//// High Tier
//        allParts.add(new PcPart("Intel Core i7-14700K", 400, "CPU", "high"));
//        allParts.add(new PcPart("NVIDIA RTX 4070 Ti Super", 800, "GPU", "high"));
//        allParts.add(new PcPart("G.SKILL Trident Z5 32GB DDR5", 150, "RAM", "high"));
//        allParts.add(new PcPart("WD Black SN850X 2TB NVMe SSD", 160, "Storage", "high"));
//        allParts.add(new PcPart("ASUS ROG Strix Z790-E", 400, "Motherboard", "high"));
//        allParts.add(new PcPart("Fractal Design Meshify 2", 150, "Case", "high"));
//
//// Legendary Tier
//        allParts.add(new PcPart("AMD Ryzen 9 7950X3D", 620, "CPU", "legendary"));
//        allParts.add(new PcPart("NVIDIA RTX 4090", 1600, "GPU", "legendary"));
//        allParts.add(new PcPart("Corsair Dominator Titanium 64GB DDR5", 300, "RAM", "legendary"));
//        allParts.add(new PcPart("Sabrent Rocket 4 Plus 4TB NVMe SSD", 400, "Storage", "legendary"));
//        allParts.add(new PcPart("ASUS ROG Crosshair X670E Hero", 700, "Motherboard", "legendary"));
//        allParts.add(new PcPart("Lian Li PC-O11 Dynamic XL", 230, "Case", "legendary"));
//
//
//        for (PcPart part : allParts) {
//            switch (part.getPartTier()) {
//                case "low":
//                    this.partListLowTier.add(part);
//                    break;
//                case "mid":
//                    this.partListMidTier.add(part);
//                    break;
//                case "high":
//                    this.partListHighTier.add(part);
//                    break;
//                case "legendary":
//                    this.partListLegandaryTier.add(part);
//                    break;
//            }
//        }
//    }
//
//    public ArrayList<PcPart> getPartListLowTier() {
//        return partListLowTier;
//    }
//
//    public List<PcPart> getAllParts() {
//        return allParts;
//    }
//
//    public ArrayList<PcPart> getPartListMidTier() {
//        return partListMidTier;
//    }
//
//    public ArrayList<PcPart> getPartListHighTier() {
//        return partListHighTier;
//    }
//
//    public ArrayList<PcPart> getPartListLegandaryTier() {
//        return partListLegandaryTier;
//    }
//
//
//}