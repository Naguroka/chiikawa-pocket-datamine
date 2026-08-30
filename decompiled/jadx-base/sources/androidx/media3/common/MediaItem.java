package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItem {
    public static final java.lang.String DEFAULT_MEDIA_ID = "";
    public final androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.ClippingProperties clippingProperties;
    public final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    public final androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
    public final java.lang.String mediaId;
    public final androidx.media3.common.MediaMetadata mediaMetadata;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.LocalConfiguration playbackProperties;
    public final androidx.media3.common.MediaItem.RequestMetadata requestMetadata;
    public static final androidx.media3.common.MediaItem EMPTY = new androidx.media3.common.MediaItem.Builder().build();
    private static final java.lang.String FIELD_MEDIA_ID = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_LIVE_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_MEDIA_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CLIPPING_PROPERTIES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_REQUEST_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_LOCAL_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    public static androidx.media3.common.MediaItem fromUri(java.lang.String str) {
        return new androidx.media3.common.MediaItem.Builder().setUri(str).build();
    }

    public static androidx.media3.common.MediaItem fromUri(android.net.Uri uri) {
        return new androidx.media3.common.MediaItem.Builder().setUri(uri).build();
    }

    public static final class Builder {
        private androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration;
        private androidx.media3.common.MediaItem.ClippingConfiguration.Builder clippingConfiguration;
        private java.lang.String customCacheKey;
        private androidx.media3.common.MediaItem.DrmConfiguration.Builder drmConfiguration;
        private long imageDurationMs;
        private androidx.media3.common.MediaItem.LiveConfiguration.Builder liveConfiguration;
        private java.lang.String mediaId;
        private androidx.media3.common.MediaMetadata mediaMetadata;
        private java.lang.String mimeType;
        private androidx.media3.common.MediaItem.RequestMetadata requestMetadata;
        private java.util.List<androidx.media3.common.StreamKey> streamKeys;
        private com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> subtitleConfigurations;
        private java.lang.Object tag;
        private android.net.Uri uri;

        public Builder() {
            this.clippingConfiguration = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            this.drmConfiguration = new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
            this.streamKeys = java.util.Collections.emptyList();
            this.subtitleConfigurations = com.google.common.collect.ImmutableList.of();
            this.liveConfiguration = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            this.requestMetadata = androidx.media3.common.MediaItem.RequestMetadata.EMPTY;
            this.imageDurationMs = androidx.media3.common.C.TIME_UNSET;
        }

        private Builder(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder;
            this();
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                if (localConfiguration.drmConfiguration != null) {
                    builder = localConfiguration.drmConfiguration.buildUpon();
                } else {
                    builder = new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
                this.imageDurationMs = localConfiguration.imageDurationMs;
            }
        }

        public androidx.media3.common.MediaItem.Builder setMediaId(java.lang.String str) {
            this.mediaId = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setUri(java.lang.String str) {
            return setUri(str == null ? null : android.net.Uri.parse(str));
        }

        public androidx.media3.common.MediaItem.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setMimeType(java.lang.String str) {
            this.mimeType = str;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipStartPositionMs(long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipRelativeToLiveWindow(boolean z) {
            this.clippingConfiguration.setRelativeToLiveWindow(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipStartsAtKeyFrame(boolean z) {
            this.clippingConfiguration.setStartsAtKeyFrame(z);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setDrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseUri(android.net.Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseUri(java.lang.String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = com.google.common.collect.ImmutableMap.of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmUuid(java.util.UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmMultiSession(boolean z) {
            this.drmConfiguration.setMultiSession(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmConfiguration.setForceDefaultLicenseUri(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmSessionForClearPeriods(boolean z) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmSessionForClearTypes(java.util.List<java.lang.Integer> list) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = com.google.common.collect.ImmutableList.of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmKeySetId(byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
            java.util.List<androidx.media3.common.StreamKey> listEmptyList;
            if (list != null && !list.isEmpty()) {
                listEmptyList = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            } else {
                listEmptyList = java.util.Collections.emptyList();
            }
            this.streamKeys = listEmptyList;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setCustomCacheKey(java.lang.String str) {
            this.customCacheKey = str;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setSubtitles(java.util.List<androidx.media3.common.MediaItem.Subtitle> list) {
            this.subtitleConfigurations = list != null ? com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list) : com.google.common.collect.ImmutableList.of();
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setSubtitleConfigurations(java.util.List<androidx.media3.common.MediaItem.SubtitleConfiguration> list) {
            this.subtitleConfigurations = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setAdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(java.lang.String str) {
            return setAdTagUri(str != null ? android.net.Uri.parse(str) : null);
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri) {
            return setAdTagUri(uri, null);
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri, java.lang.Object obj) {
            this.adsConfiguration = uri != null ? new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMinPlaybackSpeed(float f) {
            this.liveConfiguration.setMinPlaybackSpeed(f);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveConfiguration.setMaxPlaybackSpeed(f);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setImageDurationMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.imageDurationMs = j;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setRequestMetadata(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        public androidx.media3.common.MediaItem build() {
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
            androidx.media3.common.util.Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            android.net.Uri uri = this.uri;
            if (uri != null) {
                localConfiguration = new androidx.media3.common.MediaItem.LocalConfiguration(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag, this.imageDurationMs);
            } else {
                localConfiguration = null;
            }
            java.lang.String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            androidx.media3.common.MediaItem.ClippingProperties clippingPropertiesBuildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationBuild = this.liveConfiguration.build();
            androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            }
            return new androidx.media3.common.MediaItem(str2, clippingPropertiesBuildClippingProperties, localConfiguration, liveConfigurationBuild, mediaMetadata, this.requestMetadata);
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;
        private final byte[] keySetId;
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;
        public final android.net.Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> requestHeaders;
        public final java.util.UUID scheme;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableList<java.lang.Integer> sessionForClearTypes;

        @java.lang.Deprecated
        public final java.util.UUID uuid;
        private static final java.lang.String FIELD_SCHEME = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_LICENSE_URI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_LICENSE_REQUEST_HEADERS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_MULTI_SESSION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        static final java.lang.String FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_FORCE_DEFAULT_LICENSE_URI = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_FORCED_SESSION_TRACK_TYPES = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_KEY_SET_ID = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;
            private byte[] keySetId;
            private com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;
            private android.net.Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private java.util.UUID scheme;

            public Builder(java.util.UUID uuid) {
                this();
                this.scheme = uuid;
            }

            @java.lang.Deprecated
            private Builder() {
                this.licenseRequestHeaders = com.google.common.collect.ImmutableMap.of();
                this.playClearContentWithoutKey = true;
                this.forcedSessionTrackTypes = com.google.common.collect.ImmutableList.of();
            }

            private Builder(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setNullableScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(android.net.Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(java.lang.String str) {
                this.licenseUri = str == null ? null : android.net.Uri.parse(str);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
                this.licenseRequestHeaders = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                com.google.common.collect.ImmutableList immutableListOf;
                if (z) {
                    immutableListOf = com.google.common.collect.ImmutableList.of(2, 1);
                } else {
                    immutableListOf = com.google.common.collect.ImmutableList.of();
                }
                setForcedSessionTrackTypes(immutableListOf);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForcedSessionTrackTypes(java.util.List<java.lang.Integer> list) {
                this.forcedSessionTrackTypes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setKeySetId(byte[] bArr) {
                this.keySetId = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration build() {
                return new androidx.media3.common.MediaItem.DrmConfiguration(this);
            }
        }

        private DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder builder) {
            androidx.media3.common.util.Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            java.util.UUID uuid = (java.util.UUID) androidx.media3.common.util.Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? java.util.Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public androidx.media3.common.MediaItem.DrmConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.DrmConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = (androidx.media3.common.MediaItem.DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && androidx.media3.common.util.Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && androidx.media3.common.util.Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && java.util.Arrays.equals(this.keySetId, drmConfiguration.keySetId);
        }

        public int hashCode() {
            int iHashCode = this.scheme.hashCode() * 31;
            android.net.Uri uri = this.licenseUri;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + java.util.Arrays.hashCode(this.keySetId);
        }

        public static androidx.media3.common.MediaItem.DrmConfiguration fromBundle(android.os.Bundle bundle) {
            java.util.UUID uuidFromString = java.util.UUID.fromString((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(bundle.getString(FIELD_SCHEME)));
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_LICENSE_URI);
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> immutableMapBundleToStringImmutableMap = androidx.media3.common.util.BundleCollectionUtil.bundleToStringImmutableMap(androidx.media3.common.util.BundleCollectionUtil.getBundleWithDefault(bundle, FIELD_LICENSE_REQUEST_HEADERS, android.os.Bundle.EMPTY));
            boolean z = bundle.getBoolean(FIELD_MULTI_SESSION, false);
            boolean z2 = bundle.getBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, false);
            boolean z3 = bundle.getBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, false);
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) androidx.media3.common.util.BundleCollectionUtil.getIntegerArrayListWithDefault(bundle, FIELD_FORCED_SESSION_TRACK_TYPES, new java.util.ArrayList()));
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(immutableMapBundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(immutableListCopyOf).setKeySetId(bundle.getByteArray(FIELD_KEY_SET_ID)).build();
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(FIELD_SCHEME, this.scheme.toString());
            android.net.Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_LICENSE_URI, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(FIELD_LICENSE_REQUEST_HEADERS, androidx.media3.common.util.BundleCollectionUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z = this.multiSession;
            if (z) {
                bundle.putBoolean(FIELD_MULTI_SESSION, z);
            }
            boolean z2 = this.playClearContentWithoutKey;
            if (z2) {
                bundle.putBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, z2);
            }
            boolean z3 = this.forceDefaultLicenseUri;
            if (z3) {
                bundle.putBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, z3);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(FIELD_FORCED_SESSION_TRACK_TYPES, new java.util.ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                bundle.putByteArray(FIELD_KEY_SET_ID, bArr);
            }
            return bundle;
        }
    }

    public static final class AdsConfiguration {
        private static final java.lang.String FIELD_AD_TAG_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        public final android.net.Uri adTagUri;
        public final java.lang.Object adsId;

        public static final class Builder {
            private android.net.Uri adTagUri;
            private java.lang.Object adsId;

            public Builder(android.net.Uri uri) {
                this.adTagUri = uri;
            }

            public androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdTagUri(android.net.Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdsId(java.lang.Object obj) {
                this.adsId = obj;
                return this;
            }

            public androidx.media3.common.MediaItem.AdsConfiguration build() {
                return new androidx.media3.common.MediaItem.AdsConfiguration(this);
            }
        }

        private AdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration.Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public androidx.media3.common.MediaItem.AdsConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.AdsConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = (androidx.media3.common.MediaItem.AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && androidx.media3.common.util.Util.areEqual(this.adsId, adsConfiguration.adsId);
        }

        public int hashCode() {
            int iHashCode = this.adTagUri.hashCode() * 31;
            java.lang.Object obj = this.adsId;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public static androidx.media3.common.MediaItem.AdsConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_AD_TAG_URI);
            androidx.media3.common.util.Assertions.checkNotNull(uri);
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).build();
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_AD_TAG_URI, this.adTagUri);
            return bundle;
        }
    }

    public static final class LocalConfiguration {
        public final androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration;
        public final java.lang.String customCacheKey;
        public final androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration;
        public final long imageDurationMs;
        public final java.lang.String mimeType;
        public final java.util.List<androidx.media3.common.StreamKey> streamKeys;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> subtitleConfigurations;

        @java.lang.Deprecated
        public final java.util.List<androidx.media3.common.MediaItem.Subtitle> subtitles;
        public final java.lang.Object tag;
        public final android.net.Uri uri;
        private static final java.lang.String FIELD_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_DRM_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_ADS_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_STREAM_KEYS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_CUSTOM_CACHE_KEY = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_SUBTITLE_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_IMAGE_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        private LocalConfiguration(android.net.Uri uri, java.lang.String str, androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration, androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration, java.util.List<androidx.media3.common.StreamKey> list, java.lang.String str2, com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> immutableList, java.lang.Object obj, long j) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add(immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
            this.imageDurationMs = j;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LocalConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = (androidx.media3.common.MediaItem.LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && androidx.media3.common.util.Util.areEqual(this.mimeType, localConfiguration.mimeType) && androidx.media3.common.util.Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && androidx.media3.common.util.Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && androidx.media3.common.util.Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && androidx.media3.common.util.Util.areEqual(this.tag, localConfiguration.tag) && androidx.media3.common.util.Util.areEqual(java.lang.Long.valueOf(this.imageDurationMs), java.lang.Long.valueOf(localConfiguration.imageDurationMs));
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            int iHashCode3 = (iHashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            int iHashCode4 = (((iHashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            java.lang.String str2 = this.customCacheKey;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitleConfigurations.hashCode()) * 31;
            java.lang.Object obj = this.tag;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.imageDurationMs);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(FIELD_DRM_CONFIGURATION, drmConfiguration.toBundle());
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(FIELD_ADS_CONFIGURATION, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_STREAM_KEYS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.streamKeys, new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.common.StreamKey) obj).toBundle();
                    }
                }));
            }
            java.lang.String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(FIELD_CUSTOM_CACHE_KEY, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.subtitleConfigurations, new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.common.MediaItem.SubtitleConfiguration) obj).toBundle();
                    }
                }));
            }
            long j = this.imageDurationMs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(FIELD_IMAGE_DURATION_MS, j);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.LocalConfiguration fromBundle(android.os.Bundle bundle) {
            com.google.common.collect.ImmutableList immutableListFromBundleList;
            com.google.common.collect.ImmutableList immutableListFromBundleList2;
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_DRM_CONFIGURATION);
            androidx.media3.common.MediaItem.DrmConfiguration drmConfigurationFromBundle = bundle2 == null ? null : androidx.media3.common.MediaItem.DrmConfiguration.fromBundle(bundle2);
            android.os.Bundle bundle3 = bundle.getBundle(FIELD_ADS_CONFIGURATION);
            androidx.media3.common.MediaItem.AdsConfiguration adsConfigurationFromBundle = bundle3 != null ? androidx.media3.common.MediaItem.AdsConfiguration.fromBundle(bundle3) : null;
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_STREAM_KEYS);
            if (parcelableArrayList == null) {
                immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
            } else {
                immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda2
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.StreamKey.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            com.google.common.collect.ImmutableList immutableList = immutableListFromBundleList;
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION);
            if (parcelableArrayList2 == null) {
                immutableListFromBundleList2 = com.google.common.collect.ImmutableList.of();
            } else {
                immutableListFromBundleList2 = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda3
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.MediaItem.SubtitleConfiguration.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList2);
            }
            return new androidx.media3.common.MediaItem.LocalConfiguration((android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull((android.net.Uri) bundle.getParcelable(FIELD_URI)), bundle.getString(FIELD_MIME_TYPE), drmConfigurationFromBundle, adsConfigurationFromBundle, immutableList, bundle.getString(FIELD_CUSTOM_CACHE_KEY), immutableListFromBundleList2, null, bundle.getLong(FIELD_IMAGE_DURATION_MS, androidx.media3.common.C.TIME_UNSET));
        }
    }

    public static final class LiveConfiguration {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final androidx.media3.common.MediaItem.LiveConfiguration UNSET = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().build();
        private static final java.lang.String FIELD_TARGET_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIN_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_MAX_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_MIN_PLAYBACK_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_MAX_PLAYBACK_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public Builder() {
                this.targetOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.minOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.maxOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration build() {
                return new androidx.media3.common.MediaItem.LiveConfiguration(this);
            }
        }

        private LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @java.lang.Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public androidx.media3.common.MediaItem.LiveConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LiveConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = (androidx.media3.common.MediaItem.LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxOffsetMs;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.minPlaybackSpeed;
            int iFloatToIntBits = (i2 + (f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return iFloatToIntBits + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.targetOffsetMs;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(FIELD_TARGET_OFFSET_MS, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(FIELD_MIN_OFFSET_MS, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(FIELD_MAX_OFFSET_MS, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(FIELD_MIN_PLAYBACK_SPEED, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(FIELD_MAX_PLAYBACK_SPEED, f2);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.LiveConfiguration fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.LiveConfiguration.Builder builder = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            java.lang.String str = FIELD_TARGET_OFFSET_MS;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            return builder.setTargetOffsetMs(bundle.getLong(str, liveConfiguration.targetOffsetMs)).setMinOffsetMs(bundle.getLong(FIELD_MIN_OFFSET_MS, liveConfiguration.minOffsetMs)).setMaxOffsetMs(bundle.getLong(FIELD_MAX_OFFSET_MS, liveConfiguration.maxOffsetMs)).setMinPlaybackSpeed(bundle.getFloat(FIELD_MIN_PLAYBACK_SPEED, liveConfiguration.minPlaybackSpeed)).setMaxPlaybackSpeed(bundle.getFloat(FIELD_MAX_PLAYBACK_SPEED, liveConfiguration.maxPlaybackSpeed)).build();
        }
    }

    public static class SubtitleConfiguration {
        public final java.lang.String id;
        public final java.lang.String label;
        public final java.lang.String language;
        public final java.lang.String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final android.net.Uri uri;
        private static final java.lang.String FIELD_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_LANGUAGE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_SELECTION_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_LABEL = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_ID = androidx.media3.common.util.Util.intToStringMaxRadix(6);

        public static final class Builder {
            private java.lang.String id;
            private java.lang.String label;
            private java.lang.String language;
            private java.lang.String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private android.net.Uri uri;

            public Builder(android.net.Uri uri) {
                this.uri = uri;
            }

            private Builder(androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.id = subtitleConfiguration.id;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setUri(android.net.Uri uri) {
                this.uri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setMimeType(java.lang.String str) {
                this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLanguage(java.lang.String str) {
                this.language = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLabel(java.lang.String str) {
                this.label = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setId(java.lang.String str) {
                this.id = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration build() {
                return new androidx.media3.common.MediaItem.SubtitleConfiguration(this);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public androidx.media3.common.MediaItem.Subtitle buildSubtitle() {
                return new androidx.media3.common.MediaItem.Subtitle(this);
            }
        }

        private SubtitleConfiguration(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.id = str4;
        }

        private SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.id = builder.id;
        }

        public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.SubtitleConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration = (androidx.media3.common.MediaItem.SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && androidx.media3.common.util.Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && androidx.media3.common.util.Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && androidx.media3.common.util.Util.areEqual(this.label, subtitleConfiguration.label) && androidx.media3.common.util.Util.areEqual(this.id, subtitleConfiguration.id);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.language;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            java.lang.String str3 = this.label;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.id;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public static androidx.media3.common.MediaItem.SubtitleConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull((android.net.Uri) bundle.getParcelable(FIELD_URI));
            java.lang.String string = bundle.getString(FIELD_MIME_TYPE);
            java.lang.String string2 = bundle.getString(FIELD_LANGUAGE);
            int i = bundle.getInt(FIELD_SELECTION_FLAGS, 0);
            int i2 = bundle.getInt(FIELD_ROLE_FLAGS, 0);
            java.lang.String string3 = bundle.getString(FIELD_LABEL);
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(FIELD_ID)).build();
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            java.lang.String str2 = this.language;
            if (str2 != null) {
                bundle.putString(FIELD_LANGUAGE, str2);
            }
            int i = this.selectionFlags;
            if (i != 0) {
                bundle.putInt(FIELD_SELECTION_FLAGS, i);
            }
            int i2 = this.roleFlags;
            if (i2 != 0) {
                bundle.putInt(FIELD_ROLE_FLAGS, i2);
            }
            java.lang.String str3 = this.label;
            if (str3 != null) {
                bundle.putString(FIELD_LABEL, str3);
            }
            java.lang.String str4 = this.id;
            if (str4 != null) {
                bundle.putString(FIELD_ID, str4);
            }
            return bundle;
        }
    }

    @java.lang.Deprecated
    public static final class Subtitle extends androidx.media3.common.MediaItem.SubtitleConfiguration {
        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            this(uri, str, str2, 0);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static class ClippingConfiguration {
        public final long endPositionMs;
        public final long endPositionUs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final long startPositionUs;
        public final boolean startsAtKeyFrame;
        public static final androidx.media3.common.MediaItem.ClippingConfiguration UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().build();
        private static final java.lang.String FIELD_START_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_END_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_RELATIVE_TO_LIVE_WINDOW = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_RELATIVE_TO_DEFAULT_POSITION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_STARTS_AT_KEY_FRAME = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        static final java.lang.String FIELD_START_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        static final java.lang.String FIELD_END_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(6);

        public static final class Builder {
            private long endPositionUs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionUs;
            private boolean startsAtKeyFrame;

            public Builder() {
                this.endPositionUs = Long.MIN_VALUE;
            }

            private Builder(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
                this.startPositionUs = clippingConfiguration.startPositionUs;
                this.endPositionUs = clippingConfiguration.endPositionUs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionMs(long j) {
                return setStartPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0);
                this.startPositionUs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionMs(long j) {
                return setEndPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.endPositionUs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration build() {
                return new androidx.media3.common.MediaItem.ClippingConfiguration(this);
            }

            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.ClippingProperties buildClippingProperties() {
                return new androidx.media3.common.MediaItem.ClippingProperties(this);
            }
        }

        private ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            this.startPositionMs = androidx.media3.common.util.Util.usToMs(builder.startPositionUs);
            this.endPositionMs = androidx.media3.common.util.Util.usToMs(builder.endPositionUs);
            this.startPositionUs = builder.startPositionUs;
            this.endPositionUs = builder.endPositionUs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        public androidx.media3.common.MediaItem.ClippingConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.ClippingConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = (androidx.media3.common.MediaItem.ClippingConfiguration) obj;
            return this.startPositionUs == clippingConfiguration.startPositionUs && this.endPositionUs == clippingConfiguration.endPositionUs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
        }

        public int hashCode() {
            long j = this.startPositionUs;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.endPositionUs;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.startPositionMs;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(FIELD_START_POSITION_MS, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(FIELD_END_POSITION_MS, j2);
            }
            long j3 = this.startPositionUs;
            if (j3 != clippingConfiguration.startPositionUs) {
                bundle.putLong(FIELD_START_POSITION_US, j3);
            }
            long j4 = this.endPositionUs;
            if (j4 != clippingConfiguration.endPositionUs) {
                bundle.putLong(FIELD_END_POSITION_US, j4);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(FIELD_STARTS_AT_KEY_FRAME, z3);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.ClippingProperties fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            java.lang.String str = FIELD_START_POSITION_MS;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder startsAtKeyFrame = builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(FIELD_END_POSITION_MS, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(FIELD_STARTS_AT_KEY_FRAME, clippingConfiguration.startsAtKeyFrame));
            long j = bundle.getLong(FIELD_START_POSITION_US, clippingConfiguration.startPositionUs);
            if (j != clippingConfiguration.startPositionUs) {
                startsAtKeyFrame.setStartPositionUs(j);
            }
            long j2 = bundle.getLong(FIELD_END_POSITION_US, clippingConfiguration.endPositionUs);
            if (j2 != clippingConfiguration.endPositionUs) {
                startsAtKeyFrame.setEndPositionUs(j2);
            }
            return startsAtKeyFrame.buildClippingProperties();
        }
    }

    @java.lang.Deprecated
    public static final class ClippingProperties extends androidx.media3.common.MediaItem.ClippingConfiguration {
        public static final androidx.media3.common.MediaItem.ClippingProperties UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static final class RequestMetadata {
        public final android.os.Bundle extras;
        public final android.net.Uri mediaUri;
        public final java.lang.String searchQuery;
        public static final androidx.media3.common.MediaItem.RequestMetadata EMPTY = new androidx.media3.common.MediaItem.RequestMetadata.Builder().build();
        private static final java.lang.String FIELD_MEDIA_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_SEARCH_QUERY = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(2);

        public static final class Builder {
            private android.os.Bundle extras;
            private android.net.Uri mediaUri;
            private java.lang.String searchQuery;

            public Builder() {
            }

            private Builder(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setMediaUri(android.net.Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setSearchQuery(java.lang.String str) {
                this.searchQuery = str;
                return this;
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setExtras(android.os.Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public androidx.media3.common.MediaItem.RequestMetadata build() {
                return new androidx.media3.common.MediaItem.RequestMetadata(this);
            }
        }

        private RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }

        public androidx.media3.common.MediaItem.RequestMetadata.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.RequestMetadata)) {
                return false;
            }
            androidx.media3.common.MediaItem.RequestMetadata requestMetadata = (androidx.media3.common.MediaItem.RequestMetadata) obj;
            if (androidx.media3.common.util.Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && androidx.media3.common.util.Util.areEqual(this.searchQuery, requestMetadata.searchQuery)) {
                if ((this.extras == null) == (requestMetadata.extras == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            android.net.Uri uri = this.mediaUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            java.lang.String str = this.searchQuery;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.extras != null ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            android.net.Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_MEDIA_URI, uri);
            }
            java.lang.String str = this.searchQuery;
            if (str != null) {
                bundle.putString(FIELD_SEARCH_QUERY, str);
            }
            android.os.Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(FIELD_EXTRAS, bundle2);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.RequestMetadata fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri((android.net.Uri) bundle.getParcelable(FIELD_MEDIA_URI)).setSearchQuery(bundle.getString(FIELD_SEARCH_QUERY)).setExtras(bundle.getBundle(FIELD_EXTRAS)).build();
        }
    }

    private MediaItem(java.lang.String str, androidx.media3.common.MediaItem.ClippingProperties clippingProperties, androidx.media3.common.MediaItem.LocalConfiguration localConfiguration, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public androidx.media3.common.MediaItem.Builder buildUpon() {
        return new androidx.media3.common.MediaItem.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.MediaItem)) {
            return false;
        }
        androidx.media3.common.MediaItem mediaItem = (androidx.media3.common.MediaItem) obj;
        return androidx.media3.common.util.Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && androidx.media3.common.util.Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && androidx.media3.common.util.Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && androidx.media3.common.util.Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && androidx.media3.common.util.Util.areEqual(this.requestMetadata, mediaItem.requestMetadata);
    }

    public int hashCode() {
        int iHashCode = this.mediaId.hashCode() * 31;
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = this.localConfiguration;
        return ((((((((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    private android.os.Bundle toBundle(boolean z) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(FIELD_MEDIA_ID, this.mediaId);
        }
        if (!this.liveConfiguration.equals(androidx.media3.common.MediaItem.LiveConfiguration.UNSET)) {
            bundle.putBundle(FIELD_LIVE_CONFIGURATION, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(androidx.media3.common.MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET)) {
            bundle.putBundle(FIELD_CLIPPING_PROPERTIES, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(androidx.media3.common.MediaItem.RequestMetadata.EMPTY)) {
            bundle.putBundle(FIELD_REQUEST_METADATA, this.requestMetadata.toBundle());
        }
        if (z && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(FIELD_LOCAL_CONFIGURATION, localConfiguration.toBundle());
        }
        return bundle;
    }

    public android.os.Bundle toBundle() {
        return toBundle(false);
    }

    public android.os.Bundle toBundleIncludeLocalConfiguration() {
        return toBundle(true);
    }

    public static androidx.media3.common.MediaItem fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationFromBundle;
        androidx.media3.common.MediaMetadata mediaMetadataFromBundle;
        androidx.media3.common.MediaItem.ClippingProperties clippingPropertiesFromBundle;
        androidx.media3.common.MediaItem.RequestMetadata requestMetadataFromBundle;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(bundle.getString(FIELD_MEDIA_ID, ""));
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
        if (bundle2 == null) {
            liveConfigurationFromBundle = androidx.media3.common.MediaItem.LiveConfiguration.UNSET;
        } else {
            liveConfigurationFromBundle = androidx.media3.common.MediaItem.LiveConfiguration.fromBundle(bundle2);
        }
        androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = liveConfigurationFromBundle;
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_MEDIA_METADATA);
        if (bundle3 == null) {
            mediaMetadataFromBundle = androidx.media3.common.MediaMetadata.EMPTY;
        } else {
            mediaMetadataFromBundle = androidx.media3.common.MediaMetadata.fromBundle(bundle3);
        }
        androidx.media3.common.MediaMetadata mediaMetadata = mediaMetadataFromBundle;
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_CLIPPING_PROPERTIES);
        if (bundle4 == null) {
            clippingPropertiesFromBundle = androidx.media3.common.MediaItem.ClippingProperties.UNSET;
        } else {
            clippingPropertiesFromBundle = androidx.media3.common.MediaItem.ClippingConfiguration.fromBundle(bundle4);
        }
        androidx.media3.common.MediaItem.ClippingProperties clippingProperties = clippingPropertiesFromBundle;
        android.os.Bundle bundle5 = bundle.getBundle(FIELD_REQUEST_METADATA);
        if (bundle5 == null) {
            requestMetadataFromBundle = androidx.media3.common.MediaItem.RequestMetadata.EMPTY;
        } else {
            requestMetadataFromBundle = androidx.media3.common.MediaItem.RequestMetadata.fromBundle(bundle5);
        }
        androidx.media3.common.MediaItem.RequestMetadata requestMetadata = requestMetadataFromBundle;
        android.os.Bundle bundle6 = bundle.getBundle(FIELD_LOCAL_CONFIGURATION);
        return new androidx.media3.common.MediaItem(str, clippingProperties, bundle6 == null ? null : androidx.media3.common.MediaItem.LocalConfiguration.fromBundle(bundle6), liveConfiguration, mediaMetadata, requestMetadata);
    }
}
