/*
 * Copyright 2009-2011 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains;

import com.aoindustries.util.i18n.EditableResourceBundle;
import java.io.File;
import java.util.Locale;

/**
 * Provides a simplified interface for obtaining localized values from the ApplicationResources.properties files.
 * Is also an editable resource bundle.
 *
 * @author  AO Industries, Inc.
 */
public final class ApplicationResources_ja extends EditableResourceBundle {

    /**
     * Do not use directly.
     */
    public ApplicationResources_ja() {
        super(
            Locale.JAPANESE,
            ApplicationResources.bundleSet,
            new File(System.getProperty("user.home")+"/maven2/ao/ao-domains/src/com/aoindustries/domains/ApplicationResources_ja.properties")
        );
    }
}