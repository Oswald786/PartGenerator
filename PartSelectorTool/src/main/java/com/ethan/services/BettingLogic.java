package com.ethan.services;
import com.ethan.model.PcPart;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class BettingLogic {

    private final ContainerManagment partContainerManager;

    public BettingLogic() {
        this.partContainerManager = new ContainerManagment();
    }

    public PcPart findTierItem(double betPlaced) {
        int formattedBet = (int) betPlaced;

        if (formattedBet <= 500) {
            List<PcPart> low = partContainerManager.getContainer("lowTierContainer").getContainerContents();
            System.out.println("parts retrived" + low.size());
            return low.get(generateRandomItemNumber(low));
        } else if (formattedBet <= 1000) {
            List<PcPart> mid = partContainerManager.getContainer("midTierContainer").getContainerContents();
            return mid.get(generateRandomItemNumber(mid));
        } else if (formattedBet <= 2000) {
            List<PcPart> high = partContainerManager.getContainer("highTierContainer").getContainerContents();
            return high.get(generateRandomItemNumber(high));
        } else {
            List<PcPart> legendary = partContainerManager.getContainer("legendaryTierContainer").getContainerContents();
            return legendary.get(generateRandomItemNumber(legendary));
        }
        // For bets over 3000 or negative input
    }

    private int generateRandomItemNumber(List<PcPart> list) {
        return (int) (Math.random() * list.size());
    }

    public List<PcPart> retriveParts() {
        return partContainerManager.getContainer("allPartsContainer").getContainerContents();
    }
}




























//public class BettingLogic {
//
//    ContainerManagment partContainer;
//
//    public BettingLogic() {
//        this.partContainer = new ContainerManagment();
//    }
//
//    public PcPart findTierItem(double betPlaced) {
//        int formattedBet = (int) betPlaced;
//
//        if (formattedBet <= 500) {
//            List<PcPart> low = partContainer.getPartListLowTier();
//            return low.get(generateRandomItemNumber(this.partContainer.getPartListLowTier()));
//        } else if (formattedBet <= 1000) {
//            List<PcPart> mid = partContainer.getPartListMidTier();
//            return mid.get(generateRandomItemNumber(this.partContainer.getPartListMidTier()));
//        } else if (formattedBet <= 2000) {
//            List<PcPart> high = partContainer.getPartListHighTier();
//            return high.get(generateRandomItemNumber(this.partContainer.getPartListHighTier()));
//        } else if (formattedBet <= 3000) {
//            List<PcPart> legendary = partContainer.getPartListLegandaryTier();
//            return legendary.get(generateRandomItemNumber(this.partContainer.getPartListLegandaryTier()));
//        }
//
//        return null; // For bets over 3000 or negative input
//    }
//
//    private int generateRandomItemNumber(ArrayList<PcPart> list){
//        return (int)(Math.random() * list.size());
//    }
//
//    public List<PcPart> retriveParts(){
//        return this.partContainer.getAllParts();
//    }























































//        allParts.add(new PcPart("Intel Core i3-13100", 120, "CPU","low" ));
//        allParts.add(new PcPart("NVIDIA GTX 1650", 160, "GPU","low" ));
//        allParts.add(new PcPart("Kingston Fury 16GB DDR4", 45, "RAM","low" ));
//        allParts.add(new PcPart("Crucial P3 500GB NVMe SSD", 40, "Storage","low" ));
//        allParts.add(new PcPart("Crucial P3 500GB NVMe SSD", 40, "Storage","low" ));
//
//
//
//
//
//
//
//        partListLowTier.add( new PcPart("Intel Core i3-13100", 120, "CPU" ));
//        partListLowTier.add( new PcPart("NVIDIA GTX 1650", 160, "GPU", ));
//        partListLowTier.add( new PcPart("Kingston Fury 16GB DDR4", 45, "RAM"));
//        partListLowTier.add( new PcPart("Crucial P3 500GB NVMe SSD", 40, "Storage"));
//
//        partListLowTier.add( new PcPart("MSI B660M PRO-VDH WiFi", 110, "Motherboard"));
//        partListLowTier.add( new PcPart("Cooler Master MasterBox Q300L", 65, "Case"));
//
//
//        partListMidTier.add(new PcPart("AMD Ryzen 5 7600", 230, "CPU"));
//        partListMidTier.add(new PcPart("NVIDIA RTX 4060", 300, "GPU"));
//        partListMidTier.add(new PcPart("Corsair Vengeance 32GB DDR5", 110, "RAM"));
//        partListMidTier.add(new PcPart("Samsung 980 1TB NVMe SSD", 80, "Storage"));
//        partListMidTier.add(new PcPart("ASUS TUF Gaming B650-PLUS", 190, "Motherboard"));
//        partListMidTier.add(new PcPart("NZXT H510 Flow", 80, "Case"));
//
//        partListHighTier.add(new PcPart("Intel Core i7-14700K", 400, "CPU"));
//        partListHighTier.add(new PcPart("NVIDIA RTX 4070 Ti Super", 800, "GPU"));
//        partListHighTier.add(new PcPart("G.SKILL Trident Z5 32GB DDR5", 150, "RAM"));
//        partListHighTier.add(new PcPart("WD Black SN850X 2TB NVMe SSD", 160, "Storage"));
//        partListHighTier.add(new PcPart("ASUS ROG Strix Z790-E", 400, "Motherboard"));
//        partListHighTier.add(new PcPart("Fractal Design Meshify 2", 150, "Case"));
//
//        partListLegandaryTier.add(new PcPart("AMD Ryzen 9 7950X3D", 620, "CPU"));
//        partListLegandaryTier.add(new PcPart("NVIDIA RTX 4090", 1600, "GPU"));
//        partListLegandaryTier.add(new PcPart("Corsair Dominator Titanium 64GB DDR5", 300, "RAM"));
//        partListLegandaryTier.add(new PcPart("Sabrent Rocket 4 Plus 4TB NVMe SSD", 400, "Storage"));
//        partListLegandaryTier.add(new PcPart("ASUS ROG Crosshair X670E Hero", 700, "Motherboard"));
//        partListLegandaryTier.add(new PcPart("Lian Li PC-O11 Dynamic XL", 230, "Case"));

//    }
