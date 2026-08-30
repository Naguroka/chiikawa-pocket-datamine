package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class z0<T extends com.pgl.ssdk.y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3820a;
    private java.util.concurrent.BlockingQueue<T> b = new java.util.concurrent.LinkedBlockingQueue();

    private z0(int i) {
        this.f3820a = i;
    }

    public static com.pgl.ssdk.z0 a(int i) {
        return new com.pgl.ssdk.z0(i);
    }

    public T a() {
        return this.b.poll();
    }
}
