package com.bytedance.sdk.component.adexpress.IL;

/* JADX INFO: loaded from: classes3.dex */
public class PX implements com.bytedance.sdk.component.adexpress.IL.eo.bg {
    private java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> IL;
    private com.bytedance.sdk.component.adexpress.IL.WR bX;
    com.bytedance.sdk.component.adexpress.IL.Lq bg;
    private java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);

    public PX(java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> list, com.bytedance.sdk.component.adexpress.IL.WR wr) {
        this.IL = list;
        this.bX = wr;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public void bg() {
        this.bX.eqN();
        java.util.Iterator<com.bytedance.sdk.component.adexpress.IL.eo> it = this.IL.iterator();
        while (it.hasNext() && !it.next().bg(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public void bg(com.bytedance.sdk.component.adexpress.IL.eo eoVar) {
        int iIndexOf = this.IL.indexOf(eoVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.IL.size()) {
                return;
            }
        } while (!this.IL.get(iIndexOf).bg(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public boolean IL(com.bytedance.sdk.component.adexpress.IL.eo eoVar) {
        int iIndexOf = this.IL.indexOf(eoVar);
        return iIndexOf < this.IL.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public com.bytedance.sdk.component.adexpress.IL.Lq IL() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public void bg(com.bytedance.sdk.component.adexpress.IL.Lq lq) {
        this.bg = lq;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public void bg(boolean z) {
        this.eqN.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo.bg
    public boolean bX() {
        return this.eqN.get();
    }
}
