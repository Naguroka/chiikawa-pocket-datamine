package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0846Lz {
    public static java.lang.String[] A00 = {"AGgEj", "LH3rgKkNmktwVHG5nPeK3WsWN7516Jzs", "CK3U371aKg", "MTDWSiS44OE4PV9OKyjdrXQDz2py4IOF", "ej0x21azMZ2lcGnVvFT8lesJnsiudKto", "2BAFbYQr8kMnD6mhXZkfB", "qOS", "n1iHeVYqIlmDLMhT9hH5ssiOIOX1l9w9"};

    public static com.facebook.ads.redexgen.core.EnumC0969Qs A00(com.facebook.ads.VideoStartReason videoStartReason) {
        switch (videoStartReason) {
            case AUTO_STARTED:
                com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs = com.facebook.ads.redexgen.core.EnumC0969Qs.A02;
                if (A00[2].length() != 10) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A00;
                strArr[5] = "lDchC145wsMmgVMbBHFb3";
                strArr[0] = "IYy0G";
                return enumC0969Qs;
            case NOT_STARTED:
                return com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
            case USER_STARTED:
                return com.facebook.ads.redexgen.core.EnumC0969Qs.A04;
            default:
                return com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        }
    }
}
