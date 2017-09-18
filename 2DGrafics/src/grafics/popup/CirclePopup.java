package grafics.popup;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CirclePopup implements PopupBase<Circle>{

	public Circle pop() {
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Circle");
		dialog.setHeaderText("Enter the circle center location and radius");
		dialog.setContentText("Use form 'xLoc,yLoc,radius' no spaces:");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		int[] cirSpecs = null;
		if (result.isPresent()){
			cirSpecs = splitter(result.get());
			return createCircle(cirSpecs[0],cirSpecs[1],cirSpecs[2]);
		}
		
		return null;
	}
	
	public int[] splitter(String s){
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
		    	return new int[3];
		    }
		}
		
		return intA;
		
	}
	
	public Circle createCircle(int x, int y, int r){
		
		return new Circle(x,y,r);
		
	}
	
}
