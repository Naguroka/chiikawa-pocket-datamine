package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        if (!com.bytedance.adsdk.bg.IL.zx.bg.IL(bg(i, str))) {
            return bgVar.bg(str, i, deque);
        }
        return bg(str, i, deque);
    }

    private int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cBg = bg(i2, str);
            if (!com.bytedance.adsdk.bg.IL.zx.bg.IL(cBg) && !com.bytedance.adsdk.bg.IL.zx.bg.bX(cBg) && '.' != cBg && '[' != cBg && ']' != cBg && '_' != cBg && '-' != cBg) {
                break;
            }
            i3++;
        }
        java.lang.String strSubstring = str.substring(i, i2);
        if (com.bytedance.adsdk.bg.IL.eqN.bg.bg(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.iR(strSubstring));
        } else {
            deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.rri(strSubstring));
        }
        return i2;
    }
}
