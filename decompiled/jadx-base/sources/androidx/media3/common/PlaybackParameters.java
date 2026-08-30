package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final androidx.media3.common.PlaybackParameters DEFAULT = new androidx.media3.common.PlaybackParameters(1.0f);
    private static final java.lang.String FIELD_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PITCH = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(float f, float f2) {
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
        androidx.media3.common.util.Assertions.checkArgument(f2 > 0.0f);
        this.speed = f;
        this.pitch = f2;
        this.scaledUsPerMs = java.lang.Math.round(f * 1000.0f);
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.scaledUsPerMs);
    }

    public androidx.media3.common.PlaybackParameters withSpeed(float f) {
        return new androidx.media3.common.PlaybackParameters(f, this.pitch);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.PlaybackParameters playbackParameters = (androidx.media3.common.PlaybackParameters) obj;
        return this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch;
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + java.lang.Float.floatToRawIntBits(this.speed)) * 31) + java.lang.Float.floatToRawIntBits(this.pitch);
    }

    public java.lang.String toString() {
        return androidx.media3.common.util.Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.speed), java.lang.Float.valueOf(this.pitch));
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(FIELD_SPEED, this.speed);
        bundle.putFloat(FIELD_PITCH, this.pitch);
        return bundle;
    }

    public static androidx.media3.common.PlaybackParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.PlaybackParameters(bundle.getFloat(FIELD_SPEED, 1.0f), bundle.getFloat(FIELD_PITCH, 1.0f));
    }
}
