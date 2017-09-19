package grafics.popup;
import java.util.Optional;

import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Rectangle;
public class RectanglePopup implements PopupBase<Rectangle>{

	public Rectangle pop() {
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Rectangle");
		dialog.setHeaderText("Enter the Rectangle corner location and width and length");
		dialog.setContentText("Use form 'xLoc,yLoc,width,length' no spaces:");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		int[] rectSpecs = null;
		if (result.isPresent()){
			rectSpecs = splitter(result.get());
			return createRect(rectSpecs[0],rectSpecs[1],rectSpecs[2],rectSpecs[3]);
		}
		
		return null;
	}

	public int[] splitter(String s) {
		String[] strA = s.split(",");
		int[] intA = new int[strA.length];
		for(int i = 0;i < strA.length;i++)        
		{
		    try 
		    {
		    	intA[i] = Integer.parseInt(strA[i]);
		    }
		    catch (NumberFormatException nfe)   
		    {
		    	return new int[4];
		    }
		}
		
		return intA;
	}
	
	public Rectangle createRect(int x, int y, int w,int l){
		
		return new Rectangle(x,y,w,l);
		
	}

}
