package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat() {
    }

    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static int getLayoutMode(android.view.ViewGroup viewGroup) {
        return androidx.core.view.ViewGroupCompat.Api18Impl.getLayoutMode(viewGroup);
    }

    public static void setLayoutMode(android.view.ViewGroup viewGroup, int i) {
        androidx.core.view.ViewGroupCompat.Api18Impl.setLayoutMode(viewGroup, i);
    }

    public static void setTransitionGroup(android.view.ViewGroup viewGroup, boolean z) {
        androidx.core.view.ViewGroupCompat.Api21Impl.setTransitionGroup(viewGroup, z);
    }

    public static boolean isTransitionGroup(android.view.ViewGroup viewGroup) {
        return androidx.core.view.ViewGroupCompat.Api21Impl.isTransitionGroup(viewGroup);
    }

    public static int getNestedScrollAxes(android.view.ViewGroup viewGroup) {
        return androidx.core.view.ViewGroupCompat.Api21Impl.getNestedScrollAxes(viewGroup);
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static int getLayoutMode(android.view.ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        static void setLayoutMode(android.view.ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setTransitionGroup(android.view.ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }

        static boolean isTransitionGroup(android.view.ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static int getNestedScrollAxes(android.view.ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
    }
}
