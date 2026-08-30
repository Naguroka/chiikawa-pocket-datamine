package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0632Cu {
    public static java.lang.String[] A04 = {"GYrJjryQ", "l1vtwRLciJO79TPd4dMzqXi", "am4ITL2jdxZMOs0tYLCUV7", "IopdsR38pvUxqoXTri8", "J32Wu8S230nd5RtY", "R18sfAJO8lXvTtHsdQUoUfRtHeQjtOXD", "R", "yrpLUS1axgX94y0Yd6UgIHXVf93X"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0632Cu(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i) {
        int i2 = this.A01;
        int tempByteOffset = java.lang.Math.min(i, 8 - this.A00);
        int bitsRead = i2 + 1;
        int i3 = ((this.A03[i2] & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i) {
            int i4 = bitsRead + 1;
            int tempByteOffset2 = this.A03[bitsRead];
            int bitsRead2 = A04[5].charAt(24);
            if (bitsRead2 == 101) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[4] = "90jqTQXPeuHnGMLj";
            strArr[6] = com.json.Cdo.e;
            i3 |= (tempByteOffset2 & 255) << tempByteOffset;
            tempByteOffset += 8;
            bitsRead = i4;
        }
        int bitsRead3 = 32 - i;
        int returnValue = (-1) >>> bitsRead3;
        int i5 = i3 & returnValue;
        A03(i);
        return i5;
    }

    public final void A03(int i) {
        int i2 = i / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i2;
        int numBytes2 = i2 * 8;
        this.A00 += i - numBytes2;
        if (this.A00 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = this.A00;
            this.A00 = numBytes4 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
