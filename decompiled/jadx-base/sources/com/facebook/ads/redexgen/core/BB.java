package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BB {
    public static java.lang.String[] A0M = {"12WRHCRvrf7uzS15EjKhAcUJZG2MzuRW", "ORqZ7gMxbJJ1LCIrF8kx2625eiWSr61b", "xtkEmeQamovtvU2Z3hw2mSUwMXjMbz0B", "2SWBRQD5cFodCmXbUuvI5Vs4hvMM", "Ld", "Zx", "oWcxHzaW6r7lBy9gASpUpQY2t5hecS1n", "ItURT5NzCCJzRXO1EoFfUiDaBsWLxBKc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public BB(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / 400;
        this.A0I = i / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i2];
        this.A0B = new short[this.A0J * i2];
        this.A0C = new short[this.A0J * i2];
    }

    private int A00(int i) {
        int iMin = java.lang.Math.min(this.A0J, this.A09);
        A0D(this.A0A, i, iMin);
        int frameCount = this.A09;
        this.A09 = frameCount - iMin;
        return iMin;
    }

    private int A01(short[] sArr, int i) {
        int minP;
        int period;
        int i2 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i2 == 1) {
            int i3 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i, i3, skip2);
        } else {
            A0E(sArr, i, i2);
            short[] sArr2 = this.A0L;
            int i4 = this.A0K / i2;
            int skip3 = this.A0I;
            minP = A04(sArr2, 0, i4, skip3 / i2);
            if (i2 != 1) {
                int minP2 = minP * i2;
                int skip4 = i2 * 4;
                int period2 = minP2 - skip4;
                int i5 = (i2 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i5 > skip6) {
                    i5 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i, period2, i5);
                } else {
                    A0E(sArr, i, 1);
                    minP = A04(this.A0L, 0, period2, i5);
                }
            }
        }
        int period3 = this.A02;
        int skip8 = this.A01;
        if (A0F(period3, skip8)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            i3 = i2;
            float f2 = i2;
            float f3 = (2.0f * f) - 1.0f;
            java.lang.String[] strArr = A0M;
            java.lang.String str = strArr[7];
            java.lang.String str2 = strArr[1];
            int iCharAt = str.charAt(26);
            int newFrameCount = str2.charAt(26);
            if (iCharAt != newFrameCount) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[0] = "eziTD2o98diJZALFyHxZfIO5bO0xqfa9";
            strArr2[6] = "GKD0g5jHSgdF3gp0Ot79FF6iF1GE2cl5";
            int newFrameCount2 = (int) ((f2 * f3) / (1.0f - f));
            this.A09 = newFrameCount2;
        }
        int newFrameCount3 = i2 + i3;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount3);
        int i4 = this.A0G * i;
        short[] sArr2 = this.A0B;
        int i5 = this.A05;
        int newFrameCount4 = this.A0G;
        int i6 = i5 * newFrameCount4;
        int newFrameCount5 = this.A0G;
        java.lang.System.arraycopy(sArr, i4, sArr2, i6, newFrameCount5 * i2);
        A0C(i3, this.A0G, this.A0B, this.A05 + i2, sArr, i + i2, sArr, i);
        int newFrameCount6 = this.A05;
        this.A05 = newFrameCount6 + i2 + i3;
        return i3;
    }

    private int A03(short[] sArr, int i, float f, int i2) {
        int newFrameCount;
        if (f >= 2.0f) {
            newFrameCount = (int) (i2 / (f - 1.0f));
        } else {
            this.A09 = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            newFrameCount = i2;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i, sArr, i + i2);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 255;
        int i6 = 1;
        int diff = 0;
        int bestPeriod = this.A0G;
        int i7 = i * bestPeriod;
        while (i2 <= i3) {
            int i8 = 0;
            for (int minDiff = 0; minDiff < i2; minDiff++) {
                int bestPeriod2 = i7 + minDiff;
                short s = sArr[bestPeriod2];
                int bestPeriod3 = i7 + i2;
                int worstPeriod = s - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = java.lang.Math.abs(worstPeriod);
                i8 += bestPeriod4;
            }
            int worstPeriod2 = i8 * i4;
            int bestPeriod5 = i6 * i2;
            if (worstPeriod2 < bestPeriod5) {
                i6 = i8;
                i4 = i2;
            }
            int period = i8 * i5;
            int maxDiff = diff * i2;
            int worstPeriod3 = A0M[3].length();
            if (worstPeriod3 == 11) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0M;
            strArr[0] = "7654Ro0ah2nKancwMT2DmdIGdIXFgRyE";
            strArr[6] = "tMgWvda3QkwFD9DtGaYlEy8rynMhOKHT";
            if (period > maxDiff) {
                diff = i8;
                i5 = i2;
            }
            i2++;
        }
        this.A02 = i6 / i4;
        this.A01 = diff / i5;
        return i4;
    }

    private short A05(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[this.A0G + i];
        int leftPosition = this.A03 * i2;
        int i4 = this.A04 * i3;
        int position = (this.A04 + 1) * i3;
        int i5 = position - leftPosition;
        int position2 = position - i4;
        short left = (short) (((i5 * s) + ((position2 - i5) * s2)) / position2);
        return left;
    }

    private void A06() {
        int i = this.A05;
        float f = this.A0F / this.A0D;
        float f2 = this.A0E * this.A0D;
        if (f > 1.00001d || f < 0.99999d) {
            A07(f);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f2 != 1.0f) {
            A08(f2, i);
        }
    }

    private void A07(float f) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i = this.A00;
        int i2 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i2);
                i2 += frameCount3;
            } else {
                int iA01 = A01(this.A0A, i2);
                if (f > 1.0d) {
                    int iA03 = A03(this.A0A, i2, f, iA01);
                    java.lang.String[] strArr = A0M;
                    java.lang.String str = strArr[0];
                    java.lang.String str2 = strArr[6];
                    int positionFrames = str.charAt(25);
                    int frameCount4 = str2.charAt(25);
                    if (positionFrames == frameCount4) {
                        throw new java.lang.RuntimeException();
                    }
                    A0M[2] = "xDmSay9THM0s0a1UzRtMZ3OA7t2IbfqA";
                    i2 += iA03 + iA01;
                } else {
                    int frameCount5 = A02(this.A0A, i2, f, iA01);
                    i2 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i2 <= i);
        A0B(i2);
    }

    private void A08(float f, int i) {
        if (this.A05 == i) {
            return;
        }
        int i2 = (int) (this.A0H / f);
        int i3 = this.A0H;
        while (true) {
            if (i2 <= 16384 && i3 <= 16384) {
                break;
            }
            i2 /= 2;
            i3 /= 2;
        }
        A09(i);
        int i4 = 0;
        while (true) {
            int newSampleRate = this.A06;
            if (i4 < newSampleRate - 1) {
                while (true) {
                    int oldSampleRate = this.A04;
                    int oldSampleRate2 = (oldSampleRate + 1) * i2;
                    int newSampleRate2 = this.A03;
                    if (oldSampleRate2 > newSampleRate2 * i3) {
                        short[] sArr = this.A0B;
                        int newSampleRate3 = this.A05;
                        this.A0B = A0G(sArr, newSampleRate3, 1);
                        for (int i5 = 0; i5 < newSampleRate; i5++) {
                            short[] sArr2 = this.A0B;
                            int position = this.A05;
                            int newSampleRate4 = this.A0G;
                            int position2 = (position * newSampleRate4) + i5;
                            short[] sArr3 = this.A0C;
                            int newSampleRate5 = this.A0G;
                            sArr2[position2] = A05(sArr3, (newSampleRate5 * i4) + i5, i3, i2);
                        }
                        int i6 = this.A03 + 1;
                        java.lang.String[] strArr = A0M;
                        java.lang.String str = strArr[7];
                        java.lang.String str2 = strArr[1];
                        int oldSampleRate3 = str.charAt(26);
                        int newSampleRate6 = str2.charAt(26);
                        if (oldSampleRate3 != newSampleRate6) {
                            throw new java.lang.RuntimeException();
                        }
                        A0M[3] = "gKQ25B6uZCLlveN";
                        this.A03 = i6;
                        int newSampleRate7 = this.A05;
                        this.A05 = newSampleRate7 + 1;
                    }
                }
                int newSampleRate8 = this.A04;
                this.A04 = newSampleRate8 + 1;
                int newSampleRate9 = this.A04;
                if (newSampleRate9 == i3) {
                    this.A04 = 0;
                    int newSampleRate10 = this.A03;
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(newSampleRate10 == i2);
                    this.A03 = 0;
                }
                i4++;
            } else {
                int newSampleRate11 = this.A06;
                A0A(newSampleRate11 - 1);
                return;
            }
        }
    }

    private void A09(int i) {
        int i2 = this.A05 - i;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i2);
        short[] sArr2 = this.A0B;
        int i3 = this.A0G * i;
        short[] sArr3 = this.A0C;
        int i4 = this.A06;
        int frameCount2 = this.A0G;
        int i5 = i4 * frameCount2;
        int frameCount3 = this.A0G;
        java.lang.System.arraycopy(sArr2, i3, sArr3, i5, frameCount3 * i2);
        this.A05 = i;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i2;
    }

    private void A0A(int i) {
        if (i == 0) {
            return;
        }
        java.lang.System.arraycopy(this.A0C, this.A0G * i, this.A0C, 0, (this.A06 - i) * this.A0G);
        this.A06 -= i;
    }

    private void A0B(int i) {
        int i2 = this.A00 - i;
        java.lang.System.arraycopy(this.A0A, this.A0G * i, this.A0A, 0, this.A0G * i2);
        this.A00 = i2;
    }

    public static void A0C(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int t = (i5 * i2) + i6;
            int d = (i4 * i2) + i6;
            for (int u = 0; u < i; u++) {
                int i8 = i - u;
                int o = sArr2[d] * i8;
                int i9 = sArr3[t] * u;
                sArr[i7] = (short) ((o + i9) / i);
                i7 += i2;
                d += i2;
                t += i2;
            }
        }
    }

    private void A0D(short[] sArr, int i, int i2) {
        this.A0B = A0G(this.A0B, this.A05, i2);
        java.lang.System.arraycopy(sArr, this.A0G * i, this.A0B, this.A05 * this.A0G, this.A0G * i2);
        this.A05 += i2;
    }

    private void A0E(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int value = this.A0G * i2;
        int frameCount = this.A0G;
        int i4 = i * frameCount;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            for (int i7 = 0; i7 < value; i7++) {
                int frameCount2 = i5 * value;
                i6 += sArr[frameCount2 + i4 + i7];
                int samplesPerValue = A0M[2].charAt(12);
                if (samplesPerValue == 103) {
                    throw new java.lang.RuntimeException();
                }
                A0M[3] = "EUYS5WQpJRPmKwOGT0we5n4rvI";
            }
            short[] sArr2 = this.A0L;
            short s = (short) (i6 / value);
            int samplesPerValue2 = A0M[2].charAt(12);
            if (samplesPerValue2 != 103) {
                java.lang.String[] strArr = A0M;
                strArr[7] = "BC56aeWxCRgsWp8W5KdRe7bjNbWCzUgr";
                strArr[1] = "XTykDGyd0HT9mdygUoRpzOWOuHWjRRUi";
                sArr2[i5] = s;
                i5++;
            } else {
                sArr2[i5] = s;
                i5++;
            }
        }
    }

    private boolean A0F(int i, int i2) {
        if (i == 0 || this.A08 == 0) {
            return false;
        }
        int i3 = i * 3;
        java.lang.String[] strArr = A0M;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0M;
        strArr2[0] = "EZb49YdFLYqoOlZSlgWLmpmtHQMVBG5j";
        strArr2[6] = "6kSbIZyXrbBrsP3zIABXbItVIHW5EGN4";
        if (i2 > i3 || i * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i, int i2) {
        int length = sArr.length / this.A0G;
        if (i + i2 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i2;
        int currentCapacityFrames2 = this.A0G;
        short[] sArrCopyOf = java.util.Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
        java.lang.String[] strArr = A0M;
        java.lang.String str = strArr[4];
        java.lang.String str2 = strArr[5];
        int newCapacityFrames2 = str.length();
        int currentCapacityFrames3 = str2.length();
        if (newCapacityFrames2 != currentCapacityFrames3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0M;
        strArr2[4] = "bD";
        strArr2[5] = "UF";
        return sArrCopyOf;
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i = this.A00;
        float f = this.A0F / this.A0D;
        float r = this.A0E * this.A0D;
        int i2 = this.A05;
        float s = i;
        int remainingFrameCount = this.A06;
        int i3 = i2 + ((int) ((((s / f) + remainingFrameCount) / r) + 0.5f));
        short[] sArr = this.A0A;
        int i4 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i4, (remainingFrameCount2 * 2) + i);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i5 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i5 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i6 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i6 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i3) {
            this.A05 = i3;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(java.nio.ShortBuffer shortBuffer) {
        int iMin = java.lang.Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * iMin);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - iMin;
        short[] sArr2 = this.A0B;
        int i = this.A0G * iMin;
        short[] sArr3 = this.A0B;
        int i2 = this.A05;
        int framesToRead3 = this.A0G;
        java.lang.System.arraycopy(sArr2, i, sArr3, 0, i2 * framesToRead3);
    }

    public final void A0L(java.nio.ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i = framesToWrite * iRemaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, iRemaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + iRemaining;
        A06();
    }
}
