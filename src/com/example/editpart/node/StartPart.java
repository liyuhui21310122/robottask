/*
 * Created on 2005-1-24
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.example.editpart.node;

import java.beans.PropertyChangeEvent;
import org.eclipse.draw2d.IFigure;
import com.example.editpart.NonContainerPart;
import com.example.model.node.StartModel;





/**
 * @author zhanghao
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StartPart extends NonContainerPart {

  
    public void propertyChange(PropertyChangeEvent evt) {
    	super.propertyChange(evt);
    	/*
        if (evt.getPropertyName().equals(ModelStringConstant.P_COORTYPE))
            refreshVisuals();
        else if (evt.getPropertyName().equals(ModelStringConstant.P_VELOCITY))
            refreshVisuals();
        else if (evt.getPropertyName().equals(ModelStringConstant.P_DISPLACEMENT))
            refreshVisuals();
        */
    }
/*
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return new StartFigure();
		//return new Circle();
	}
	
	 protected void refreshVisuals() {
	        super.refreshVisuals();
	        StartModel Model = (StartModel) getModel();
	        StartFigure figure = (StartFigure) getFigure();
	        //Circle figure =  (Circle) getFigure();
	        figure.setName(Model.getName());
	    }
*/
}