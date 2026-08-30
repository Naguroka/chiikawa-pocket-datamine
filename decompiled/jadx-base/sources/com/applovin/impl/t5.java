package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class t5 implements com.applovin.impl.s4 {
    private final long b = androidx.media3.common.C.TIME_UNSET;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1349a = androidx.media3.common.C.TIME_UNSET;
    private final boolean c = false;

    @Override // com.applovin.impl.s4
    public boolean b(com.applovin.impl.qh qhVar) {
        qhVar.b();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean e(com.applovin.impl.qh qhVar) {
        qhVar.D();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a(com.applovin.impl.qh qhVar) {
        qhVar.u();
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean c(com.applovin.impl.qh qhVar) {
        if (!this.c) {
            qhVar.B();
            return true;
        }
        if (!b() || !qhVar.y()) {
            return true;
        }
        a(qhVar, -this.f1349a);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean d(com.applovin.impl.qh qhVar) {
        if (!this.c) {
            qhVar.w();
            return true;
        }
        if (!a() || !qhVar.y()) {
            return true;
        }
        a(qhVar, this.b);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean b(com.applovin.impl.qh qhVar, boolean z) {
        qhVar.a(z);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a(com.applovin.impl.qh qhVar, int i, long j) {
        qhVar.a(i, j);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean b() {
        return !this.c || this.f1349a > 0;
    }

    @Override // com.applovin.impl.s4
    public boolean a(com.applovin.impl.qh qhVar, int i) {
        qhVar.a(i);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a(com.applovin.impl.qh qhVar, boolean z) {
        qhVar.b(z);
        return true;
    }

    @Override // com.applovin.impl.s4
    public boolean a() {
        return !this.c || this.b > 0;
    }

    private static void a(com.applovin.impl.qh qhVar, long j) {
        long currentPosition = qhVar.getCurrentPosition() + j;
        long duration = qhVar.getDuration();
        if (duration != androidx.media3.common.C.TIME_UNSET) {
            currentPosition = java.lang.Math.min(currentPosition, duration);
        }
        qhVar.a(java.lang.Math.max(currentPosition, 0L));
    }
}
