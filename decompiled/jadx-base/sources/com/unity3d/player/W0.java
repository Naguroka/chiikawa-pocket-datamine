package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class W0 {
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3901a = false;
    private boolean b = false;
    private boolean c = true;
    private boolean d = false;

    W0() {
    }

    static boolean d() {
        return e;
    }

    static void e() {
        e = true;
    }

    static void f() {
        e = false;
    }

    final boolean a() {
        return this.d;
    }

    final boolean a(boolean z) {
        return e && !((!z && !this.f3901a) || this.c || this.b);
    }

    final void b(boolean z) {
        this.f3901a = z;
    }

    final boolean b() {
        return this.c;
    }

    final void c(boolean z) {
        this.b = z;
    }

    final boolean c() {
        return this.b;
    }

    final void d(boolean z) {
        this.d = z;
    }

    final void e(boolean z) {
        this.c = z;
    }

    public final java.lang.String toString() {
        return super.toString();
    }
}
