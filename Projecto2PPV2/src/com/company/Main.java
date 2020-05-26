package com.company;


import com.company.Exceptions.ContException;
import com.company.Packing.Container;
import com.company.Packing.Item;
import com.company.Packing.PackedItem;
import com.company.Packing.Position;
import com.company.ShippingOrder.ShippingOrder;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws PositionException, ContainerException, IOException, ParseException, OrderException {

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
            System.out.println("Main final:  "+ Arrays.toString(iItemPackeds));

            //get remaining volume
            System.out.println("Remaingin volume "+container.getRemainingVolume());

            //Verificar o "Verificador de posicoes"

            container.validate();
            System.out.println(container.getNumberOfItems());

        //----------Test PackedItem----------//

        //----------ShippingOrder Test----------//
        Container container2 = new Container(500,"ContainerNNR2",50,50,50);

        ShippingOrder shippingOrder = new ShippingOrder();
        //Add container
        //shippingOrder.addContainer(container);
        //shippingOrder.addContainer(container2);

        //Test removeContainer
        //shippingOrder.removeContainer(container2);
        //System.out.println("Removido Container2");
        //ExistsContainer
        //boolean b = shippingOrder.existsContainer(container2);
        //System.out.println(b);
        shippingOrder.setStatus(OrderStatus.IN_TREATMENT);
        shippingOrder.getStatus();
        shippingOrder.addContainer(container);
        shippingOrder.addContainer(container2);
        shippingOrder.setStatus(OrderStatus.CLOSED);
        shippingOrder.getStatus();

        //----------ShippingOrder Test----------//

    }
}
