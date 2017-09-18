package grafics.popup;

import javafx.scene.shape.Circle;

import com.sun.javafx.geom.Shape;

public interface PopupBase<T> {
	
	public T pop();
	public int[] splitter(String s);	
}
