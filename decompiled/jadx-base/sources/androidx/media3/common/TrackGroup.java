package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup {
    private static final java.lang.String FIELD_FORMATS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_ID = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String TAG = "TrackGroup";
    private final androidx.media3.common.Format[] formats;
    private int hashCode;
    public final java.lang.String id;
    public final int length;
    public final int type;

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    public TrackGroup(androidx.media3.common.Format... formatArr) {
        this("", formatArr);
    }

    public TrackGroup(java.lang.String str, androidx.media3.common.Format... formatArr) {
        androidx.media3.common.util.Assertions.checkArgument(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = androidx.media3.common.MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? androidx.media3.common.MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }

    public androidx.media3.common.TrackGroup copyWithId(java.lang.String str) {
        return new androidx.media3.common.TrackGroup(str, this.formats);
    }

    public androidx.media3.common.Format getFormat(int i) {
        return this.formats[i];
    }

    public int indexOf(androidx.media3.common.Format format) {
        int i = 0;
        while (true) {
            androidx.media3.common.Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + java.util.Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.TrackGroup trackGroup = (androidx.media3.common.TrackGroup) obj;
        return this.id.equals(trackGroup.id) && java.util.Arrays.equals(this.formats, trackGroup.formats);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.formats.length);
        for (androidx.media3.common.Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.id);
        return bundle;
    }

    public static androidx.media3.common.TrackGroup fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList immutableListFromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        if (parcelableArrayList == null) {
            immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.TrackGroup$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Format.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        return new androidx.media3.common.TrackGroup(bundle.getString(FIELD_ID, ""), (androidx.media3.common.Format[]) immutableListFromBundleList.toArray(new androidx.media3.common.Format[0]));
    }

    private void verifyCorrectness() {
        java.lang.String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            androidx.media3.common.Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                logErrorMessage("languages", this.formats[0].language, this.formats[i].language, i);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                    logErrorMessage("role flags", java.lang.Integer.toBinaryString(this.formats[0].roleFlags), java.lang.Integer.toBinaryString(this.formats[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    private static java.lang.String normalizeLanguage(java.lang.String str) {
        return (str == null || str.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void logErrorMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        androidx.media3.common.util.Log.e(TAG, "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
