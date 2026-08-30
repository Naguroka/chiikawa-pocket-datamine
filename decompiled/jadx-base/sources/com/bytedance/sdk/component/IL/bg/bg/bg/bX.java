package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.IL.bg.Kg.bg {
    com.bytedance.sdk.component.IL.bg.Ta IL;
    int bX = 0;
    java.util.List<com.bytedance.sdk.component.IL.bg.Kg> bg;

    bX(java.util.List<com.bytedance.sdk.component.IL.bg.Kg> list, com.bytedance.sdk.component.IL.bg.Ta ta) {
        this.bg = list;
        this.IL = ta;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Kg.bg
    public com.bytedance.sdk.component.IL.bg.Ta bg() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Kg.bg
    public com.bytedance.sdk.component.IL.bg.Lq bg(com.bytedance.sdk.component.IL.bg.Ta ta) throws java.io.IOException {
        this.IL = ta;
        int i = this.bX + 1;
        this.bX = i;
        if (i >= this.bg.size()) {
            return null;
        }
        return this.bg.get(this.bX).bg(this);
    }
}
