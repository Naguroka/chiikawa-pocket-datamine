package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MarginLayoutParamsCompat {
    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginStart(marginLayoutParams);
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginEnd(marginLayoutParams);
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginStart(marginLayoutParams, i);
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginEnd(marginLayoutParams, i);
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return androidx.core.view.MarginLayoutParamsCompat.Api17Impl.isMarginRelative(marginLayoutParams);
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getLayoutDirection(marginLayoutParams);
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setLayoutDirection(marginLayoutParams, i);
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        androidx.core.view.MarginLayoutParamsCompat.Api17Impl.resolveLayoutDirection(marginLayoutParams, i);
    }

    private MarginLayoutParamsCompat() {
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }

        static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }
}
