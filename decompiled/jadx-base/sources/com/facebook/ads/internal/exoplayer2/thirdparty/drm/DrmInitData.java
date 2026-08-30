package com.facebook.ads.internal.exoplayer2.thirdparty.drm;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DrmInitData implements java.util.Comparator<com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData> CREATOR = new com.facebook.ads.redexgen.core.C0588Ba();
    public int A00;
    public final int A01;
    public final java.lang.String A02;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData[] A03;

    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData> CREATOR = new com.facebook.ads.redexgen.core.C0589Bb();
        public int A00;
        public final java.lang.String A01;
        public final java.lang.String A02;
        public final boolean A03;
        public final byte[] A04;
        public final java.util.UUID A05;

        public SchemeData(android.os.Parcel parcel) {
            this.A05 = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr, boolean z) {
            this.A05 = (java.util.UUID) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(uuid);
            this.A01 = str;
            this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(str2);
            this.A04 = bArr;
            this.A03 = z;
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData schemeData = (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData) obj;
            return com.facebook.ads.redexgen.core.IK.A0g(this.A01, schemeData.A01) && com.facebook.ads.redexgen.core.IK.A0g(this.A02, schemeData.A02) && com.facebook.ads.redexgen.core.IK.A0g(this.A05, schemeData.A05) && java.util.Arrays.equals(this.A04, schemeData.A04);
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int result = this.A05.hashCode();
                int i = result * 31;
                int result2 = this.A01 == null ? 0 : this.A01.hashCode();
                int result3 = (((i + result2) * 31) + this.A02.hashCode()) * 31;
                int result4 = java.util.Arrays.hashCode(this.A04);
                this.A00 = result3 + result4;
            }
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.A05.getMostSignificantBits());
            parcel.writeLong(this.A05.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        }
    }

    public DrmInitData(android.os.Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData[]) parcel.createTypedArray(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData.CREATOR);
        this.A01 = this.A03.length;
    }

    public DrmInitData(java.lang.String str, boolean z, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        java.util.Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(java.lang.String str, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData> schemeDatas) {
        this(null, false, (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData[]) schemeDatas.toArray(new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData[schemeDatas.size()]));
    }

    public DrmInitData(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData schemeData, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData schemeData2) {
        if (com.facebook.ads.redexgen.core.AbstractC05389b.A05.equals(schemeData.A05)) {
            return com.facebook.ads.redexgen.core.AbstractC05389b.A05.equals(schemeData2.A05) ? 0 : 1;
        }
        return schemeData.A05.compareTo(schemeData2.A05);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData A01(int i) {
        return this.A03[i];
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData A02(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A0g(this.A02, str)) {
            return this;
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData = (com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData) obj;
        if (com.facebook.ads.redexgen.core.IK.A0g(this.A02, drmInitData.A02) && java.util.Arrays.equals(this.A03, drmInitData.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02 == null ? 0 : this.A02.hashCode();
            int i = result * 31;
            int result2 = java.util.Arrays.hashCode(this.A03);
            this.A00 = i + result2;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
