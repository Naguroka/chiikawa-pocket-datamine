package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public final class PX<V> {
    private final java.lang.Throwable IL;
    private final V bg;

    public PX(V v) {
        this.bg = v;
        this.IL = null;
    }

    public PX(java.lang.Throwable th) {
        this.IL = th;
        this.bg = null;
    }

    public V bg() {
        return this.bg;
    }

    public java.lang.Throwable IL() {
        return this.IL;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bytedance.adsdk.IL.PX)) {
            return false;
        }
        com.bytedance.adsdk.IL.PX px = (com.bytedance.adsdk.IL.PX) obj;
        if (bg() != null && bg().equals(px.bg())) {
            return true;
        }
        if (IL() == null || px.IL() == null) {
            return false;
        }
        return IL().toString().equals(IL().toString());
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{bg(), IL()});
    }
}
