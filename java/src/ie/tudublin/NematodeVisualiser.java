package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> Nema = new ArrayList<Nematode>();
    

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();
		printNematodes();		
	}

	void printNematodes(){
        for(Nematode n:Nema)
        {
            System.out.println(n);
        }
    }
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode n = new Nematode(r);
            Nema.add(n);
        }
	}




	public void draw()
	{	
		
	}
}
