package com.monkeynuts.bukkit.SimpleWarp2;

import org.bukkit.Location;
import org.bukkit.World;

/**
 * Created by IntelliJ IDEA.
 * User: Chris
 * Date: 02/03/11
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class LocationWrapper {

    private Location location;
    private String name;

    public LocationWrapper(Location location, String name) {

        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
