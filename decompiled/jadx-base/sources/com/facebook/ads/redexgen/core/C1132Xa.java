package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1132Xa implements com.facebook.ads.redexgen.core.FG {
    public static java.lang.String[] A03 = {"7b9fG", "b9JIza1iq", "K3VyjjUa81gB6cgwVU2jHXka9iZh", "EoGoOIpCr4mqUndNE", "5ZgFW0YOcFC7K3cyyILWpbh9L", "dXF9qRoKmMpqtq30wkkPlo0zhDUieZVy", "IPOptFHjiBpY8aBdK", "n7dlWK9OIMHRWWLbwG0IyBG9Jd4f"};
    public boolean A00;
    public final com.facebook.ads.redexgen.core.FG A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.E5 A02;

    public C1132Xa(com.facebook.ads.redexgen.core.E5 e5, com.facebook.ads.redexgen.core.FG fg) {
        this.A02 = e5;
        this.A01 = fg;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final boolean A9b() {
        return !this.A02.A03() && this.A01.A9b();
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final void AAm() throws java.io.IOException {
        this.A01.AAm();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x003a, please report this as an issue */
    @Override // com.facebook.ads.redexgen.core.FG
    public final int AEn(com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z) {
        long j;
        int encoderPadding;
        int i;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            c1177Yw.A02(4);
            return -4;
        }
        int iAEn = this.A01.AEn(c05569u, c1177Yw, z);
        if (iAEn != -5) {
            if (this.A02.A00 != Long.MIN_VALUE && ((iAEn == -4 && c1177Yw.A00 >= this.A02.A00) || (iAEn == -3 && this.A02.A6b() == Long.MIN_VALUE))) {
                c1177Yw.A07();
                c1177Yw.A02(4);
                this.A00 = true;
                return -4;
            }
            return iAEn;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.Format format = c05569u.A00;
        int result = format.A06;
        if (result == 0) {
            int result2 = format.A07;
            if (result2 != 0) {
                j = this.A02.A01;
                if (A03[3].length() != 9) {
                    A03[4] = "RuISqhHF0zDEDt2bjOodlrYJm";
                    if (j != 0) {
                        encoderPadding = 0;
                    } else {
                        encoderPadding = format.A06;
                    }
                    i = this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0;
                    if (A03[4].length() != 25) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A03;
                    strArr[0] = "xUEww";
                    strArr[1] = "zgsWRTHUk";
                    c05569u.A00 = format.A0G(encoderPadding, i);
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
        } else {
            j = this.A02.A01;
            if (A03[3].length() != 9) {
                A03[4] = "RuISqhHF0zDEDt2bjOodlrYJm";
                if (j != 0) {
                    encoderPadding = 0;
                } else {
                    encoderPadding = format.A06;
                }
                if (this.A02.A00 == Long.MIN_VALUE) {
                }
                if (A03[4].length() != 25) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A03;
                strArr2[0] = "xUEww";
                strArr2[1] = "zgsWRTHUk";
                c05569u.A00 = format.A0G(encoderPadding, i);
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        return -5;
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final int AGp(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AGp(j);
    }
}
