package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AI {
    public final long A00;
    public final long A01;
    public static java.lang.String[] A02 = {"wjrRPXWyt7FJOtCfXXeKbwMwqBspTzQg", "eY06ibbuLK1J5UWPto3xCw2uyWnrSlTN", "5vbywGgLU2fUNXMaCGRflqdPRLJOnOI5", "n82TP93wz0kvvP6hrorLqVOpldCSHKat", "2zS5yAgm8usBx", "tcU6jmyapCTPAiujYKdEShZXG5LbCi0K", "JC5LCDKkuX4e7glPZC0VksCLDl8t9zvH", "hqvqHn8ksuGmD"};
    public static final com.facebook.ads.redexgen.core.AI A05 = new com.facebook.ads.redexgen.core.AI(0, 0);
    public static final com.facebook.ads.redexgen.core.AI A03 = new com.facebook.ads.redexgen.core.AI(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final com.facebook.ads.redexgen.core.AI A07 = new com.facebook.ads.redexgen.core.AI(Long.MAX_VALUE, 0);
    public static final com.facebook.ads.redexgen.core.AI A06 = new com.facebook.ads.redexgen.core.AI(0, Long.MAX_VALUE);
    public static final com.facebook.ads.redexgen.core.AI A04 = A05;

    public AI(long j, long j2) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(j >= 0);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[ORIG_RETURN, RETURN] */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.String[] strArr = A02;
            if (strArr[6].charAt(29) != strArr[0].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "OxhK2LHKCoc2mqKSCaROUBw0x2bF5l7L";
            if (cls == cls2) {
                com.facebook.ads.redexgen.core.AI ai = (com.facebook.ads.redexgen.core.AI) obj;
                if (A02[3].charAt(23) != 'p') {
                    A02[3] = "d6Mhnf64aMieM2vxsbZH8LbpuFdSo2DL";
                    if (this.A01 == ai.A01) {
                        if (this.A00 == ai.A00) {
                            return true;
                        }
                    }
                } else {
                    A02[3] = "SWJJMQHIt7MTKCAkJwEpA52p5HuOpWsK";
                    if (this.A01 == ai.A01) {
                        if (this.A00 == ai.A00) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
