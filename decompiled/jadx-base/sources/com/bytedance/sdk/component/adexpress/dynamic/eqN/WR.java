package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class WR {
    public float IL;
    public float bg;

    public WR(float f, float f2) {
        this.bg = f;
        this.IL = f2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wr = (com.bytedance.sdk.component.adexpress.dynamic.eqN.WR) obj;
            if (java.lang.Float.compare(wr.bg, this.bg) == 0 && java.lang.Float.compare(wr.IL, this.IL) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.bg), java.lang.Float.valueOf(this.IL)});
    }
}
