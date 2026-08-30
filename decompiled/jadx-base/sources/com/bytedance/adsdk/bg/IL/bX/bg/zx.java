package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        char cBg;
        int i2 = i;
        while (true) {
            cBg = bg(i2, str);
            if (!com.bytedance.adsdk.bg.IL.zx.bg.IL(cBg) && !com.bytedance.adsdk.bg.IL.zx.bg.bX(cBg)) {
                break;
            }
            i2++;
        }
        if (cBg != '(') {
            return bgVar.bg(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.eo(str.substring(i, i2)));
        return i2 + 1;
    }
}
