
/**
 * Author:  Bill Gillespie
 * Project: Face Draw
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

import sun.awt.RepaintArea;

import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Random;

class FaceOvalDraw extends Oval{
	private int drawSmileType;
	public void setdrawSmileType() { drawSmileType = 0;}
	
	//Override default constructor
	public FaceOvalDraw() {
		super(0,0,0,0);		
	}
	
//	public FaceOvalDraw(int positionXIn, int positionYIn, int widthIn, int heightIn){
//		super(positionXIn,positionYIn,widthIn,heightIn);
//	}
	
	
	public FaceOvalDraw(int widthIn, int heightIn, int positionXIn, int positionYIn, int smileTypeIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
		setSmileType(smileTypeIn);
	}
		
	public FaceOvalDraw(int widthIn, int heightIn, int positionXIn, int positionYIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
	}
		
	//get and set Width
	private int width;
	public final void setsWidth(int widthIn) {width = widthIn;}
	public final int getsWidth() { return width; }
	
	//get and set Height
	private int height;
	public final void setsHeight(int heightIn) {height = heightIn;}
	public final int getsHeight() {return height;}
	

	//get and set positionX
	private int positionX;
	public final void setpositionX(int positionXIn) {positionX = positionXIn;}
	public final int getpositionX() {return positionX;}

	//get and set positionY
	private int positionY;
	public final void setpositionY(int positionYIn) {positionY = positionYIn;}
	public final int getpositionY() {return positionY;}
		
	private int SmileType;
	public final void setSmileType(int smileTypeIn) {SmileType= smileTypeIn;}
	public final int getSmileType() {return SmileType;}
	
	
	public String toString() {
		return String.format("positionX=%03d,positionY=%03d, width%03d, height%03d,smileType%03d", positionX,positionY,width,height,SmileType);
	}

		public void paintComponent(Graphics g) {
			g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeight());

			
			int eyeLHeight = getHeight() / 5;
			int eyeLWidth = eyeLHeight /2;
			int eyeLPostionX = getPositionX() + (getWidth() / 4) - (eyeLWidth / 4);
			int eyeLPositionY = getPositionY() + (getHeight() / 3) - (eyeLHeight /2) ;
			
			
			int eyeRHeight = getHeight() /5;
			int eyeRWidth = eyeLHeight /2;
			int eyeRPostionX = getPositionX() + (getWidth() - 40) - (eyeRWidth /4);
			int eyeRPositionY = getPositionY() + (getHeight()/ 3) - (eyeRHeight /2) ;

			g.drawOval(eyeRPostionX, eyeRPositionY, eyeRWidth, eyeRHeight);
			g.drawOval(eyeLPostionX, eyeLPositionY, eyeLWidth, eyeLHeight);
			
			
		
			
		}
		
	}

//step 8 create face w default constructor
class Face extends FaceOvalDraw {
	private FaceOvalDraw eyeL;
	private FaceOvalDraw eyeR;
	public final void setFace(int positionXIn, int positionYIn, int widthIn, int heightIn, int SmileTypeIn) {
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
		setSmileType(SmileTypeIn);
		}

	


	public Face() {
		this(0,0,0,0,0);
	
	}
	
	
	public Face(int positionXIn, int positionYIn, int widthIn, int heightIn){

		super(positionXIn,positionYIn,widthIn,heightIn);
		
	}
	

		Face(int positionXIn, int positionYIn, int widthIn, int heightIn, int SmileTypeIn){
			super(widthIn,heightIn,positionXIn,positionYIn,SmileTypeIn);
			setWidth(widthIn);
			setHeight(heightIn);
			setpositionX(positionXIn);
			setpositionY(positionYIn);
			setSmileType(SmileTypeIn);
			
			this.setFace(getPositionX(), getPositionY(), getWidth(), getHeight(),SmileTypeIn);
			
		
		
		//setSmileType(3);
		Random rand = new Random(); 
		int SmilesTypeIn = rand.nextInt(3); 
		setSmileType(SmilesTypeIn);	
		int eyeLHeight = heightIn / 5;
		int eyeLWidth = eyeLHeight /2;
		int eyeLPostionX = positionXIn + (widthIn / 4) - (eyeLWidth / 4);
		int eyeLPositionY = positionYIn + (heightIn / 3) - (eyeLHeight /2) ;
		
		
		int eyeRHeight = heightIn /5;
		int eyeRWidth = eyeLHeight /2;
		int eyeRPostionX = positionXIn + (widthIn - 40) - (eyeRWidth /4);
		int eyeRPositionY = positionYIn + (heightIn / 3) - (eyeRHeight /2) ;

		eyeL = new FaceOvalDraw(eyeLPostionX,eyeLPositionY,eyeLWidth,eyeLHeight);
		eyeR = new FaceOvalDraw(eyeRPostionX,eyeRPositionY,eyeRWidth,eyeRHeight);
		
	}
		
	




	//draw sad face itself
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		if (getSmileType() ==1){
			g.drawArc(getPositionX(),getPositionY()+(getHeight()/2), getWidth(), getHeight()+30, 45,90);

		}
		else if (getSmileType() ==2)
			{g.drawArc(getPositionX()+5,getPositionY()+(getHeight()/100), getWidth()-10, getHeight()-30, -45,-90);
			System.out.println(getSmileType());


			}
		else if (getSmileType() ==3)

			{g.drawArc(getPositionX()+15,getPositionY()+(getHeight()-30), getWidth()-30, 0, -45,-90);
		System.out.println(getSmileType());


			}
		else
			g.drawArc(getPositionX()+15,getPositionY()+(getHeight()-30), getWidth()-30, 0, -45,-90);
				
	}
}		



//stpe 2 implement jpanel and graphics then add panel to frame
class FacePanel extends JPanel{

	private Face myFace;
	private Face myFace1;
	private Face myFace2;
	private Face myFace3;
	private Face myFace4;
	private Face myFace5;


	
	public FacePanel() {
		//constructor
		Random rand = new Random(); 
		int SmileTypeIn = rand.nextInt(3); 
		myFace = new Face(10, 30, 100, 200,SmileTypeIn);
		myFace1 = new Face(500, 100, 100, 100,SmileTypeIn);
		myFace2 = new Face(300, 30, 200, 100,SmileTypeIn);
		myFace3 = new Face(400, 400, 300, 200,SmileTypeIn);
		myFace4= new Face(10, 400, 100, 300,SmileTypeIn);
		
	}
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		
		myFace.paintComponent(g);
		myFace1.paintComponent(g);
		myFace2.paintComponent(g);
		myFace3.paintComponent(g);
		myFace4.paintComponent(g);
		//System.out.println("printed Face lite panel paint...");		
	}
}





	class FaceFrame extends JFrame{
		FaceFrame(){
			//step 1 create jframe
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame myFrame = new JFrame("Face Draw");
			myFrame.setBounds(100, 100, 900, 900);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);	
			FacePanel myFacesPanel = new FacePanel();
			myFrame.add(myFacesPanel);


	}


}
	public class FaceDraw {

		public static void main(String[] args) {
			//System.out.println("Starting Face Draw...");
			//using jFrame
			JFrame myFrame = new FaceFrame();
		
			System.out.println("Starting Face Draw...");

		
			ArrayList<FaceFrame> FaceList = new ArrayList<FaceFrame>();
			for (int loopCount=1; loopCount<4; loopCount++){
				//FacesPanel myFacesPanel = new FacesPanel();
				myFrame.add(new FacePanel());
			}	
			
			

		}
	}

