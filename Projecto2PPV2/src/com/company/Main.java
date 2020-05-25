package com.company;

import com.company.Exceptions.ContException;
import order.exceptions.PositionException;
import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
import org.json.simple.parser.ParseException;
import packing_gui.PackingGUI;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws PositionException, ContException, IOException, ParseException {

       // PackingGUI.render("C:\\Users\\marce\\Desktop\\Projecto2PPV2\\src\\com\\company\\example.json");

	// write your code here
        //----------Test Item----------//

        IItem item = new Item("ItemRef1","Este e o primeiro item",4,4,4);
        IItem item2 = new Item("ItemRef2","Este e o primeiro item",4,4,4);
        IItem item3 = new Item("ItemRef3","Este e o primeiro item",4,4,4);
        IItem item4 = new Item("ItemRef4","Este e o primeiro item",4,4,4);
        //ToString
        System.out.println(item.toString());
        //GetVolume
        System.out.println("Item Ref:  "+item.getReference()+"  Volume: "+item.getVolume());
        //----------Test Item----------//

        //----------Test Position Throws----------//
        Position position = new Position(0,0,0);
        Position position2 = new Position(4,4,4);
        System.out.println(position.getX());
        //----------Test Position Throws----------//

        //----------Test PackedItem----------//

        PackedItem packedItem = new PackedItem(Color.aqua,item,position);
        System.out.println("PackedItem: "+packedItem.toString());

        System.out.println(packedItem.getPosition().toString());
        //----------Test PackedItem----------//

        //----------Test PackedItem----------//
            //Add Item
            Container container = new Container(500,"ContainerNNR1",50,50,50);
            //container.addItem(item,position,Color.black);
            //container.addItem(item2,position,Color.black);
            //container.addItem(item3,position,Color.black);
            container.addItem(item4,position,Color.black);
            container.addItem(item4,position2,Color.black);

            //Test Remove
            //container.removeItem(item);
            //container.removeItem(item2);
            //container.removeItem(item3);
            //container.removeItem(item4);

            //Get Item
            System.out.println("Item 1 pesquisado, Resultado:"+container.getItem("ItemRef4"));

            //Get Ocuppied Volume
            System.out.println("Ocupied Volume: "+ container.getOccupiedVolume());

            //GetPackedItems test
            IItemPacked[] iItemPackeds;
            iItemPackeds = container.iItemPackeds;
            System.out.println("Main final:  "+Arrays.toString(iItemPackeds));

            //get remaining volume
            System.out.println("Remaingin volume "+container.getRemainingVolume());

            //Verificar o "Verificador de posicoes"

            container.validate();

        //----------Test PackedItem----------//

    }
}