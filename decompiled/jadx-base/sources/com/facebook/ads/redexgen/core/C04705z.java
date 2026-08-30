package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04705z implements com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final com.facebook.ads.Ad A00;
    public final com.facebook.ads.redexgen.core.C1290bO A01;
    public final com.facebook.ads.redexgen.core.C0679Fc A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 124, 121, 122, 45, 122, 123, 28, 22, 30, 25, 76, 73, 73, 75, 101, 102, 48, 53, 96, 103, 55, 102, 94, 121, 99, 114, 101, 121, 118, 123, 55, 114, 101, 101, 120, 101, 57, 29, 47, 24, 10, 28, 15, 25, 24, 25, 93, 11, 20, 25, 24, 18, 93, 28, 25, 93, 25, 24, 14, 9, 15, 18, 4, 24, 25, 105, 94, 76, 90, 73, 95, 94, 95, 27, 77, 82, 95, 94, 84, 27, 90, 95, 27, 87, 84, 90, 95, 27, 73, 94, 74, 78, 94, 72, 79, 94, 95, 59, 12, 30, 8, 27, 13, 12, 13, 73, 31, 0, 13, 12, 6, 73, 8, 13, 73, 26, 1, 6, 30, 73, 10, 8, 5, 5, 12, 13, 16, 64, 22, 16, 71, 22, 68, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, 22, 13, 10, 18};
    }

    static {
        A01();
    }

    public C04705z(android.content.Context context, java.lang.String str, com.facebook.ads.Ad ad) {
        this.A00 = ad;
        java.lang.String string = java.util.UUID.randomUUID().toString();
        this.A03 = com.facebook.ads.redexgen.core.C04465b.A07(context, string);
        com.facebook.ads.redexgen.core.C0S c0sA0E = this.A03.A0E();
        java.lang.String adId = com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString();
        c0sA0E.A3E(adId, str);
        this.A01 = new com.facebook.ads.redexgen.core.C1290bO(this.A03, str, this.A00, new com.facebook.ads.redexgen.core.C1309bh());
        this.A03.A0N(this);
        this.A02 = new com.facebook.ads.redexgen.core.C0679Fc(this.A01, string);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.AnonymousClass60 buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.AnonymousClass60(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.AnonymousClass61 buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.AnonymousClass61();
    }

    public final void A04() {
        if (com.facebook.ads.redexgen.core.C0762Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void A05(com.facebook.ads.RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A06(com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0E().A37(rewardedVideoAdListener != null);
        java.lang.String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1199Zs.A0E().A3A();
        }
        this.A02.A0D(this.A00, str, adExperienceType, z);
        this.A03.A0E().A39();
    }

    public final boolean A08(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0E().A3K();
        boolean zA0H = this.A02.A0H(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0E().A3J(zA0H);
        return zA0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(134, 7, 47), A00(39, 27, 116), A00(127, 7, 122));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0F = this.A02.A0F();
        this.A03.A0E().A5E(zA0F);
        return zA0F;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(141, 6, 44), A00(66, 32, 50), A00(7, 8, 38));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.AnonymousClass60) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new com.facebook.ads.AdError(2001, A00(23, 16, 30) + com.facebook.ads.redexgen.core.AbstractC0832Ll.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(org.objectweb.asm.Opcodes.I2S, 4, 108), A00(98, 29, 96), A00(0, 7, 64));
        return A08(new com.facebook.ads.redexgen.core.AnonymousClass61().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(org.objectweb.asm.Opcodes.I2S, 4, 108), A00(98, 29, 96), A00(15, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
