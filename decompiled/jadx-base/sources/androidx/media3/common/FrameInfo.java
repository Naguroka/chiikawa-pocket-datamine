package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class FrameInfo {
    public final androidx.media3.common.ColorInfo colorInfo;
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static final class Builder {
        private androidx.media3.common.ColorInfo colorInfo;
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio;
        private int width;

        public Builder(androidx.media3.common.ColorInfo colorInfo, int i, int i2) {
            this.colorInfo = colorInfo;
            this.width = i;
            this.height = i2;
            this.pixelWidthHeightRatio = 1.0f;
        }

        public Builder(androidx.media3.common.FrameInfo frameInfo) {
            this.colorInfo = frameInfo.colorInfo;
            this.width = frameInfo.width;
            this.height = frameInfo.height;
            this.pixelWidthHeightRatio = frameInfo.pixelWidthHeightRatio;
            this.offsetToAddUs = frameInfo.offsetToAddUs;
        }

        public androidx.media3.common.FrameInfo.Builder setColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public androidx.media3.common.FrameInfo.Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public androidx.media3.common.FrameInfo.Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public androidx.media3.common.FrameInfo.Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public androidx.media3.common.FrameInfo.Builder setOffsetToAddUs(long j) {
            this.offsetToAddUs = j;
            return this;
        }

        public androidx.media3.common.FrameInfo build() {
            return new androidx.media3.common.FrameInfo(this.colorInfo, this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }
    }

    private FrameInfo(androidx.media3.common.ColorInfo colorInfo, int i, int i2, float f, long j) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "width must be positive, but is: " + i);
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0, "height must be positive, but is: " + i2);
        this.colorInfo = colorInfo;
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.offsetToAddUs = j;
    }
}
