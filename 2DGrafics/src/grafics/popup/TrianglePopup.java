package grafics.popup;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Line;

public class TrianglePopup implements PopupBase<Line[]>{

	public Line[] pop() {
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Triangle");
		dialog.setHeaderText("Enter the Triangle vertices");
		dialog.setContentText("Use form 'x1,y1,x2,y2,x3,y3' no spaces:");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		int[] lineSpecs = null;
		if (result.isPresent()){
			lineSpecs = splitter(result.get());
			return createTriangle(lineSpecs[0],lineSpecs[1],lineSpecs[2],lineSpecs[3], lineSpecs[4], lineSpecs[5]);
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
		    	return new int[6];
		    }
		}
		
		return intA;
	}
	
	public Line[] createTriangle(int x1, int y1, int x2, int y2,int x3, int y3) {
		Line[] triangle = new Line[3];
		triangle[0] =  new Line(x1,y1,x2,y2);
		triangle[1] =  new Line(x2,y2,x3,y3);
		triangle[2] =  new Line(x3,y3,x1,y1);
		return triangle;
	}

}
