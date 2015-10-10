package start;

import game.WorldMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load
{
	public static void mapOfMaps(String Dir)
	{
		WorldMap worldMap = null;
		try
		{
			FileInputStream door = new FileInputStream(Dir);
			ObjectInputStream reader = new ObjectInputStream(door);
			try
			{
				worldMap = ((WorldMap)reader.readObject());
				new game.Screen();
			} 
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			reader.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
