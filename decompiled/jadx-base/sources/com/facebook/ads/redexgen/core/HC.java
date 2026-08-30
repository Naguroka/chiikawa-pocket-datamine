package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HC<T extends com.facebook.ads.redexgen.core.HD> extends android.os.Handler implements java.lang.Runnable {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"jnbmIE2916PFpUTPOA8pGlKEXy6RHOsj", "9rhOhRNdxlxAg8zNXDvdXeOLZ3R", "9E94u0qc0K0USfGlf79CEW8gWN5Gt", "Qc5NHzHyAtQ93FWvZt19c61s8RDFcyv6", "ZqeOda301Fdz3JQ2hYEiJQV5PqrnYtOf", "ayOQ3imumLDr4CxNka1OeixDC9uOGZjB", "c8BnLV9KGCbGJHkN4eSXXrImznfnFd0b", "IX3a2OshrR8CckanHKp7BtIP31Kfs"};
    public int A00;
    public com.facebook.ads.redexgen.core.HB<T> A01;
    public java.io.IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile java.lang.Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1127Wv A09;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{105, 122, 54, 57, 38, 107, 78, 109, 99, 102, 86, 99, 113, 105, 8, 50, 51, 8, 33, 10, 34, 42, 40, 53, 62, 103, 34, 53, 53, 40, 53, 103, 43, 40, 38, 35, 46, 41, 32, 103, 52, 51, 53, 34, 38, 42, 100, 95, 84, 73, 65, 84, 82, 69, 84, 85, 17, 84, 67, 67, 94, 67, 17, 93, 94, 80, 85, 88, 95, 86, 17, 66, 69, 67, 84, 80, 92, 41, 18, 25, 4, 12, 25, 31, 8, 25, 24, 92, 25, 4, 31, 25, 12, 8, 21, 19, 18, 92, 20, 29, 18, 24, 16, 21, 18, 27, 92, 16, 19, 29, 24, 92, 31, 19, 17, 12, 16, 25, 8, 25, 24, 46, 21, 30, 3, 11, 30, 24, 15, 30, 31, 91, 30, 3, 24, 30, 11, 15, 18, 20, 21, 91, 23, 20, 26, 31, 18, 21, 28, 91, 8, 15, 9, 30, 26, 22, 111, 108, 98, 103, 57, okio.Utf8.REPLACEMENT_BYTE, 96, 111, 112, kotlin.io.encoding.Base64.padSymbol};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
                return;
            }
            if (message.what == 4) {
                throw ((java.lang.Error) message.obj);
            }
            A03();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.A04;
            if (this.A07) {
                this.A01.ACQ(this.A05, jElapsedRealtime, j, false);
                return;
            }
            switch (message.what) {
                case 1:
                    this.A01.ACQ(this.A05, jElapsedRealtime, j, false);
                    return;
                case 2:
                    try {
                        this.A01.ACS(this.A05, jElapsedRealtime, j);
                        return;
                    } catch (java.lang.RuntimeException e) {
                        android.util.Log.e(A01(6, 8, 41), A01(77, 44, 87), e);
                        this.A09.A01 = new com.facebook.ads.redexgen.core.HH(e);
                        return;
                    }
                case 3:
                    this.A02 = (java.io.IOException) message.obj;
                    int iACT = this.A01.ACT(this.A05, jElapsedRealtime, j, this.A02);
                    if (iACT == 3) {
                        this.A09.A01 = this.A02;
                        return;
                    } else {
                        if (iACT != 2) {
                            int i = 1;
                            if (iACT != 1) {
                                i = 1 + this.A00;
                            }
                            this.A00 = i;
                            A06(A00());
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HB != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.HD> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public HC(com.facebook.ads.redexgen.core.C1127Wv c1127Wv, android.os.Looper looper, T loadable, com.facebook.ads.redexgen.core.HB<T> hb, int i, long j) {
        super(looper);
        this.A09 = c1127Wv;
        this.A05 = loadable;
        this.A01 = hb;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private long A00() {
        return java.lang.Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A02() {
        this.A02 = null;
        this.A09.A02.execute(this.A09.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A05(int i) throws java.io.IOException {
        if (this.A02 == null || this.A00 <= i) {
        } else {
            throw this.A02;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A06(long j) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A09.A00 == null);
        com.facebook.ads.redexgen.core.C1127Wv c1127Wv = this.A09;
        java.lang.String[] strArr = A0B;
        if (strArr[5].charAt(15) != strArr[6].charAt(15)) {
            throw new java.lang.RuntimeException();
        }
        A0B[1] = "zIFvZ9";
        c1127Wv.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A4W();
            if (this.A06 != null) {
                java.lang.Thread thread = this.A06;
                if (A0B[4].charAt(9) == 'w') {
                    throw new java.lang.RuntimeException();
                }
                A0B[4] = "r4RNyVnork5imI2VujkZnwWbxz1Yztux";
                thread.interrupt();
            }
        }
        if (z) {
            A03();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.A01.ACQ(this.A05, jElapsedRealtime, jElapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.lang.String strA01 = A01(6, 8, 41);
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = java.lang.Thread.currentThread();
                            if (!this.A07) {
                                com.facebook.ads.redexgen.core.IH.A02(A01(156, 10, 40) + this.A05.getClass().getSimpleName() + A01(0, 6, 126));
                                try {
                                    this.A05.A9o();
                                    com.facebook.ads.redexgen.core.IH.A00();
                                } catch (java.lang.Throwable th) {
                                    com.facebook.ads.redexgen.core.IH.A00();
                                    throw th;
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (java.io.IOException e) {
                            if (!this.A08) {
                                obtainMessage(3, e).sendToTarget();
                            }
                        }
                    } catch (java.lang.OutOfMemoryError e2) {
                        android.util.Log.e(strA01, A01(14, 32, 108), e2);
                        if (!this.A08) {
                            obtainMessage(3, new com.facebook.ads.redexgen.core.HH(e2)).sendToTarget();
                        }
                    }
                } catch (java.lang.Exception e3) {
                    android.util.Log.e(strA01, A01(121, 35, 80), e3);
                    if (!this.A08) {
                        obtainMessage(3, new com.facebook.ads.redexgen.core.HH(e3)).sendToTarget();
                    }
                }
            } catch (java.lang.Error e4) {
                android.util.Log.e(strA01, A01(46, 31, 26), e4);
                if (!this.A08) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (java.lang.InterruptedException unused) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A07);
                if (!this.A08) {
                    sendEmptyMessage(2);
                }
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
        }
    }
}
