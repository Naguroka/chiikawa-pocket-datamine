package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1175Yu<I extends com.facebook.ads.redexgen.core.C1177Yw, O extends com.facebook.ads.redexgen.core.AbstractC1176Yv, E extends java.lang.Exception> implements com.facebook.ads.redexgen.core.BG<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final java.lang.Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final java.lang.Object A07 = new java.lang.Object();
    public final java.util.ArrayDeque<I> A09 = new java.util.ArrayDeque<>();
    public final java.util.ArrayDeque<O> A0A = new java.util.ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i, O o, boolean z);

    public abstract E A0X(java.lang.Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public AbstractC1175Yu(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            ((I[]) this.A0B)[i] = A0T();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i2 = 0; i2 < this.A01; i2++) {
            ((O[]) this.A0C)[i2] = A0V();
        }
        this.A08 = new com.facebook.ads.redexgen.core.BJ(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0L() throws java.lang.Exception {
        if (this.A04 == null) {
        } else {
            throw this.A04;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0N(I inputBuffer) {
        inputBuffer.A07();
        I[] iArr = this.A0B;
        int i = this.A00;
        this.A00 = i + 1;
        iArr[i] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private void A0O(O outputBuffer) {
        outputBuffer.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    private boolean A0R() throws java.lang.InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A04()) {
                o.A00(4);
            } else {
                if (iRemoveFirst.A03()) {
                    o.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = A0W(iRemoveFirst, o, z);
                } catch (java.lang.OutOfMemoryError e) {
                    this.A04 = (E) A0X(e);
                } catch (java.lang.RuntimeException e2) {
                    this.A04 = (E) A0X(e2);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o);
                } else if (o.A03()) {
                    this.A02++;
                    A0O(o);
                } else {
                    o.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o);
                }
                A0N(iRemoveFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A5Q() throws java.lang.Exception {
        I i;
        I i2;
        synchronized (this.A07) {
            A0L();
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A03 == null);
            if (this.A00 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A03 = i;
            i2 = this.A03;
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A5R() throws java.lang.Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public final void A0Y(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A00 == this.A0B.length);
        for (I i2 : this.A0B) {
            i2.A09(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void AEj(I inputBuffer) throws java.lang.Exception {
        synchronized (this.A07) {
            A0L();
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(inputBuffer == this.A03);
            this.A09.addLast(inputBuffer);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    public void A0a(O outputBuffer) {
        synchronized (this.A07) {
            A0O(outputBuffer);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.core.BG
    public final void AEy() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yu != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Yw, O extends com.facebook.ads.redexgen.X.Yv, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.core.BG
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0N(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
