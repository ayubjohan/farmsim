package org.farmsim.items;

import org.farmsim.Farm;
import org.farmsim.items.Item;

public class Fertiliser extends Item {
	
	public Fertiliser () {
		super();
	}
	
	// @Override
	public void use (Farm farm) {
        farm.changeSoilQuality(5);
        farm.changeFarmHealth(3);
    }
}
