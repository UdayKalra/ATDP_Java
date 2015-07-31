 

import java.awt.geom.Point2D;
/**
 * Contains a states detail for the program to use.
 * @version 1.0
 * @author Uday
 *
 */
public class State {
private String name;
private Point2D.Double point;
private String desc;
	public State(String nam){
		name = nam;
		
	}
	//Getter-Setters
	
/**
 * Returns the state's name.
 * @return Name of the state.
 */
public String getName() {
	return name;
}
/**
 * Sets the state's name.
 * @param name Name of state.
 */
public void setName(String name) {
	this.name = name;
}
/**
 * Returns the location of the state.
 * @return The coordinate of the state's capital.
 */
public Point2D.Double getPoint() {
	return point;
}
/**
 * Sets the location of the state.
 * @param point The coordinate of the state's capital.
 */
public void setPoint(Point2D.Double point) {
	this.point = point;
}
/**
 * Returns description of the state.
 * @return Description of the state.
 */
public String getDesc() {
	return desc;
}
/**
 * Sets the description of the state.
 * @param desc The description of the state.
 */
public void setDesc(String desc) {
	this.desc = desc;
}


	
	
}
