package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AP {
    public static java.lang.String[] A02 = {"z5cWhBKwyfDPSiydbjddEPZfwt53ja0x", "cRtyb", "3nl2uEmm3Y6v2r6DUjAJFGqyxF5bM8Tl", "Xh7r", "szA3L8LMw85djaignONCiRG8", "IkzVIE", "xrsAK", "aL7FDs2Gv9osoDuKJqGKfwNkNHCE1i97"};
    public final int A00;
    public final com.facebook.ads.redexgen.core.Et A01;

    public AP(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A00 = i;
        this.A01 = et;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.AP ap = (com.facebook.ads.redexgen.core.AP) obj;
        java.lang.String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[2] = "kxld16OEBNgi84xJjJHT7I1GCW5BWB1v";
        strArr2[0] = "YhTGjjkd4nQlp6zPvBFYrrZ7l65Vw2gm";
        if (this.A00 == ap.A00) {
            com.facebook.ads.redexgen.core.Et et = this.A01;
            if (A02[7].charAt(9) != '6') {
                java.lang.String[] strArr3 = A02;
                strArr3[5] = "HGjNL7";
                strArr3[3] = "NcRh";
                if (et.equals(ap.A01)) {
                    return true;
                }
            } else {
                java.lang.String[] strArr4 = A02;
                strArr4[6] = "oEAqE";
                strArr4[1] = "ZR52c";
                if (et.equals(ap.A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
