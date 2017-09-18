package grafics.popup;
import static org.junit.Assert.*;
import javafx.scene.shape.Circle;

import org.junit.Test;

public class CiclePopupTest{


    @Test
    public void createCircleTest() {

    	CirclePopup cp = new CirclePopup();
    	Circle c1 = cp.createCircle(30,20,5); 
    	assertTrue(c1!=null);
    	assertTrue(c1.getCenterX()==30);
    	assertTrue(c1.getCenterY()==20);
    	assertTrue(c1.getRadius()==5);
    	
    }
    @Test
    public void splitterTest(){
    	CirclePopup cp = new CirclePopup();
    	int[] ar = {1,2,3};
    	assertTrue(cp.splitter("1,2,3")[0]==(ar[0]));
    	assertTrue(cp.splitter("1,2,3")[1]==(ar[1]));
    	assertTrue(cp.splitter("1,2,3")[2]==(ar[2]));
    }
    
    @Test
    public void splitterTestInvalidInput(){
    	CirclePopup cp = new CirclePopup();
    	assertTrue(cp.splitter("1.1,2.3,a")[0] == 0);
    	assertTrue(cp.splitter("1.1,2.3,a")[1] == 0);
    	assertTrue(cp.splitter("1.1,2.3,a")[2] == 0);
    }
    
    
}
