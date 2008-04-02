/*
 * $Id: Output_DateTimeTag.java,v 1.10 2003/07/16 00:00:11 jvisvanathan Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.taglib.html_basic;

import org.mozilla.util.Assert;
import org.mozilla.util.ParameterCheck;

import javax.servlet.jsp.JspException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.FacesException;

import com.sun.faces.util.Util;

/**
 *
 * @version $Id: Output_DateTimeTag.java,v 1.10 2003/07/16 00:00:11 jvisvanathan Exp $
 * 
 * @see	Blah
 * @see	Bloo
 *
 */

public class Output_DateTimeTag extends com.sun.faces.taglib.FacesTag
{
    //
    // Protected Constants
    //

    //
    // Class Variables
    //

    //
    // Instance Variables
    //

    // Attribute Instance Variables

    // Relationship Instance Variables

    //
    // Constructors and Initializers    
    //

    public Output_DateTimeTag()
    {
        super();
    }

    //
    // Class methods
    //

    // 
    // Accessors
    //


    //
    // General Methods
    //
    public String getLocalRendererType() { 
        return "DateTime"; 
    }
    public String getComponentType() { 
        return "Output"; 
    }

    protected void overrideProperties(UIComponent component) {
	super.overrideProperties(component);
        UIOutput uiOutput = (UIOutput)component;
	if (null != value) {
	    uiOutput.setValue(value);
	}
    }

    //
    // Methods from TagSupport
    //
} // end of class Output_DateTimeTag
