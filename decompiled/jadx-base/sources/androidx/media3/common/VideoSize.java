package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_UNAPPLIED_ROTATION_DEGREES = 0;
    private static final int DEFAULT_WIDTH = 0;
    public final int height;
    public final float pixelWidthHeightRatio;
    public final int unappliedRotationDegrees;
    public final int width;
    public static final androidx.media3.common.VideoSize UNKNOWN = new androidx.media3.common.VideoSize(0, 0);
    private static final java.lang.String FIELD_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_UNAPPLIED_ROTATION_DEGREES = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    public VideoSize(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public VideoSize(int i, int i2, int i3, float f) {
        this.width = i;
        this.height = i2;
        this.unappliedRotationDegrees = i3;
        this.pixelWidthHeightRatio = f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.VideoSize)) {
            return false;
        }
        androidx.media3.common.VideoSize videoSize = (androidx.media3.common.VideoSize) obj;
        return this.width == videoSize.width && this.height == videoSize.height && this.unappliedRotationDegrees == videoSize.unappliedRotationDegrees && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio;
    }

    public int hashCode() {
        return ((((((217 + this.width) * 31) + this.height) * 31) + this.unappliedRotationDegrees) * 31) + java.lang.Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        bundle.putInt(FIELD_UNAPPLIED_ROTATION_DEGREES, this.unappliedRotationDegrees);
        bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, this.pixelWidthHeightRatio);
        return bundle;
    }

    public static androidx.media3.common.VideoSize fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getInt(FIELD_UNAPPLIED_ROTATION_DEGREES, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }
}
