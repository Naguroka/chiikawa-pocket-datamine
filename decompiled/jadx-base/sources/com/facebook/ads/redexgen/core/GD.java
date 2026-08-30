package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GD {
    public static java.lang.String[] A09 = {"RyObx4fDrpMWT", "FTMxUhOCMkhRoWZqBhU38SM6oI7g2M2", "2MJEizeCZp5uxdCnXqOwiW6KQOsM6Mkf", "FGlKPE9c96UBdMv9ez6ncjACQS1IUqcl", "lhmVeVrWicrlRI5i333Om88pysxYtUVV", "IdMgaNLr90DZkQ3EJ6nC", "kLSN0JGedbjQkgataaBmJ9dDQG5h9BL", "R6VLxz3UdMSFOznv3qvHILfZYgKZO5A0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final com.facebook.ads.redexgen.core.I4 A07 = new com.facebook.ads.redexgen.core.I4();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(com.facebook.ads.redexgen.core.I4 i4, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        i4.A0Z(3);
        int i2 = i - 4;
        if ((i4.A0E() & 128) != 0) {
            if (i2 < 7 || (totalLength = i4.A0G()) < 4) {
                return;
            }
            this.A01 = i4.A0I();
            this.A00 = i4.A0I();
            this.A07.A0W(totalLength - 4);
            i2 -= 7;
        }
        int bytesToRead = this.A07.A06();
        int iA07 = this.A07.A07();
        java.lang.String[] strArr = A09;
        java.lang.String str = strArr[6];
        java.lang.String str2 = strArr[1];
        int length = str.length();
        int position = str2.length();
        if (length != position) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[3] = "GogXbqDElCJhME8HyW7iX3mlv0t9khKj";
        strArr2[4] = "UXOJdmjGs2LP9mzRUQfP3v2dC8BVV8MN";
        if (bytesToRead < iA07 && i2 > 0) {
            int iMin = java.lang.Math.min(i2, iA07 - bytesToRead);
            i4.A0c(this.A07.A00, bytesToRead, iMin);
            this.A07.A0Y(bytesToRead + iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(com.facebook.ads.redexgen.core.I4 i4, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = i4.A0I();
        this.A04 = i4.A0I();
        i4.A0Z(11);
        this.A02 = i4.A0I();
        this.A03 = i4.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(com.facebook.ads.redexgen.core.I4 i4, int i) {
        if (i % 5 != 2) {
            return;
        }
        i4.A0Z(2);
        java.util.Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int index = 0; index < i2; index++) {
            int iA0E = i4.A0E();
            int a2 = i4.A0E();
            int iA0E2 = i4.A0E();
            int iA0E3 = i4.A0E();
            int entryCount = iA0E2 - 128;
            int i3 = (int) (((double) a2) + (((double) entryCount) * 1.402d));
            int g = (int) ((((double) a2) - (((double) (iA0E3 - 128)) * 0.34414d)) - (((double) (iA0E2 - 128)) * 0.71414d));
            int entryCount2 = i4.A0E() << 24;
            this.A08[iA0E] = entryCount2 | (com.facebook.ads.redexgen.core.IK.A06(i3, 0, 255) << 16) | (com.facebook.ads.redexgen.core.IK.A06(g, 0, 255) << 8) | com.facebook.ads.redexgen.core.IK.A06((int) (((double) a2) + (((double) (iA0E3 - 128)) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    public final com.facebook.ads.redexgen.core.C0693Fs A06() {
        int colorIndex;
        int i;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0) {
            return null;
        }
        int i2 = this.A00;
        java.lang.String[] strArr = A09;
        if (strArr[5].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[5] = "QuakJopv7bib0A0WzDaD";
        strArr2[0] = "ZVTWG90UWhIb2";
        if (i2 != 0) {
            int iA07 = this.A07.A07();
            java.lang.String[] strArr3 = A09;
            if (strArr3[7].charAt(5) != strArr3[2].charAt(5)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A09;
            strArr4[5] = "urIoQhn3muBr6cGkyY6P";
            strArr4[0] = "XNwzbjBmz8FwR";
            if (iA07 == 0 || this.A07.A06() != this.A07.A07() || !this.A06) {
                return null;
            }
            this.A07.A0Y(0);
            int[] iArr = new int[this.A01 * this.A00];
            int runLength = 0;
            while (runLength < iArr.length) {
                int argbBitmapDataIndex = this.A07.A0E();
                if (argbBitmapDataIndex != 0) {
                    int[] argbBitmapData = this.A08;
                    iArr[runLength] = argbBitmapData[argbBitmapDataIndex];
                    runLength++;
                } else {
                    int iA0E = this.A07.A0E();
                    if (iA0E != 0) {
                        if ((iA0E & 64) == 0) {
                            colorIndex = iA0E & 63;
                        } else {
                            int colorIndex2 = (iA0E & 63) << 8;
                            colorIndex = colorIndex2 | this.A07.A0E();
                        }
                        int color = iA0E & 128;
                        java.lang.String[] strArr5 = A09;
                        if (strArr5[7].charAt(5) == strArr5[2].charAt(5)) {
                            java.lang.String[] strArr6 = A09;
                            strArr6[6] = "h6JekcFzsTFu5KNkyPFbxDZu66bzIHF";
                            strArr6[1] = "W6t2vKaLS4um3MbbUQzXnPCaVdOtQDV";
                            if (color == 0) {
                                i = 0;
                            } else {
                                i = this.A08[this.A07.A0E()];
                            }
                        } else if (color == 0) {
                            i = 0;
                        } else {
                            i = this.A08[this.A07.A0E()];
                        }
                        java.util.Arrays.fill(iArr, runLength, runLength + colorIndex, i);
                        runLength += colorIndex;
                    }
                }
            }
            return new com.facebook.ads.redexgen.core.C0693Fs(android.graphics.Bitmap.createBitmap(iArr, this.A01, this.A00, android.graphics.Bitmap.Config.ARGB_8888), this.A02 / this.A05, 0, this.A03 / this.A04, 0, this.A01 / this.A05, this.A00 / this.A04);
        }
        return null;
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
