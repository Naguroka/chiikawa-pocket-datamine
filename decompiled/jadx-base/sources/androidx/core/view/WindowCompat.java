package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private WindowCompat() {
    }

    public static <T extends android.view.View> T requireViewById(android.view.Window window, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) androidx.core.view.WindowCompat.Api28Impl.requireViewById(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.WindowCompat.Api30Impl.setDecorFitsSystemWindows(window, z);
        } else {
            androidx.core.view.WindowCompat.Api16Impl.setDecorFitsSystemWindows(window, z);
        }
    }

    public static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window window, android.view.View view) {
        return new androidx.core.view.WindowInsetsControllerCompat(window, view);
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(android.view.Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }
}
