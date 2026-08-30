package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }

    private static java.lang.NumberFormatException zaa(java.lang.String str) {
        throw new java.lang.NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.images.Size) {
            com.google.android.gms.common.images.Size size = (com.google.android.gms.common.images.Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i = this.zaa;
        return ((i >>> 16) | (i << 16)) ^ this.zab;
    }

    public java.lang.String toString() {
        return this.zaa + "x" + this.zab;
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new com.google.android.gms.common.images.Size(java.lang.Integer.parseInt(str.substring(0, iIndexOf)), java.lang.Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (java.lang.NumberFormatException unused) {
            throw zaa(str);
        }
    }
}
