package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DT {
    public final java.lang.String A00;
    public final boolean A01;

    public DT(java.lang.String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != com.facebook.ads.redexgen.core.DT.class) {
            return false;
        }
        com.facebook.ads.redexgen.core.DT dt = (com.facebook.ads.redexgen.core.DT) obj;
        return android.text.TextUtils.equals(this.A00, dt.A00) && this.A01 == dt.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        int prime = this.A00 == null ? 0 : this.A00.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
