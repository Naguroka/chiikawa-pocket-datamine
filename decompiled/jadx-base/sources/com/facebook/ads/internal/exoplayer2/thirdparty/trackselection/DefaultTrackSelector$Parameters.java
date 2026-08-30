package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements android.os.Parcelable {
    public static java.lang.String[] A0I = {"8cmZQKSr4e", "iMp0vhQuApByAzd3UlzuqPNosBBIij56", "lQE7OUEJZwYk", "ijVF0TjJmPEEom5xXBBS3MNokpliI9Vz", "24priIiqAscL", "HHTbuc6jJnpbFValFtkFIwv24qRilhed", "j1grCTc2L", "MPdgTc6Z3sPUFClC4uSLQHQa2XebDs9v"};
    public static final com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters A0J = new com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters();
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters> CREATOR = new com.facebook.ads.redexgen.core.C0704Gd();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final java.lang.String A07;
    public final java.lang.String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> A0G;
    public final android.util.SparseBooleanArray A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A01(android.os.Parcel parcel, android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> mapValueAt = sparseArray.valueAt(i);
            int size2 = mapValueAt.size();
            parcel.writeInt(iKeyAt);
            parcel.writeInt(size2);
            for (java.util.Map.Entry<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> entry : mapValueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A04(java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> map, java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> entry : map.entrySet()) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray key = entry.getKey();
            if (!map2.containsKey(key) || !com.facebook.ads.redexgen.core.IK.A0g(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public DefaultTrackSelector$Parameters() {
        this(new android.util.SparseArray(), new android.util.SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(android.os.Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A09 = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A0A = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A0B = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> sparseArray, android.util.SparseBooleanArray sparseBooleanArray, java.lang.String str, java.lang.String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = com.facebook.ads.redexgen.core.IK.A0L(str);
        this.A08 = com.facebook.ads.redexgen.core.IK.A0L(str2);
        this.A0E = z;
        this.A00 = i;
        this.A0D = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = i5;
        this.A05 = i6;
        this.A0F = z7;
        this.A04 = i7;
    }

    public static android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> A00(android.os.Parcel parcel) {
        int i = parcel.readInt();
        android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> sparseArray = new android.util.SparseArray<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parcel.readInt();
            int overrideCount = parcel.readInt();
            java.util.HashMap map = new java.util.HashMap(overrideCount);
            for (int i4 = 0; i4 < overrideCount; i4++) {
                map.put((com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.class.getClassLoader()), (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(i3, map);
        }
        return sparseArray;
    }

    public static boolean A02(android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> second, android.util.SparseArray<java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = second.size();
        int firstSize = sparseArray.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int iKeyAt = second.keyAt(indexInSecond);
            java.lang.String[] strArr = A0I;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[1];
            int indexInFirst = str.charAt(21);
            int firstSize2 = str2.charAt(21);
            if (indexInFirst == firstSize2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0I;
            strArr2[2] = "cTRaF8RO9nXx";
            strArr2[4] = "EDqN0kPd4EtP";
            int firstSize3 = sparseArray.indexOfKey(iKeyAt);
            if (firstSize3 < 0 || !A04(second.valueAt(indexInSecond), sparseArray.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride A05(int i, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray) {
        java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i);
        if (overrides != null) {
            return overrides.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i) {
        return this.A0H.get(i);
    }

    public final boolean A07(int i, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray) {
        java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i);
        return overrides != null && overrides.containsKey(trackGroupArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters) obj;
        if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02) {
            boolean z = this.A0C;
            boolean z2 = defaultTrackSelector$Parameters.A0C;
            java.lang.String[] strArr = A0I;
            if (strArr[5].charAt(6) == strArr[7].charAt(6)) {
                java.lang.String[] strArr2 = A0I;
                strArr2[2] = "sfh4v5JH9YfM";
                strArr2[4] = "60euWtnhJ0n7";
                if (z == z2 && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01) {
                    int i = this.A04;
                    java.lang.String[] strArr3 = A0I;
                    if (strArr3[3].charAt(21) != strArr3[1].charAt(21)) {
                        java.lang.String[] strArr4 = A0I;
                        strArr4[3] = "jFxDzMr4Wl6CXL9gL9bgBgUZ4CFyGZQQ";
                        strArr4[1] = "AvCBIiMA1IKKXmLhd6rc5nfLtcJ8dACa";
                        if (i == defaultTrackSelector$Parameters.A04 && android.text.TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && android.text.TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
                            return true;
                        }
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.A0E ? 1 : 0) * 31) + this.A00) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A03) * 31) + this.A02) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + this.A06) * 31) + this.A05) * 31) + this.A01) * 31) + this.A04) * 31) + (this.A07 == null ? 0 : this.A07.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0D);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A09);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0C);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
