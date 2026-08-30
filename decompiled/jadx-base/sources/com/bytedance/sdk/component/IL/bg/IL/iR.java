package com.bytedance.sdk.component.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
final class iR extends com.bytedance.sdk.component.IL.bg.IL.eqN {
    final transient int[] Kg;
    final transient byte[][] iR;

    iR(com.bytedance.sdk.component.IL.bg.IL.bg bgVar, int i) {
        super(null);
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(bgVar.IL, 0L, i);
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = bgVar.bg;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (zxVar.bX == zxVar.IL) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += zxVar.bX - zxVar.IL;
            i4++;
            zxVar = zxVar.ldr;
        }
        this.iR = new byte[i4][];
        this.Kg = new int[i4 * 2];
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar2 = bgVar.bg;
        int i5 = 0;
        while (i2 < i) {
            this.iR[i5] = zxVar2.bg;
            i2 += zxVar2.bX - zxVar2.IL;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.Kg;
            iArr[i5] = i2;
            iArr[this.iR.length + i5] = zxVar2.IL;
            zxVar2.eqN = true;
            i5++;
            zxVar2 = zxVar2.ldr;
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public java.lang.String bg() {
        return zx().bg();
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public java.lang.String IL() {
        return zx().IL();
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public com.bytedance.sdk.component.IL.bg.IL.eqN bg(int i, int i2) {
        return zx().bg(i, i2);
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public byte bg(int i) {
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(this.Kg[this.iR.length - 1], i, 1L);
        int iIL = IL(i);
        int i2 = iIL == 0 ? 0 : this.Kg[iIL - 1];
        int[] iArr = this.Kg;
        byte[][] bArr = this.iR;
        return bArr[iIL][(i - i2) + iArr[bArr.length + iIL]];
    }

    private int IL(int i) {
        int iBinarySearch = java.util.Arrays.binarySearch(this.Kg, 0, this.iR.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public int bX() {
        return this.Kg[this.iR.length - 1];
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public byte[] eqN() {
        int[] iArr = this.Kg;
        byte[][] bArr = this.iR;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.Kg;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            java.lang.System.arraycopy(this.iR[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public boolean bg(int i, com.bytedance.sdk.component.IL.bg.IL.eqN eqn, int i2, int i3) {
        if (i < 0 || i > bX() - i3) {
            return false;
        }
        int iIL = IL(i);
        while (i3 > 0) {
            int i4 = iIL == 0 ? 0 : this.Kg[iIL - 1];
            int iMin = java.lang.Math.min(i3, ((this.Kg[iIL] - i4) + i4) - i);
            int[] iArr = this.Kg;
            byte[][] bArr = this.iR;
            if (!eqn.bg(i2, bArr[iIL], (i - i4) + iArr[bArr.length + iIL], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iIL++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public boolean bg(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > bX() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iIL = IL(i);
        while (i3 > 0) {
            int i4 = iIL == 0 ? 0 : this.Kg[iIL - 1];
            int iMin = java.lang.Math.min(i3, ((this.Kg[iIL] - i4) + i4) - i);
            int[] iArr = this.Kg;
            byte[][] bArr2 = this.iR;
            if (!com.bytedance.sdk.component.IL.bg.IL.WR.bg(bArr2[iIL], (i - i4) + iArr[bArr2.length + iIL], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iIL++;
        }
        return true;
    }

    private com.bytedance.sdk.component.IL.bg.IL.eqN zx() {
        return new com.bytedance.sdk.component.IL.bg.IL.eqN(eqN());
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.bytedance.sdk.component.IL.bg.IL.eqN) {
            com.bytedance.sdk.component.IL.bg.IL.eqN eqn = (com.bytedance.sdk.component.IL.bg.IL.eqN) obj;
            if (eqn.bX() == bX() && bg(0, eqn, 0, bX())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public int hashCode() {
        int i = this.zx;
        if (i != 0) {
            return i;
        }
        int length = this.iR.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.iR[i2];
            int[] iArr = this.Kg;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.zx = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL.eqN
    public java.lang.String toString() {
        return zx().toString();
    }
}
