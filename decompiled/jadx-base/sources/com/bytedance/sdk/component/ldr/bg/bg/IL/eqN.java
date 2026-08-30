package com.bytedance.sdk.component.ldr.bg.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eqN<T extends com.bytedance.sdk.component.ldr.bg.eqN.bg> {
    private java.util.Queue<T> IL = new java.util.concurrent.ConcurrentLinkedQueue();
    private java.util.Queue<java.lang.String> bX;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bg;
    private java.lang.String eqN;

    public eqN(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar, java.util.Queue<java.lang.String> queue, java.lang.String str) {
        this.bg = bgVar;
        this.bX = queue;
        this.eqN = str;
    }

    public void bg(T t) {
        java.util.Queue<T> queue = this.IL;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, int i2) {
        if (!IL(i, i2)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.bg.bg());
        do {
            T tPoll = this.IL.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.bg.IL());
        return arrayList;
    }

    public synchronized void bg(int i, java.util.List<T> list) {
        try {
            if (i == -1 || i == 200 || i == 509) {
                this.IL.size();
            } else {
                this.IL.addAll(list);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized boolean IL(int i, int i2) {
        int size = this.IL.size();
        int iBg = this.bg.bg();
        if (i != 2 && i != 1) {
            return size >= iBg;
        }
        if (com.bytedance.sdk.component.ldr.bg.bX.bg.bX()) {
            return size > 0;
        }
        return size >= iBg;
    }
}
