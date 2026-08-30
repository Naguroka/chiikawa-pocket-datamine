package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;

    static {
        SDK_LEVEL_SUPPORTS_AUTOSIZE = android.os.Build.VERSION.SDK_INT >= 27;
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            sComputeFitSystemWindowsMethod = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            sComputeFitSystemWindowsMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d(TAG, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    private ViewUtils() {
    }

    public static boolean isLayoutRtl(android.view.View view) {
        return androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
    }

    public static void computeFitSystemWindows(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
        java.lang.reflect.Method method = sComputeFitSystemWindowsMethod;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (java.lang.Exception e) {
                android.util.Log.d(TAG, "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static void makeOptionalFitsSystemWindows(android.view.View view) {
        try {
            java.lang.reflect.Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d(TAG, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
    }
}
