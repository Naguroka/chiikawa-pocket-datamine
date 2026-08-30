package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                sGetScaledScrollFactorMethod = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new java.lang.Class[0]);
            } catch (java.lang.Exception unused) {
                android.util.Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledHorizontalScrollFactor(viewConfiguration);
        }
        return getLegacyScrollFactor(viewConfiguration, context);
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledVerticalScrollFactor(viewConfiguration);
        }
        return getLegacyScrollFactor(viewConfiguration, context);
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (method = sGetScaledScrollFactorMethod) != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewConfiguration, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception unused) {
                android.util.Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration viewConfiguration) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.ViewConfigurationCompat.Api28Impl.getScaledHoverSlop(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.ViewConfigurationCompat.Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(viewConfiguration);
        }
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    private ViewConfigurationCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float getScaledVerticalScrollFactor(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getScaledHoverSlop(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }
}
