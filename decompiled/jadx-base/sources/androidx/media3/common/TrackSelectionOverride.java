package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride {
    public final androidx.media3.common.TrackGroup mediaTrackGroup;
    public final com.google.common.collect.ImmutableList<java.lang.Integer> trackIndices;
    private static final java.lang.String FIELD_TRACK_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_TRACKS = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public TrackSelectionOverride(androidx.media3.common.TrackGroup trackGroup, int i) {
        this(trackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i)));
    }

    public TrackSelectionOverride(androidx.media3.common.TrackGroup trackGroup, java.util.List<java.lang.Integer> list) {
        if (!list.isEmpty() && (((java.lang.Integer) java.util.Collections.min(list)).intValue() < 0 || ((java.lang.Integer) java.util.Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) obj;
        return this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices);
    }

    public int hashCode() {
        return this.mediaTrackGroup.hashCode() + (this.trackIndices.hashCode() * 31);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, com.google.common.primitives.Ints.toArray(this.trackIndices));
        return bundle;
    }

    public static androidx.media3.common.TrackSelectionOverride fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.TrackSelectionOverride(androidx.media3.common.TrackGroup.fromBundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP))), com.google.common.primitives.Ints.asList((int[]) androidx.media3.common.util.Assertions.checkNotNull(bundle.getIntArray(FIELD_TRACKS))));
    }
}
