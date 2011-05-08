package app.gwtfb;

import app.client.UI;
import com.google.gwt.core.client.GWT;
import com.google.inject.Singleton;

/**
 *
 */
@Singleton
public class FBHelper {
    public final FBCore fbCore = GWT.create(FBCore.class);
    public final FBEvent fbEvent = GWT.create(FBEvent.class);

    public FBHelper() {
        if (UI.useFBConnect()) {
            fbCore.init(UI.APPID, true, true, true);
        }
    }

}
