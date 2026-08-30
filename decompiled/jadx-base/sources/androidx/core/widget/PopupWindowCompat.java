package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
    }

    public static void showAsDropDown(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
        androidx.core.widget.PopupWindowCompat.Api19Impl.showAsDropDown(popupWindow, view, i, i2, i3);
    }

    public static void setOverlapAnchor(android.widget.PopupWindow popupWindow, boolean z) {
        androidx.core.widget.PopupWindowCompat.Api23Impl.setOverlapAnchor(popupWindow, z);
    }

    public static boolean getOverlapAnchor(android.widget.PopupWindow popupWindow) {
        return androidx.core.widget.PopupWindowCompat.Api23Impl.getOverlapAnchor(popupWindow);
    }

    public static void setWindowLayoutType(android.widget.PopupWindow popupWindow, int i) {
        androidx.core.widget.PopupWindowCompat.Api23Impl.setWindowLayoutType(popupWindow, i);
    }

    public static int getWindowLayoutType(android.widget.PopupWindow popupWindow) {
        return androidx.core.widget.PopupWindowCompat.Api23Impl.getWindowLayoutType(popupWindow);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setOverlapAnchor(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static boolean getOverlapAnchor(android.widget.PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static void setWindowLayoutType(android.widget.PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        static int getWindowLayoutType(android.widget.PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void showAsDropDown(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }
}
