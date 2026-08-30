package com.bytedance.sdk.component.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
final class ldr {
    static long IL;
    static com.bytedance.sdk.component.IL.bg.IL.zx bg;

    private ldr() {
    }

    static com.bytedance.sdk.component.IL.bg.IL.zx bg() {
        synchronized (com.bytedance.sdk.component.IL.bg.IL.ldr.class) {
            com.bytedance.sdk.component.IL.bg.IL.zx zxVar = bg;
            if (zxVar != null) {
                bg = zxVar.ldr;
                zxVar.ldr = null;
                IL -= 8192;
                return zxVar;
            }
            return new com.bytedance.sdk.component.IL.bg.IL.zx();
        }
    }

    static void bg(com.bytedance.sdk.component.IL.bg.IL.zx zxVar) {
        if (zxVar.ldr != null || zxVar.iR != null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (zxVar.eqN) {
            return;
        }
        synchronized (com.bytedance.sdk.component.IL.bg.IL.ldr.class) {
            long j = IL;
            if (j + 8192 > 65536) {
                return;
            }
            IL = j + 8192;
            zxVar.ldr = bg;
            zxVar.bX = 0;
            zxVar.IL = 0;
            bg = zxVar;
        }
    }
}
