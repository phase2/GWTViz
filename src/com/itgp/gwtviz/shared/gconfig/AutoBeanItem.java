/* 
 * The MIT License
 *
 * Copyright 2015 InsiTech LLC.   gwtvis@insitechinc.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.itgp.gwtviz.shared.gconfig;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;

public interface AutoBeanItem  {
	
	public AutoBeanItemFactory itemFactory = GWT.create(AutoBeanItemFactory.class);

	public interface AutoBeanItemFactory extends AutoBeanFactory {
		AutoBean<AutoBeanItem> make();
	}
	
	interface Data{
	}
	
	void setData(List<AutoBeanItem> data);
	void setValue(String value);
	void setId(long Id);
	void setLabel(String label);
	void setSortOrder(String sortOrder);
	void setSortDirection(String sortDirection);
	void setSelected(boolean selected);
	
	List<AutoBeanItem> getData();
	String getValue();
	long getId();
	String getLabel();
	String getSortOrder();
	String getSortDirection();
	boolean isSelected();
		
}
