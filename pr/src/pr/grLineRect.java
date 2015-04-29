package pr;

import java.awt.*;
import java.awt.event.*;
public class grLineRect extends Frame {  
	public grLineRect(String str)
      {  
      super(str);  
      }
   	public void paint(Graphics g)
      {
   		g.drawOval(10,30, 150,250);    // oval 
		g.drawArc(200,30, 150,250,  30, 270);  	  // arc
      	g.fillArc(400, 30, 150, 250,  30, 300);  }  // colored arc

	public static void main(String[] args)
      {  	Frame frm =  new grLineRect("선/사각형");  // frame construction    
        	frm.setSize(500, 300);             	           // size of the frame : 500*300(pixel)
		WindowDestroyer listener = new WindowDestroyer();  // window destroy button
      	frm.addWindowListener(listener);
      	frm.setVisible(true);                       		          // indication of frame 
      }   }
