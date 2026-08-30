package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Et {
    public static java.lang.String[] A04 = {"QJblDe3wVK6feXal4ldrY3QcOGG4UkHt", "2zepy1PmZTCf4jSxyWiaVOuG1uYDUhxq", "yYSZkIRTXInaVK1F9QQ9YZR4hxi7L96x", "9Bt0bU", "BsbuUwvwQ1kbtWiwTekQfziPaSue0dsw", "yLqexVAazno3TL8TDAW38tYF3t4XrW", "8DUKE7RXBSYmkSj7feSXhV2S4GEg6t2h", "8s5VPXlVl4Lwrm8gOC5ZhnLqGhthAU"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public Et(int i) {
        this(i, -1L);
    }

    public Et(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public Et(int i, long j) {
        this(i, -1, -1, j);
    }

    public final com.facebook.ads.redexgen.core.Et A00(int i) {
        if (this.A02 == i) {
            return this;
        }
        return new com.facebook.ads.redexgen.core.Et(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.Et et = (com.facebook.ads.redexgen.core.Et) obj;
        if (this.A02 == et.A02 && this.A00 == et.A00) {
            int i = this.A01;
            java.lang.String[] strArr = A04;
            if (strArr[2].charAt(6) != strArr[6].charAt(6)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[7] = "3akbSKdkYbqYqb8XM8EoWhMtdFIZ3n";
            strArr2[5] = "92eUK6p4zC0e1AjStm6aKeEHBLYU05";
            if (i == et.A01 && this.A03 == et.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        return ((result2 + result3) * 31) + ((int) this.A03);
    }
}
