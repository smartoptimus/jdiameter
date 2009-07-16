/*
 * Copyright (c) 2006 jDiameter.
 * https://jdiameter.dev.java.net/
 *
 * License: GPL v3
 *
 * e-mail: erick.svenson@yahoo.com
 *
 */
package org.jdiameter.client.api;

import org.jdiameter.api.Session;
import org.jdiameter.api.NetworkReqListener;

/**
 * This interface describe extends methods of base class
 * Data: $Date: 2009/07/12 18:35:35 $
 * Revision: $Revision: 1.2 $
 * @version 1.5.0.1
 */
public interface ISession extends Session {
    NetworkReqListener getReqListener();    
}
