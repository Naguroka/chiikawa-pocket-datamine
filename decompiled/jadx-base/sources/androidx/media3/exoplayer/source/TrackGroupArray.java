package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroupArray {
    public static final androidx.media3.exoplayer.source.TrackGroupArray EMPTY = new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup[0]);
    private static final java.lang.String FIELD_TRACK_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.TrackGroup> trackGroups;

    public TrackGroupArray(androidx.media3.common.TrackGroup... trackGroupArr) {
        this.trackGroups = com.google.common.collect.ImmutableList.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public androidx.media3.common.TrackGroup get(int i) {
        return this.trackGroups.get(i);
    }

    public int indexOf(androidx.media3.common.TrackGroup trackGroup) {
        int iIndexOf = this.trackGroups.indexOf(trackGroup);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public com.google.common.collect.ImmutableList<java.lang.Integer> getTrackTypes() {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) com.google.common.collect.Lists.transform(this.trackGroups, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.source.TrackGroupArray$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((androidx.media3.common.TrackGroup) obj).type);
            }
        }));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
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
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = (androidx.media3.exoplayer.source.TrackGroupArray) obj;
        return this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.trackGroups, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.source.TrackGroupArray$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.TrackGroup) obj).toBundle();
            }
        }));
        return bundle;
    }

    public static androidx.media3.exoplayer.source.TrackGroupArray fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            return new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup[0]);
        }
        return new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.source.TrackGroupArray$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.media3.common.TrackGroup.fromBundle((android.os.Bundle) obj);
            }
        }, parcelableArrayList).toArray(new androidx.media3.common.TrackGroup[0]));
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.trackGroups.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.trackGroups.size(); i3++) {
                if (this.trackGroups.get(i).equals(this.trackGroups.get(i3))) {
                    androidx.media3.common.util.Log.e(TAG, "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
