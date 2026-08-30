package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class EdgeEffectCompat {
    private final android.widget.EdgeEffect mEdgeEffect;

    @java.lang.Deprecated
    public EdgeEffectCompat(android.content.Context context) {
        this.mEdgeEffect = new android.widget.EdgeEffect(context);
    }

    public static android.widget.EdgeEffect create(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.create(context, attributeSet);
        }
        return new android.widget.EdgeEffect(context);
    }

    public static float getDistance(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    @java.lang.Deprecated
    public void setSize(int i, int i2) {
        this.mEdgeEffect.setSize(i, i2);
    }

    @java.lang.Deprecated
    public boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @java.lang.Deprecated
    public void finish() {
        this.mEdgeEffect.finish();
    }

    @java.lang.Deprecated
    public boolean onPull(float f) {
        this.mEdgeEffect.onPull(f);
        return true;
    }

    @java.lang.Deprecated
    public boolean onPull(float f, float f2) {
        onPull(this.mEdgeEffect, f, f2);
        return true;
    }

    public static void onPull(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        androidx.core.widget.EdgeEffectCompat.Api21Impl.onPull(edgeEffect, f, f2);
    }

    public static float onPullDistance(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.onPullDistance(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }

    @java.lang.Deprecated
    public boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @java.lang.Deprecated
    public boolean onAbsorb(int i) {
        this.mEdgeEffect.onAbsorb(i);
        return true;
    }

    @java.lang.Deprecated
    public boolean draw(android.graphics.Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        public static android.widget.EdgeEffect create(android.content.Context context, android.util.AttributeSet attributeSet) {
            try {
                return new android.widget.EdgeEffect(context, attributeSet);
            } catch (java.lang.Throwable unused) {
                return new android.widget.EdgeEffect(context);
            }
        }

        public static float onPullDistance(android.widget.EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (java.lang.Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }

        public static float getDistance(android.widget.EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (java.lang.Throwable unused) {
                return 0.0f;
            }
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void onPull(android.widget.EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }
}
