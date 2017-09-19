package grafics.popup;

import static org.junit.Assert.*;
import javafx.scene.shape.Line;

import org.junit.Test;

public class TrianglePopupTest {

    @Test
    public void createTriangleTest() {

    	TrianglePopup lp = new TrianglePopup();
    	Line l1 = lp.createTriangle(30,20,5,10,35,15)[0]; 
    	Line l2 = lp.createTriangle(30,20,5,10,35,15)[1]; 
    	Line l3 = lp.createTriangle(30,20,5,10,35,15)[2]; 
    	assertTrue(l1!=null);
    	assertTrue(l1.getStartX()==30);
    	assertTrue(l1.getStartY()==20);
    	assertTrue(l1.getEndX()==5);
    	assertTrue(l1.getEndY()==10);
    	assertTrue(l2.getStartX()==5);
    	assertTrue(l2.getStartY()==10);
    	assertTrue(l2.getEndX()==35);
    	assertTrue(l2.getEndY()==15);
    	assertTrue(l3.getStartX()==35);
    	assertTrue(l3.getStartY()==15);
    	assertTrue(l3.getEndX()==30);
    	assertTrue(l3.getEndY()==20);
    	
    }
    @Test
    public void splitterTest(){
    	TrianglePopup lp = new TrianglePopup();
    	int[] ar = {1,2,3,4,5,6};
    	assertTrue(lp.splitter("1,2,3,4,5,6")[0]==(ar[0]));
    	assertTrue(lp.splitter("1,2,3,4,5,6")[1]==(ar[1]));
    	assertTrue(lp.splitter("1,2,3,4,5,6")[2]==(ar[2]));
    	assertTrue(lp.splitter("1,2,3,4,5,6")[3]==(ar[3]));

    }
    
    @Test
    public void splitterTestInvalidInput(){
    	TrianglePopup lp = new TrianglePopup();
    	assertTrue(lp.splitter("1.1,2.3,a,b,c,d")[0] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b,c,d")[1] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b,c,d")[2] == 0);
    	assertTrue(lp.splitter("1.1,2.3,a,b,c,d")[3] == 0);

    }

}
