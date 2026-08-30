package com.bytedance.adsdk.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
abstract class yDt<V, O> implements com.bytedance.adsdk.IL.bX.bg.Ta<V, O> {
    final java.util.List<com.bytedance.adsdk.IL.iR.bg<V>> bg;

    yDt(java.util.List<com.bytedance.adsdk.IL.iR.bg<V>> list) {
        this.bg = list;
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public java.util.List<com.bytedance.adsdk.IL.iR.bg<V>> bX() {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public boolean IL() {
        return this.bg.isEmpty() || (this.bg.size() == 1 && this.bg.get(0).zx());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.bg.isEmpty()) {
            sb.append("values=").append(java.util.Arrays.toString(this.bg.toArray()));
        }
        return sb.toString();
    }
}
