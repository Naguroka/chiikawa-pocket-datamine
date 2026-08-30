package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        if (',' != bg(i, str)) {
            return bgVar.bg(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.tC(com.bytedance.adsdk.bg.IL.eqN.eqN.COMMA));
        return i + 1;
    }
}
