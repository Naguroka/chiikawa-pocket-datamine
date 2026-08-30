package com.bytedance.sdk.component.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements java.io.Serializable, java.lang.Comparable<com.bytedance.sdk.component.IL.bg.IL.eqN> {
    final byte[] eqN;
    transient java.lang.String ldr;
    transient int zx;
    static final char[] bg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final java.nio.charset.Charset IL = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public static final com.bytedance.sdk.component.IL.bg.IL.eqN bX = bg(new byte[0]);

    eqN(byte[] bArr) {
        this.eqN = bArr;
    }

    public static com.bytedance.sdk.component.IL.bg.IL.eqN bg(byte... bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("data == null");
        }
        return new com.bytedance.sdk.component.IL.bg.IL.eqN((byte[]) bArr.clone());
    }

    public java.lang.String bg() {
        java.lang.String str = this.ldr;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(this.eqN, IL);
        this.ldr = str2;
        return str2;
    }

    public java.lang.String IL() {
        byte[] bArr = this.eqN;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = bg;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new java.lang.String(cArr);
    }

    public com.bytedance.sdk.component.IL.bg.IL.eqN bg(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.eqN;
        if (i2 > bArr.length) {
            throw new java.lang.IllegalArgumentException("endIndex > length(" + this.eqN.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i3);
        return new com.bytedance.sdk.component.IL.bg.IL.eqN(bArr2);
    }

    public byte bg(int i) {
        return this.eqN[i];
    }

    public int bX() {
        return this.eqN.length;
    }

    public byte[] eqN() {
        return (byte[]) this.eqN.clone();
    }

    public boolean bg(int i, com.bytedance.sdk.component.IL.bg.IL.eqN eqn, int i2, int i3) {
        return eqn.bg(i2, this.eqN, i, i3);
    }

    public boolean bg(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.eqN;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.bytedance.sdk.component.IL.bg.IL.WR.bg(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.bytedance.sdk.component.IL.bg.IL.eqN) {
            com.bytedance.sdk.component.IL.bg.IL.eqN eqn = (com.bytedance.sdk.component.IL.bg.IL.eqN) obj;
            int iBX = eqn.bX();
            byte[] bArr = this.eqN;
            if (iBX == bArr.length && eqn.bg(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.zx;
        if (i != 0) {
            return i;
        }
        int iHashCode = java.util.Arrays.hashCode(this.eqN);
        this.zx = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.component.IL.bg.IL.eqN eqn) {
        int iBX = bX();
        int iBX2 = eqn.bX();
        int iMin = java.lang.Math.min(iBX, iBX2);
        for (int i = 0; i < iMin; i++) {
            int iBg = bg(i) & 255;
            int iBg2 = eqn.bg(i) & 255;
            if (iBg != iBg2) {
                return iBg < iBg2 ? -1 : 1;
            }
        }
        if (iBX == iBX2) {
            return 0;
        }
        return iBX < iBX2 ? -1 : 1;
    }

    public java.lang.String toString() {
        if (this.eqN.length == 0) {
            return "[size=0]";
        }
        java.lang.String strBg = bg();
        int iBg = bg(strBg, 64);
        if (iBg == -1) {
            if (this.eqN.length <= 64) {
                return "[hex=" + IL() + com.ironsource.y8.i.e;
            }
            return "[size=" + this.eqN.length + " hex=" + bg(0, 64).IL() + "…]";
        }
        java.lang.String strReplace = strBg.substring(0, iBg).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return iBg < strBg.length() ? "[size=" + this.eqN.length + " text=" + strReplace + "…]" : "[text=" + strReplace + com.ironsource.y8.i.e;
    }

    static int bg(java.lang.String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((java.lang.Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
