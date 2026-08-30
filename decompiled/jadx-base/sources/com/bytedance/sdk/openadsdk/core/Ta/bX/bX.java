package com.bytedance.sdk.openadsdk.core.Ta.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.IL.IL {
    public bX(int i, int i2) {
        super(i, i2);
    }

    public bX(int i, int i2, boolean z) {
        super(i, i2);
        this.bg = z;
    }

    @Override // com.bytedance.sdk.openadsdk.IL.IL, com.bytedance.sdk.openadsdk.IL.bg
    protected void bg(java.util.List<java.io.File> list) {
        int size = list.size();
        if (bg(0L, size)) {
            return;
        }
        for (java.io.File file : list) {
            com.bytedance.sdk.component.utils.ldr.bX(file);
            size--;
            if (bg(file, 0L, size)) {
                return;
            }
        }
    }
}
