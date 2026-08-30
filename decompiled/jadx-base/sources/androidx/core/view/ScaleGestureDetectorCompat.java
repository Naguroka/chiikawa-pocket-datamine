package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object obj, boolean z) {
        setQuickScaleEnabled((android.view.ScaleGestureDetector) obj, z);
    }

    public static void setQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector, boolean z) {
        androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.setQuickScaleEnabled(scaleGestureDetector, z);
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object obj) {
        return isQuickScaleEnabled((android.view.ScaleGestureDetector) obj);
    }

    public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector) {
        return androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.isQuickScaleEnabled(scaleGestureDetector);
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }

        static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
    }
}
