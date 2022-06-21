/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.constants;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: RequestMappingConstants.java, v 0.1 2022‐06‐21 10.59 Rionaldy "Roy" Triantoro Exp $$
 */
public class RequestMappingConstants {

    private static final String     API_VERSION             = "v1";

    private static final String     API_PREFIX              = "api/" + API_VERSION + "/";

    public static final String      PRODUCT_CONTROLLER      = API_PREFIX + "products";

    public static final String      FEED_CONTROLLER         = API_PREFIX + "feed";

    public static final String      USER_CONTROLLER         = API_PREFIX + "user";
}
