package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0702Gb {
    public final int A00;
    public final int A01;
    public final java.lang.String A02;

    public C0702Gb(int i, int i2, java.lang.String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C0702Gb c0702Gb = (com.facebook.ads.redexgen.core.C0702Gb) obj;
        if (this.A00 == c0702Gb.A00 && this.A01 == c0702Gb.A01 && android.text.TextUtils.equals(this.A02, c0702Gb.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A01;
        int result3 = (i + result2) * 31;
        int result4 = this.A02 != null ? this.A02.hashCode() : 0;
        return result3 + result4;
    }
}
