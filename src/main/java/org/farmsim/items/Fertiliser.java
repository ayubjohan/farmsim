package org.farmsim.items;

import org.farmsim.Farm;
import org.farmsim.items.Item;

public class Fertiliser{
	
	public Fertiliser () {
		super();
	}
	
	// @Override
	public void use (Farm farm) {
        farm.changeSoilQuality(5);
        farm.changeFarmHealth(3);
    }
}
