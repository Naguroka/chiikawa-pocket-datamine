package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    public static final androidx.media3.common.util.Size UNKNOWN = new androidx.media3.common.util.Size(-1, -1);
    public static final androidx.media3.common.util.Size ZERO = new androidx.media3.common.util.Size(0, 0);
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.width = i;
        this.height = i2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.util.Size)) {
            return false;
        }
        androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public java.lang.String toString() {
        return this.width + "x" + this.height;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
