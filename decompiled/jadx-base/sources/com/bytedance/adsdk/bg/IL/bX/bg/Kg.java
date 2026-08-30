package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        if (!com.bytedance.adsdk.bg.IL.zx.bg.eqN(bg(i, str))) {
            return bgVar.bg(str, i, deque);
        }
        int i2 = i + 1;
        java.lang.String str2 = new java.lang.String(new char[]{bg(i, str), bg(i2, str)});
        if (com.bytedance.adsdk.bg.IL.eqN.bX.bg(str2) != null) {
            deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.xxp(com.bytedance.adsdk.bg.IL.eqN.bX.bg(str2)));
            return i + 2;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(bg(i, str));
        if (com.bytedance.adsdk.bg.IL.eqN.bX.bg(strValueOf) != null) {
            deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.xxp(com.bytedance.adsdk.bg.IL.eqN.bX.bg(strValueOf)));
            return i2;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i));
    }
}
