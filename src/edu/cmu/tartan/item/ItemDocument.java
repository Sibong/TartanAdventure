package edu.cmu.tartan.item;

import edu.cmu.tartan.properties.Holdable;
import edu.cmu.tartan.properties.Installable;

public class ItemDocument extends Item implements Holdable, Installable {
    public ItemDocument(String s, String sd, String[] a) {
        super(s, sd, a);
    }
}
