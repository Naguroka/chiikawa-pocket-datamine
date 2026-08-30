package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        if ('\'' != bg(i, str)) {
            return bgVar.bg(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && bg(i3, str) != '\'') {
            i3++;
        }
        if (bg(i3, str) != '\'') {
            throw new com.bytedance.adsdk.bg.bg.bg("String expression not surrounded by '", str.substring(i2 - 1));
        }
        deque.push(new com.bytedance.adsdk.bg.IL.IL.bg.LZ(str.substring(i2, i3)));
        return i3 + 1;
    }
}
