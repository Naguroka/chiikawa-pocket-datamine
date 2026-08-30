package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements java.util.Comparator<androidx.media3.common.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData>() { // from class: androidx.media3.common.DrmInitData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.DrmInitData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.DrmInitData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.DrmInitData[] newArray(int i) {
            return new androidx.media3.common.DrmInitData[i];
        }
    };
    private int hashCode;
    public final int schemeDataCount;
    private final androidx.media3.common.DrmInitData.SchemeData[] schemeDatas;
    public final java.lang.String schemeType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static androidx.media3.common.DrmInitData createSessionCreationData(androidx.media3.common.DrmInitData drmInitData, androidx.media3.common.DrmInitData drmInitData2) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (androidx.media3.common.DrmInitData.SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (androidx.media3.common.DrmInitData.SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.hasData() && !containsSchemeDataWithUuid(arrayList, size, schemeData2.uuid)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.DrmInitData(str, arrayList);
    }

    public DrmInitData(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(null, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    public DrmInitData(java.lang.String str, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(str, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    public DrmInitData(androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this((java.lang.String) null, schemeDataArr);
    }

    public DrmInitData(java.lang.String str, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(java.lang.String str, boolean z, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z ? (androidx.media3.common.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        java.util.Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(android.os.Parcel parcel) {
        this.schemeType = parcel.readString();
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.castNonNull((androidx.media3.common.DrmInitData.SchemeData[]) parcel.createTypedArray(androidx.media3.common.DrmInitData.SchemeData.CREATOR));
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }

    public androidx.media3.common.DrmInitData.SchemeData get(int i) {
        return this.schemeDatas[i];
    }

    public androidx.media3.common.DrmInitData copyWithSchemeType(java.lang.String str) {
        return androidx.media3.common.util.Util.areEqual(this.schemeType, str) ? this : new androidx.media3.common.DrmInitData(str, false, this.schemeDatas);
    }

    public androidx.media3.common.DrmInitData merge(androidx.media3.common.DrmInitData drmInitData) {
        java.lang.String str;
        java.lang.String str2 = this.schemeType;
        androidx.media3.common.util.Assertions.checkState(str2 == null || (str = drmInitData.schemeType) == null || android.text.TextUtils.equals(str2, str));
        java.lang.String str3 = this.schemeType;
        if (str3 == null) {
            str3 = drmInitData.schemeType;
        }
        return new androidx.media3.common.DrmInitData(str3, (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.schemeDatas, drmInitData.schemeDatas));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) obj;
        return androidx.media3.common.util.Util.areEqual(this.schemeType, drmInitData.schemeType) && java.util.Arrays.equals(this.schemeDatas, drmInitData.schemeDatas);
    }

    @Override // java.util.Comparator
    public int compare(androidx.media3.common.DrmInitData.SchemeData schemeData, androidx.media3.common.DrmInitData.SchemeData schemeData2) {
        if (androidx.media3.common.C.UUID_NIL.equals(schemeData.uuid)) {
            return androidx.media3.common.C.UUID_NIL.equals(schemeData2.uuid) ? 0 : 1;
        }
        return schemeData.uuid.compareTo(schemeData2.uuid);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    private static boolean containsSchemeDataWithUuid(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList, int i, java.util.UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData>() { // from class: androidx.media3.common.DrmInitData.SchemeData.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.common.DrmInitData.SchemeData createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.common.DrmInitData.SchemeData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.common.DrmInitData.SchemeData[] newArray(int i) {
                return new androidx.media3.common.DrmInitData.SchemeData[i];
            }
        };
        public final byte[] data;
        private int hashCode;
        public final java.lang.String licenseServerUrl;
        public final java.lang.String mimeType;
        public final java.util.UUID uuid;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this.uuid = (java.util.UUID) androidx.media3.common.util.Assertions.checkNotNull(uuid);
            this.licenseServerUrl = str;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str2));
            this.data = bArr;
        }

        SchemeData(android.os.Parcel parcel) {
            this.uuid = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
            this.data = parcel.createByteArray();
        }

        public boolean matches(java.util.UUID uuid) {
            return androidx.media3.common.C.UUID_NIL.equals(this.uuid) || uuid.equals(this.uuid);
        }

        public boolean canReplace(androidx.media3.common.DrmInitData.SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.uuid);
        }

        public boolean hasData() {
            return this.data != null;
        }

        public androidx.media3.common.DrmInitData.SchemeData copyWithData(byte[] bArr) {
            return new androidx.media3.common.DrmInitData.SchemeData(this.uuid, this.licenseServerUrl, this.mimeType, bArr);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.common.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            androidx.media3.common.DrmInitData.SchemeData schemeData = (androidx.media3.common.DrmInitData.SchemeData) obj;
            return androidx.media3.common.util.Util.areEqual(this.licenseServerUrl, schemeData.licenseServerUrl) && androidx.media3.common.util.Util.areEqual(this.mimeType, schemeData.mimeType) && androidx.media3.common.util.Util.areEqual(this.uuid, schemeData.uuid) && java.util.Arrays.equals(this.data, schemeData.data);
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                int iHashCode = this.uuid.hashCode() * 31;
                java.lang.String str = this.licenseServerUrl;
                this.hashCode = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mimeType.hashCode()) * 31) + java.util.Arrays.hashCode(this.data);
            }
            return this.hashCode;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }
    }
}
