package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CL {
    public static java.lang.String[] A02 = {"pydgZ7SJAfyaf8gDpqIGl6ZfsH76sIMS", "5luhpr11k9JiTq5lHCbJLbX6g9usHom3", "zWS4lVjyDY90UUPX5QEGbfg3CKzj1elF", "iaMCaj", "s01WbZNA", "Zbkc6ME", "kGRhHwEsk4pJ0bE6xku5dbDmcKAoqEqT", "TYsxHc2nx7Tf2I7b9tH4dxpJxGdmpH7B"};
    public int A00;
    public final com.facebook.ads.redexgen.core.I4 A01 = new com.facebook.ads.redexgen.core.I4(8);

    private long A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AEO(this.A01.A00, 0, 1);
        int i = this.A01.A00[0] & 255;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int mask = 128;
        int length = 0;
        while (value == 0) {
            mask >>= 1;
            length++;
        }
        int value = mask ^ (-1);
        int i2 = i & value;
        interfaceC0610By.AEO(this.A01.A00, 1, length);
        for (int i3 = 0; i3 < length; i3++) {
            int value2 = i3 + 1;
            i2 = (i2 << 8) + (this.A01.A00[value2] & 255);
        }
        int mask2 = this.A00;
        int value3 = length + 1;
        this.A00 = mask2 + value3;
        return i2;
    }

    public final boolean A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        long jA7g = interfaceC0610By.A7g();
        long j = 1024;
        if (jA7g != -1 && jA7g <= 1024) {
            j = jA7g;
        }
        int i = (int) j;
        boolean z = false;
        interfaceC0610By.AEO(this.A01.A00, 0, 4);
        long tag = this.A01.A0M();
        this.A00 = 4;
        while (tag != 440786851) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == i) {
                return false;
            }
            interfaceC0610By.AEO(this.A01.A00, 0, 1);
            tag = ((tag << 8) & (-256)) | ((long) (this.A01.A00[0] & 255));
        }
        long jA00 = A00(interfaceC0610By);
        long j2 = this.A00;
        if (jA00 == Long.MIN_VALUE) {
            return false;
        }
        java.lang.String[] strArr = A02;
        if (strArr[7].charAt(4) != strArr[6].charAt(4)) {
            throw new java.lang.RuntimeException();
        }
        A02[1] = "SlkU6fYzRv5zr5BYbE0B2bmc0S5WyyME";
        if (jA7g != -1 && j2 + jA00 >= jA7g) {
            return false;
        }
        while (this.A00 < tag) {
            if (A00(interfaceC0610By) == Long.MIN_VALUE) {
                return z;
            }
            long jA01 = A00(interfaceC0610By);
            if (jA01 < 0 || jA01 > 2147483647L) {
                return false;
            }
            if (jA01 != 0) {
                int i3 = (int) jA01;
                interfaceC0610By.A3s(i3);
                this.A00 += i3;
            }
            z = false;
        }
        return ((long) this.A00) == j2 + jA00;
    }
}
