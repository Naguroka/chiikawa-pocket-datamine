package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.offline.DownloadRequest createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.exoplayer.offline.DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.offline.DownloadRequest[] newArray(int i) {
            return new androidx.media3.exoplayer.offline.DownloadRequest[i];
        }
    };
    public final java.lang.String customCacheKey;
    public final byte[] data;
    public final java.lang.String id;
    public final byte[] keySetId;
    public final java.lang.String mimeType;
    public final java.util.List<androidx.media3.common.StreamKey> streamKeys;
    public final android.net.Uri uri;

    public static class UnsupportedRequestException extends java.io.IOException {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class Builder {
        private java.lang.String customCacheKey;
        private byte[] data;
        private final java.lang.String id;
        private byte[] keySetId;
        private java.lang.String mimeType;
        private java.util.List<androidx.media3.common.StreamKey> streamKeys;
        private final android.net.Uri uri;

        public Builder(java.lang.String str, android.net.Uri uri) {
            this.id = str;
            this.uri = uri;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setMimeType(java.lang.String str) {
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
            this.streamKeys = list;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setKeySetId(byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setCustomCacheKey(java.lang.String str) {
            this.customCacheKey = str;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest build() {
            java.lang.String str = this.id;
            android.net.Uri uri = this.uri;
            java.lang.String str2 = this.mimeType;
            java.util.List listOf = this.streamKeys;
            if (listOf == null) {
                listOf = com.google.common.collect.ImmutableList.of();
            }
            return new androidx.media3.exoplayer.offline.DownloadRequest(str, uri, str2, listOf, this.keySetId, this.customCacheKey, this.data);
        }
    }

    private DownloadRequest(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.util.List<androidx.media3.common.StreamKey> list, byte[] bArr, java.lang.String str3, byte[] bArr2) {
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 2 || iInferContentTypeForUriAndMimeType == 1) {
            androidx.media3.common.util.Assertions.checkArgument(str3 == null, "customCacheKey must be null for type: " + iInferContentTypeForUriAndMimeType);
        }
        this.id = str;
        this.uri = uri;
        this.mimeType = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList);
        this.streamKeys = java.util.Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? java.util.Arrays.copyOf(bArr2, bArr2.length) : androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    DownloadRequest(android.os.Parcel parcel) {
        this.id = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.uri = android.net.Uri.parse((java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((androidx.media3.common.StreamKey) parcel.readParcelable(androidx.media3.common.StreamKey.class.getClassLoader()));
        }
        this.streamKeys = java.util.Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    public androidx.media3.exoplayer.offline.DownloadRequest copyWithId(java.lang.String str) {
        return new androidx.media3.exoplayer.offline.DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new androidx.media3.exoplayer.offline.DownloadRequest(this.id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest copyWithMergedRequest(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        java.util.List listEmptyList;
        androidx.media3.common.util.Assertions.checkArgument(this.id.equals(downloadRequest.id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            listEmptyList = new java.util.ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                androidx.media3.common.StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new androidx.media3.exoplayer.offline.DownloadRequest(this.id, downloadRequest.uri, downloadRequest.mimeType, listEmptyList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data);
    }

    public androidx.media3.common.MediaItem toMediaItem() {
        return new androidx.media3.common.MediaItem.Builder().setMediaId(this.id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public java.lang.String toString() {
        return this.mimeType + ":" + this.id;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.exoplayer.offline.DownloadRequest)) {
            return false;
        }
        androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = (androidx.media3.exoplayer.offline.DownloadRequest) obj;
        return this.id.equals(downloadRequest.id) && this.uri.equals(downloadRequest.uri) && androidx.media3.common.util.Util.areEqual(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && java.util.Arrays.equals(this.keySetId, downloadRequest.keySetId) && androidx.media3.common.util.Util.areEqual(this.customCacheKey, downloadRequest.customCacheKey) && java.util.Arrays.equals(this.data, downloadRequest.data);
    }

    public final int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31 * 31) + this.uri.hashCode()) * 31;
        java.lang.String str = this.mimeType;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.streamKeys.hashCode()) * 31) + java.util.Arrays.hashCode(this.keySetId)) * 31;
        java.lang.String str2 = this.customCacheKey;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }
}
