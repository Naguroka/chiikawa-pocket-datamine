package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final androidx.media3.common.AdPlaybackState.AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final java.lang.Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final androidx.media3.common.AdPlaybackState NONE = new androidx.media3.common.AdPlaybackState(null, new androidx.media3.common.AdPlaybackState.AdGroup[0], 0, androidx.media3.common.C.TIME_UNSET, 0);
    private static final androidx.media3.common.AdPlaybackState.AdGroup REMOVED_AD_GROUP = new androidx.media3.common.AdPlaybackState.AdGroup(0).withAdCount(0);
    private static final java.lang.String FIELD_AD_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_AD_RESUME_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CONTENT_DURATION_US = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_REMOVED_AD_GROUP_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final androidx.media3.common.MediaItem[] mediaItems;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;

        @java.lang.Deprecated
        public final android.net.Uri[] uris;
        private static final java.lang.String FIELD_TIME_US = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_URIS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_STATES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_DURATIONS_US = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_CONTENT_RESUME_OFFSET_US = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_IS_SERVER_SIDE_INSERTED = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_ORIGINAL_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        static final java.lang.String FIELD_MEDIA_ITEMS = androidx.media3.common.util.Util.intToStringMaxRadix(8);

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new androidx.media3.common.MediaItem[0], new long[0], 0L, false);
        }

        private AdGroup(long j, int i, int i2, int[] iArr, androidx.media3.common.MediaItem[] mediaItemArr, long[] jArr, long j2, boolean z) {
            int i3 = 0;
            androidx.media3.common.util.Assertions.checkArgument(iArr.length == mediaItemArr.length);
            this.timeUs = j;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j2;
            this.isServerSideInserted = z;
            this.uris = new android.net.Uri[mediaItemArr.length];
            while (true) {
                android.net.Uri[] uriArr = this.uris;
                if (i3 >= uriArr.length) {
                    return;
                }
                androidx.media3.common.MediaItem mediaItem = mediaItemArr[i3];
                uriArr[i3] = mediaItem == null ? null : ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
                i3++;
            }
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || this.isServerSideInserted || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i = 0; i < this.count; i++) {
                int i2 = this.states[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLivePostrollPlaceholder() {
            return this.isServerSideInserted && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = (androidx.media3.common.AdPlaybackState.AdGroup) obj;
            return this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && java.util.Arrays.equals(this.mediaItems, adGroup.mediaItems) && java.util.Arrays.equals(this.states, adGroup.states) && java.util.Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted;
        }

        public int hashCode() {
            int i = ((this.count * 31) + this.originalCount) * 31;
            long j = this.timeUs;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + java.util.Arrays.hashCode(this.mediaItems)) * 31) + java.util.Arrays.hashCode(this.states)) * 31) + java.util.Arrays.hashCode(this.durationsUs)) * 31;
            long j2 = this.contentResumeOffsetUs;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withTimeUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdCount(int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i);
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, i, this.originalCount, iArrCopyStatesWithSpaceForAdCount, (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, i), jArrCopyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @java.lang.Deprecated
        public androidx.media3.common.AdPlaybackState.AdGroup withAdUri(android.net.Uri uri, int i) {
            return withAdMediaItem(androidx.media3.common.MediaItem.fromUri(uri), i);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdMediaItem(androidx.media3.common.MediaItem mediaItem, int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, iArrCopyStatesWithSpaceForAdCount.length);
            mediaItemArr[i] = mediaItem;
            iArrCopyStatesWithSpaceForAdCount[i] = 1;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdState(int i, int i2) {
            int i3 = this.count;
            androidx.media3.common.util.Assertions.checkArgument(i3 == -1 || i2 < i3);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int i4 = iArrCopyStatesWithSpaceForAdCount[i2];
            androidx.media3.common.util.Assertions.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            iArrCopyStatesWithSpaceForAdCount[i2] = i;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, mediaItemArr.length);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = java.util.Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withContentResumeOffsetUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withIsServerSideInserted(boolean z) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withOriginalAdCount(int i) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, i, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, length);
            long[] jArrCopyOf = this.durationsUs;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, mediaItemArr, jArr, androidx.media3.common.util.Util.sum(jArr), this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, 0, this.originalCount, new int[0], new androidx.media3.common.MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 1 || i2 == 0) {
                    iArrCopyOf[i] = 2;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    iArrCopyOf[i] = this.mediaItems[i] == null ? 0 : 1;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = java.lang.Math.max(i, length);
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
            java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = java.lang.Math.max(i, length);
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax);
            java.util.Arrays.fill(jArrCopyOf, length, iMax, androidx.media3.common.C.TIME_UNSET);
            return jArrCopyOf;
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new java.util.ArrayList<>(java.util.Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles());
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            return bundle;
        }

        public static androidx.media3.common.AdPlaybackState.AdGroup fromBundle(android.os.Bundle bundle) {
            long j = bundle.getLong(FIELD_TIME_US);
            int i = bundle.getInt(FIELD_COUNT);
            int i2 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j2 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, i, i2, intArray, getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList), longArray == null ? new long[0] : longArray, j2, z);
        }

        private java.util.ArrayList<android.os.Bundle> getMediaItemsArrayBundles() {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i = 0; i < length; i++) {
                androidx.media3.common.MediaItem mediaItem = mediaItemArr[i];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration());
            }
            return arrayList;
        }

        private static androidx.media3.common.MediaItem[] getMediaItemsFromBundleArrays(java.util.ArrayList<android.os.Bundle> arrayList, java.util.ArrayList<android.net.Uri> arrayList2) {
            int i = 0;
            if (arrayList != null) {
                androidx.media3.common.MediaItem[] mediaItemArr = new androidx.media3.common.MediaItem[arrayList.size()];
                while (i < arrayList.size()) {
                    android.os.Bundle bundle = arrayList.get(i);
                    mediaItemArr[i] = bundle == null ? null : androidx.media3.common.MediaItem.fromBundle(bundle);
                    i++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new androidx.media3.common.MediaItem[0];
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = new androidx.media3.common.MediaItem[arrayList2.size()];
            while (i < arrayList2.size()) {
                android.net.Uri uri = arrayList2.get(i);
                mediaItemArr2[i] = uri == null ? null : androidx.media3.common.MediaItem.fromUri(uri);
                i++;
            }
            return mediaItemArr2;
        }
    }

    public AdPlaybackState(java.lang.Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, androidx.media3.common.C.TIME_UNSET, 0);
    }

    private AdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr, long j, long j2, int i) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
        this.adGroupCount = adGroupArr.length + i;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i;
    }

    public androidx.media3.common.AdPlaybackState.AdGroup getAdGroup(int i) {
        int i2 = this.removedAdGroupCount;
        if (i < i2) {
            return REMOVED_AD_GROUP;
        }
        return this.adGroups[i - i2];
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.adGroupCount - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (i2 >= 0 && isPositionBeforeAdGroup(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != androidx.media3.common.C.TIME_UNSET && j >= j2) {
            return -1;
        }
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i < this.adGroupCount) {
            return i;
        }
        return -1;
    }

    public boolean isAdInErrorState(int i, int i2) {
        if (i >= this.adGroupCount) {
            return false;
        }
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i);
        return adGroup.count != -1 && i2 < adGroup.count && adGroup.states[i2] == 4;
    }

    public androidx.media3.common.AdPlaybackState withAdGroupTimeUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.adGroups[i2].withTimeUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withNewAdGroup(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = new androidx.media3.common.AdPlaybackState.AdGroup(j);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayAppend(this.adGroups, adGroup);
        java.lang.System.arraycopy(adGroupArr, i2, adGroupArr, i2 + 1, this.adGroups.length - i2);
        adGroupArr[i2] = adGroup;
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdCount(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0);
        int i3 = i - this.removedAdGroupCount;
        if (this.adGroups[i3].count == i2) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = this.adGroups[i3].withAdCount(i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public androidx.media3.common.AdPlaybackState withAvailableAdUri(int i, int i2, android.net.Uri uri) {
        return withAvailableAdMediaItem(i, i2, androidx.media3.common.MediaItem.fromUri(uri));
    }

    public androidx.media3.common.AdPlaybackState withAvailableAdMediaItem(int i, int i2, androidx.media3.common.MediaItem mediaItem) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        androidx.media3.common.util.Assertions.checkState(adGroupArr2[i3].isServerSideInserted || !(mediaItem.localConfiguration == null || mediaItem.localConfiguration.uri.equals(android.net.Uri.EMPTY)));
        adGroupArr2[i3] = adGroupArr2[i3].withAdMediaItem(mediaItem, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAvailableAd(int i, int i2) {
        return withAvailableAdMediaItem(i, i2, androidx.media3.common.MediaItem.fromUri(android.net.Uri.EMPTY));
    }

    public androidx.media3.common.AdPlaybackState withPlayedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(3, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withSkippedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(2, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withLastAdRemoved(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withLastAdRemoved();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdLoadError(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(4, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withSkippedAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdDurationsUs(long[][] jArr) {
        androidx.media3.common.util.Assertions.checkState(this.removedAdGroupCount == 0);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i = 0; i < this.adGroupCount; i++) {
            adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i]);
        }
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdDurationsUs(int i, long... jArr) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.adGroups, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withRemovedAdGroupCount(int i) {
        int i2 = this.removedAdGroupCount;
        if (i2 == i) {
            return this;
        }
        androidx.media3.common.util.Assertions.checkArgument(i > i2);
        int i3 = this.adGroupCount - i;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i3];
        java.lang.System.arraycopy(this.adGroups, i - this.removedAdGroupCount, adGroupArr, 0, i3);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i);
    }

    public androidx.media3.common.AdPlaybackState withContentResumeOffsetUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        if (this.adGroups[i2].contentResumeOffsetUs == j) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withContentResumeOffsetUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withOriginalAdCount(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        if (this.adGroups[i3].originalCount == i2) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withOriginalAdCount(i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withIsServerSideInserted(int i, boolean z) {
        int i2 = i - this.removedAdGroupCount;
        if (this.adGroups[i2].isServerSideInserted == z) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsServerSideInserted(z);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withResetAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsReset();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsServerSideInserted(this.adGroupCount, true);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i = this.adGroupCount - 1;
        return i >= 0 && isLivePostrollPlaceholder(i);
    }

    public boolean isLivePostrollPlaceholder(int i) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    public static androidx.media3.common.AdPlaybackState fromAdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i];
        for (int i2 = 0; i2 < i; i2++) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.adGroups[i2];
            adGroupArr[i2] = new androidx.media3.common.AdPlaybackState.AdGroup(adGroup.timeUs, adGroup.count, adGroup.originalCount, java.util.Arrays.copyOf(adGroup.states, adGroup.states.length), (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(adGroup.mediaItems, adGroup.mediaItems.length), java.util.Arrays.copyOf(adGroup.durationsUs, adGroup.durationsUs.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted);
        }
        return new androidx.media3.common.AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) obj;
        return androidx.media3.common.util.Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && java.util.Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public int hashCode() {
        int i = this.adGroupCount * 31;
        java.lang.Object obj = this.adsId;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + java.util.Arrays.hashCode(this.adGroups);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.adGroups.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i].timeUs);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.adGroups[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.adGroups[i].states[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 == 4) {
                    sb.append('!');
                } else {
                    sb.append('?');
                }
                sb.append(", durationUs=");
                sb.append(this.adGroups[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < this.adGroups[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i);
        long j3 = adGroup.timeUs;
        if (j3 == Long.MIN_VALUE) {
            return j2 == androidx.media3.common.C.TIME_UNSET || (adGroup.isServerSideInserted && adGroup.count == -1) || j < j2;
        }
        return j < j3;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.AdPlaybackState.AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j = this.adResumePositionUs;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        if (j != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j);
        }
        long j2 = this.contentDurationUs;
        if (j2 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j2);
        }
        int i = this.removedAdGroupCount;
        if (i != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i);
        }
        return bundle;
    }

    public static androidx.media3.common.AdPlaybackState fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[0];
        } else {
            androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = new androidx.media3.common.AdPlaybackState.AdGroup[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                adGroupArr2[i] = androidx.media3.common.AdPlaybackState.AdGroup.fromBundle((android.os.Bundle) parcelableArrayList.get(i));
            }
            adGroupArr = adGroupArr2;
        }
        java.lang.String str = FIELD_AD_RESUME_POSITION_US;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        return new androidx.media3.common.AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    private static androidx.media3.common.AdPlaybackState.AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = new androidx.media3.common.AdPlaybackState.AdGroup(jArr[i]);
        }
        return adGroupArr;
    }
}
