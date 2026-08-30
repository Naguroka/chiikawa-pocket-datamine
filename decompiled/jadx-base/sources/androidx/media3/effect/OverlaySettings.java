package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class OverlaySettings {
    public final float alphaScale;
    public final android.util.Pair<java.lang.Float, java.lang.Float> backgroundFrameAnchor;
    public final float hdrLuminanceMultiplier;
    public final android.util.Pair<java.lang.Float, java.lang.Float> overlayFrameAnchor;
    public final float rotationDegrees;
    public final android.util.Pair<java.lang.Float, java.lang.Float> scale;

    public static final class Builder {
        private float alphaScale;
        private android.util.Pair<java.lang.Float, java.lang.Float> backgroundFrameAnchor;
        private float hdrLuminanceMultiplier;
        private android.util.Pair<java.lang.Float, java.lang.Float> overlayFrameAnchor;
        private float rotationDegrees;
        private android.util.Pair<java.lang.Float, java.lang.Float> scale;

        public Builder() {
            java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
            this.alphaScale = 1.0f;
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
            this.backgroundFrameAnchor = android.util.Pair.create(fValueOf2, fValueOf2);
            this.overlayFrameAnchor = android.util.Pair.create(fValueOf2, fValueOf2);
            this.scale = android.util.Pair.create(fValueOf, fValueOf);
            this.rotationDegrees = 0.0f;
            this.hdrLuminanceMultiplier = 1.0f;
        }

        private Builder(androidx.media3.effect.OverlaySettings overlaySettings) {
            this.alphaScale = overlaySettings.alphaScale;
            this.backgroundFrameAnchor = overlaySettings.backgroundFrameAnchor;
            this.overlayFrameAnchor = overlaySettings.overlayFrameAnchor;
            this.scale = overlaySettings.scale;
            this.rotationDegrees = overlaySettings.rotationDegrees;
        }

        public androidx.media3.effect.OverlaySettings.Builder setAlphaScale(float f) {
            androidx.media3.common.util.Assertions.checkArgument(0.0f <= f, "alphaScale needs to be greater than or equal to zero.");
            this.alphaScale = f;
            return this;
        }

        public androidx.media3.effect.OverlaySettings.Builder setBackgroundFrameAnchor(float f, float f2) {
            androidx.media3.common.util.Assertions.checkArgument(-1.0f <= f && f <= 1.0f);
            androidx.media3.common.util.Assertions.checkArgument(-1.0f <= f2 && f2 <= 1.0f);
            this.backgroundFrameAnchor = android.util.Pair.create(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
            return this;
        }

        public androidx.media3.effect.OverlaySettings.Builder setOverlayFrameAnchor(float f, float f2) {
            androidx.media3.common.util.Assertions.checkArgument(-1.0f <= f && f <= 1.0f);
            androidx.media3.common.util.Assertions.checkArgument(-1.0f <= f2 && f2 <= 1.0f);
            this.overlayFrameAnchor = android.util.Pair.create(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
            return this;
        }

        public androidx.media3.effect.OverlaySettings.Builder setScale(float f, float f2) {
            this.scale = android.util.Pair.create(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
            return this;
        }

        public androidx.media3.effect.OverlaySettings.Builder setRotationDegrees(float f) {
            this.rotationDegrees = f;
            return this;
        }

        public androidx.media3.effect.OverlaySettings.Builder setHdrLuminanceMultiplier(float f) {
            this.hdrLuminanceMultiplier = f;
            return this;
        }

        public androidx.media3.effect.OverlaySettings build() {
            return new androidx.media3.effect.OverlaySettings(this.alphaScale, this.backgroundFrameAnchor, this.overlayFrameAnchor, this.scale, this.rotationDegrees, this.hdrLuminanceMultiplier);
        }
    }

    private OverlaySettings(float f, android.util.Pair<java.lang.Float, java.lang.Float> pair, android.util.Pair<java.lang.Float, java.lang.Float> pair2, android.util.Pair<java.lang.Float, java.lang.Float> pair3, float f2, float f3) {
        this.alphaScale = f;
        this.backgroundFrameAnchor = pair;
        this.overlayFrameAnchor = pair2;
        this.scale = pair3;
        this.rotationDegrees = f2;
        this.hdrLuminanceMultiplier = f3;
    }

    androidx.media3.effect.OverlaySettings.Builder buildUpon() {
        return new androidx.media3.effect.OverlaySettings.Builder();
    }
}
