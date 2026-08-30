package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry>() { // from class: androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.hls.HlsTrackMetadataEntry createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.hls.HlsTrackMetadataEntry[] newArray(int i) {
            return new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry[i];
        }
    };
    public final java.lang.String groupId;
    public final java.lang.String name;
    public final java.util.List<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo> variantInfos;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final class VariantInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo>() { // from class: androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo[] newArray(int i) {
                return new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo[i];
            }
        };
        public final java.lang.String audioGroupId;
        public final int averageBitrate;
        public final java.lang.String captionGroupId;
        public final int peakBitrate;
        public final java.lang.String subtitleGroupId;
        public final java.lang.String videoGroupId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public VariantInfo(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.averageBitrate = i;
            this.peakBitrate = i2;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
        }

        VariantInfo(android.os.Parcel parcel) {
            this.averageBitrate = parcel.readInt();
            this.peakBitrate = parcel.readInt();
            this.videoGroupId = parcel.readString();
            this.audioGroupId = parcel.readString();
            this.subtitleGroupId = parcel.readString();
            this.captionGroupId = parcel.readString();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo variantInfo = (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo) obj;
            return this.averageBitrate == variantInfo.averageBitrate && this.peakBitrate == variantInfo.peakBitrate && android.text.TextUtils.equals(this.videoGroupId, variantInfo.videoGroupId) && android.text.TextUtils.equals(this.audioGroupId, variantInfo.audioGroupId) && android.text.TextUtils.equals(this.subtitleGroupId, variantInfo.subtitleGroupId) && android.text.TextUtils.equals(this.captionGroupId, variantInfo.captionGroupId);
        }

        public int hashCode() {
            int i = ((this.averageBitrate * 31) + this.peakBitrate) * 31;
            java.lang.String str = this.videoGroupId;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.audioGroupId;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            java.lang.String str3 = this.subtitleGroupId;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            java.lang.String str4 = this.captionGroupId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.averageBitrate);
            parcel.writeInt(this.peakBitrate);
            parcel.writeString(this.videoGroupId);
            parcel.writeString(this.audioGroupId);
            parcel.writeString(this.subtitleGroupId);
            parcel.writeString(this.captionGroupId);
        }
    }

    public HlsTrackMetadataEntry(java.lang.String str, java.lang.String str2, java.util.List<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo> list) {
        this.groupId = str;
        this.name = str2;
        this.variantInfos = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    HlsTrackMetadataEntry(android.os.Parcel parcel) {
        this.groupId = parcel.readString();
        this.name = parcel.readString();
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo) parcel.readParcelable(androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo.class.getClassLoader()));
        }
        this.variantInfos = java.util.Collections.unmodifiableList(arrayList);
    }

    public java.lang.String toString() {
        return "HlsTrackMetadataEntry" + (this.groupId != null ? " [" + this.groupId + ", " + this.name + com.ironsource.y8.i.e : "");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.hls.HlsTrackMetadataEntry hlsTrackMetadataEntry = (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry) obj;
        return android.text.TextUtils.equals(this.groupId, hlsTrackMetadataEntry.groupId) && android.text.TextUtils.equals(this.name, hlsTrackMetadataEntry.name) && this.variantInfos.equals(hlsTrackMetadataEntry.variantInfos);
    }

    public int hashCode() {
        java.lang.String str = this.groupId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.name;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.variantInfos.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.groupId);
        parcel.writeString(this.name);
        int size = this.variantInfos.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.variantInfos.get(i2), 0);
        }
    }
}
