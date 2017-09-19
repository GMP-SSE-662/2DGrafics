package grafics.popup;

import static org.junit.Assert.*;
import javafx.scene.shape.Line;

import org.junit.Test;

public class LinePopupTest {

    @Test
    public void createLineTest() {

    	LinePopup lp = new LinePopup();
    	Line l1 = lp.createLine(30,20,5,10); 
    	assertTrue(l1!=null);
    	assertTrue(l1.getStartX()==30);
    	assertTrue(l1.getStartY()==20);
    	assertTrue(l1.getEndX()==5);
    	assertTrue(l1.getEndY()==10);
    	
    }
    @Test
    public void splitterTest(){
    	LinePopup lp = new LinePopup();
    	int[] ar = {1,2,3,4};
    	assertTrue(lp.splitter("1,2,3,4")[0]==(ar[0]));
    	assertTrue(lp.splitter("1,2,3,4")[1]==(ar[1]));
    	assertTrue(lp.splitter("1,2,3,4")[2]==(ar[2]));
    	assertTrue(lp.splitter("1,2,3,4")[3]==(ar[3]));
    }
    
    @Test
    public void splitterTestInvalidInput(){
    	LinePopup lp = new LinePopup();
    	assertTrue(lp.splitter("1.1,2.3,a,b")[0] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b")[1] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b")[2] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b")[3] == 0);
    }

}
