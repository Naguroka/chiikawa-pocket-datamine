package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0679Fc extends com.facebook.ads.redexgen.core.AbstractC1310bi {
    public static java.lang.String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public com.facebook.ads.redexgen.core.C1300bY A00;
    public final com.facebook.ads.redexgen.core.C1290bO A01;

    public C0679Fc(com.facebook.ads.redexgen.core.C1290bO c1290bO, java.lang.String str) {
        super(c1290bO.A0B, str, A00(c1290bO));
        this.A01 = c1290bO;
    }

    public static com.facebook.ads.redexgen.core.C1289bN A00(com.facebook.ads.redexgen.core.C1290bO c1290bO) {
        return new com.facebook.ads.redexgen.core.C1289bN(c1290bO);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1310bi
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5S();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(com.facebook.ads.redexgen.core.EnumC03681z.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1310bi
    public final void A09() {
        this.A00 = new com.facebook.ads.redexgen.core.C1300bY(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A0D(com.facebook.ads.Ad ad, java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A02(ad);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z;
        if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A07(this.A02) && com.facebook.ads.redexgen.core.AbstractC0764Ip.A09(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(com.facebook.ads.RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(2003, com.facebook.ads.redexgen.core.C2K.A00(new android.os.Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && com.facebook.ads.redexgen.core.C0841Lu.A00() > this.A01.A01;
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6J() == com.facebook.ads.redexgen.core.EnumC03681z.A05;
    }

    public final boolean A0H(com.facebook.ads.Ad ad, com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((com.facebook.ads.redexgen.core.AnonymousClass61) rewardedVideoShowAdConfig).A00();
        long jA01 = ((com.facebook.ads.redexgen.core.AnonymousClass61) rewardedVideoShowAdConfig).A01();
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A02(ad);
        java.lang.String[] strArr = A02;
        java.lang.String str = strArr[7];
        java.lang.String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(iA00);
                return true;
            }
            com.facebook.ads.redexgen.core.C1300bY c1300bY = this.A00;
            java.lang.String[] strArr3 = A02;
            java.lang.String str3 = strArr3[2];
            java.lang.String str4 = strArr3[1];
            int iCharAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (iCharAt != appOrientation2) {
                java.lang.String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c1300bY != null) {
                    return this.A00.A0M(iA00, jA01);
                }
                this.A00 = new com.facebook.ads.redexgen.core.C1300bY(this.A01, this, A04());
                this.A00.A0M(iA00, jA01);
                return false;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
