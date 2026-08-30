package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum JQ {
    A05(0, com.facebook.ads.NativeAdBase.MediaCacheFlag.NONE),
    A04(1, com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final com.facebook.ads.NativeAdBase.MediaCacheFlag A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, -128, -128, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    JQ(long j, com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    @javax.annotation.Nullable
    public static com.facebook.ads.redexgen.core.JQ A00(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (com.facebook.ads.redexgen.core.JQ jq : values()) {
            if (jq.A01 == mediaCacheFlag) {
                return jq;
            }
        }
        return null;
    }
}
