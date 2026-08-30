package com.bytedance.sdk.component.ldr.bg.zx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zx implements java.lang.Comparable<com.bytedance.sdk.component.ldr.bg.zx.zx>, java.lang.Runnable {
    private java.lang.String bX;
    private int bg = 5;
    private java.lang.String IL = java.util.UUID.randomUUID().toString() + "-" + java.lang.String.valueOf(java.lang.System.nanoTime());

    public zx(java.lang.String str) {
        this.bX = str;
    }

    public void bg(int i) {
        this.bg = i;
    }

    public int bg() {
        return this.bg;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.component.ldr.bg.zx.zx zxVar) {
        if (bg() < zxVar.bg()) {
            return 1;
        }
        return bg() >= zxVar.bg() ? -1 : 0;
    }
}
