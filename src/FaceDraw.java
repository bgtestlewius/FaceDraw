
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

//stpe 4 leverage shapeslibrary
class FaceOvalDraw extends Oval{
	private boolean drawOvalfilledred;
	private boolean drawOvalfilledblue;
	public void setDrawOvalFilledRed() { drawOvalfilledred = true;}
	public void setDrawOvalFilledBlue() { drawOvalfilledblue = true;}
	
	//Override default constructor
	public FaceOvalDraw () {
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
	//steop 5 draew itself
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
		eyeR = new FaceOvalDraw(0,0,0,0);

	}
	
	public FaceDesign(int positionXIn, int positionYIn, int widthIn, int heightIn){

		super(positionXIn,positionYIn,widthIn,heightIn);
		int eyeHeight = heightIn / 7;
		int eyeWidth = eyeHeight * 2;
		int eyeLPostionX = positionXIn + (widthIn / 2) - (eyeWidth / 2);
		int eyeLPositionY = positionYIn + (heightIn / 3) - (eyeHeight /2) ;
		int eyePostionX = positionXIn;
		int eyeRPositionY = positionYIn;




		eyeL = new FaceOvalDraw(eyePostionX,eyeLPositionY,eyeWidth,eyeHeight);
		eyeR = new FaceOvalDraw(eyePostionX,eyeRPositionY,eyeWidth,eyeHeight);
		eyeL.setDrawOvalFilledRed();
		eyeR.setDrawOvalFilledBlue();
	}
	
	//draw sad face itself
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		eyeL.paintComponent(g);
		eyeR.paintComponent(g);
		g.setColor(Color.black);
		g.drawArc(getPositionX(),getPositionY()+(getHeight()/2), getWidth()-10, getHeight()-10, 45,90);
	}
}


	
	//stpe 2 implement jpanel and graphics then add panel to frame
class FacesPanel extends JPanel{

	//steop 6 create 1 of them
	//create collectiomn of sadpanels
	private FaceDesign myFaceDesign;



	public FacesPanel() {
		System.out.println("entered Face panel...");
		//constructor
		//private FaceDesign myFaceDesign;
		myFaceDesign = new FaceDesign(100,100,80,160);
		System.out.println("set design Face panel paint...");
	}

		public void paintComponent(Graphics g) {	
			super.paintComponent(g);
			//step 7 clean up
			//g.setColor(Color.black);
			//g.drawOval(900, 900, 900, 920);
		
			System.out.println("Face panel paint in...");	
			//step 6.1
			myFaceDesign.paintComponent(g);

		
	}
}



	class FacesFrame extends JFrame{
		FacesFrame(){
			//step 1 create jframe
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame myFrame = new JFrame("Face Draw");
			myFrame.setBounds(100, 100, 900, 900);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);	
			//return FacesFrame();
			FacesPanel myFacesPanel = new FacesPanel();
			myFrame.add(myFacesPanel);
	}

		private Object FacesFrame() {
			// TODO Auto-generated method stub
			return FacesFrame();
		}
}
	public class FaceDraw {

		public static void main(String[] args) {
			System.out.println("Starting Face Draw...");
			//using jFrame
			JFrame myFrame = new FacesFrame();
			ArrayList<FacesPanel> FaceList = new ArrayList<FacesPanel>();
			
			for (int loopCount=1; loopCount<4; loopCount++){
				FaceList.add(new FacesPanel());
				//shapeList.add(new Rectangle(10-loopCount,4.22));
			System.out.println("Starting Face panel...");
				//FacesPanel myFacesPanel = new FacesPanel();
				//myFrame.add(myFacesPanel);
			}
			
			//Poly inplmemented via virtual tables
//			for(FacesPanel s: FaceList){
//				System.out.println(s);
//				FacesPanel myFacesPanel = new FacesPanel();
//				myFrame.add(myFacesPanel);
//				//s.add
//				//System.out.format("Area = %.1f\n", s.CalcFaceDesignLayout());
//				
//				
//			}

			
		}
	}

