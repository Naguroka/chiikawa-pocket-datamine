package com.bytedance.sdk.component.ldr.bg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static void bg(java.util.concurrent.atomic.AtomicLong atomicLong, int i) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || !zxVarVb.iR() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
