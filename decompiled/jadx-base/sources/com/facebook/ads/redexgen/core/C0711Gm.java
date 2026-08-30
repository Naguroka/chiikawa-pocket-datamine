package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0711Gm {
    public static java.lang.String[] A03 = {"NWG3TX9NYXGrD16qfhvaDq7MonVrzPIO", "e028evzEPQ1h5lDY7CAKWXrwz5QUxGwz", "wyXr8MEnBTTKz0yAsrzUV0iU4Ibjh0Fo", "VlpdjJJ9SUaJbdhAbneZKmgMMaYhtuPM", "leixSyaSVIZAAe", "tUi6z1qi4eeeY7tCSbTmQeoyMOz2CIiq", "19NDzRR0DB7SK3z9xqtaZiHwxOVs7vz5", "Z9dYfKMSwy4DwqfPMAiJW01558cOA1wL"};
    public int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0710Gl[] A02;

    public C0711Gm(com.facebook.ads.redexgen.core.InterfaceC0710Gl... interfaceC0710GlArr) {
        this.A02 = interfaceC0710GlArr;
        this.A01 = interfaceC0710GlArr.length;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0710Gl A00(int i) {
        return this.A02[i];
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0710Gl[] A01() {
        return (com.facebook.ads.redexgen.core.InterfaceC0710Gl[]) this.A02.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return java.util.Arrays.equals(this.A02, ((com.facebook.ads.redexgen.core.C0711Gm) obj).A02);
        }
        java.lang.String[] strArr = A03;
        if (strArr[7].charAt(1) != strArr[6].charAt(1)) {
            throw new java.lang.RuntimeException();
        }
        A03[5] = "E0Kn0L50oTRfoyGXjeatyhejueoNkM7v";
        return true;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            if (A03[5].charAt(16) == 'k') {
                throw new java.lang.RuntimeException();
            }
            A03[5] = "P2K1jmtqr0f0Y5LRKLvugbgPQbCJUlId";
            int result = java.util.Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
