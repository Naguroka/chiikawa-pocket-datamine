package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ak extends com.applovin.impl.z1 {
    private final long i;
    private final long j;
    private final short k;
    private int l;
    private boolean m;
    private byte[] n;
    private byte[] o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private long t;

    public ak() {
        this(150000L, 20000L, androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    public long j() {
        return this.t;
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public boolean f() {
        return this.m;
    }

    @Override // com.applovin.impl.z1
    protected void h() {
        int i = this.q;
        if (i > 0) {
            a(this.n, i);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.r / this.l);
    }

    @Override // com.applovin.impl.z1
    protected void g() {
        if (this.m) {
            this.l = this.b.d;
            int iA = a(this.i) * this.l;
            if (this.n.length != iA) {
                this.n = new byte[iA];
            }
            int iA2 = a(this.j) * this.l;
            this.r = iA2;
            if (this.o.length != iA2) {
                this.o = new byte[iA2];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    public ak(long j, long j2, short s) {
        com.applovin.impl.b1.a(j2 <= j);
        this.i = j;
        this.j = j2;
        this.k = s;
        byte[] bArr = com.applovin.impl.xp.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // com.applovin.impl.z1
    protected void i() {
        this.m = false;
        this.r = 0;
        byte[] bArr = com.applovin.impl.xp.f;
        this.n = bArr;
        this.o = bArr;
    }

    private void e(java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iC = c(byteBuffer);
        int iPosition = iC - byteBuffer.position();
        byte[] bArr = this.n;
        int length = bArr.length;
        int i = this.q;
        int i2 = length - i;
        if (iC < iLimit && iPosition < i2) {
            a(bArr, i);
            this.q = 0;
            this.p = 0;
            return;
        }
        int iMin = java.lang.Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.n, this.q, iMin);
        int i3 = this.q + iMin;
        this.q = i3;
        byte[] bArr2 = this.n;
        if (i3 == bArr2.length) {
            if (this.s) {
                a(bArr2, this.r);
                this.t += (long) ((this.q - (this.r * 2)) / this.l);
            } else {
                this.t += (long) ((i3 - this.r) / this.l);
            }
            a(byteBuffer, this.n, this.q);
            this.q = 0;
            this.p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void d(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        a(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.s = true;
        }
    }

    private int a(long j) {
        return (int) ((j * ((long) this.b.f1139a)) / 1000000);
    }

    private int c(java.nio.ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (java.lang.Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i = this.l;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private int b(java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (java.lang.Math.abs((int) byteBuffer.getShort(iLimit)) <= this.k);
        int i = this.l;
        return ((iLimit / i) * i) + i;
    }

    private void f(java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(java.lang.Math.min(iLimit, byteBuffer.position() + this.n.length));
        int iB = b(byteBuffer);
        if (iB == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(iB);
            d(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void g(java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iC = c(byteBuffer);
        byteBuffer.limit(iC);
        this.t += (long) (byteBuffer.remaining() / this.l);
        a(byteBuffer, this.o, this.r);
        if (iC < iLimit) {
            a(this.o, this.r);
            this.p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.applovin.impl.z1
    public com.applovin.impl.p1.a b(com.applovin.impl.p1.a aVar) throws com.applovin.impl.p1.b {
        if (aVar.c == 2) {
            return this.m ? aVar : com.applovin.impl.p1.a.e;
        }
        throw new com.applovin.impl.p1.b(aVar);
    }

    private void a(byte[] bArr, int i) {
        a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    @Override // com.applovin.impl.p1
    public void a(java.nio.ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i = this.p;
            if (i == 0) {
                f(byteBuffer);
            } else if (i == 1) {
                e(byteBuffer);
            } else if (i == 2) {
                g(byteBuffer);
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(boolean z) {
        this.m = z;
    }

    private void a(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - iMin;
        java.lang.System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.o, i2, iMin);
    }
}
