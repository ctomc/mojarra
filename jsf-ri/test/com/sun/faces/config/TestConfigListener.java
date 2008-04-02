/*
 * $Id: TestConfigListener.java,v 1.5 2004/02/26 20:34:16 eburns Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.config;

import com.sun.faces.ServletFacesTestCase;
import org.apache.cactus.ServletTestCase;

import javax.servlet.ServletContextEvent;

/**
 * <p>Unit tests for Configuration File processing.</p>
 */

public class TestConfigListener extends ServletFacesTestCase {


    // ----------------------------------------------------- Instance Variables


    // ----------------------------------------------------------- Constructors


    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public TestConfigListener(String name) {

        super(name);

    }


    // --------------------------------------------------- Overall Test Methods




    // ------------------------------------------------ Individual Test Methods

    // this method manually invokes the ContextListener contextInitialized method
    // multiple times to ensure the parsing logic only gets executed once
    // (for the same webapp).
    //
    public void testContextInitialized() {
        ConfigListener cl = new ConfigListener();
        ServletContextEvent e = new ServletContextEvent(
            getConfig().getServletContext());
        cl.contextInitialized(e);
        cl.contextInitialized(e);
    }
}
