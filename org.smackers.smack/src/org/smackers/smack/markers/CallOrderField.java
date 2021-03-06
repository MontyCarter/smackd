package org.smackers.smack.markers;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.markers.MarkerField;
import org.eclipse.ui.views.markers.MarkerItem;

public class CallOrderField extends MarkerField {

	public CallOrderField() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String getValue(MarkerItem item) {
		return item.getAttributeValue("callOrder", "0");		
	}
	
	@Override
	public String getColumnHeaderText() {
		return "Call Seq";
	}
	
	@Override
	public int getDefaultColumnWidth(Control control) {
		return 20;
	}
	

}
