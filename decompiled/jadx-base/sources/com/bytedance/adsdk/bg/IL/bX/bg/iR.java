package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    private boolean bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque) {
        if ('-' == bg(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.bg.IL.eqN.bX.bg(deque.peek().bg())) {
                return false;
            }
            if (com.bytedance.adsdk.bg.IL.zx.bg.bX(bg(i + 1, str))) {
                return true;
            }
            throw new java.lang.IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.bg.IL.zx.bg.bX(bg(i, str));
    }

    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        char cBg;
        if (!bg(str, i, deque)) {
            return bgVar.bg(str, i, deque);
        }
        int i2 = bg(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            cBg = bg(i2, str);
            if (!com.bytedance.adsdk.bg.IL.zx.bg.bX(cBg) && (z || cBg != '.')) {
                break;
            }
            i2++;
            if (cBg == '.') {
                z = true;
            }
        }
        if (cBg == '.') {
            throw new java.lang.IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.Lq(str.substring(i, i2)));
        return i2;
    }
}
