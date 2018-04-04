
/**
 * Author:  Bill Gillespie
 * Project: Face Draw
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;


abstract class FaceDesign{
	public FaceDesign() {
		this(0,0,0,0,0);
	}
	
	//width, height, x, y, and smiling status
	

	
	public FaceDesign(int widthIn, int heightIn, int positionXIn, int positionYIn,int smilingStatus){
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
		setSmilingStatus(smilingStatus);
		
		
		
	}
	//get and set positionX
	private int positionX;
	public final void setpositionX(int positionXIn) {positionX = positionXIn;}
	public final int getpositionX() {return positionX;}

	//get and set positionY
	private int positionY;
	public final void setpositionY(int positionYIn) {positionY = positionYIn;}
	public final int getpositionY() {return positionY;}
		
	//get and set Width
	private int width;
	public final void setWidth(int widthIn) {width = widthIn;}
	public final int getWidth() { return width; }
	
	//get and set Height
	private int height;
	public final void setHeight(int heightIn) {height = heightIn;}
	public final int getHeight() {return height;}
	
	//get and set smilingStatus
	private int smilingStatus;
	public final void setSmilingStatus(int smilingStatusIn) {smilingStatus = smilingStatusIn;}
	public final int getSmilingStatus() {return smilingStatus;}

	
	

	abstract public double CalcFaceDesignLayout();
}

	class Face extends FaceDesign{
		public Face() {
			this(0,0,0,0,0);
		}
		public Face(int widthIn, int heightIn, int positionXIn, int positionYIn,int smilingStatus){
			super(widthIn,heightIn,positionXIn,positionYIn,smilingStatus);
			
		}
		public double CalcFaceDesignLayout() {
			return getWidth() * getHeight();
			
		}
	}


public class FaceDraw {

	public static void main(String[] args) {


	}

}
