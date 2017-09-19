package grafics.popup;
import java.util.Optional;

import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Line;
public class LinePopup implements PopupBase<Line>{

	public Line pop() {
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Line");
		dialog.setHeaderText("Enter the Line start and end point");
		dialog.setContentText("Use form 'x1,y1,x2,y2' no spaces:");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		int[] lineSpecs = null;
		if (result.isPresent()){
			lineSpecs = splitter(result.get());
			return createLine(lineSpecs[0],lineSpecs[1],lineSpecs[2],lineSpecs[3]);
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

	public Line createLine(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return new Line(x1,y1,x2,y2);
	}

}
