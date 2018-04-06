
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
	private boolean drawOvalfilledred;
	private boolean drawOvalfilledblue;
	public void setDrawOvalFilledRed() { drawOvalfilledred = true;}
	public void setDrawOvalFilledBlue() { drawOvalfilledblue = true;}
	
	//Override default constructor
	public FaceOvalDraw() {
		super(0,0,0,0);
		drawOvalfilledred =false;
		drawOvalfilledblue =false;
		
	}
	
	public FaceOvalDraw(int positionXIn, int positionYIn, int widthIn, int heightIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		drawOvalfilledred = false;
		drawOvalfilledblue = false;
	}
	
	
	public FaceOvalDraw(int widthIn, int heightIn, int positionXIn, int positionYIn, int smileTypeIn){
		super(positionXIn,positionYIn,widthIn,heightIn);
		setWidth(widthIn);
		setHeight(heightIn);
		setpositionX(positionXIn);
		setpositionY(positionYIn);
		setSmileType(smileTypeIn);
		drawOvalfilledred = false;
		drawOvalfilledblue = false;
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
		
	private int smileType;
	public final void setSmileType(int smileTypeIn) {smileType= smileTypeIn;}
	public final int getSmileType() {return positionX;}

	
	//step 5 draw itself
		public void paintComponent(Graphics g) {
			g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeight());
			if (drawOvalfilledred) {
				g.setColor(Color.red);
				g.fillOval(getPositionX()+1, getPositionY()+1, getWidth()-2, getHeight()-2);
				g.setColor(Color.black);
			}
			if (drawOvalfilledblue) {
				g.setColor(Color.blue);
				g.fillOval(getPositionX()+1, getPositionY()+1, getWidth()-2, getHeight()-2);
				g.setColor(Color.black);
			}
			System.out.format("OvalDraw.paintComponent(x=%d,y=%d,w=%d,h=d)\n",
					getPositionX(), getPositionY(), getWidth(), getHeight());
		}
		
	}

	
class FaceDesign extends FaceOvalDraw{
	
	private FaceOvalDraw eyeL;
	private FaceOvalDraw eyeR;


	public FaceDesign() {
		super(0,0,0,0);
		eyeL = new FaceOvalDraw(0,0,0,0);
		eyeL = new FaceOvalDraw(0,0,0,0);
		eyeR = new FaceOvalDraw(0,0,0,0);

	}
	
	public FaceDesign(int positionXIn, int positionYIn, int widthIn, int heightIn,int smileType ){

		super(positionXIn,positionYIn,widthIn,heightIn);
		int eyeRHeight = heightIn / 5;
		int eyeRWidth = widthIn / 4 ;
		int eyeLHeight = heightIn / 5 ;
		int eyeLWidth = widthIn / 4 ;
		int eyeLPostionX = positionXIn +10;
		int eyeLPositionY = positionYIn + 20;
		int eyeRPostionX = positionXIn  + 60 ;
		int eyeRPositionY =  positionYIn + 20;
		int aFacePostionX = positionXIn;
		int aFacePostionY = positionYIn;
		int asmileType = positionYIn;
				

		eyeL = new FaceOvalDraw(eyeLPostionX,eyeLPositionY,eyeLWidth,eyeLHeight);
		eyeR = new FaceOvalDraw(eyeRPostionX,eyeRPositionY,eyeRWidth,eyeRHeight);
		eyeL.setDrawOvalFilledRed();
		eyeR.setDrawOvalFilledBlue();
		System.out.println("printing faces...");
	}
	
	
	public FaceDesign(int positionXIn, int positionYIn, int widthIn, int heightIn){

		super(positionXIn,positionYIn,widthIn,heightIn);
		int eyeRHeight = heightIn / 5;
		int eyeRWidth = widthIn / 4 ;
		int eyeLHeight = heightIn / 5 ;
		int eyeLWidth = widthIn / 4 ;
		int eyeLPostionX = positionXIn +10;
		int eyeLPositionY = positionYIn + 20;
		int eyeRPostionX = positionXIn  + 60 ;
		int eyeRPositionY =  positionYIn + 20;
		int aFacePostionX = positionXIn;
		int aFacePostionY = positionYIn;
		int asmileType = positionYIn;
				

		eyeL = new FaceOvalDraw(eyeLPostionX,eyeLPositionY,eyeLWidth,eyeLHeight);
		eyeR = new FaceOvalDraw(eyeRPostionX,eyeRPositionY,eyeRWidth,eyeRHeight);
		eyeL.setDrawOvalFilledRed();
		eyeR.setDrawOvalFilledBlue();
		System.out.println("printing faces...");
	}
	//draw sad face itself
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		eyeL.paintComponent(g);
		eyeR.paintComponent(g);
		//aFace.paintComponent(g);
		g.setColor(Color.black);
		g.drawArc(getPositionX(),getPositionY()+(getHeight()/2), getWidth()-10, getHeight()-10, 45,90);
	}
}


	
	//stpe 2 implement jpanel and graphics then add panel to frame
class FacePanel extends JPanel{

	//steop 6 create 1 of them
	//create collectiomn of sadpanels
	private FaceDesign myFaceDesign;



	public FacePanel() {
		System.out.println("entered Face panel...");
		//constructor


		int max = 400;
		int min = 100;
		// create instance of Random class

		Random randomNum = new Random();
		int one,two,three,four;
		one = min + randomNum.nextInt(max);
		two = min + randomNum.nextInt(max);
		three = min + randomNum.nextInt(max);
		four = min + randomNum.nextInt(max);
		System.out.println("num" + one + " and " + two + " and " + three +  " and " + four );
		

		myFaceDesign = new FaceDesign(one,two,three,four);

	}

		public void paintComponent(Graphics g) {	
			super.paintComponent(g);
			//step 7 clean up
			//g.setColor(Color.black);
			//g.drawOval(900, 900, 900, 920);
			int max = 400;
			int min = 100;
			// create instance of Random class

//			Random randomNum = new Random();
//			int one,two,three,four,five;
//			one = min + randomNum.nextInt(max);
//			two = min + randomNum.nextInt(max);
//			three = min + randomNum.nextInt(max);
//			four = min + randomNum.nextInt(max);
//			five = min + randomNum.nextInt(max);
//			myFaceDesign = new FaceDesign(one,two,three,four,five);
			

			System.out.println("Face panel paint in...");	
			//step 6.1
			myFaceDesign.paintComponent(g);
			

		
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
			FacePanel myFacesPanel = new FacePanel();
			myFrame.add(myFacesPanel);
	}

		private Object FaceFrame() {
			// TODO Auto-generated method stub
			return FaceFrame();
		}
}
	public class FaceDraw {

		public static void main(String[] args) {
			System.out.println("Starting Face Draw...");
			//using jFrame
			JFrame myFrame = new FaceFrame();
			

			//FacesPanel myFacesPanel = new FacesPanel();
			ArrayList<FaceFrame> FaceList = new ArrayList<FaceFrame>();
			for (int loopCount=1; loopCount<4; loopCount++){
				//FacesPanel myFacesPanel = new FacesPanel();
				myFrame.add(new FacePanel());
			}
			
			//for (int loopCount=1; loopCount<4; loopCount++){
			//FaceList.add(new FacesPanel());
			//shapeList.add(new Rectangle(10-loopCount,4.22));
			//System.out.println("Starting Face panel..." + loopCount);
			//FacesPanel myFacesPanel = new FacesPanel();
			//myFrame.add(myFacesPanel);
		//}
			
//			for (int loopCount=1; loopCount<4; loopCount++){
//				FaceList.add(new FacesPanel());
//				//shapeList.add(new Rectangle(10-loopCount,4.22));
//				System.out.println("Starting Face panel..." + loopCount);
//				//FacesPanel myFacesPanel = new FacesPanel();
//				//myFrame.add(myFacesPanel);
//			}
			
			//Poly inplmemented via virtual tables
			//for(FacesPanel  s: FaceList){
				//System.out.println(s);
				//FacesPanel myFacesPanel = new FacesPanel();
				//s.add(FacesPanel());
				//System.out.println("Printes");
			//}
//				//s.add
//				//System.out.format("Area = %.1f\n", s.CalcFaceDesignLayout());
//				
//				
//			}

			
		}
	}

