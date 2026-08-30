package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static java.util.HashMap<java.lang.Integer, com.bytedance.sdk.component.iR.bX.ldr> IL;
    private static java.util.HashMap<java.lang.Integer, com.bytedance.sdk.component.iR.bX.bg> bX;
    private static volatile com.bytedance.sdk.component.iR.bX.Kg bg;

    private Kg() {
        IL = new java.util.HashMap<>();
        bX = new java.util.HashMap<>();
    }

    public static synchronized com.bytedance.sdk.component.iR.bX.Kg bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.iR.bX.Kg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.component.iR.bX.Kg();
                }
            }
        }
        return bg;
    }

    public com.bytedance.sdk.component.iR.bX.ldr bg(int i) {
        com.bytedance.sdk.component.iR.bX.ldr ldrVar = IL.get(java.lang.Integer.valueOf(i));
        if (ldrVar != null) {
            return ldrVar;
        }
        com.bytedance.sdk.component.iR.bX.ldr ldrVar2 = new com.bytedance.sdk.component.iR.bX.ldr(i);
        IL.put(java.lang.Integer.valueOf(i), ldrVar2);
        return ldrVar2;
    }

    public com.bytedance.sdk.component.iR.bX.bg bg(int i, android.content.Context context) {
        com.bytedance.sdk.component.iR.bX.bg bgVar = bX.get(java.lang.Integer.valueOf(i));
        if (bgVar != null) {
            return bgVar;
        }
        com.bytedance.sdk.component.iR.bX.bg bgVar2 = new com.bytedance.sdk.component.iR.bX.bg(context, i);
        bX.put(java.lang.Integer.valueOf(i), bgVar2);
        return bgVar2;
    }
}
