package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class Tracks {
    public static final androidx.media3.common.Tracks EMPTY = new androidx.media3.common.Tracks(com.google.common.collect.ImmutableList.of());
    private static final java.lang.String FIELD_TRACK_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private final com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final androidx.media3.common.TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final java.lang.String FIELD_TRACK_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_TRACK_SUPPORT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_TRACK_SELECTED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_ADAPTIVE_SUPPORTED = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public Group(androidx.media3.common.TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = false;
            androidx.media3.common.util.Assertions.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.adaptiveSupported = z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public androidx.media3.common.TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public androidx.media3.common.Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            return i2 == 4 || (z && i2 == 3);
        }

        public boolean isSelected() {
            return com.google.common.primitives.Booleans.contains(this.trackSelected, true);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public androidx.media3.common.Tracks.Group copyWithId(java.lang.String str) {
            return new androidx.media3.common.Tracks.Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) obj;
            return this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && java.util.Arrays.equals(this.trackSupport, group.trackSupport) && java.util.Arrays.equals(this.trackSelected, group.trackSelected);
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.trackSupport)) * 31) + java.util.Arrays.hashCode(this.trackSelected);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public static androidx.media3.common.Tracks.Group fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.TrackGroup trackGroupFromBundle = androidx.media3.common.TrackGroup.fromBundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new androidx.media3.common.Tracks.Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }
    }

    public Tracks(java.util.List<androidx.media3.common.Tracks.Group> list) {
        this.groups = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    public com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> getGroups() {
        return this.groups;
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i && this.groups.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            androidx.media3.common.Tracks.Group group = this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((androidx.media3.common.Tracks) obj).groups);
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.groups, new com.google.common.base.Function() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.Tracks.Group) obj).toBundle();
            }
        }));
        return bundle;
    }

    public static androidx.media3.common.Tracks fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList immutableListFromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Tracks.Group.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        return new androidx.media3.common.Tracks(immutableListFromBundleList);
    }
}
