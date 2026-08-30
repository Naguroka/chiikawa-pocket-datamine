package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HT implements java.lang.Comparable<com.facebook.ads.redexgen.core.HT> {
    public static java.lang.String[] A06 = {"YtTqrr36IpTZEk4bgIvsBXk24JcVhmoU", "o2fs6uJN4rTaL", "Db4XzOO9iMDbC", "Saxp3y0", "OLcmUi74zHQznPcwd2HExE6T020fWxqu", "tCQEbNaJVz0PlCRSNnPyqV4UH5k0cfLN", "F2yQzLJFEjO2XmqsM0eh8XOkYGMJUBuc", "2g54UXZJjIjL6gHQKj3sjrDPLMAzDLyJ"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final java.io.File A03;
    public final java.lang.String A04;
    public final boolean A05;

    public HT(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        this.A04 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.HT ht) {
        if (!this.A04.equals(ht.A04)) {
            java.lang.String str = this.A04;
            java.lang.String str2 = ht.A04;
            java.lang.String[] strArr = A06;
            if (strArr[5].charAt(7) != strArr[7].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[3] = "aYZMBjJ";
            strArr2[6] = "1NklUZMMo7CoWmkhhyfBrWe0DhkXD4Fk";
            return str.compareTo(str2);
        }
        long j = this.A02 - ht.A02;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
