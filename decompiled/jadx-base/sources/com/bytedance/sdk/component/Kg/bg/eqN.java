package com.bytedance.sdk.component.Kg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN<T extends com.bytedance.sdk.component.Kg.bg.bX> {
    private java.util.concurrent.BlockingQueue<T> IL = new java.util.concurrent.LinkedBlockingQueue();
    private int bg;

    public static com.bytedance.sdk.component.Kg.bg.eqN bg(int i) {
        return new com.bytedance.sdk.component.Kg.bg.eqN(i);
    }

    private eqN(int i) {
        this.bg = i;
    }

    public T bg() {
        return this.IL.poll();
    }

    public boolean bg(T t) {
        if (t == null) {
            return false;
        }
        t.bg();
        if (this.IL.size() >= this.bg) {
            return false;
        }
        return this.IL.offer(t);
    }
}
