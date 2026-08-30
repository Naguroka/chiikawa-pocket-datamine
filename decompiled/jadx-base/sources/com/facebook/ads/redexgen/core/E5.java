package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E5 implements com.facebook.ads.redexgen.core.XU, com.facebook.ads.redexgen.core.XV {
    public static java.lang.String[] A06 = {"FKxkeTyNcELruURTBl6lcHzQkOtglqVi", "5VUPZyR", "h4QAdQ2k4bq5I5kw9k507iFMyPiUKBqg", "ACG7if3eIl7svvFGCbIXgylPM5X6", "MMEOde", "Ne8Swyj20Utm40D", "fzp5cmA7a9jEIH2cS1qn9VNYlxJ5WcKE", "e38WKWMIi9RGh5e82fLDO75VNnvmj40O"};
    public long A00;
    public long A01;
    public long A02;
    public com.facebook.ads.redexgen.core.XV A03;
    public com.facebook.ads.redexgen.core.C1132Xa[] A04 = new com.facebook.ads.redexgen.core.C1132Xa[0];
    public final com.facebook.ads.redexgen.core.XU A05;

    public E5(com.facebook.ads.redexgen.core.XU xu, boolean z, long j, long j2) {
        this.A05 = xu;
        this.A02 = z ? j : androidx.media3.common.C.TIME_UNSET;
        this.A01 = j;
        this.A00 = j2;
    }

    private com.facebook.ads.redexgen.core.AI A00(long j, com.facebook.ads.redexgen.core.AI ai) {
        long toleranceBeforeUs = com.facebook.ads.redexgen.core.IK.A0E(ai.A01, 0L, j - this.A01);
        long j2 = ai.A00;
        long j3 = this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j;
        if (A06[6].length() != 32) {
            throw new java.lang.RuntimeException();
        }
        A06[7] = "39x0yJkTHKofHHETezutF7bVoixqTCZQ";
        long jA0E = com.facebook.ads.redexgen.core.IK.A0E(j2, 0L, j3);
        if (toleranceBeforeUs == ai.A01 && jA0E == ai.A00) {
            return ai;
        }
        return new com.facebook.ads.redexgen.core.AI(toleranceBeforeUs, jA0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FH
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ABd(com.facebook.ads.redexgen.core.XU xu) {
        this.A03.ABd(this);
    }

    public static boolean A02(long j, com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr) {
        if (j != 0) {
            for (com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl : interfaceC0710GlArr) {
                if (interfaceC0710Gl != null && !com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(interfaceC0710Gl.A8I().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final boolean A4p(long j) {
        return this.A05.A4p(j);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void A5W(long j, boolean z) {
        this.A05.A5W(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A6L(long j, com.facebook.ads.redexgen.core.AI ai) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6L(j, A00(j, ai));
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A6b() {
        long jA6b = this.A05.A6b();
        if (jA6b != Long.MIN_VALUE) {
            long bufferedPositionUs = this.A00;
            if (A06[2].charAt(4) == 'm') {
                throw new java.lang.RuntimeException();
            }
            A06[2] = "v7PeKUnzeGhoG0IESTdo7BlOEWICkZOG";
            if (bufferedPositionUs == Long.MIN_VALUE || jA6b < this.A00) {
                return jA6b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A7s() {
        long jA7s = this.A05.A7s();
        if (jA7s == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA7s >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA7s;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A8Z() {
        return this.A05.A8Z();
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AAn() throws java.io.IOException {
        this.A05.AAn();
    }

    @Override // com.facebook.ads.redexgen.core.XV
    public final void ADC(com.facebook.ads.redexgen.core.XU xu) {
        this.A03.ADC(this);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AEX(com.facebook.ads.redexgen.core.XV xv, long j) {
        this.A03 = xv;
        this.A05.AEX(this, j);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long AEo() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = androidx.media3.common.C.TIME_UNSET;
            long initialDiscontinuityUs = AEo();
            return initialDiscontinuityUs != androidx.media3.common.C.TIME_UNSET ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long jAEo = this.A05.AEo();
        if (jAEo == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(jAEo >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jAEo > this.A00) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z);
        return jAEo;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AEu(long j) {
        this.A05.AEu(j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // com.facebook.ads.redexgen.core.XU
    public final long AGB(long j) {
        this.A02 = androidx.media3.common.C.TIME_UNSET;
        boolean z = false;
        for (com.facebook.ads.redexgen.core.C1132Xa c1132Xa : this.A04) {
            if (c1132Xa != null) {
                c1132Xa.A00();
            }
        }
        long jAGB = this.A05.AGB(j);
        if (jAGB != j) {
            long seekUs = this.A01;
            if (A06[1].length() == 28) {
                throw new java.lang.RuntimeException();
            }
            A06[1] = "IA7KJv";
            if (jAGB >= seekUs && (this.A00 == Long.MIN_VALUE || jAGB <= this.A00)) {
                z = true;
            }
        } else {
            z = true;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z);
        return jAGB;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1 A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.XU
    public final long AGC(com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr, boolean[] zArr, com.facebook.ads.redexgen.core.FG[] fgArr, boolean[] zArr2, long j) {
        long j2;
        com.facebook.ads.redexgen.core.C1132Xa c1132Xa;
        java.lang.String[] strArr;
        this.A04 = new com.facebook.ads.redexgen.core.C1132Xa[fgArr.length];
        com.facebook.ads.redexgen.core.FG[] fgArr2 = new com.facebook.ads.redexgen.core.FG[fgArr.length];
        int i = 0;
        while (true) {
            com.facebook.ads.redexgen.core.FG fg = null;
            if (i >= fgArr.length) {
                break;
            }
            this.A04[i] = (com.facebook.ads.redexgen.core.C1132Xa) fgArr[i];
            com.facebook.ads.redexgen.core.FG[] childStreams = this.A04;
            if (childStreams[i] != null) {
                fg = this.A04[i].A01;
            }
            fgArr2[i] = fg;
            i++;
        }
        com.facebook.ads.redexgen.core.XU xu = this.A05;
        if (A06[4].length() != 6) {
            throw new java.lang.RuntimeException();
        }
        A06[6] = "OTl9eV95pfASS0X2SBfNi6LofBhZAJkF";
        long jAGC = xu.AGC(interfaceC0710GlArr, zArr, fgArr2, zArr2, j);
        if (A03() && j == this.A01 && A02(this.A01, interfaceC0710GlArr)) {
            j2 = jAGC;
        } else {
            j2 = androidx.media3.common.C.TIME_UNSET;
        }
        this.A02 = j2;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(jAGC == j || (jAGC >= this.A01 && (this.A00 == Long.MIN_VALUE || jAGC <= this.A00)));
        int i2 = 0;
        while (true) {
            int length = fgArr.length;
            if (A06[6].length() != 32) {
                A06[1] = "kmvZDHTk06t1d";
                if (i2 >= length) {
                    break;
                }
                if (fgArr2[i2] == null) {
                    com.facebook.ads.redexgen.core.FG[] childStreams2 = this.A04;
                    childStreams2[i2] = null;
                } else if (fgArr[i2] != null) {
                    c1132Xa = this.A04[i2];
                    strArr = A06;
                    if (strArr[5].length() != strArr[3].length()) {
                        A06[4] = "coIUYK";
                        if (c1132Xa.A01 != fgArr2[i2]) {
                            this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                        }
                    } else {
                        java.lang.String[] strArr2 = A06;
                        strArr2[5] = "umLIfS6Hl5hNB2Z";
                        strArr2[3] = "muELT5JxW7sQH6jin7b7yhtBjbIz";
                        if (c1132Xa.A01 != fgArr2[i2]) {
                            this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                        }
                    }
                } else {
                    this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                }
                com.facebook.ads.redexgen.core.FG[] childStreams3 = this.A04;
                fgArr[i2] = childStreams3[i2];
                i2++;
            } else {
                A06[7] = "P7hx2UqbN1pJuRwLHU4MB7ovE67CehaW";
                if (i2 >= length) {
                    break;
                }
                if (fgArr2[i2] == null) {
                    com.facebook.ads.redexgen.core.FG[] childStreams4 = this.A04;
                    childStreams4[i2] = null;
                } else if (fgArr[i2] != null) {
                    c1132Xa = this.A04[i2];
                    strArr = A06;
                    if (strArr[5].length() != strArr[3].length()) {
                        A06[4] = "coIUYK";
                        if (c1132Xa.A01 != fgArr2[i2]) {
                            this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                        }
                    } else {
                        java.lang.String[] strArr3 = A06;
                        strArr3[5] = "umLIfS6Hl5hNB2Z";
                        strArr3[3] = "muELT5JxW7sQH6jin7b7yhtBjbIz";
                        if (c1132Xa.A01 != fgArr2[i2]) {
                            this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                        }
                    }
                } else {
                    this.A04[i2] = new com.facebook.ads.redexgen.core.C1132Xa(this, fgArr2[i2]);
                }
                com.facebook.ads.redexgen.core.FG[] childStreams5 = this.A04;
                fgArr[i2] = childStreams5[i2];
                i2++;
            }
        }
        return jAGC;
    }
}
