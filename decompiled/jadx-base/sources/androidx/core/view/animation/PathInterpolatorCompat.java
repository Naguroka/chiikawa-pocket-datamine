package androidx.core.view.animation;

/* JADX INFO: loaded from: classes.dex */
public final class PathInterpolatorCompat {
    private PathInterpolatorCompat() {
    }

    public static android.view.animation.Interpolator create(android.graphics.Path path) {
        return androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(path);
    }

    public static android.view.animation.Interpolator create(float f, float f2) {
        return androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(f, f2);
    }

    public static android.view.animation.Interpolator create(float f, float f2, float f3, float f4) {
        return androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(f, f2, f3, f4);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.view.animation.PathInterpolator createPathInterpolator(android.graphics.Path path) {
            return new android.view.animation.PathInterpolator(path);
        }

        static android.view.animation.PathInterpolator createPathInterpolator(float f, float f2) {
            return new android.view.animation.PathInterpolator(f, f2);
        }

        static android.view.animation.PathInterpolator createPathInterpolator(float f, float f2, float f3, float f4) {
            return new android.view.animation.PathInterpolator(f, f2, f3, f4);
        }
    }
}
