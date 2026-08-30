package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerCompat {

    @java.lang.Deprecated
    public interface AccessibilityStateChangeListener {
        @java.lang.Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @java.lang.Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z);
    }

    @java.lang.Deprecated
    public static boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener));
    }

    @java.lang.Deprecated
    public static boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener));
    }

    private static class AccessibilityStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener mListener;

        AccessibilityStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.mListener = accessibilityStateChangeListener;
        }

        public int hashCode() {
            return this.mListener.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper) {
                return this.mListener.equals(((androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper) obj).mListener);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.mListener.onAccessibilityStateChanged(z);
        }
    }

    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(android.view.accessibility.AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @java.lang.Deprecated
    public static boolean isTouchExplorationEnabled(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return androidx.core.view.accessibility.AccessibilityManagerCompat.Api19Impl.addTouchExplorationStateChangeListenerWrapper(accessibilityManager, touchExplorationStateChangeListener);
    }

    public static boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return androidx.core.view.accessibility.AccessibilityManagerCompat.Api19Impl.removeTouchExplorationStateChangeListenerWrapper(accessibilityManager, touchExplorationStateChangeListener);
    }

    private static final class TouchExplorationStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
        final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener mListener;

        TouchExplorationStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.mListener = touchExplorationStateChangeListener;
        }

        public int hashCode() {
            return this.mListener.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper) {
                return this.mListener.equals(((androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper) obj).mListener);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.mListener.onTouchExplorationStateChanged(z);
        }
    }

    private AccessibilityManagerCompat() {
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static boolean addTouchExplorationStateChangeListenerWrapper(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
        }

        static boolean removeTouchExplorationStateChangeListenerWrapper(android.view.accessibility.AccessibilityManager accessibilityManager, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
        }
    }
}
