package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f975a;

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }

    public final void b(int i) {
        this.f975a = i | this.f975a;
    }

    public final void c(int i) {
        this.f975a = (~i) & this.f975a;
    }

    protected final boolean d(int i) {
        return (this.f975a & i) == i;
    }

    public void b() {
        this.f975a = 0;
    }

    public final void e(int i) {
        this.f975a = i;
    }

    public final boolean d() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return d(268435456);
    }
}
