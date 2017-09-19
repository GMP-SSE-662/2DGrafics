package grafics.popup;

import static org.junit.Assert.*;
import javafx.scene.shape.Rectangle;

import org.junit.Test;

public class RectanglePopupTest {

    @Test
    public void createRectangleTest() {

    	RectanglePopup rp = new RectanglePopup();
    	Rectangle r1 = rp.createRect(30,20,5,10); 
    	assertTrue(r1!=null);
    	assertTrue(r1.getX()==30);
    	assertTrue(r1.getY()==20);
    	assertTrue(r1.getWidth()==5);
    	assertTrue(r1.getHeight()==10);
    	
    }
    @Test
    public void splitterTest(){
    	RectanglePopup rp = new RectanglePopup();
    	int[] ar = {1,2,3,4};
    	assertTrue(rp.splitter("1,2,3,4")[0]==(ar[0]));
    	assertTrue(rp.splitter("1,2,3,4")[1]==(ar[1]));
    	assertTrue(rp.splitter("1,2,3,4")[2]==(ar[2]));
    	assertTrue(rp.splitter("1,2,3,4")[3]==(ar[3]));
    }
    
    @Test
    public void splitterTestInvalidInput(){
    	RectanglePopup rp = new RectanglePopup();
    	assertTrue(rp.splitter("1.1,2.3,a,b")[0] == 0);
    	assertTrue(rp.splitter("1.1,2.3,a,b")[1] == 0);
    	assertTrue(rp.splitter("1.1,2.3,a,b")[2] == 0);
    	assertTrue(rp.splitter("1.1,2.3,a,b")[3] == 0);
    }

}
