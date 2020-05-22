package com.company;

import com.company.base.Address;
import com.company.base.Customer;
import com.company.base.Destination;
import com.company.packing.Container;
import com.company.packing.Item;
import com.company.packing.Position;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.packing.Color;
import order.packing.IPosition;
import org.json.simple.parser.ParseException;
import packing_gui.PackingGUI;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, ContainerException {
	// write your code here
        //Gerar Address
        Address address = new Address("Lixa", "Portugal", 11, "Porto", "Rua de Real");
        //System.out.println(address.toString() );

        //Gerar Costumer
        Customer customer = new Customer(22, "Marcelo", address,address);
       // System.out.println("Customer: "+ customer.toString());

        //Gerar Destination
        Destination destination = new Destination(address, "Joana");

        //Gerar Position
        Position position = new Position(3,3,3);
        //Gerar Item
        Item item = new Item("Ref1","DEscription",3,3,3,Color.blue,Color.fuchsia);
        Item item1 = new Item("Ref11","DEscription",3,3,3,Color.blue,Color.fuchsia);
        Item item2 = new Item("Ref12","DEscription",3,3,3,Color.blue,Color.fuchsia);
        //Gerar Array de Item
        Item[] items = new Item[1];
        items[0] = item;

        //Gerar position
        //Position position = new Position(3,3,3);
        //Gerer Container
        Container container = new Container(10,"C1",10, Color.blue,10,10,Color.gray, items);
        container.addItem(item,position,Color.lime);
        container.addItem(item1,position,Color.lime);
        container.addItem(item2,position,Color.lime);
        container.removeItem(item);
        //Gerar Array de containers
        Container[] containers = new Container[1];
        containers[0] = container;

        //Gerar Order
        //Order order = new Order(1,destination,containers, OrderStatus.CLOSED,customer);
        //System.out.println(container.toString());
        //JsonFormater jsonFormater = new JsonFormater();
        //String newResult = jsonFormater.formater(order);
        //System.out.println(newResult);
        //PackingGUI.render("example.json");

    }
}
