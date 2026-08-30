package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D1 extends com.facebook.ads.redexgen.core.XB {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"Khlodgv4nm1JN7pvDudzhLshYnVFJMYj", "c7ah86gyOlUD", "JoZr7ruM8P1CDzAkdNZ", "HjL2B3NAdMNeR5iFqDiYNYNkxiWEx", "oQm2ks6hNiY41q9vro", "ayV7y67njefchB5PWBkMMUfanflb38Cr", "oO7X36UNtbffgy2V6l3ztlPOg46Wx", "Y52Q59EloTeftRYp1OS0iD4QyyXWfCYD"};
    public static final int[] A04;
    public final com.facebook.ads.redexgen.core.InterfaceC0709Gk A00;
    public final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A03(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, int i, java.lang.String str, int i2, int i3, int i4, java.util.List<java.lang.Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue = list.get(i6).intValue();
            if (A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{7, 28, 22};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0F(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, int i, java.lang.String str, int i2, int i3, int i4, java.util.List<java.lang.Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public D1() {
        this(null);
    }

    public D1(com.facebook.ads.redexgen.core.InterfaceC0709Gk interfaceC0709Gk) {
        this.A00 = interfaceC0709Gk;
        this.A01 = new java.util.concurrent.atomic.AtomicReference<>(com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, com.facebook.ads.redexgen.core.C0702Gb c0702Gb) {
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroup.A01(i2);
            int count = iArr[i2];
            if (A0J(formatA01, count, c0702Gb)) {
                i++;
            }
        }
        return i;
    }

    public static android.graphics.Point A05(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new android.graphics.Point(tempViewportWidth, com.facebook.ads.redexgen.core.IK.A04(tempViewportWidth * i3, i2));
        }
        return new android.graphics.Point(com.facebook.ads.redexgen.core.IK.A04(i * i2, i3), i);
    }

    private final com.facebook.ads.redexgen.core.C0620Ci A06(int i, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup2 = trackGroupArray.A01(i3);
            int[] iArr2 = iArr[i3];
            for (int groupIndex = 0; groupIndex < trackGroup2.A01; groupIndex++) {
                if (A0H(iArr2[groupIndex], defaultTrackSelector$Parameters.A0B)) {
                    int selectedTrackScore = (trackGroup2.A01(groupIndex).A0D & 1) != 0 ? 2 : 1;
                    boolean isDefault = A0H(iArr2[groupIndex], false);
                    java.lang.String[] strArr = A03;
                    if (strArr[6].length() != strArr[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A03;
                    strArr2[0] = "dNPOXoA5s2XMMA0mWcPJLidwRtPmHQYg";
                    strArr2[7] = "mpqhGybSHlFRTMufKuA4cMMwx1NmszYZ";
                    if (isDefault) {
                        selectedTrackScore += 1000;
                    }
                    if (selectedTrackScore > i2) {
                        trackGroup = trackGroup2;
                        trackIndex = groupIndex;
                        i2 = selectedTrackScore;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0620Ci(trackGroup, trackIndex);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    public static com.facebook.ads.redexgen.core.C0620Ci A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        boolean selectTrack;
        int iA00;
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup = null;
        int i = 0;
        int trackIndex = 0;
        int i2 = -1;
        int iA0E = -1;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
            java.util.List<java.lang.Integer> listA0D = A0D(trackGroupA01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            int[] iArr2 = iArr[i3];
            for (int selectedBitrate = 0; selectedBitrate < trackGroupA01.A01; selectedBitrate++) {
                if (A0H(iArr2[selectedBitrate], defaultTrackSelector$Parameters.A0B)) {
                    com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroupA01.A01(selectedBitrate);
                    if (!listA0D.contains(java.lang.Integer.valueOf(selectedBitrate)) || (formatA01.A0F != -1 && formatA01.A0F > defaultTrackSelector$Parameters.A03)) {
                        selectTrack = false;
                    } else if (formatA01.A08 != -1) {
                        int i4 = formatA01.A08;
                        if (A03[2].length() != 19) {
                            throw new java.lang.RuntimeException();
                        }
                        A03[5] = "Jqa8SH6zQFngYnrJuBfynJsdrfKJwvTt";
                        if (i4 <= defaultTrackSelector$Parameters.A02) {
                            if (formatA01.A04 != -1 || formatA01.A04 <= defaultTrackSelector$Parameters.A01) {
                                selectTrack = true;
                            } else {
                                selectTrack = false;
                            }
                        } else {
                            selectTrack = false;
                        }
                    } else {
                        if (formatA01.A04 != -1) {
                        }
                        selectTrack = true;
                    }
                    if (selectTrack || defaultTrackSelector$Parameters.A0C) {
                        int selectedTrackIndex = selectTrack ? 2 : 1;
                        boolean zA0H = A0H(iArr2[selectedBitrate], false);
                        if (zA0H) {
                            selectedTrackIndex += 1000;
                        }
                        int comparisonResult = selectedTrackIndex > trackIndex ? 1 : 0;
                        if (selectedTrackIndex == trackIndex) {
                            if (defaultTrackSelector$Parameters.A0D) {
                                int iA01 = A00(formatA01.A04, i2);
                                if (A03[2].length() != 19) {
                                    java.lang.String[] strArr = A03;
                                    strArr[0] = "m3ds9XgIPqyPftSNBn8aSUwJnsw9CqYT";
                                    strArr[7] = "5BLrdMdZC8Kc5nZO9R4t3v0sVWSorMYk";
                                    if (iA01 < 0) {
                                        comparisonResult = 1;
                                    } else {
                                        comparisonResult = 0;
                                    }
                                } else {
                                    java.lang.String[] strArr2 = A03;
                                    strArr2[6] = "P9BQk28vFHJO7D0xI7VGyuhbl8Z7G";
                                    strArr2[3] = "bLLGJo7EuJ7yRp1OLug6pheIhfDjI";
                                    if (iA01 < 0) {
                                        comparisonResult = 1;
                                    } else {
                                        comparisonResult = 0;
                                    }
                                }
                            } else {
                                int formatPixelCount = formatA01.A0E();
                                if (formatPixelCount != iA0E) {
                                    iA00 = A00(formatPixelCount, iA0E);
                                    if (A03[2].length() == 19) {
                                        A03[1] = "qH";
                                    }
                                } else {
                                    int comparisonResult2 = formatA01.A04;
                                    iA00 = A00(comparisonResult2, i2);
                                }
                                if (zA0H && selectTrack) {
                                    comparisonResult = iA00 > 0 ? 1 : 0;
                                } else {
                                    comparisonResult = iA00 < 0 ? 1 : 0;
                                }
                            }
                        }
                        if (comparisonResult != 0) {
                            trackGroup = trackGroupA01;
                            i = selectedBitrate;
                            trackIndex = selectedTrackIndex;
                            i2 = formatA01.A04;
                            iA0E = formatA01.A0E();
                        }
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0620Ci(trackGroup, i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab A[SYNTHETIC] */
    private final com.facebook.ads.redexgen.core.C0620Ci A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws com.facebook.ads.redexgen.core.C05449h {
        int i;
        int i2;
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < trackGroupArray.A01; i5++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA01 = trackGroupArray.A01(i5);
            int[] iArr2 = iArr[i5];
            int i6 = 0;
            while (true) {
                int i7 = trackGroupA01.A01;
                if (A03[5].charAt(17) != 'B') {
                    throw new java.lang.RuntimeException();
                }
                A03[5] = "37qTTd5O8cPtS1sjjBrsz0hoz4Lfr2xO";
                if (i6 < i7) {
                    int i8 = iArr2[i6];
                    boolean z = defaultTrackSelector$Parameters.A0B;
                    if (A03[1].length() == 16) {
                        throw new java.lang.RuntimeException();
                    }
                    A03[2] = "edD2epHaH2femKSefM7";
                    if (A0H(i8, z)) {
                        com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroupA01.A01(i6);
                        int i9 = formatA01.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                        boolean z2 = (i9 & 1) != 0;
                        int i10 = (i9 & 2) == 0 ? 0 : 1;
                        boolean zA0K = A0K(formatA01, defaultTrackSelector$Parameters.A08);
                        if (!zA0K) {
                            boolean z3 = defaultTrackSelector$Parameters.A0E;
                            if (A03[2].length() != 19) {
                                throw new java.lang.RuntimeException();
                            }
                            A03[5] = "kGMFgeSM9gOqj0RHEBB3hX7mWDGPaalc";
                            if (z3 && A0I(formatA01)) {
                                if (z2) {
                                    i = 8;
                                } else if (i10 == 0) {
                                    i = 6;
                                } else {
                                    i = 4;
                                }
                                i2 = i + (zA0K ? 1 : 0);
                            } else if (z2) {
                                i2 = 3;
                            } else if (i10 != 0) {
                                if (A0K(formatA01, defaultTrackSelector$Parameters.A07)) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                            }
                            if (A0H(iArr2[i6], false)) {
                                i2 += 1000;
                            }
                            if (i2 > i4) {
                                trackGroup = trackGroupA01;
                                i3 = i6;
                                i4 = i2;
                            }
                        } else {
                            if (z2) {
                                i = 8;
                            } else if (i10 == 0) {
                                i = 6;
                            } else {
                                i = 4;
                            }
                            i2 = i + (zA0K ? 1 : 0);
                            if (A0H(iArr2[i6], false)) {
                                i2 += 1000;
                            }
                            if (i2 > i4) {
                                trackGroup = trackGroupA01;
                                i3 = i6;
                                i4 = i2;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0620Ci(trackGroup, i3);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0710Gl A09(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, int i, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, com.facebook.ads.redexgen.core.InterfaceC0709Gk interfaceC0709Gk) throws com.facebook.ads.redexgen.core.C05449h {
        int i2;
        if (defaultTrackSelector$Parameters.A0A) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
            int[] iArrA0O = A0O(trackGroupA01, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0O.length > 0) {
                return ((com.facebook.ads.redexgen.core.InterfaceC0709Gk) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0709Gk)).A5A(trackGroupA01, iArrA0O);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    private final com.facebook.ads.redexgen.core.InterfaceC0710Gl A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, int i, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, com.facebook.ads.redexgen.core.InterfaceC0709Gk interfaceC0709Gk) throws com.facebook.ads.redexgen.core.C05449h {
        int groupIndex = -1;
        int i2 = -1;
        com.facebook.ads.redexgen.core.C0703Gc c0703Gc = null;
        for (int trackIndex = 0; trackIndex < selectedTrackIndex; trackIndex++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA01 = trackGroupArray.A01(trackIndex);
            int[] iArr2 = iArr[trackIndex];
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[7];
            int selectedGroupIndex = str.charAt(30);
            int selectedTrackIndex = str2.charAt(30);
            if (selectedGroupIndex != selectedTrackIndex) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "5kgCAopkMsZg7F4ZV1xgY9";
            for (int selectedTrackIndex2 = 0; selectedTrackIndex2 < selectedGroupIndex; selectedTrackIndex2++) {
                if (A0H(iArr2[selectedTrackIndex2], defaultTrackSelector$Parameters.A0B)) {
                    com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroupA01.A01(selectedTrackIndex2);
                    int selectedGroupIndex2 = iArr2[selectedTrackIndex2];
                    com.facebook.ads.redexgen.core.C0703Gc selectedTrackScore = new com.facebook.ads.redexgen.core.C0703Gc(formatA01, defaultTrackSelector$Parameters, selectedGroupIndex2);
                    if (c0703Gc != null) {
                        int selectedGroupIndex3 = selectedTrackScore.A00(c0703Gc);
                        if (selectedGroupIndex3 > 0) {
                            i2 = trackIndex;
                            groupIndex = selectedTrackIndex2;
                            c0703Gc = selectedTrackScore;
                        }
                    } else {
                        i2 = trackIndex;
                        groupIndex = selectedTrackIndex2;
                        c0703Gc = selectedTrackScore;
                    }
                }
            }
        }
        java.lang.String[] strArr2 = A03;
        java.lang.String str3 = strArr2[0];
        java.lang.String str4 = strArr2[7];
        int selectedGroupIndex4 = str3.charAt(30);
        int selectedTrackIndex3 = str4.charAt(30);
        if (selectedGroupIndex4 != selectedTrackIndex3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A03;
        strArr3[0] = "M5FLJD12PT3lmaOUQ9XFglzutSHDLZYg";
        strArr3[7] = "9xRNKXhRIKwGRNoeZY9pf18L4ABxNHYN";
        if (i2 == -1) {
            return null;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA02 = trackGroupArray.A01(i2);
        if (!defaultTrackSelector$Parameters.A0D && interfaceC0709Gk != null) {
            int[] iArrA0N = A0N(trackGroupA02, iArr[i2], defaultTrackSelector$Parameters.A09);
            int selectedTrackIndex4 = iArrA0N.length;
            if (selectedTrackIndex4 > 0) {
                return interfaceC0709Gk.A5A(trackGroupA02, iArrA0N);
            }
        }
        return new com.facebook.ads.redexgen.core.C0620Ci(trackGroupA02, groupIndex);
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0710Gl A0B(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, int[][] iArr, int i, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, com.facebook.ads.redexgen.core.InterfaceC0709Gk interfaceC0709Gk) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710GlA09 = null;
        if (!defaultTrackSelector$Parameters.A0D && interfaceC0709Gk != null) {
            interfaceC0710GlA09 = A09(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, interfaceC0709Gk);
        }
        if (interfaceC0710GlA09 == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return interfaceC0710GlA09;
    }

    public static java.util.List<java.lang.Integer> A0D(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int i, int i2, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(java.lang.Integer.valueOf(i3));
        }
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < trackGroup.A01; i5++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroup.A01(i5);
            if (A03[1].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "AsRc";
            if (formatA01.A0F > 0 && formatA01.A08 > 0) {
                android.graphics.Point pointA05 = A05(z, i, i2, formatA01.A0F, formatA01.A08);
                int i6 = formatA01.A0F * formatA01.A08;
                if (formatA01.A0F >= ((int) (pointA05.x * 0.98f)) && formatA01.A08 >= ((int) (pointA05.y * 0.98f)) && i6 < i4) {
                    i4 = i6;
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            int size = arrayList.size();
            if (A03[2].length() != 19) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "XusxMXAKD";
            for (int i7 = size - 1; i7 >= 0; i7--) {
                int i8 = ((java.lang.Integer) arrayList.get(i7)).intValue();
                int maxVideoPixelsToRetain = trackGroup.A01(i8).A0E();
                if (maxVideoPixelsToRetain == -1 || maxVideoPixelsToRetain > i4) {
                    arrayList.remove(i7);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(com.facebook.ads.redexgen.core.C0708Gj c0708Gj, int[][][] iArr, com.facebook.ads.redexgen.core.AG[] agArr, com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr, int i) {
        if (i == 0) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c0708Gj.A00();
            if (i4 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i5 = c0708Gj.A01(i4);
            com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl = interfaceC0710GlArr[i4];
            if ((i5 == 1 || i5 == 2) && interfaceC0710Gl != null) {
                boolean zA0M = A0M(iArr[i4], c0708Gj.A02(i4), interfaceC0710Gl);
                int tunnelingVideoRendererIndex = A03[1].length();
                if (tunnelingVideoRendererIndex == 16) {
                    throw new java.lang.RuntimeException();
                }
                A03[1] = "";
                if (!zA0M) {
                    continue;
                } else if (i5 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                }
            }
            i4++;
        }
        if (z & ((i2 == -1 || i3 == -1) ? false : true)) {
            com.facebook.ads.redexgen.core.AG ag = new com.facebook.ads.redexgen.core.AG(i);
            agArr[i2] = ag;
            agArr[i3] = ag;
        }
    }

    public static boolean A0H(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean A0I(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        return android.text.TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 61));
    }

    public static boolean A0J(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i, com.facebook.ads.redexgen.core.C0702Gb c0702Gb) {
        if (!A0H(i, false) || format.A05 != c0702Gb.A00) {
            return false;
        }
        int i2 = format.A0C;
        java.lang.String[] strArr = A03;
        if (strArr[6].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        A03[5] = "i1Rv3RXs3qomVMYLbBToUnjZJyACCjVo";
        if (i2 == c0702Gb.A01) {
            return c0702Gb.A02 == null || android.text.TextUtils.equals(c0702Gb.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, java.lang.String str) {
        return str != null && android.text.TextUtils.equals(str, com.facebook.ads.redexgen.core.IK.A0L(format.A0N));
    }

    public static boolean A0L(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !com.facebook.ads.redexgen.core.IK.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i3) {
            return false;
        }
        if (format.A08 == -1 || format.A08 <= i4) {
            return format.A04 == -1 || format.A04 <= i5;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl) {
        if (interfaceC0710Gl == null) {
            return false;
        }
        int iA00 = trackGroupArray.A00(interfaceC0710Gl.A8Y());
        for (int i = 0; i < interfaceC0710Gl.length(); i++) {
            int trackGroupIndex = iArr[iA00][interfaceC0710Gl.A7a(i)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        int trackGroupIndex2 = A03[5].charAt(17);
        if (trackGroupIndex2 != 66) {
            throw new java.lang.RuntimeException();
        }
        A03[5] = "tG1y1zDJKZkfF9elCBgE5pr6FloJMK6B";
        return true;
    }

    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, boolean z) {
        int i;
        int i2 = 0;
        com.facebook.ads.redexgen.core.C0702Gb c0702Gb = null;
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 0; i3 < selectedConfigurationTrackCount; i3++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = trackGroup.A01(i3);
            com.facebook.ads.redexgen.core.C0702Gb c0702Gb2 = new com.facebook.ads.redexgen.core.C0702Gb(formatA01.A05, formatA01.A0C, z ? null : formatA01.A0O);
            if (hashSet.add(c0702Gb2) && (i = A04(trackGroup, iArr, c0702Gb2)) > i2) {
                c0702Gb = c0702Gb2;
                if (A03[4].length() == 30) {
                    throw new java.lang.RuntimeException();
                }
                A03[2] = "QSRO8bxNHUTwbsCCzbG";
                i2 = i;
            }
        }
        if (i2 > 1) {
            int[] iArr2 = new int[i2];
            int index = 0;
            for (int i4 = 0; i4 < selectedConfigurationTrackCount; i4++) {
                if (A0J(trackGroup.A01(i4), iArr[i4], (com.facebook.ads.redexgen.core.C0702Gb) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(c0702Gb))) {
                    int selectedConfigurationTrackCount = index + 1;
                    iArr2[index] = i4;
                    index = selectedConfigurationTrackCount;
                }
            }
            return iArr2;
        }
        return A04;
    }

    public static int[] A0O(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int selectedMimeTypeTrackCount, int i3, int i4, int i5, boolean z2) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            java.util.List<java.lang.Integer> listA0D = A0D(trackGroup, i4, i5, z2);
            if (listA0D.size() < 2) {
                return A04;
            }
            java.lang.String selectedMimeType = null;
            if (!z) {
                java.util.HashSet hashSet = new java.util.HashSet();
                int i6 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < listA0D.size(); selectedMimeTypeTrackCount2++) {
                    java.lang.String str = trackGroup.A01(listA0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i, str, i2, selectedMimeTypeTrackCount, i3, listA0D)) > i6) {
                        selectedMimeType = str;
                        i6 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i, selectedMimeType, i2, selectedMimeTypeTrackCount, i3, listA0D);
            return listA0D.size() < 2 ? A04 : com.facebook.ads.redexgen.core.IK.A0j(listA0D);
        }
        return A04;
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0710Gl[] A0P(com.facebook.ads.redexgen.core.C0708Gj c0708Gj, int[][][] iArr, int[] iArr2, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws com.facebook.ads.redexgen.core.C05449h {
        int iA00 = c0708Gj.A00();
        com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr = new com.facebook.ads.redexgen.core.InterfaceC0710Gl[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z = false;
        for (int i = 0; i < iA00; i++) {
            if (2 == c0708Gj.A01(i)) {
                if (!z) {
                    interfaceC0710GlArr[i] = A0B(c0708Gj.A02(i), iArr[i], iArr2[i], defaultTrackSelector$Parameters, this.A00);
                    z = interfaceC0710GlArr[i] != null;
                }
                seenVideoRendererWithMappedTracks |= c0708Gj.A02(i).A01 > 0;
            }
        }
        boolean z2 = false;
        int rendererCount = 0;
        for (int i2 = 0; i2 < iA00; i2++) {
            int iA01 = c0708Gj.A01(i2);
            switch (iA01) {
                case 1:
                    if (!z2) {
                        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArrayA02 = c0708Gj.A02(i2);
                        int[][] iArr3 = iArr[i2];
                        int i3 = iArr2[i2];
                        interfaceC0710GlArr[i2] = A0A(trackGroupArrayA02, iArr3, i3, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        z2 = interfaceC0710GlArr[i2] != null;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    if (rendererCount == 0) {
                        interfaceC0710GlArr[i2] = A08(c0708Gj.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                        com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl = interfaceC0710GlArr[i2];
                        if (A03[4].length() == 30) {
                            throw new java.lang.RuntimeException();
                        }
                        A03[4] = "uYzutQ7tTIwb8kcWwqH9k";
                        rendererCount = interfaceC0710Gl != null ? 1 : 0;
                    } else {
                        continue;
                    }
                    break;
                default:
                    interfaceC0710GlArr[i2] = A06(iA01, c0708Gj.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return interfaceC0710GlArr;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    @Override // com.facebook.ads.redexgen.core.XB
    public final android.util.Pair<com.facebook.ads.redexgen.core.AG[], com.facebook.ads.redexgen.core.InterfaceC0710Gl[]> A0V(com.facebook.ads.redexgen.core.C0708Gj c0708Gj, int[][][] iArr, int[] iArr2) throws com.facebook.ads.redexgen.core.C05449h {
        boolean z;
        com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int iA00 = c0708Gj.A00();
        com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArrA0P = A0P(c0708Gj, iArr, iArr2, defaultTrackSelector$Parameters);
        int i = 0;
        while (rendererCount != 16) {
            java.lang.String[] strArr = A03;
            strArr[0] = "ZmrexZRrRHgZEMsoEd2PcKeNAMWqImYj";
            strArr[7] = "Uret7BWMfXvFMqMEqRmkUne58E39DlYX";
            if (i < iA00) {
                if (defaultTrackSelector$Parameters.A06(i)) {
                    interfaceC0710GlArrA0P[i] = null;
                } else {
                    com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArrayA02 = c0708Gj.A02(i);
                    if (defaultTrackSelector$Parameters.A07(i, trackGroupArrayA02)) {
                        com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride override = defaultTrackSelector$Parameters.A05(i, trackGroupArrayA02);
                        if (override == null) {
                            interfaceC0710GlArrA0P[i] = null;
                        } else {
                            int rendererCount = override.A01;
                            if (rendererCount == 1) {
                                com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroupA01 = trackGroupArrayA02.A01(override.A00);
                                int rendererCount2 = override.A02[0];
                                interfaceC0710GlArrA0P[i] = new com.facebook.ads.redexgen.core.C0620Ci(trackGroupA01, rendererCount2);
                            } else {
                                com.facebook.ads.redexgen.core.InterfaceC0709Gk interfaceC0709Gk = (com.facebook.ads.redexgen.core.InterfaceC0709Gk) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A00);
                                int i2 = override.A00;
                                int rendererCount3 = A03[1].length();
                                if (rendererCount3 == 16) {
                                    break;
                                }
                                A03[1] = "EeGbVnU9RpDUR9Bf8iFyWWXvjq6";
                                interfaceC0710GlArrA0P[i] = interfaceC0709Gk.A5A(trackGroupArrayA02.A01(i2), override.A02);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            } else {
                com.facebook.ads.redexgen.core.AG[] agArr = new com.facebook.ads.redexgen.core.AG[iA00];
                for (int i3 = 0; i3 < iA00; i3++) {
                    if (!defaultTrackSelector$Parameters.A06(i3)) {
                        int rendererCount4 = c0708Gj.A01(i3);
                        if (rendererCount4 == 5 || interfaceC0710GlArrA0P[i3] != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    agArr[i3] = z ? com.facebook.ads.redexgen.core.AG.A01 : null;
                }
                int i4 = defaultTrackSelector$Parameters.A04;
                java.lang.String[] strArr2 = A03;
                java.lang.String str = strArr2[6];
                java.lang.String str2 = strArr2[3];
                int rendererCount5 = str.length();
                if (rendererCount5 != str2.length()) {
                    break;
                }
                java.lang.String[] strArr3 = A03;
                strArr3[6] = "J9zHD1fjeZawh2cumA969EJRDnEyZ";
                strArr3[3] = "uEShLyBsBMive1cEFt5NvU7odiWqS";
                A0G(c0708Gj, iArr, agArr, interfaceC0710GlArrA0P, i4);
                return android.util.Pair.create(agArr, interfaceC0710GlArrA0P);
            }
        }
        throw new java.lang.RuntimeException();
    }
}
