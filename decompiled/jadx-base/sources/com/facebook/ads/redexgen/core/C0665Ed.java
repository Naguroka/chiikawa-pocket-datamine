package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0665Ed implements com.facebook.ads.redexgen.core.ZB {
    public static byte[] A0M;
    public static java.lang.String[] A0N = {"w8VAAYxajCwIoAYYjD3lLavMTkUOaMKn", "LsuplI2AFLx33t6glLoweUUwBxsDM6eJ", "n5ZpgNe8kAkQTw0twR8R0sU4HpYvcw33", "rwAXW1DnXASIJgDkZIisH2bihwrxiuKR", "nh92Wxhsr0aH2lO7Xy4xTBv2WwV0hwN3", "", "RFoFjGknfB0i2", "f5Io1mcG5jEJO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C05449h A05;
    public com.facebook.ads.redexgen.core.A1 A06;
    public com.facebook.ads.redexgen.core.A2 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final android.os.Handler A0C;
    public final android.os.Handler A0D;
    public final com.facebook.ads.redexgen.core.C0664Ec A0E;
    public final com.facebook.ads.redexgen.core.AK A0F;
    public final com.facebook.ads.redexgen.core.AL A0G;
    public final com.facebook.ads.redexgen.core.AbstractC0713Go A0H;
    public final com.facebook.ads.redexgen.core.C0714Gp A0I;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C05489l> A0J;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.A5> A0K;
    public final com.facebook.ads.redexgen.core.ZA[] A0L;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{-35, 24, -48, 3, -6, -37, -9, -20, 4, -16, -3, -44, -8, -5, -9, 37, 88, 79, 48, 76, 65, 89, 69, 82, 44, 73, 66, 15, 18, 14, 24, 14, 20, 4, 41, 36, 47, -37, -64, -45, -38, -45, -49, -31, -45, -114, 14, -35, -96, -37, 34, 20, 20, 26, 3, 30, -49, 24, 22, 29, 30, 33, 20, 19, -49, 17, 20, 18, 16, 36, 34, 20, -49, 16, 29, -49, 16, 19, -49, 24, 34, -49, 31, 27, 16, 40, 24, 29, 22};
    }

    static {
        A03();
    }

    public C0665Ed(com.facebook.ads.redexgen.core.ZA[] zaArr, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        android.util.Log.i(A02(2, 13, 30), A02(33, 5, 78) + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + A02(0, 2, 80) + A02(15, 18, 115) + A02(47, 3, 19) + com.facebook.ads.redexgen.core.IK.A04 + A02(46, 1, 68));
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(zaArr.length > 0);
        this.A0L = (com.facebook.ads.redexgen.core.ZA[]) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(zaArr);
        this.A0H = (com.facebook.ads.redexgen.core.AbstractC0713Go) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(abstractC0713Go);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0I = new com.facebook.ads.redexgen.core.C0714Gp(new com.facebook.ads.redexgen.core.AG[zaArr.length], new com.facebook.ads.redexgen.core.InterfaceC0710Gl[zaArr.length], null);
        this.A0G = new com.facebook.ads.redexgen.core.AL();
        this.A0F = new com.facebook.ads.redexgen.core.AK();
        this.A07 = com.facebook.ads.redexgen.core.A2.A05;
        final android.os.Looper looperMyLooper = android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper();
        this.A0C = new android.os.Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.9k
            @Override // android.os.Handler
            public final void handleMessage(android.os.Message msg) throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return;
                }
                try {
                    this.A00.A0A(msg);
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                }
            }
        };
        this.A06 = new com.facebook.ads.redexgen.core.A1(com.facebook.ads.redexgen.core.AM.A01, 0L, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.A04, this.A0I);
        this.A0J = new java.util.ArrayDeque<>();
        this.A0E = new com.facebook.ads.redexgen.core.C0664Ec(zaArr, abstractC0713Go, this.A0I, interfaceC05589w, this.A0A, this.A03, this.A0B, this.A0C, this, interfaceC0733Hi);
        this.A0D = new android.os.Handler(this.A0E.A0w());
    }

    private long A00(long j) {
        long jA01 = com.facebook.ads.redexgen.core.AbstractC05389b.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private com.facebook.ads.redexgen.core.A1 A01(boolean z, boolean z2, int i) {
        com.facebook.ads.redexgen.core.C0714Gp c0714Gp;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A74();
            this.A00 = A07();
            this.A04 = A71();
        }
        com.facebook.ads.redexgen.core.AM am = z2 ? com.facebook.ads.redexgen.core.AM.A01 : this.A06.A03;
        java.lang.Object obj = z2 ? null : this.A06.A07;
        com.facebook.ads.redexgen.core.Et et = this.A06.A04;
        long j = this.A06.A02;
        long j2 = this.A06.A01;
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray = z2 ? com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.A04 : this.A06.A05;
        if (z2) {
            c0714Gp = this.A0I;
        } else {
            c0714Gp = this.A06.A06;
        }
        return new com.facebook.ads.redexgen.core.A1(am, obj, et, j, j2, i, false, trackGroupArray, c0714Gp);
    }

    private void A04(com.facebook.ads.redexgen.core.A1 a1, int i, boolean z, int i2) {
        int i3;
        com.facebook.ads.redexgen.core.A1 a1A04 = a1;
        this.A02 -= i;
        if (this.A02 == 0) {
            if (a1A04.A02 == androidx.media3.common.C.TIME_UNSET) {
                a1A04 = a1A04.A04(a1A04.A04, 0L, a1A04.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && a1A04.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                if (A0N[2].charAt(11) == 'f') {
                    throw new java.lang.RuntimeException();
                }
                A0N[2] = "I0z9XBogSeP4xaPMoEVv8Y3CsXKu0t6N";
                this.A04 = 0L;
            }
            if (this.A08) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(a1A04, z, i2, i3, z2, false);
        }
    }

    private void A05(final com.facebook.ads.redexgen.core.A1 a1, final boolean z, final int i, final int i2, final boolean z2, final boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        java.util.ArrayDeque<com.facebook.ads.redexgen.core.C05489l> arrayDeque = this.A0J;
        final com.facebook.ads.redexgen.core.A1 a2 = this.A06;
        final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.A5> copyOnWriteArraySet = this.A0K;
        final com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go = this.A0H;
        final boolean z5 = this.A0A;
        arrayDeque.addLast((com.facebook.ads.redexgen.core.C05489l) new java.lang.Object(a1, a2, copyOnWriteArraySet, abstractC0713Go, z, i, i2, z2, z5, z3) { // from class: com.facebook.ads.redexgen.X.9l
            public static java.lang.String[] A0C = {"KYzLQiBmn0FiQRjPmzMoZyTMXJUCYazH", "8ZWwkBEIP5GpfkYlq", "GsiX37b8ObJA1d3iwpzM", "DZldgTYE3duYcDTffrrsish34ss3C", "owziJE4ETQEY5DqdH7kHnL5e4jEZYH", "elngO9mL6FpjJEe4il6taIIRZ5n02WzG", "vc3a7vRG", "Ibw5ifPZZc9LdA"};
            public final int A00;
            public final int A01;
            public final com.facebook.ads.redexgen.core.A1 A02;
            public final com.facebook.ads.redexgen.core.AbstractC0713Go A03;
            public final java.util.Set<com.facebook.ads.redexgen.core.A5> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = a1;
                this.A04 = copyOnWriteArraySet;
                this.A03 = abstractC0713Go;
                this.A08 = z;
                this.A00 = i;
                this.A01 = i2;
                this.A09 = z2;
                this.A06 = z5;
                this.A07 = z3 || a2.A00 != a1.A00;
                this.A0A = (a2.A03 == a1.A03 && a2.A07 == a1.A07) ? false : true;
                this.A05 = a2.A08 != a1.A08;
                this.A0B = a2.A06 != a1.A06;
            }

            public final void A00() {
                java.util.Iterator<com.facebook.ads.redexgen.core.A5> it;
                if (this.A0A || this.A01 == 0) {
                    java.util.Iterator<com.facebook.ads.redexgen.core.A5> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().ADm(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (com.facebook.ads.redexgen.core.A5 listener : this.A04) {
                        listener.ADA(this.A00);
                    }
                }
                boolean z6 = this.A0B;
                if (A0C[0].charAt(4) == 'F') {
                    throw new java.lang.RuntimeException();
                }
                A0C[0] = "NSO1YjE0K80ooc4jlLY2PvdGV0yqHKRo";
                if (z6) {
                    this.A03.A0U(this.A02.A06.A02);
                    java.util.Set<com.facebook.ads.redexgen.core.A5> set = this.A04;
                    java.lang.String[] strArr = A0C;
                    if (strArr[1].length() != strArr[2].length()) {
                        A0C[0] = "IX8AzuZF3sh97knAPev8KtZkbQXBOL0k";
                        it = set.iterator();
                    } else {
                        java.lang.String[] strArr2 = A0C;
                        strArr2[7] = "IystOXtUMajZr4";
                        strArr2[6] = "BmaC5zCJ";
                        it = set.iterator();
                    }
                    while (it.hasNext()) {
                        it.next().ADp(this.A02.A05, this.A02.A06.A01);
                    }
                }
                if (this.A05) {
                    for (com.facebook.ads.redexgen.core.A5 listener2 : this.A04) {
                        listener2.ACY(this.A02.A08);
                    }
                }
                if (this.A07) {
                    java.util.Iterator<com.facebook.ads.redexgen.core.A5> it3 = this.A04.iterator();
                    while (it3.hasNext()) {
                        it3.next().AD8(this.A06, this.A02.A00);
                    }
                }
                boolean z7 = this.A09;
                if (A0C[5].charAt(19) == 't') {
                    java.lang.String[] strArr3 = A0C;
                    strArr3[3] = "rZ5iCKv2iyJCL3c8gXhMhKHhXlzWd";
                    strArr3[4] = "JkBTkyzl6HurESuXa9ju20RiiMzRa3";
                    if (!z7) {
                        return;
                    }
                } else if (!z7) {
                    return;
                }
                java.util.Iterator<com.facebook.ads.redexgen.core.A5> it4 = this.A04.iterator();
                while (it4.hasNext()) {
                    it4.next().ADX();
                }
            }
        });
        this.A06 = a1;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, androidx.media3.common.C.TIME_UNSET);
    }

    public final void A09(int i, long j) {
        long jA00;
        com.facebook.ads.redexgen.core.AM am = this.A06.A03;
        if (i < 0 || (!am.A0E() && i >= am.A01())) {
            throw new com.facebook.ads.redexgen.core.C05579v(am, i, j);
        }
        this.A09 = true;
        this.A02++;
        if (A0B()) {
            android.util.Log.w(A02(2, 13, 30), A02(50, 39, 66));
            this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
            return;
        }
        this.A01 = i;
        if (am.A0E()) {
            this.A04 = j == androidx.media3.common.C.TIME_UNSET ? 0L : j;
            this.A00 = 0;
        } else {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                jA00 = am.A0B(i, this.A0G).A01();
            } else {
                jA00 = com.facebook.ads.redexgen.core.AbstractC05389b.A00(j);
            }
            android.util.Pair<java.lang.Integer, java.lang.Long> pairA07 = am.A07(this.A0G, this.A0F, i, jA00);
            this.A04 = com.facebook.ads.redexgen.core.AbstractC05389b.A01(jA00);
            this.A00 = ((java.lang.Integer) pairA07.first).intValue();
        }
        this.A0E.A0y(am, i, com.facebook.ads.redexgen.core.AbstractC05389b.A00(j));
        java.util.Iterator<com.facebook.ads.redexgen.core.A5> it = this.A0K.iterator();
        while (it.hasNext()) {
            it.next().ADA(1);
        }
    }

    public final void A0A(android.os.Message message) {
        switch (message.what) {
            case 0:
                A04((com.facebook.ads.redexgen.core.A1) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                com.facebook.ads.redexgen.core.A2 a2 = (com.facebook.ads.redexgen.core.A2) message.obj;
                com.facebook.ads.redexgen.core.A2 playbackParameters = this.A07;
                if (!playbackParameters.equals(a2)) {
                    this.A07 = a2;
                    for (com.facebook.ads.redexgen.core.A5 a5 : this.A0K) {
                        java.lang.String[] strArr = A0N;
                        if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0N;
                        strArr2[1] = "Rx35SoFeg5J49OemA5SmkfILnHIw2zPV";
                        strArr2[4] = "AOCcqe8qUBOiNNfFwZNpwcN90njeUUle";
                        a5.AD4(a2);
                    }
                    return;
                }
                return;
            case 2:
                com.facebook.ads.redexgen.core.C05449h c05449h = (com.facebook.ads.redexgen.core.C05449h) message.obj;
                this.A05 = c05449h;
                java.util.Iterator<com.facebook.ads.redexgen.core.A5> it = this.A0K.iterator();
                while (it.hasNext()) {
                    it.next().AD6(c05449h);
                }
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void A3m(com.facebook.ads.redexgen.core.A5 a5) {
        this.A0K.add(a5);
    }

    @Override // com.facebook.ads.redexgen.core.ZB
    public final com.facebook.ads.redexgen.core.AD A51(com.facebook.ads.redexgen.core.AC ac) {
        return new com.facebook.ads.redexgen.core.AD(this.A0E, ac, this.A06.A03, A74(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6Z() {
        long jA6a = A6a();
        long jA7E = A7E();
        if (jA6a == androidx.media3.common.C.TIME_UNSET || jA7E == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (jA7E == 0) {
            return 100;
        }
        return com.facebook.ads.redexgen.core.IK.A06((int) ((100 * jA6a) / jA7E), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A6a() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A6w() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + com.facebook.ads.redexgen.core.AbstractC05389b.A01(this.A06.A01);
        }
        return A71();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6y() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6z() {
        if (!A0B()) {
            return -1;
        }
        com.facebook.ads.redexgen.core.Et et = this.A06.A04;
        java.lang.String[] strArr = A0N;
        if (strArr[1].charAt(26) == strArr[4].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0N;
        strArr2[6] = "CcD4McdZf45PB";
        strArr2[7] = "2ShBxbZH9Pfqw";
        return et.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A71() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final com.facebook.ads.redexgen.core.AM A73() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A74() {
        if (A06()) {
            int i = this.A01;
            java.lang.String[] strArr = A0N;
            if (strArr[1].charAt(26) == strArr[4].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            A0N[5] = "";
            return i;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A7E() {
        com.facebook.ads.redexgen.core.AM am = this.A06.A03;
        if (am.A0E()) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (A0B()) {
            com.facebook.ads.redexgen.core.Et et = this.A06.A04;
            am.A09(et.A02, this.A0F);
            return com.facebook.ads.redexgen.core.AbstractC05389b.A01(this.A0F.A0A(et.A00, et.A01));
        }
        return am.A0B(A74(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final boolean A84() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.ZB
    public final void AEY(com.facebook.ads.redexgen.core.Ev ev, boolean z, boolean z2) {
        this.A05 = null;
        com.facebook.ads.redexgen.core.A1 a1A01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(ev, z, z2);
        A05(a1A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AEy() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A02(38, 8, 1)).append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this))).append(A02(0, 2, 80)).append(A02(15, 18, 115));
        java.lang.String strA02 = A02(47, 3, 19);
        android.util.Log.i(A02(2, 13, 30), sbAppend.append(strA02).append(com.facebook.ads.redexgen.core.IK.A04).append(strA02).append(com.facebook.ads.redexgen.core.C05549r.A00()).append(A02(46, 1, 68)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AG9(long j) {
        A09(A74(), j);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AGA() {
        A08(A74());
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AGZ(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AH2(boolean z) {
        if (z) {
            this.A05 = null;
        }
        com.facebook.ads.redexgen.core.A1 a1A01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(a1A01, false, 4, 1, false, false);
    }
}
