package com.Api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

	
	private static ConfigManager manager;
	private static final Properties prop =new Properties();
	
	private ConfigManager() throws IOException
	{
		InputStream inputStream = ConfigManager.class.getResourceAsStream("/config.properties");
		prop.load(inputStream);
	}
	
	public static ConfigManager getIstance()
	{
		if(manager == null) {
			synchronized (ConfigManager.class) {
				try {
					manager=new ConfigManager();
				}catch	(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return manager;
	}
	
	public String getString(String Key) {
		return System.getProperty(Key,prop.getProperty(Key));
	}
}
