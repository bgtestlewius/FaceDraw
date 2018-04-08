
/**
 * Author:  Bill Gillespie
 * Project: Face Draw
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Random;

//stpe 4 leverage shapeslibrary
class FaceOvalDraw extends Oval{
//	private boolean drawOvalfilledred;
//	private boolean drawOvalfilledblue;
//	public void setDrawOvalFilledRed() { drawOvalfilledred = true;}
//	public void setDrawOvalFilledBlue() { drawOvalfilledblue = true;}
	private int drawSmileType;
	public void setdrawSmileType() { drawSmileType = 0;}
	
	//Override default constructor
	public FaceOvalDraw() {
		super(0,0,0,0);
		//drawSmileType = 2;
//		drawOvalfilledred =false;
//		drawOvalfilledblue =false;
		
	}
	
	public FaceOvalDraw(int positionXIn, int positionYIn, int widthIn, int heightIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		//drawSmileType = 2;
//		drawOvalfilledred = false;
//		drawOvalfilledblue = false;
	}
	
	
	public FaceOvalDraw(int widthIn, int heightIn, int positionXIn, int positionYIn, int smileTypeIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
		setSmileType(smileTypeIn);
//		drawOvalfilledred = false;
//		drawOvalfilledblue = false;
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


	//steop 5 draew itself
		public void paintComponent(Graphics g) {
			g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeight());
	        //g.drawOval(10, 30, 100, 100);   // face outline
//			if (drawOvalfilledred) {
//				g.setColor(Color.red);
//				g.fillOval(getPositionX()+1, getPositionY()+1, getWidth()-2, getHeight()-2);
//			}
	        //g.setColor(Color.BLUE);
	        //g.fillOval(30, 60, 20, 20);     // eyes
	        //g.fillOval(getPositionX()+1, getPositionY()+1, getWidth()-2, getHeight()-2);
	        //g.fillOval(70, 60, 20, 20);
	        //g.setColor(Color.RED);          // mouth
	        //g.drawLine(40, 100, 80, 100);
			System.out.format("OvalDraw.paintComponent(x=%d,y=%d,w=%d,h=d)\n",
					getPositionX(), getPositionY(), getWidth(), getHeight());
		}
		
	}

//step 8 create face w default constructor
class SadFace extends FaceOvalDraw {
	private FaceOvalDraw eyeL;
	private FaceOvalDraw eyeR;

	public SadFace() {
		super(0,0,0,0,0);
//		eyeL = new FaceOvalDraw(0,0,0,0);
//		eyeR = new FaceOvalDraw(0,0,0,0);

		
	}
	
	public SadFace(int positionXIn, int positionYIn, int widthIn, int heightIn){

		super(positionXIn,positionYIn,widthIn,heightIn);
//		int eyeHeight = heightIn / 7;
//		int eyeWidth = eyeHeight * 2;
//		int eyePostionX = positionXIn + (widthIn / 2) - (eyeWidth / 2);
//		int eyePositionY = positionYIn + (heightIn / 3) - (eyeHeight /2) ;



//		eyeL = new FaceOvalDraw(eyePostionX,eyePositionY,eyeWidth,eyeHeight);
//		eyeL.setDrawOvalFilledRed();
//		eyeR = new FaceOvalDraw(eyePostionX,eyePositionY,eyeWidth,eyeHeight);
//		eyeR.setDrawOvalFilledRed();
		
	}
	public SadFace(int positionXIn, int positionYIn, int widthIn, int heightIn, int SmileTypeIn){
//	public SadFace(int positionXIn, int positionYIn, int widthIn, int heightIn){
//
		//super(positionXIn,positionYIn,widthIn,heightIn,SmileTypeIn);
		super(positionXIn,positionYIn,widthIn,heightIn);
////		int eyeHeight = heightIn / 7;
////		int eyeWidth = eyeHeight * 2;
////		int eyePostionX = positionXIn + (widthIn / 2) - (eyeWidth / 2);
////		int eyePositionY = positionYIn + (heightIn / 3) - (eyeHeight /2) ;
//		//setSmileType()=1;
//
//
//
////		eyeL = new FaceOvalDraw(eyePostionX,eyePositionY,eyeWidth,eyeHeight);
////		eyeL.setDrawOvalFilledRed();
////		eyeR = new FaceOvalDraw(eyePostionX,eyePositionY,eyeWidth,eyeHeight);
////		eyeR.setDrawOvalFilledRed();
//
//		
		
		setSmileType(1);
	}
	
	//draw sad face itself
	public void paintComponent(Graphics g){
		super.paintComponent(g);
//		g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeight());
//        g.drawOval(10, 30, 100, 100);   // face outline
//        g.setColor(Color.BLUE);
//        g.fillOval(30, 60, 20, 20);     // eyes
//        g.fillOval(70, 60, 20, 20);
//        g.setColor(Color.RED);          // mouth
//        g.drawLine(40, 100, 80, 100);
		//System.out.format("FaceOvalDraw.paintComponent(x=%d,y=%d,w=%d,h=d)\n",
//		getPositionX(), getPositionY(), getWidth(), getHeight());
//		eyeL.paintComponent(g);
//		eyeL.paintComponent(g);
//		g.setColor(Color.black);
		
        g.setColor(Color.BLUE);
        g.fillOval(30, 60, 20, 20);     // eyes
        g.fillOval(70, 60, 20, 20);
        g.setColor(Color.RED);          // mouth

		if (getSmileType() ==1){
			g.drawArc(getPositionX(),getPositionY()+(getHeight()/2), getWidth(), getHeight()+30, 45,90);
			System.out.println(getSmileType());
		}
		else if (getSmileType() ==2)
			{g.drawArc(getPositionX()+5,getPositionY()+(getHeight()/100), getWidth()-10, getHeight()-30, -45,-90);
			System.out.println(getSmileType());
			}
		else 
		//{g.drawLine(getPositionX(),getPositionY()+(getHeight()/2), 0, 0);
		{g.drawArc(getPositionX()+15,getPositionY()+(getHeight()-30), getWidth()-30, 0, -45,-90);
		System.out.println(getSmileType());
		}


			
			
	}
}		



//stpe 2 implement jpanel and graphics then add panel to frame
class SadPanel extends JPanel{
	//steop 6 create 1 of them
	//create collectiomn of sadpanels
	private SadFace mySadFace;


	
	public SadPanel() {
		//constructor
		Random rand = new Random(); 
		//int mySadFaceIn = rand.nextInt(3); 
		int SmileTypeIn = 1; 
		
		//mySadFace = new SadFace(10, 30, 100, 100,SmileTypeIn);
		mySadFace = new SadFace(10, 30, 100, 100,2);
		//mySadFace = new SadFace(100, 30, 100, 100,2);
		
	}
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		
        //g.drawOval(10, 30, 100, 100);   // face outline
//		if (drawOvalfilledred) {
//			g.setColor(Color.red);
//			g.fillOval(getPositionX()+1, getPositionY()+1, getWidth()-2, getHeight()-2);
//		}
//        g.setColor(Color.BLUE);
//        g.fillOval(30, 60, 20, 20);     // eyes
//        g.fillOval(70, 60, 20, 20);
//        g.setColor(Color.RED);          // mouth
        
        //g.drawLine(40, 100, 80, 100);

//		System.out.format("OvalDraw.paintComponent(x=%d,y=%d,w=%d,h=d)\n",
//				getPositionX(), getPositionY(), getWidth(), getHeight());
		//step 7 clean up
		//g.drawOval(100, 100, 80, 120);
		System.out.println("Facelite panel paint...");
		
		mySadFace.paintComponent(g);
		System.out.println("printed Face lite panel paint...");		
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
			//return FacesFrame();
//			SadPanel myFacesPanel = new SadPanel();
//			myFrame.add(myFacesPanel);
	}

//		private Object FaceFrame() {
//			// TODO Auto-generated method stub
//			return FaceFrame();
//		}
}
	public class FaceDraw {

		public static void main(String[] args) {
			System.out.println("Starting Face Draw...");
			//using jFrame
			//JFrame myFrame = new FaceFrame();
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame myFrame = new JFrame("Face Draw");
			myFrame.setBounds(100, 100, 900, 900);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);
			//step3 add Panel to Frame
			SadPanel mySadPanel = new SadPanel();
			myFrame.add(mySadPanel);	

		}
	}

