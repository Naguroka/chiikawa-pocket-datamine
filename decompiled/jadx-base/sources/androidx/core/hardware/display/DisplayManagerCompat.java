package androidx.core.hardware.display;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> sInstances = new java.util.WeakHashMap<>();
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context context) {
        this.mContext = context;
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context context) {
        androidx.core.hardware.display.DisplayManagerCompat displayManagerCompat;
        java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> weakHashMap = sInstances;
        synchronized (weakHashMap) {
            displayManagerCompat = weakHashMap.get(context);
            if (displayManagerCompat == null) {
                displayManagerCompat = new androidx.core.hardware.display.DisplayManagerCompat(context);
                weakHashMap.put(context, displayManagerCompat);
            }
        }
        return displayManagerCompat;
    }

    public android.view.Display getDisplay(int i) {
        return androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplay((android.hardware.display.DisplayManager) this.mContext.getSystemService("display"), i);
    }

    public android.view.Display[] getDisplays() {
        return androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays((android.hardware.display.DisplayManager) this.mContext.getSystemService("display"));
    }

    public android.view.Display[] getDisplays(java.lang.String str) {
        return androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays((android.hardware.display.DisplayManager) this.mContext.getSystemService("display"));
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static android.view.Display getDisplay(android.hardware.display.DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        static android.view.Display[] getDisplays(android.hardware.display.DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }
}
