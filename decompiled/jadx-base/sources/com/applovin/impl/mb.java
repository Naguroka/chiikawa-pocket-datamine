package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class mb implements com.applovin.impl.lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1019a;
    private final com.applovin.impl.qc b;
    private final com.applovin.impl.qc c;
    private long d;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public mb(long j, long j2, long j3) {
        this.d = j;
        this.f1019a = j3;
        com.applovin.impl.qc qcVar = new com.applovin.impl.qc();
        this.b = qcVar;
        com.applovin.impl.qc qcVar2 = new com.applovin.impl.qc();
        this.c = qcVar2;
        qcVar.a(0L);
        qcVar2.a(j2);
    }

    @Override // com.applovin.impl.lj
    public long a(long j) {
        return this.b.a(com.applovin.impl.xp.a(this.c, j, true, true));
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.f1019a;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.d;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        int iA = com.applovin.impl.xp.a(this.b, j, true, true);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(this.b.a(iA), this.c.a(iA));
        if (kjVar.f963a != j && iA != this.b.a() - 1) {
            int i = iA + 1;
            return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(this.b.a(i), this.c.a(i)));
        }
        return new com.applovin.impl.ij.a(kjVar);
    }

    public void a(long j, long j2) {
        if (c(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }

    public boolean c(long j) {
        com.applovin.impl.qc qcVar = this.b;
        return j - qcVar.a(qcVar.a() - 1) < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    void d(long j) {
        this.d = j;
    }
}
