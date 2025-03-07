package fi.razerman.youtube.Helpers;

import android.content.Context;

/* loaded from: classes6.dex */
public class XScreenSizeHelpers {
    public static boolean isTablet(Context context) {
        return smallestWidthDp(context) >= 600;
    }

    private static int smallestWidthDp(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }
}
