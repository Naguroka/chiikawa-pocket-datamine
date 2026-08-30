package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0772Iy {
    public static java.lang.String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", com.json.zb.q, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public com.facebook.ads.redexgen.core.EnumC0769Iv A01 = com.facebook.ads.redexgen.core.EnumC0769Iv.A03;
    public com.facebook.ads.redexgen.core.EnumC0770Iw A02 = com.facebook.ads.redexgen.core.EnumC0770Iw.A06;
    public com.facebook.ads.redexgen.core.EnumC0771Ix A03 = com.facebook.ads.redexgen.core.EnumC0771Ix.A02;
    public com.facebook.ads.redexgen.core.EnumC0768Iu A00 = com.facebook.ads.redexgen.core.EnumC0768Iu.A02;

    public final void A00() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC0768Iu.A03;
    }

    public final void A01() {
        this.A02 = com.facebook.ads.redexgen.core.EnumC0770Iw.A04;
    }

    public final void A02() {
        this.A02 = com.facebook.ads.redexgen.core.EnumC0770Iw.A05;
    }

    public final void A03() {
        this.A03 = com.facebook.ads.redexgen.core.EnumC0771Ix.A03;
    }

    public final boolean A04() {
        if (this.A02 != com.facebook.ads.redexgen.core.EnumC0770Iw.A06) {
            com.facebook.ads.redexgen.core.EnumC0770Iw enumC0770Iw = this.A02;
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC0770Iw != com.facebook.ads.redexgen.core.EnumC0770Iw.A02 && this.A02 != com.facebook.ads.redexgen.core.EnumC0770Iw.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == com.facebook.ads.redexgen.core.EnumC0770Iw.A06 || this.A02 == com.facebook.ads.redexgen.core.EnumC0770Iw.A02;
    }

    public final boolean A06() {
        return this.A03 == com.facebook.ads.redexgen.core.EnumC0771Ix.A03;
    }

    public final boolean A07() {
        return this.A00 == com.facebook.ads.redexgen.core.EnumC0768Iu.A03;
    }
}
