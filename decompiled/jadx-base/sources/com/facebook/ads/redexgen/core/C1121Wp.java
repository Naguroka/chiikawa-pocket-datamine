package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1121Wp implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"UrMCnkXccBalFC8HN9WCBLbox3X", "dRv2Z9", "bDdSrUcUzo1kmxfMgj3oH3iXU8Cz", "fEcMQ3SzKJYU9tWNHDoWDVYLkgWB8X3t", "PaXpl3O9a7f217zDSW3nSwn08nRWKu6e", "5K8mm", "Bluxfawih5IcbVckq", "oeBNeOrgZeyvX0HRTMFnCChFZXWKqMG2"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public android.net.Uri A05;
    public android.net.Uri A06;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A07;
    public com.facebook.ads.redexgen.core.HT A08;
    public java.lang.String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A0D;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A0F;
    public final com.facebook.ads.redexgen.core.HP A0G;
    public final com.facebook.ads.redexgen.core.HR A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0M[7].charAt(18) == 'n') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0M;
            strArr[5] = "1vZeu";
            strArr[1] = "9LB3fH";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            int i5 = (bArrCopyOfRange[i4] - i3) - 75;
            java.lang.String[] strArr2 = A0M;
            if (strArr2[5].length() == strArr2[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0M[2] = "cFY8xftPDAVu85oO173navidMiHt";
            bArrCopyOfRange[i4] = (byte) i5;
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{-51, -52, -95, -65, -63, -58, -61, -62, -96, -41, -46, -61, -47, -80, -61, -65, -62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        try {
            this.A09 = com.facebook.ads.redexgen.core.HV.A02(h3);
            this.A06 = h3.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = h3.A00;
            this.A03 = h3.A03;
            this.A0B = A00(h3) != -1;
            boolean z = this.A0B;
            if (h3.A02 != -1 || this.A0B) {
                this.A01 = h3.A02;
            } else {
                this.A01 = this.A0G.A6u(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= h3.A03;
                    if (this.A01 <= 0) {
                        throw new com.facebook.ads.redexgen.core.H0(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (java.io.IOException e) {
            A07(e);
            throw e;
        }
    }

    static {
        A06();
    }

    public C1121Wp(com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz2, com.facebook.ads.redexgen.core.InterfaceC0722Gx interfaceC0722Gx, int i, com.facebook.ads.redexgen.core.HR hr) {
        this.A0G = hp;
        this.A0D = interfaceC0724Gz2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0724Gz;
        if (interfaceC0722Gx != null) {
            this.A0E = new com.facebook.ads.redexgen.core.C1124Ws(interfaceC0724Gz, interfaceC0722Gx);
        } else {
            this.A0E = null;
        }
        this.A0H = hr;
    }

    private int A00(com.facebook.ads.redexgen.core.H3 h3) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && h3.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static android.net.Uri A01(com.facebook.ads.redexgen.core.HP hp, java.lang.String str, android.net.Uri uri) {
        com.facebook.ads.redexgen.core.HZ contentMetadata = hp.A6v(str);
        android.net.Uri uriA01 = com.facebook.ads.redexgen.core.AbstractC0725Ha.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    private void A03() throws java.io.IOException {
        if (this.A07 == null) {
            return;
        }
        try {
            this.A07.close();
            this.A07 = null;
            if (A0M[0].length() == 24) {
                throw new java.lang.RuntimeException();
            }
            A0M[6] = "QoSQ";
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
        } catch (java.lang.Throwable th) {
            this.A07 = null;
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6d();
            throw new java.lang.NullPointerException(A02(0, 17, 19));
        }
    }

    private void A05() throws java.io.IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AGN(this.A09, this.A03);
        }
    }

    private void A07(java.io.IOException iOException) {
        if (A0A() || (iOException instanceof com.facebook.ads.redexgen.core.HN)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z) throws java.io.IOException {
        com.facebook.ads.redexgen.core.HT htAGw;
        long jMin;
        com.facebook.ads.redexgen.core.H3 h3;
        com.facebook.ads.redexgen.core.InterfaceC0724Gz nextDataSource;
        long j;
        if (this.A0B) {
            htAGw = null;
        } else if (this.A0I) {
            try {
                htAGw = this.A0G.AGw(this.A09, this.A03);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.InterruptedIOException();
            }
        } else {
            htAGw = this.A0G.AGx(this.A09, this.A03);
        }
        if (htAGw == null) {
            nextDataSource = this.A0F;
            h3 = new com.facebook.ads.redexgen.core.H3(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (htAGw.A05) {
            android.net.Uri uriFromFile = android.net.Uri.fromFile(htAGw.A03);
            long j2 = this.A03 - htAGw.A02;
            long jMin2 = htAGw.A01 - j2;
            if (this.A01 != -1) {
                jMin2 = java.lang.Math.min(jMin2, this.A01);
            }
            h3 = new com.facebook.ads.redexgen.core.H3(uriFromFile, this.A03, j2, jMin2, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (htAGw.A02()) {
                jMin = this.A01;
            } else {
                jMin = htAGw.A01;
                if (this.A01 != -1) {
                    long length = this.A01;
                    jMin = java.lang.Math.min(jMin, length);
                }
            }
            h3 = new com.facebook.ads.redexgen.core.H3(this.A06, this.A03, jMin, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AF2(htAGw);
                htAGw = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            long j3 = this.A03;
            if (A0M[6].length() != 12) {
                A0M[6] = "p5EQIcrIdk611KGKEjqGxcWasTL";
                j = j3 + 102400;
            }
            throw new java.lang.RuntimeException();
        }
        j = Long.MAX_VALUE;
        this.A02 = j;
        if (z) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (java.lang.Throwable th) {
                if (htAGw.A01()) {
                    this.A0G.AF2(htAGw);
                }
                throw th;
            }
        }
        if (htAGw != null && htAGw.A01()) {
            this.A08 = htAGw;
        }
        this.A07 = nextDataSource;
        this.A0A = h3.A02 == -1;
        long jAEE = nextDataSource.AEE(h3);
        com.facebook.ads.redexgen.core.C0726Hb mutations = new com.facebook.ads.redexgen.core.C0726Hb();
        if (this.A0A && jAEE != -1) {
            this.A01 = jAEE;
            long length2 = this.A03;
            if (A0M[2].length() == 28) {
                java.lang.String[] strArr = A0M;
                strArr[3] = "FVh5FgWCovtJ16SB4dV0NFQsQCOStobl";
                strArr[4] = "W34lmKPADTxVjAICliDlMevzRY7gU29F";
                com.facebook.ads.redexgen.core.AbstractC0725Ha.A05(mutations, length2 + this.A01);
            }
            throw new java.lang.RuntimeException();
        }
        if (A0B()) {
            this.A05 = this.A07.A8c();
            if (true ^ this.A06.equals(this.A05)) {
                com.facebook.ads.redexgen.core.AbstractC0725Ha.A06(mutations, this.A05);
            } else {
                com.facebook.ads.redexgen.core.AbstractC0725Ha.A04(mutations);
            }
        }
        boolean isRedirected = A0C();
        if (isRedirected) {
            this.A0G.A3w(this.A09, mutations);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(java.io.IOException iOException) {
        for (java.lang.Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof com.facebook.ads.redexgen.core.H0) && ((com.facebook.ads.redexgen.core.H0) cause).A00 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (java.io.IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int i3 = this.A07.read(bArr, i, i2);
            if (i3 != -1) {
                if (A0A()) {
                    this.A04 += (long) i3;
                }
                this.A03 += (long) i3;
                if (this.A01 != -1) {
                    this.A01 -= (long) i3;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return i3;
        } catch (java.io.IOException e) {
            if (this.A0A) {
                boolean zA0D = A0D(e);
                java.lang.String[] strArr = A0M;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0M[6] = "d45piyjFs6M";
                if (zA0D) {
                    A05();
                    return -1;
                }
            }
            A07(e);
            throw e;
        }
    }
}
