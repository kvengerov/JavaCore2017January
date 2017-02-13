package com.company.HW2.BoxLikeObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Stas on 29.01.2017.
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        System.out.println("Веддите пожалуйста количество ящиков с провизией, для высадки на марс....");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countBoxes = Integer.parseInt(reader.readLine());
        ArrayList<SpaceShip> SpaceShips = new ArrayList();
        SpaceShip spaceShip = new SpaceShip("Грузовик " + (SpaceShip.getCount() + 1));
        SpaceShips.add(spaceShip);
        // оставил как пример, -  "каким путем идти не надо"
//        for (int i = 0; i < countBoxes; i++) {
//            if(SpaceShips.get(SpaceShip.getCount() - 1).getContainerCount() < SpaceShips.get(SpaceShip.getCount() - 1).getContainerMax())
//            {
//                SpaceShips.get(SpaceShip.getCount() - 1).ContainerAdd(new Containery("Контейнер " + (int)(SpaceShips.get(SpaceShip.getCount() - 1).getContainerCount()+1)));
//            }
//            else{
//                SpaceShip SpaceShip1 = new SpaceShip("Космический корабль " + (int)(SpaceShip.getCount()+1));
//                SpaceShip1.ContainerAdd(new Containery("Контейнер " + (int)(SpaceShip1.getContainerCount()+1)));
//                SpaceShips.add(SpaceShip1);
//            }
//        }
        for (int i = 0; i < countBoxes; i++) {
            Box box = new Box("Ящик " + (i + 1));
            if (SpaceShips.get(SpaceShip.getCount() - 1).putBox(box))
                System.out.println(box + " загружен");
            else {
                SpaceShip SpaceShip1 = new SpaceShip("Грузовик " + (SpaceShip.getCount() + 1));
                SpaceShip1.putBox(box);
                SpaceShips.add(SpaceShip1);
            }
        }

        for (SpaceShip SpaceShipy : SpaceShips) {
            System.out.println(SpaceShipy);
            for (Containery containery : SpaceShipy.getContainers()) {
                System.out.println(containery);
                for (Box boxy : containery.getBoxes()) {
                    System.out.println(boxy);
                }
            }
        }



    }
}
