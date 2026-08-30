package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionParameters {

    @java.lang.Deprecated
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT;
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    private static final java.lang.String FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
    private static final java.lang.String FIELD_AUDIO_OFFLOAD_PREFERENCES;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final java.lang.String FIELD_DISABLED_TRACK_TYPE;
    private static final java.lang.String FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE;
    private static final java.lang.String FIELD_FORCE_LOWEST_BITRATE;
    private static final java.lang.String FIELD_IGNORED_TEXT_SELECTION_FLAGS;
    private static final java.lang.String FIELD_IS_GAPLESS_SUPPORT_REQUIRED;
    private static final java.lang.String FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED;
    private static final java.lang.String FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED;
    private static final java.lang.String FIELD_MAX_AUDIO_BITRATE;
    private static final java.lang.String FIELD_MAX_AUDIO_CHANNEL_COUNT;
    private static final java.lang.String FIELD_MAX_VIDEO_BITRATE;
    private static final java.lang.String FIELD_MAX_VIDEO_FRAMERATE;
    private static final java.lang.String FIELD_MAX_VIDEO_HEIGHT;
    private static final java.lang.String FIELD_MAX_VIDEO_WIDTH;
    private static final java.lang.String FIELD_MIN_VIDEO_BITRATE;
    private static final java.lang.String FIELD_MIN_VIDEO_FRAMERATE;
    private static final java.lang.String FIELD_MIN_VIDEO_HEIGHT;
    private static final java.lang.String FIELD_MIN_VIDEO_WIDTH;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_LANGUAGES;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_MIME_TYPES;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_ROLE_FLAGS;
    private static final java.lang.String FIELD_PREFERRED_TEXT_LANGUAGES;
    private static final java.lang.String FIELD_PREFERRED_TEXT_ROLE_FLAGS;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_MIMETYPES;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_ROLE_FLAGS;
    private static final java.lang.String FIELD_SELECTION_OVERRIDES;
    private static final java.lang.String FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE;
    private static final java.lang.String FIELD_VIEWPORT_HEIGHT;
    private static final java.lang.String FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE;
    private static final java.lang.String FIELD_VIEWPORT_WIDTH;
    public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
    public final com.google.common.collect.ImmutableSet<java.lang.Integer> disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final boolean isPrioritizeImageOverVideoEnabled;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final com.google.common.collect.ImmutableMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public static class Builder {
        private androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
        private java.util.HashSet<java.lang.Integer> disabledTrackTypes;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int ignoredTextSelectionFlags;
        private boolean isPrioritizeImageOverVideoEnabled;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private java.util.HashMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
        private int preferredTextRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
        private int preferredVideoRoleFlags;
        private boolean selectUndeterminedTextLanguage;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        @java.lang.Deprecated
        public Builder() {
            this.maxVideoWidth = Integer.MAX_VALUE;
            this.maxVideoHeight = Integer.MAX_VALUE;
            this.maxVideoFrameRate = Integer.MAX_VALUE;
            this.maxVideoBitrate = Integer.MAX_VALUE;
            this.viewportWidth = Integer.MAX_VALUE;
            this.viewportHeight = Integer.MAX_VALUE;
            this.viewportOrientationMayChange = true;
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.of();
            this.preferredVideoRoleFlags = 0;
            this.preferredAudioLanguages = com.google.common.collect.ImmutableList.of();
            this.preferredAudioRoleFlags = 0;
            this.maxAudioChannelCount = Integer.MAX_VALUE;
            this.maxAudioBitrate = Integer.MAX_VALUE;
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.of();
            this.audioOffloadPreferences = androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT;
            this.preferredTextLanguages = com.google.common.collect.ImmutableList.of();
            this.preferredTextRoleFlags = 0;
            this.ignoredTextSelectionFlags = 0;
            this.selectUndeterminedTextLanguage = false;
            this.isPrioritizeImageOverVideoEnabled = false;
            this.forceLowestBitrate = false;
            this.forceHighestSupportedBitrate = false;
            this.overrides = new java.util.HashMap<>();
            this.disabledTrackTypes = new java.util.HashSet<>();
        }

        public Builder(android.content.Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        protected Builder(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected Builder(android.os.Bundle bundle) {
            com.google.common.collect.ImmutableList immutableListFromBundleList;
            this.maxVideoWidth = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_WIDTH, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoWidth);
            this.maxVideoHeight = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_HEIGHT, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoHeight);
            this.maxVideoFrameRate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_FRAMERATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoFrameRate);
            this.maxVideoBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_BITRATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoBitrate);
            this.minVideoWidth = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_WIDTH, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoWidth);
            this.minVideoHeight = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_HEIGHT, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoHeight);
            this.minVideoFrameRate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_FRAMERATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoFrameRate);
            this.minVideoBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_BITRATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoBitrate);
            this.viewportWidth = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_WIDTH, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportWidth);
            this.viewportHeight = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_HEIGHT, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportHeight);
            this.viewportOrientationMayChange = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportOrientationMayChange);
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_MIMETYPES), new java.lang.String[0]));
            this.preferredVideoRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_ROLE_FLAGS, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredVideoRoleFlags);
            this.preferredAudioLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LANGUAGES), new java.lang.String[0]));
            this.preferredAudioRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_ROLE_FLAGS, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredAudioRoleFlags);
            this.maxAudioChannelCount = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_AUDIO_CHANNEL_COUNT, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxAudioChannelCount);
            this.maxAudioBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_AUDIO_BITRATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxAudioBitrate);
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_MIME_TYPES), new java.lang.String[0]));
            this.audioOffloadPreferences = getAudioOffloadPreferencesFromBundle(bundle);
            this.preferredTextLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LANGUAGES), new java.lang.String[0]));
            this.preferredTextRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_TEXT_ROLE_FLAGS, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredTextRoleFlags);
            this.ignoredTextSelectionFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_IGNORED_TEXT_SELECTION_FLAGS, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.ignoredTextSelectionFlags);
            this.selectUndeterminedTextLanguage = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.selectUndeterminedTextLanguage);
            this.isPrioritizeImageOverVideoEnabled = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.isPrioritizeImageOverVideoEnabled);
            this.forceLowestBitrate = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_FORCE_LOWEST_BITRATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.forceLowestBitrate);
            this.forceHighestSupportedBitrate = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.forceHighestSupportedBitrate);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.TrackSelectionParameters.FIELD_SELECTION_OVERRIDES);
            if (parcelableArrayList == null) {
                immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
            } else {
                immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.TrackSelectionParameters$Builder$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.TrackSelectionOverride.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            this.overrides = new java.util.HashMap<>();
            for (int i = 0; i < immutableListFromBundleList.size(); i++) {
                androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) immutableListFromBundleList.get(i);
                this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
            int[] iArr = (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(androidx.media3.common.TrackSelectionParameters.FIELD_DISABLED_TRACK_TYPE), new int[0]);
            this.disabledTrackTypes = new java.util.HashSet<>();
            for (int i2 : iArr) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i2));
            }
        }

        private static androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences getAudioOffloadPreferencesFromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(androidx.media3.common.TrackSelectionParameters.FIELD_AUDIO_OFFLOAD_PREFERENCES);
            if (bundle2 != null) {
                return androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.fromBundle(bundle2);
            }
            return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().setAudioOffloadMode(bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_GAPLESS_SUPPORT_REQUIRED, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.isSpeedChangeSupportRequired)).build();
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void init(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.maxVideoWidth = trackSelectionParameters.maxVideoWidth;
            this.maxVideoHeight = trackSelectionParameters.maxVideoHeight;
            this.maxVideoFrameRate = trackSelectionParameters.maxVideoFrameRate;
            this.maxVideoBitrate = trackSelectionParameters.maxVideoBitrate;
            this.minVideoWidth = trackSelectionParameters.minVideoWidth;
            this.minVideoHeight = trackSelectionParameters.minVideoHeight;
            this.minVideoFrameRate = trackSelectionParameters.minVideoFrameRate;
            this.minVideoBitrate = trackSelectionParameters.minVideoBitrate;
            this.viewportWidth = trackSelectionParameters.viewportWidth;
            this.viewportHeight = trackSelectionParameters.viewportHeight;
            this.viewportOrientationMayChange = trackSelectionParameters.viewportOrientationMayChange;
            this.preferredVideoMimeTypes = trackSelectionParameters.preferredVideoMimeTypes;
            this.preferredVideoRoleFlags = trackSelectionParameters.preferredVideoRoleFlags;
            this.preferredAudioLanguages = trackSelectionParameters.preferredAudioLanguages;
            this.preferredAudioRoleFlags = trackSelectionParameters.preferredAudioRoleFlags;
            this.maxAudioChannelCount = trackSelectionParameters.maxAudioChannelCount;
            this.maxAudioBitrate = trackSelectionParameters.maxAudioBitrate;
            this.preferredAudioMimeTypes = trackSelectionParameters.preferredAudioMimeTypes;
            this.audioOffloadPreferences = trackSelectionParameters.audioOffloadPreferences;
            this.preferredTextLanguages = trackSelectionParameters.preferredTextLanguages;
            this.preferredTextRoleFlags = trackSelectionParameters.preferredTextRoleFlags;
            this.ignoredTextSelectionFlags = trackSelectionParameters.ignoredTextSelectionFlags;
            this.selectUndeterminedTextLanguage = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.isPrioritizeImageOverVideoEnabled = trackSelectionParameters.isPrioritizeImageOverVideoEnabled;
            this.forceLowestBitrate = trackSelectionParameters.forceLowestBitrate;
            this.forceHighestSupportedBitrate = trackSelectionParameters.forceHighestSupportedBitrate;
            this.disabledTrackTypes = new java.util.HashSet<>(trackSelectionParameters.disabledTrackTypes);
            this.overrides = new java.util.HashMap<>(trackSelectionParameters.overrides);
        }

        protected androidx.media3.common.TrackSelectionParameters.Builder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
            return setMaxVideoSize(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSize(int i, int i2) {
            this.maxVideoWidth = i;
            this.maxVideoHeight = i2;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoFrameRate(int i) {
            this.maxVideoFrameRate = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoBitrate(int i) {
            this.maxVideoBitrate = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoSize(int i, int i2) {
            this.minVideoWidth = i;
            this.minVideoHeight = i2;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoFrameRate(int i) {
            this.minVideoFrameRate = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoBitrate(int i) {
            this.minVideoBitrate = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
            android.graphics.Point currentDisplayModeSize = androidx.media3.common.util.Util.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSize(int i, int i2, boolean z) {
            this.viewportWidth = i;
            this.viewportHeight = i2;
            this.viewportOrientationMayChange = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeType(java.lang.String str) {
            return str == null ? setPreferredVideoMimeTypes(new java.lang.String[0]) : setPreferredVideoMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i) {
            this.preferredVideoRoleFlags = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredAudioLanguages(new java.lang.String[0]);
            }
            return setPreferredAudioLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.preferredAudioLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i) {
            this.preferredAudioRoleFlags = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioChannelCount(int i) {
            this.maxAudioChannelCount = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioBitrate(int i) {
            this.maxAudioBitrate = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeType(java.lang.String str) {
            return str == null ? setPreferredAudioMimeTypes(new java.lang.String[0]) : setPreferredAudioMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.audioOffloadPreferences = audioOffloadPreferences;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            android.view.accessibility.CaptioningManager captioningManager;
            if ((androidx.media3.common.util.Util.SDK_INT >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.preferredTextRoleFlags = 1088;
                java.util.Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.preferredTextLanguages = com.google.common.collect.ImmutableList.of(androidx.media3.common.util.Util.getLocaleLanguageTag(locale));
                }
            }
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredTextLanguages(new java.lang.String[0]);
            }
            return setPreferredTextLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
            this.preferredTextLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i) {
            this.preferredTextRoleFlags = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i) {
            this.ignoredTextSelectionFlags = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
            this.selectUndeterminedTextLanguage = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPrioritizeImageOverVideoEnabled(boolean z) {
            this.isPrioritizeImageOverVideoEnabled = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceLowestBitrate(boolean z) {
            this.forceLowestBitrate = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z) {
            this.forceHighestSupportedBitrate = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            clearOverridesOfType(trackSelectionOverride.getType());
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
            this.overrides.remove(trackGroup);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverridesOfType(int i) {
            java.util.Iterator<androidx.media3.common.TrackSelectionOverride> it = this.overrides.values().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == i) {
                    it.remove();
                }
            }
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverrides() {
            this.overrides.clear();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.disabledTrackTypes.clear();
            this.disabledTrackTypes.addAll(set);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
            if (z) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i));
            } else {
                this.disabledTrackTypes.remove(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters build() {
            return new androidx.media3.common.TrackSelectionParameters(this);
        }

        private static com.google.common.collect.ImmutableList<java.lang.String> normalizeLanguageCodes(java.lang.String[] strArr) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (java.lang.String str : (java.lang.String[]) androidx.media3.common.util.Assertions.checkNotNull(strArr)) {
                builder.add(androidx.media3.common.util.Util.normalizeLanguageCode((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str)));
            }
            return builder.build();
        }
    }

    public static final class AudioOffloadPreferences {
        public static final int AUDIO_OFFLOAD_MODE_DISABLED = 0;
        public static final int AUDIO_OFFLOAD_MODE_ENABLED = 1;
        public static final int AUDIO_OFFLOAD_MODE_REQUIRED = 2;
        public static final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences DEFAULT = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().build();
        private static final java.lang.String FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_IS_GAPLESS_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        public final int audioOffloadMode;
        public final boolean isGaplessSupportRequired;
        public final boolean isSpeedChangeSupportRequired;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AudioOffloadMode {
        }

        public static final class Builder {
            private int audioOffloadMode = 0;
            private boolean isGaplessSupportRequired = false;
            private boolean isSpeedChangeSupportRequired = false;

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setAudioOffloadMode(int i) {
                this.audioOffloadMode = i;
                return this;
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsGaplessSupportRequired(boolean z) {
                this.isGaplessSupportRequired = z;
                return this;
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsSpeedChangeSupportRequired(boolean z) {
                this.isSpeedChangeSupportRequired = z;
                return this;
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences build() {
                return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences(this);
            }
        }

        private AudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder) {
            this.audioOffloadMode = builder.audioOffloadMode;
            this.isGaplessSupportRequired = builder.isGaplessSupportRequired;
            this.isSpeedChangeSupportRequired = builder.isSpeedChangeSupportRequired;
        }

        public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder buildUpon() {
            return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().setAudioOffloadMode(this.audioOffloadMode).setIsGaplessSupportRequired(this.isGaplessSupportRequired).setIsSpeedChangeSupportRequired(this.isSpeedChangeSupportRequired);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = (androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences) obj;
            return this.audioOffloadMode == audioOffloadPreferences.audioOffloadMode && this.isGaplessSupportRequired == audioOffloadPreferences.isGaplessSupportRequired && this.isSpeedChangeSupportRequired == audioOffloadPreferences.isSpeedChangeSupportRequired;
        }

        public int hashCode() {
            return ((((this.audioOffloadMode + 31) * 31) + (this.isGaplessSupportRequired ? 1 : 0)) * 31) + (this.isSpeedChangeSupportRequired ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, this.audioOffloadMode);
            bundle.putBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, this.isGaplessSupportRequired);
            bundle.putBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, this.isSpeedChangeSupportRequired);
            return bundle;
        }

        public static androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder();
            java.lang.String str = FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = DEFAULT;
            return builder.setAudioOffloadMode(bundle.getInt(str, audioOffloadPreferences.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, audioOffloadPreferences.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, audioOffloadPreferences.isSpeedChangeSupportRequired)).build();
        }
    }

    static {
        androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = new androidx.media3.common.TrackSelectionParameters.Builder().build();
        DEFAULT_WITHOUT_CONTEXT = trackSelectionParametersBuild;
        DEFAULT = trackSelectionParametersBuild;
        FIELD_PREFERRED_AUDIO_LANGUAGES = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        FIELD_PREFERRED_AUDIO_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        FIELD_PREFERRED_TEXT_LANGUAGES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        FIELD_PREFERRED_TEXT_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        FIELD_MAX_VIDEO_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        FIELD_MAX_VIDEO_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        FIELD_MAX_VIDEO_FRAMERATE = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        FIELD_MAX_VIDEO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        FIELD_MIN_VIDEO_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        FIELD_MIN_VIDEO_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(11);
        FIELD_MIN_VIDEO_FRAMERATE = androidx.media3.common.util.Util.intToStringMaxRadix(12);
        FIELD_MIN_VIDEO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(13);
        FIELD_VIEWPORT_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(14);
        FIELD_VIEWPORT_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(15);
        FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = androidx.media3.common.util.Util.intToStringMaxRadix(16);
        FIELD_PREFERRED_VIDEO_MIMETYPES = androidx.media3.common.util.Util.intToStringMaxRadix(17);
        FIELD_MAX_AUDIO_CHANNEL_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(18);
        FIELD_MAX_AUDIO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(19);
        FIELD_PREFERRED_AUDIO_MIME_TYPES = androidx.media3.common.util.Util.intToStringMaxRadix(20);
        FIELD_FORCE_LOWEST_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(21);
        FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(22);
        FIELD_SELECTION_OVERRIDES = androidx.media3.common.util.Util.intToStringMaxRadix(23);
        FIELD_DISABLED_TRACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(24);
        FIELD_PREFERRED_VIDEO_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(25);
        FIELD_IGNORED_TEXT_SELECTION_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(26);
        FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE = androidx.media3.common.util.Util.intToStringMaxRadix(27);
        FIELD_IS_GAPLESS_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(28);
        FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(29);
        FIELD_AUDIO_OFFLOAD_PREFERENCES = androidx.media3.common.util.Util.intToStringMaxRadix(30);
        FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    }

    public static androidx.media3.common.TrackSelectionParameters getDefaults(android.content.Context context) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(context).build();
    }

    protected TrackSelectionParameters(androidx.media3.common.TrackSelectionParameters.Builder builder) {
        this.maxVideoWidth = builder.maxVideoWidth;
        this.maxVideoHeight = builder.maxVideoHeight;
        this.maxVideoFrameRate = builder.maxVideoFrameRate;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.minVideoWidth = builder.minVideoWidth;
        this.minVideoHeight = builder.minVideoHeight;
        this.minVideoFrameRate = builder.minVideoFrameRate;
        this.minVideoBitrate = builder.minVideoBitrate;
        this.viewportWidth = builder.viewportWidth;
        this.viewportHeight = builder.viewportHeight;
        this.viewportOrientationMayChange = builder.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = builder.preferredVideoMimeTypes;
        this.preferredVideoRoleFlags = builder.preferredVideoRoleFlags;
        this.preferredAudioLanguages = builder.preferredAudioLanguages;
        this.preferredAudioRoleFlags = builder.preferredAudioRoleFlags;
        this.maxAudioChannelCount = builder.maxAudioChannelCount;
        this.maxAudioBitrate = builder.maxAudioBitrate;
        this.preferredAudioMimeTypes = builder.preferredAudioMimeTypes;
        this.audioOffloadPreferences = builder.audioOffloadPreferences;
        this.preferredTextLanguages = builder.preferredTextLanguages;
        this.preferredTextRoleFlags = builder.preferredTextRoleFlags;
        this.ignoredTextSelectionFlags = builder.ignoredTextSelectionFlags;
        this.selectUndeterminedTextLanguage = builder.selectUndeterminedTextLanguage;
        this.isPrioritizeImageOverVideoEnabled = builder.isPrioritizeImageOverVideoEnabled;
        this.forceLowestBitrate = builder.forceLowestBitrate;
        this.forceHighestSupportedBitrate = builder.forceHighestSupportedBitrate;
        this.overrides = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) builder.overrides);
        this.disabledTrackTypes = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) builder.disabledTrackTypes);
    }

    public androidx.media3.common.TrackSelectionParameters.Builder buildUpon() {
        return new androidx.media3.common.TrackSelectionParameters.Builder(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.TrackSelectionParameters trackSelectionParameters = (androidx.media3.common.TrackSelectionParameters) obj;
        return this.maxVideoWidth == trackSelectionParameters.maxVideoWidth && this.maxVideoHeight == trackSelectionParameters.maxVideoHeight && this.maxVideoFrameRate == trackSelectionParameters.maxVideoFrameRate && this.maxVideoBitrate == trackSelectionParameters.maxVideoBitrate && this.minVideoWidth == trackSelectionParameters.minVideoWidth && this.minVideoHeight == trackSelectionParameters.minVideoHeight && this.minVideoFrameRate == trackSelectionParameters.minVideoFrameRate && this.minVideoBitrate == trackSelectionParameters.minVideoBitrate && this.viewportOrientationMayChange == trackSelectionParameters.viewportOrientationMayChange && this.viewportWidth == trackSelectionParameters.viewportWidth && this.viewportHeight == trackSelectionParameters.viewportHeight && this.preferredVideoMimeTypes.equals(trackSelectionParameters.preferredVideoMimeTypes) && this.preferredVideoRoleFlags == trackSelectionParameters.preferredVideoRoleFlags && this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.maxAudioChannelCount == trackSelectionParameters.maxAudioChannelCount && this.maxAudioBitrate == trackSelectionParameters.maxAudioBitrate && this.preferredAudioMimeTypes.equals(trackSelectionParameters.preferredAudioMimeTypes) && this.audioOffloadPreferences.equals(trackSelectionParameters.audioOffloadPreferences) && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.ignoredTextSelectionFlags == trackSelectionParameters.ignoredTextSelectionFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.isPrioritizeImageOverVideoEnabled == trackSelectionParameters.isPrioritizeImageOverVideoEnabled && this.forceLowestBitrate == trackSelectionParameters.forceLowestBitrate && this.forceHighestSupportedBitrate == trackSelectionParameters.forceHighestSupportedBitrate && this.overrides.equals(trackSelectionParameters.overrides) && this.disabledTrackTypes.equals(trackSelectionParameters.disabledTrackTypes);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.preferredVideoMimeTypes.hashCode()) * 31) + this.preferredVideoRoleFlags) * 31) + this.preferredAudioLanguages.hashCode()) * 31) + this.preferredAudioRoleFlags) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31) + this.preferredAudioMimeTypes.hashCode()) * 31) + this.audioOffloadPreferences.hashCode()) * 31) + this.preferredTextLanguages.hashCode()) * 31) + this.preferredTextRoleFlags) * 31) + this.ignoredTextSelectionFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + (this.isPrioritizeImageOverVideoEnabled ? 1 : 0)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31) + this.overrides.hashCode()) * 31) + this.disabledTrackTypes.hashCode();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_MAX_VIDEO_WIDTH, this.maxVideoWidth);
        bundle.putInt(FIELD_MAX_VIDEO_HEIGHT, this.maxVideoHeight);
        bundle.putInt(FIELD_MAX_VIDEO_FRAMERATE, this.maxVideoFrameRate);
        bundle.putInt(FIELD_MAX_VIDEO_BITRATE, this.maxVideoBitrate);
        bundle.putInt(FIELD_MIN_VIDEO_WIDTH, this.minVideoWidth);
        bundle.putInt(FIELD_MIN_VIDEO_HEIGHT, this.minVideoHeight);
        bundle.putInt(FIELD_MIN_VIDEO_FRAMERATE, this.minVideoFrameRate);
        bundle.putInt(FIELD_MIN_VIDEO_BITRATE, this.minVideoBitrate);
        bundle.putInt(FIELD_VIEWPORT_WIDTH, this.viewportWidth);
        bundle.putInt(FIELD_VIEWPORT_HEIGHT, this.viewportHeight);
        bundle.putBoolean(FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, this.viewportOrientationMayChange);
        bundle.putStringArray(FIELD_PREFERRED_VIDEO_MIMETYPES, (java.lang.String[]) this.preferredVideoMimeTypes.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_VIDEO_ROLE_FLAGS, this.preferredVideoRoleFlags);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_LANGUAGES, (java.lang.String[]) this.preferredAudioLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_AUDIO_ROLE_FLAGS, this.preferredAudioRoleFlags);
        bundle.putInt(FIELD_MAX_AUDIO_CHANNEL_COUNT, this.maxAudioChannelCount);
        bundle.putInt(FIELD_MAX_AUDIO_BITRATE, this.maxAudioBitrate);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_MIME_TYPES, (java.lang.String[]) this.preferredAudioMimeTypes.toArray(new java.lang.String[0]));
        bundle.putStringArray(FIELD_PREFERRED_TEXT_LANGUAGES, (java.lang.String[]) this.preferredTextLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_TEXT_ROLE_FLAGS, this.preferredTextRoleFlags);
        bundle.putInt(FIELD_IGNORED_TEXT_SELECTION_FLAGS, this.ignoredTextSelectionFlags);
        bundle.putBoolean(FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, this.selectUndeterminedTextLanguage);
        bundle.putInt(FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, this.audioOffloadPreferences.audioOffloadMode);
        bundle.putBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, this.audioOffloadPreferences.isGaplessSupportRequired);
        bundle.putBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, this.audioOffloadPreferences.isSpeedChangeSupportRequired);
        bundle.putBundle(FIELD_AUDIO_OFFLOAD_PREFERENCES, this.audioOffloadPreferences.toBundle());
        bundle.putBoolean(FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, this.isPrioritizeImageOverVideoEnabled);
        bundle.putBoolean(FIELD_FORCE_LOWEST_BITRATE, this.forceLowestBitrate);
        bundle.putBoolean(FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, this.forceHighestSupportedBitrate);
        bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.overrides.values(), new com.google.common.base.Function() { // from class: androidx.media3.common.TrackSelectionParameters$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.TrackSelectionOverride) obj).toBundle();
            }
        }));
        bundle.putIntArray(FIELD_DISABLED_TRACK_TYPE, com.google.common.primitives.Ints.toArray(this.disabledTrackTypes));
        return bundle;
    }

    public static androidx.media3.common.TrackSelectionParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(bundle).build();
    }
}
