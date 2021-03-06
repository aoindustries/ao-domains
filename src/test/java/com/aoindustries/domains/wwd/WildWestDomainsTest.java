package com.aoindustries.domains.wwd;
/*
 * Copyright 2009-2011 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.DomainRegistrarParent;
import com.aoindustries.util.PropertiesUtils;
import java.io.IOException;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author  AO Industries, Inc.
 */
public class WildWestDomainsTest extends DomainRegistrarParent {
    
    private static Properties config;
    synchronized private static String getConfig(String name) throws IOException {
        if(config==null) config = PropertiesUtils.loadFromResource(WildWestDomainsTest.class, "WildWestDomainsTest.properties");
        return config.getProperty(name);
    }

    public WildWestDomainsTest(String testName) {
        super(testName);
    }

    public DomainRegistrar getDomainRegistrar() throws Exception {
        return new WildWestDomains("WildWestDomainsTest", WildWestDomains.PRODUCTION_PORT_ADDRESS, getConfig("account"), getConfig("password"));
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(WildWestDomainsTest.class);
        return suite;
    }
}
