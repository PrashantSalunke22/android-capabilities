package com.dark.droid.features;

import android.content.pm.PackageManager;

public class Feature
{
	public boolean has, software, camera, sensor, screen, connectivity;
	public String msg;
	public Feature(String thing, PackageManager pm)
	{
		has = pm.hasSystemFeature(thing);
		String name = thing.replace("android.", "");
		if(name.startsWith("software"))software = true;
		name = name.replace("software.", "");
		name = name.replace("hardware.", "");
		if(name.startsWith("camera"))camera = true;
		if(name.startsWith("sensor"))sensor = true;
		if(name.startsWith("wifi") || name.startsWith("telephony") || name.startsWith("bluetooth") || name.startsWith("sip"))connectivity = true;
		if(name.startsWith("screen") || name.startsWith("faketouch") || name.startsWith("touchscreen"))screen = true;
		if(has)
		{
			msg = "<font color='#008000'>" + name + "</font>";
		}
		else
		{
			msg = "<font color='#8B0000'>" + name + "</font>";
		}
	}
}
