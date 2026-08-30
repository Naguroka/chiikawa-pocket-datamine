package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ldr {
    public abstract int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar);

    protected char bg(int i, java.lang.String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    protected int IL(int i, java.lang.String str) {
        while (com.bytedance.adsdk.bg.IL.zx.bg.bg(bg(i, str))) {
            i++;
        }
        return i;
    }
}
