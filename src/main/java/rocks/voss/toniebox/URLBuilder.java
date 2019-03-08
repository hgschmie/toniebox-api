package rocks.voss.toniebox;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import rocks.voss.toniebox.beans.toniebox.CreativeTonie;
import rocks.voss.toniebox.beans.toniebox.Household;

class URLBuilder {
    private static Logger log = Logger.getLogger(URLBuilder.class.getName());

    protected static String getUrl(final String URLConstant, Household household) {
        return getUrl(URLConstant, household, null);
    }

    protected static String getUrl(final String URLConstant, CreativeTonie creativeTonie) {
        return getUrl(URLConstant, null, creativeTonie);
    }

    protected static String getUrl(final String URLConstant, Household household, CreativeTonie creativeTonie) {
        String returnUrl = URLConstant;
        if (household != null) {
            returnUrl = StringUtils.replace(returnUrl, "%h", household.getId());
        }
        if (creativeTonie != null) {
            returnUrl = StringUtils.replace(returnUrl, "%t", creativeTonie.getId());
        }
        return returnUrl;
    }
}
