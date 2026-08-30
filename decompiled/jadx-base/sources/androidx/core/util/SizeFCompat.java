package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    public SizeFCompat(float f, float f2) {
        this.mWidth = androidx.core.util.Preconditions.checkArgumentFinite(f, "width");
        this.mHeight = androidx.core.util.Preconditions.checkArgumentFinite(f2, "height");
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.util.SizeFCompat)) {
            return false;
        }
        androidx.core.util.SizeFCompat sizeFCompat = (androidx.core.util.SizeFCompat) obj;
        return sizeFCompat.mWidth == this.mWidth && sizeFCompat.mHeight == this.mHeight;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.mWidth) ^ java.lang.Float.floatToIntBits(this.mHeight);
    }

    public java.lang.String toString() {
        return this.mWidth + "x" + this.mHeight;
    }

    public android.util.SizeF toSizeF() {
        return androidx.core.util.SizeFCompat.Api21Impl.toSizeF(this);
    }

    public static androidx.core.util.SizeFCompat toSizeFCompat(android.util.SizeF sizeF) {
        return androidx.core.util.SizeFCompat.Api21Impl.toSizeFCompat(sizeF);
    }

    private static final class Api21Impl {
        private Api21Impl() {
        }

        static androidx.core.util.SizeFCompat toSizeFCompat(android.util.SizeF sizeF) {
            androidx.core.util.Preconditions.checkNotNull(sizeF);
            return new androidx.core.util.SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }

        static android.util.SizeF toSizeF(androidx.core.util.SizeFCompat sizeFCompat) {
            androidx.core.util.Preconditions.checkNotNull(sizeFCompat);
            return new android.util.SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }
    }
}
