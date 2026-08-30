package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class iR<V> extends java.util.concurrent.FutureTask<V> implements java.lang.Comparable<com.bytedance.sdk.component.Kg.iR<V>> {
    private int IL;
    private int bg;

    public iR(java.util.concurrent.Callable<V> callable, int i, int i2) {
        super(callable);
        this.bg = i == -1 ? 5 : i;
        this.IL = i2;
    }

    public iR(java.lang.Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.bg = i == -1 ? 5 : i;
        this.IL = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.component.Kg.iR iRVar) {
        if (bg() < iRVar.bg()) {
            return 1;
        }
        return bg() > iRVar.bg() ? -1 : 0;
    }

    public int bg() {
        return this.bg;
    }
}
