package com.bytedance.sdk.component.ldr.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static volatile com.bytedance.sdk.component.ldr.bg.ldr.IL bg;

    public static com.bytedance.sdk.component.ldr.bg.ldr.IL bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.ldr.bg.ldr.IL.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.component.ldr.bg.ldr.bX(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), new com.bytedance.sdk.component.ldr.bg.ldr.ldr(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr()));
                }
            }
        }
        return bg;
    }
}
