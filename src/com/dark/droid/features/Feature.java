package com.dark.droid.features;

import android.content.pm.PackageManager;

public class Feature
{
	public boolean has, software, camera;
	public String msg;
	public Feature(String thing, PackageManager pm)
	{
		has = pm.hasSystemFeature(thing);
		String name = thing.replace("android.", "");
		if(name.startsWith("software"))software = true;
		name = name.replace("software.", "");
		name = name.replace("hardware.", "");
		if(name.startsWith("camera"))camera = true;
		if(has)
		{
			msg = "<font color='#15D515'>" + name + "</font>";
		}
		else
		{
			msg = "<font color='#D51515'>" + name + "</font>";
		}
	}
}
