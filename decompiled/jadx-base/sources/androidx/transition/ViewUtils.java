package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtils {
    static final android.util.Property<android.view.View, android.graphics.Rect> CLIP_BOUNDS;
    private static final androidx.transition.ViewUtilsBase IMPL;
    private static final java.lang.String TAG = "ViewUtils";
    static final android.util.Property<android.view.View, java.lang.Float> TRANSITION_ALPHA;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            IMPL = new androidx.transition.ViewUtilsApi29();
        } else {
            IMPL = new androidx.transition.ViewUtilsApi23();
        }
        TRANSITION_ALPHA = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            public java.lang.Float get(android.view.View view) {
                return java.lang.Float.valueOf(androidx.transition.ViewUtils.getTransitionAlpha(view));
            }

            @Override // android.util.Property
            public void set(android.view.View view, java.lang.Float f) {
                androidx.transition.ViewUtils.setTransitionAlpha(view, f.floatValue());
            }
        };
        CLIP_BOUNDS = new android.util.Property<android.view.View, android.graphics.Rect>(android.graphics.Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            public android.graphics.Rect get(android.view.View view) {
                return androidx.core.view.ViewCompat.getClipBounds(view);
            }

            @Override // android.util.Property
            public void set(android.view.View view, android.graphics.Rect rect) {
                androidx.core.view.ViewCompat.setClipBounds(view, rect);
            }
        };
    }

    static androidx.transition.ViewOverlayImpl getOverlay(android.view.View view) {
        return new androidx.transition.ViewOverlayApi18(view);
    }

    static androidx.transition.WindowIdImpl getWindowId(android.view.View view) {
        return new androidx.transition.WindowIdApi18(view);
    }

    static void setTransitionAlpha(android.view.View view, float f) {
        IMPL.setTransitionAlpha(view, f);
    }

    static float getTransitionAlpha(android.view.View view) {
        return IMPL.getTransitionAlpha(view);
    }

    static void saveNonTransitionAlpha(android.view.View view) {
        IMPL.saveNonTransitionAlpha(view);
    }

    static void clearNonTransitionAlpha(android.view.View view) {
        IMPL.clearNonTransitionAlpha(view);
    }

    static void setTransitionVisibility(android.view.View view, int i) {
        IMPL.setTransitionVisibility(view, i);
    }

    static void transformMatrixToGlobal(android.view.View view, android.graphics.Matrix matrix) {
        IMPL.transformMatrixToGlobal(view, matrix);
    }

    static void transformMatrixToLocal(android.view.View view, android.graphics.Matrix matrix) {
        IMPL.transformMatrixToLocal(view, matrix);
    }

    static void setAnimationMatrix(android.view.View view, android.graphics.Matrix matrix) {
        IMPL.setAnimationMatrix(view, matrix);
    }

    static void setLeftTopRightBottom(android.view.View view, int i, int i2, int i3, int i4) {
        IMPL.setLeftTopRightBottom(view, i, i2, i3, i4);
    }

    private ViewUtils() {
    }
}
