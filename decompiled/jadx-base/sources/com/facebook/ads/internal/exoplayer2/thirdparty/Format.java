package com.facebook.ads.internal.exoplayer2.thirdparty;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Format implements android.os.Parcelable {
    public static byte[] A0R;
    public static java.lang.String[] A0S = {"de5uy2BqkxnoVETaQgG6018QJ", "QjZ3WuGDAtQY8A5m4uZmHBOIJWs2sGqp", "lTxQXfy1tPEqYVt0GnS3AFby", "M0Hd9NF", "8IrZ9i3Wgz7X9CLGIW1Q1ZpEnKLSVzU5", "khDapw2sYLu2WK", "uYrohRFMOV8RstLYSa6yYUc7MyroLy5r", "nuinMkKCPcbDofkkuiA5GHEn1RfTFTKM"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData A0H;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A0I;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo A0J;
    public final java.lang.String A0K;
    public final java.lang.String A0L;
    public final java.lang.String A0M;
    public final java.lang.String A0N;
    public final java.lang.String A0O;
    public final java.util.List<byte[]> A0P;
    public final byte[] A0Q;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Format(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, java.lang.String str5, int i13, long j, java.util.List<byte[]> list, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        int i14 = i5;
        float f3 = f2;
        java.util.List<byte[]> list2 = list;
        int i15 = i11;
        int i16 = i10;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f3 == -1.0f ? 1.0f : f3;
        this.A0Q = bArr;
        this.A0E = i6;
        this.A0J = colorInfo;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0N = str5;
        this.A03 = i13;
        this.A0G = j;
        this.A0P = list2 == null ? java.util.Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A09(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.String str4, int i3, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, long j, java.util.List<byte[]> list) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0R = new byte[]{6, -6, -60, -72, -13, 16, 57, 60, 55, 43, 62, -14, -42, -94, 28, -21, -33, 26};
    }

    static {
        A0D();
        CREATOR = new android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.Format>() { // from class: com.facebook.ads.redexgen.X.9s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.internal.exoplayer2.thirdparty.Format createFromParcel(android.os.Parcel parcel) {
                return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.internal.exoplayer2.thirdparty.Format[] newArray(int i) {
                return new com.facebook.ads.internal.exoplayer2.thirdparty.Format[i];
            }
        };
    }

    public Format(android.os.Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        boolean hasProjectionData = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A0Q = hasProjectionData ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int i = parcel.readInt();
        this.A0P = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.class.getClassLoader());
        this.A0I = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.class.getClassLoader());
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A00(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        return A01(str, str2, i, str3, null);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A01(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, java.util.Collections.emptyList());
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A02(java.lang.String str, java.lang.String str2, long j) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A03(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, float f, java.util.List<byte[]> initializationData, int i5, float f2, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return A04(str, str2, str3, i, i2, i3, i4, f, initializationData, i5, f2, null, -1, null, drmInitData);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A04(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, float f, java.util.List<byte[]> list, int i5, float f2, byte[] bArr, int i6, com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo colorInfo, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A05(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, java.util.List<byte[]> list, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, int i8, java.lang.String str4, com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A06(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, int i5, java.util.List<byte[]> initializationData, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, int i6, java.lang.String str4) {
        return A05(str, str2, str3, i, i2, i3, i4, i5, -1, -1, initializationData, drmInitData, i6, str4, null);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A07(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, java.util.List<byte[]> initializationData, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, int i5, java.lang.String str4) {
        return A06(str, str2, str3, i, i2, i3, i4, -1, initializationData, drmInitData, i5, str4);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A08(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.String str4, int i3, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return A09(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, java.util.Collections.emptyList());
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A0A(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.util.List<byte[]> list, java.lang.String str4, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A0B(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public final int A0E() {
        if (this.A0F == -1 || this.A08 == -1) {
            return -1;
        }
        return this.A08 * this.A0F;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0F(int i) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0G(int i, int i2) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0H(long j) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j, this.A0P, this.A0H, this.A0I);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0I(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0J(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0K(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (this.A0P.size() != format.A0P.size()) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            if (!java.util.Arrays.equals(this.A0P.get(i), format.A0P.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        java.lang.String[] strArr = A0S;
        if (strArr[2].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A0S[1] = "yjtOScDk05vJZSD2Dt7eVIF";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.Format format = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) obj;
        if (this.A04 == format.A04 && this.A09 == format.A09 && this.A0F == format.A0F && this.A08 == format.A08 && this.A01 == format.A01 && this.A0B == format.A0B && this.A02 == format.A02 && this.A0E == format.A0E && this.A05 == format.A05 && this.A0C == format.A0C && this.A0A == format.A0A && this.A06 == format.A06 && this.A07 == format.A07 && this.A0G == format.A0G && this.A0D == format.A0D && com.facebook.ads.redexgen.core.IK.A0g(this.A0M, format.A0M)) {
            java.lang.String str = this.A0N;
            if (A0S[3].length() != 7) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0S;
            strArr2[7] = "vFAyIhDjx7PQTTwycAK8iUJWbttwgSfB";
            strArr2[4] = "wEeRBkPfcoUTpcJss7BEDa6c0l6NXmjY";
            if (com.facebook.ads.redexgen.core.IK.A0g(str, format.A0N) && this.A03 == format.A03 && com.facebook.ads.redexgen.core.IK.A0g(this.A0L, format.A0L) && com.facebook.ads.redexgen.core.IK.A0g(this.A0O, format.A0O) && com.facebook.ads.redexgen.core.IK.A0g(this.A0K, format.A0K) && com.facebook.ads.redexgen.core.IK.A0g(this.A0H, format.A0H) && com.facebook.ads.redexgen.core.IK.A0g(this.A0I, format.A0I) && com.facebook.ads.redexgen.core.IK.A0g(this.A0J, format.A0J) && java.util.Arrays.equals(this.A0Q, format.A0Q) && A0K(format)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        if (this.A00 == 0) {
            int i = 17 * 31;
            int result = this.A0M == null ? 0 : this.A0M.hashCode();
            int result2 = (((i + result) * 31) + (this.A0L == null ? 0 : this.A0L.hashCode())) * 31;
            int result3 = this.A0O == null ? 0 : this.A0O.hashCode();
            int result4 = (((result2 + result3) * 31) + (this.A0K == null ? 0 : this.A0K.hashCode())) * 31;
            int result5 = this.A04;
            int result6 = (((result4 + result5) * 31) + this.A0F) * 31;
            int result7 = this.A08;
            int result8 = (((result6 + result7) * 31) + this.A05) * 31;
            int result9 = this.A0C;
            int result10 = (((result8 + result9) * 31) + (this.A0N == null ? 0 : this.A0N.hashCode())) * 31;
            int result11 = this.A03;
            int i2 = (result10 + result11) * 31;
            if (this.A0H == null) {
                iHashCode = 0;
            } else {
                com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData = this.A0H;
                if (A0S[1].length() == 31) {
                    throw new java.lang.RuntimeException();
                }
                A0S[5] = "uYHkpeSB9nFFKCXFurU";
                iHashCode = drmInitData.hashCode();
            }
            int result12 = (i2 + iHashCode) * 31;
            this.A00 = result12 + (this.A0I != null ? this.A0I.hashCode() : 0);
        }
        return this.A00;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A0C(5, 7, 105)).append(this.A0M);
        java.lang.String strA0C = A0C(0, 2, 121);
        return sbAppend.append(strA0C).append(this.A0L).append(strA0C).append(this.A0O).append(strA0C).append(this.A04).append(strA0C).append(this.A0N).append(A0C(2, 3, 55)).append(this.A0F).append(strA0C).append(this.A08).append(strA0C).append(this.A01).append(A0C(14, 4, 94)).append(this.A05).append(strA0C).append(this.A0C).append(A0C(12, 2, 24)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int initializationDataSize;
        int i2;
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A0Q != null);
        if (this.A0Q != null) {
            byte[] bArr = this.A0Q;
            if (A0S[1].length() == 31) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0S;
            strArr[7] = "l0NdMuNcsvV8BIpyxAa78ogafLg9twRC";
            strArr[4] = "FxwThCj4P05UwTC97angjmmu7gEBX1aC";
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        if (A0S[6].charAt(19) != 'l') {
            A0S[6] = "1REzEz5AaJmY1W8RAT2AA8hoZB0TP5gp";
            parcel.writeInt(this.A05);
            parcel.writeInt(this.A0C);
            parcel.writeInt(this.A0A);
            parcel.writeInt(this.A06);
            parcel.writeInt(this.A07);
            parcel.writeInt(this.A0D);
            parcel.writeString(this.A0N);
            parcel.writeInt(this.A03);
            parcel.writeLong(this.A0G);
            initializationDataSize = this.A0P.size();
            parcel.writeInt(initializationDataSize);
            i2 = 0;
        } else {
            A0S[5] = "Da4E3gv4xQpsqKTZbnCdtwn7j4CUP";
            int initializationDataSize2 = this.A05;
            parcel.writeInt(initializationDataSize2);
            int initializationDataSize3 = this.A0C;
            parcel.writeInt(initializationDataSize3);
            int initializationDataSize4 = this.A0A;
            parcel.writeInt(initializationDataSize4);
            int initializationDataSize5 = this.A06;
            parcel.writeInt(initializationDataSize5);
            int initializationDataSize6 = this.A07;
            parcel.writeInt(initializationDataSize6);
            int initializationDataSize7 = this.A0D;
            parcel.writeInt(initializationDataSize7);
            parcel.writeString(this.A0N);
            int initializationDataSize8 = this.A03;
            parcel.writeInt(initializationDataSize8);
            parcel.writeLong(this.A0G);
            initializationDataSize = this.A0P.size();
            parcel.writeInt(initializationDataSize);
            i2 = 0;
        }
        while (i2 < initializationDataSize) {
            parcel.writeByteArray(this.A0P.get(i2));
            i2++;
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
