package androidx.media3.extractor.metadata.icy;

/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyHeaders> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyHeaders>() { // from class: androidx.media3.extractor.metadata.icy.IcyHeaders.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyHeaders createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyHeaders[] newArray(int i) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders[i];
        }
    };
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final java.lang.String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final java.lang.String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final java.lang.String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final java.lang.String RESPONSE_HEADER_NAME = "icy-name";
    private static final java.lang.String RESPONSE_HEADER_PUB = "icy-pub";
    private static final java.lang.String RESPONSE_HEADER_URL = "icy-url";
    private static final java.lang.String TAG = "IcyHeaders";
    public final int bitrate;
    public final java.lang.String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final java.lang.String name;
    public final java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static androidx.media3.extractor.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        boolean z;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEquals;
        int i2;
        java.util.List<java.lang.String> list = map.get(RESPONSE_HEADER_BITRATE);
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            java.lang.String str4 = list.get(0);
            try {
                i2 = java.lang.Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        androidx.media3.common.util.Log.w(TAG, "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (java.lang.NumberFormatException unused) {
                        androidx.media3.common.util.Log.w(TAG, "Invalid bitrate header: " + str4);
                        z = false;
                    }
                }
            } catch (java.lang.NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        java.util.List<java.lang.String> list2 = map.get(RESPONSE_HEADER_GENRE);
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        java.util.List<java.lang.String> list3 = map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        java.util.List<java.lang.String> list4 = map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        java.util.List<java.lang.String> list5 = map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        java.util.List<java.lang.String> list6 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            java.lang.String str5 = list6.get(0);
            try {
                int i4 = java.lang.Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        androidx.media3.common.util.Log.w(TAG, "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (java.lang.NumberFormatException unused3) {
                        i3 = i4;
                        androidx.media3.common.util.Log.w(TAG, "Invalid metadata interval: " + str5);
                    }
                }
                z = z2;
            } catch (java.lang.NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders(i, str, str2, str3, zEquals, i5);
        }
        return null;
    }

    public IcyHeaders(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i2 == -1 || i2 > 0);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
    }

    IcyHeaders(android.os.Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = androidx.media3.common.util.Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.name;
        if (str != null) {
            builder.setStation(str);
        }
        java.lang.String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.icy.IcyHeaders icyHeaders = (androidx.media3.extractor.metadata.icy.IcyHeaders) obj;
        return this.bitrate == icyHeaders.bitrate && androidx.media3.common.util.Util.areEqual(this.genre, icyHeaders.genre) && androidx.media3.common.util.Util.areEqual(this.name, icyHeaders.name) && androidx.media3.common.util.Util.areEqual(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval;
    }

    public int hashCode() {
        int i = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bitrate) * 31;
        java.lang.String str = this.genre;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.url;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    public java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        androidx.media3.common.util.Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
    }
}
