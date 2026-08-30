package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends androidx.media3.exoplayer.trackselection.MappingTrackSelector implements androidx.media3.exoplayer.RendererCapabilities.Listener {
    private static final java.lang.String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final com.google.common.collect.Ordering<java.lang.Integer> FORMAT_VALUE_ORDERING = com.google.common.collect.Ordering.from(new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda9
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.lambda$static$0((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    });
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final java.lang.String TAG = "DefaultTrackSelector";
    private androidx.media3.common.AudioAttributes audioAttributes;
    public final android.content.Context context;
    private final boolean deviceIsTV;
    private final java.lang.Object lock;
    private androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
    private androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializer;
    private final androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory trackSelectionFactory;

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public androidx.media3.exoplayer.RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @java.lang.Deprecated
    public static final class ParametersBuilder extends androidx.media3.common.TrackSelectionParameters.Builder {
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder delegate;

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
            return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
        }

        @java.lang.Deprecated
        public ParametersBuilder() {
            this.delegate = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder();
        }

        public ParametersBuilder(android.content.Context context) {
            this.delegate = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSize(int i, int i2) {
            this.delegate.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoSize(int i, int i2) {
            this.delegate.setMinVideoSize(i, i2);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSize(int i, int i2, boolean z) {
            this.delegate.setViewportSize(i, i2, z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeType(java.lang.String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguage(java.lang.String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeType(java.lang.String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.delegate.setAudioOffloadPreferences(audioOffloadPreferences);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguage(java.lang.String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
            this.delegate.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setForceLowestBitrate(boolean z) {
            this.delegate.setForceLowestBitrate(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
            this.delegate.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
            this.delegate.setTrackTypeDisabled(i, z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setTunnelingEnabled(boolean z) {
            this.delegate.setTunnelingEnabled(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
            this.delegate.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setRendererDisabled(int i, boolean z) {
            this.delegate.setRendererDisabled(i, z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters build() {
            return this.delegate.build();
        }
    }

    public static final class Parameters extends androidx.media3.common.TrackSelectionParameters {

        @java.lang.Deprecated
        public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT;
        public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE;
        private static final java.lang.String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final java.lang.String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final java.lang.String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final java.lang.String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final java.lang.String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final java.lang.String FIELD_RENDERER_DISABLED_INDICES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final java.lang.String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final android.util.SparseBooleanArray rendererDisabledFlags;
        private final android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends androidx.media3.common.TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final android.util.SparseBooleanArray rendererDisabledFlags;
            private final android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public /* bridge */ /* synthetic */ androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
                return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
            }

            @java.lang.Deprecated
            public Builder() {
                this.selectionOverrides = new android.util.SparseArray<>();
                this.rendererDisabledFlags = new android.util.SparseBooleanArray();
                init();
            }

            public Builder(android.content.Context context) {
                super(context);
                this.selectionOverrides = new android.util.SparseArray<>();
                this.rendererDisabledFlags = new android.util.SparseBooleanArray();
                init();
            }

            private Builder(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(android.os.Bundle bundle) {
                super(bundle);
                init();
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new android.util.SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedVideoConstraintsIfNecessary(boolean z) {
                this.exceedVideoConstraintsIfNecessary = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.allowVideoMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.allowVideoNonSeamlessAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeType(java.lang.String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguage(java.lang.String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedAudioConstraintsIfNecessary(boolean z) {
                this.exceedAudioConstraintsIfNecessary = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.allowAudioMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.allowAudioMixedSampleRateAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.allowAudioMixedChannelCountAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeType(java.lang.String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioNonSeamlessAdaptiveness(boolean z) {
                this.allowAudioNonSeamlessAdaptiveness = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.constrainAudioChannelCountToDeviceCapabilities = z;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguage(java.lang.String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.exceedRendererCapabilitiesIfNecessary = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setTunnelingEnabled(boolean z) {
                this.tunnelingEnabled = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowMultipleAdaptiveSelections(boolean z) {
                this.allowMultipleAdaptiveSelections = z;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setRendererDisabled(int i, boolean z) {
                if (this.rendererDisabledFlags.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.rendererDisabledFlags.put(i, true);
                } else {
                    this.rendererDisabledFlags.delete(i);
                }
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new java.util.HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray) && androidx.media3.common.util.Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides(int i) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters build() {
                return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters(this);
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private static android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> cloneSelectionOverrides(android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
                android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2 = new android.util.SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new java.util.HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(android.os.Bundle bundle) {
                com.google.common.collect.ImmutableList immutableListFromBundleList;
                android.util.SparseArray sparseArrayFromBundleSparseArray;
                int[] intArray = bundle.getIntArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    immutableListFromBundleList = com.google.common.collect.ImmutableList.of();
                } else {
                    immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$Builder$$ExternalSyntheticLambda0
                        @Override // com.google.common.base.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return androidx.media3.exoplayer.source.TrackGroupArray.fromBundle((android.os.Bundle) obj);
                        }
                    }, parcelableArrayList);
                }
                android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES);
                if (sparseParcelableArray == null) {
                    sparseArrayFromBundleSparseArray = new android.util.SparseArray();
                } else {
                    sparseArrayFromBundleSparseArray = androidx.media3.common.util.BundleCollectionUtil.fromBundleSparseArray(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$Builder$$ExternalSyntheticLambda1
                        @Override // com.google.common.base.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride.fromBundle((android.os.Bundle) obj);
                        }
                    }, sparseParcelableArray);
                }
                if (intArray == null || intArray.length != immutableListFromBundleList.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (androidx.media3.exoplayer.source.TrackGroupArray) immutableListFromBundleList.get(i), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) sparseArrayFromBundleSparseArray.get(i));
                }
            }

            private android.util.SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new android.util.SparseBooleanArray();
                }
                android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }
        }

        static {
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parametersBuild = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1005);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1006);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(1007);
            FIELD_TUNNELING_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(1008);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = androidx.media3.common.util.Util.intToStringMaxRadix(1009);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = androidx.media3.common.util.Util.intToStringMaxRadix(1010);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = androidx.media3.common.util.Util.intToStringMaxRadix(1011);
            FIELD_SELECTION_OVERRIDES = androidx.media3.common.util.Util.intToStringMaxRadix(1012);
            FIELD_RENDERER_DISABLED_INDICES = androidx.media3.common.util.Util.intToStringMaxRadix(1013);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1014);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1015);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = androidx.media3.common.util.Util.intToStringMaxRadix(1016);
            FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE = androidx.media3.common.util.Util.intToStringMaxRadix(1017);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1018);
        }

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getDefaults(android.content.Context context) {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder(context).build();
        }

        private Parameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @java.lang.Deprecated
        public boolean hasSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride getSelectionOverride(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon() {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder();
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) obj;
            return super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder(bundle).build();
        }

        private static void putSelectionOverridesToBundle(android.os.Bundle bundle, android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (java.util.Map.Entry<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(java.lang.Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, com.google.common.primitives.Ints.toArray(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(arrayList2, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.exoplayer.source.TrackGroupArray) obj).toBundle();
                    }
                }));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, androidx.media3.common.util.BundleCollectionUtil.toBundleSparseArray(sparseArray2, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) obj).toBundle();
                    }
                }));
            }
        }

        private static int[] getKeysFromSparseBooleanArray(android.util.SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static boolean areRendererDisabledFlagsEqual(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray, android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map, java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (java.util.Map.Entry<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> entry : map.entrySet()) {
                androidx.media3.exoplayer.source.TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !androidx.media3.common.util.Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class SelectionOverride {
        private static final java.lang.String FIELD_GROUP_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_TRACKS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_TRACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i2;
            java.util.Arrays.sort(iArrCopyOf);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + java.util.Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && java.util.Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride fromBundle(android.os.Bundle bundle) {
            int i = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i2 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= 0);
            androidx.media3.common.util.Assertions.checkNotNull(intArray);
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride(i, intArray, i2);
        }
    }

    static /* synthetic */ int lambda$static$0(java.lang.Integer num, java.lang.Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public DefaultTrackSelector(android.content.Context context) {
        this(context, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(context, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.getDefaults(context), factory);
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    @java.lang.Deprecated
    public DefaultTrackSelector(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (android.content.Context) null);
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    private DefaultTrackSelector(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory, android.content.Context context) {
        this.lock = new java.lang.Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) {
            this.parameters = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT : androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
        boolean z = context != null && androidx.media3.common.util.Util.isTv(context);
        this.deviceIsTV = z;
        if (!z && context != null && androidx.media3.common.util.Util.SDK_INT >= 32) {
            this.spatializer = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            androidx.media3.common.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            if (androidx.media3.common.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.release();
            }
        }
        super.release();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getParameters() {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) {
            setParametersInternal((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters);
        }
        setParametersInternal(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder().set(trackSelectionParameters).build());
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        boolean z;
        synchronized (this.lock) {
            z = !this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (z) {
            maybeInvalidateForAudioChannelCountConstraints();
        }
    }

    @java.lang.Deprecated
    public void setParameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public void setParameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    private void setParametersInternal(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        boolean z;
        androidx.media3.common.util.Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            z = !this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (z) {
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
                androidx.media3.common.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
            }
            invalidate();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    protected final android.util.Pair<androidx.media3.exoplayer.RendererConfiguration[], androidx.media3.exoplayer.trackselection.ExoTrackSelection[]> selectTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            parameters = this.parameters;
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && androidx.media3.common.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.ensureInitialized(this, (android.os.Looper) androidx.media3.common.util.Assertions.checkStateNotNull(android.os.Looper.myLooper()));
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i] = null;
            }
        }
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr = new androidx.media3.exoplayer.RendererConfiguration[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            boolean z = true;
            if ((parameters.getRendererDisabled(i2) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i2)))) || (mappedTrackInfo.getRendererType(i2) != -2 && exoTrackSelectionArrCreateTrackSelections[i2] == null)) {
                z = false;
            }
            rendererConfigurationArr[i2] = z ? androidx.media3.exoplayer.RendererConfiguration.DEFAULT : null;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        if (parameters.audioOffloadPreferences.audioOffloadMode != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return android.util.Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    protected androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] selectAllTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[rendererCount];
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectImageTrack = (parameters.isPrioritizeImageOverVideoEnabled || pairSelectVideoTrack == null) ? selectImageTrack(mappedTrackInfo, iArr, parameters) : null;
        if (pairSelectImageTrack != null) {
            definitionArr[((java.lang.Integer) pairSelectImageTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectImageTrack.first;
        } else if (pairSelectVideoTrack != null) {
            definitionArr[((java.lang.Integer) pairSelectVideoTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((java.lang.Integer) pairSelectAudioTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, pairSelectAudioTrack != null ? ((androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectAudioTrack.first).group.getFormat(((androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectAudioTrack.first).tracks[0]).language : null);
        if (pairSelectTextTrack != null) {
            definitionArr[((java.lang.Integer) pairSelectTextTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
        return definitionArr;
    }

    protected android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectVideoTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda2
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i, androidx.media3.common.TrackGroup trackGroup, int[] iArr3) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr3, iArr2[i]);
            }
        }, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    protected android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectAudioTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        final boolean z = false;
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                z = true;
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i2, androidx.media3.common.TrackGroup trackGroup, int[] iArr3) {
                return this.f$0.m201x92d8c743(parameters, z, iArr2, i2, trackGroup, iArr3);
            }
        }, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$selectAudioTrack$2$androidx-media3-exoplayer-trackselection-DefaultTrackSelector, reason: not valid java name */
    /* synthetic */ java.util.List m201x92d8c743(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, boolean z, int[] iArr, int i, androidx.media3.common.TrackGroup trackGroup, int[] iArr2) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2, z, new com.google.common.base.Predicate() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return this.f$0.isAudioFormatWithinAudioChannelCountConstraints((androidx.media3.common.Format) obj);
            }
        }, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(androidx.media3.common.Format format) {
        boolean z;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV33;
        synchronized (this.lock) {
            z = !this.parameters.constrainAudioChannelCountToDeviceCapabilities || this.deviceIsTV || format.channelCount <= 2 || (isDolbyAudio(format) && (androidx.media3.common.util.Util.SDK_INT < 32 || (spatializerWrapperV33 = this.spatializer) == null || !spatializerWrapperV33.isSpatializationSupported())) || (androidx.media3.common.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format));
        }
        return z;
    }

    protected android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTextTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, final java.lang.String str) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda5
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i, androidx.media3.common.TrackGroup trackGroup, int[] iArr2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2, str);
            }
        }, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    protected android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectImageTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda7
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i, androidx.media3.common.TrackGroup trackGroup, int[] iArr2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2);
            }
        }, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    protected androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition selectOtherTrack(int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, int[][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        int i2 = 0;
        androidx.media3.common.TrackGroup trackGroup = null;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore = null;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            androidx.media3.common.TrackGroup trackGroup2 = trackGroupArray.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore2 = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore(trackGroup2.getFormat(i4), iArr2[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackGroup, i2);
    }

    private <T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTracksForType(int i, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory<T> factory, java.util.Comparator<java.util.List<T>> comparator) {
        int i2;
        java.util.RandomAccess randomAccessOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int rendererCount = mappedTrackInfo.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == mappedTrackInfo.getRendererType(i3)) {
                androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.length; i4++) {
                    androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i4);
                    java.util.List<T> listCreate = factory.create(i3, trackGroup, iArr[i3][i4]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i5 = 0;
                    while (i5 < trackGroup.length) {
                        T t = listCreate.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessOf = com.google.common.collect.ImmutableList.of(t);
                                i2 = rendererCount;
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < trackGroup.length) {
                                    T t2 = listCreate.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                i2 = rendererCount;
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo) list.get(i8)).trackIndex;
        }
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo trackInfo = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo) list.get(0);
        return android.util.Pair.create(new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), java.lang.Integer.valueOf(trackInfo.rendererIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            z = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && androidx.media3.common.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
        }
        if (z) {
            invalidate();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(androidx.media3.exoplayer.Renderer renderer) {
        boolean z;
        synchronized (this.lock) {
            z = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    private static void applyTrackSelectionOverrides(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) map.get(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i2)));
            if (trackSelectionOverride != null) {
                definitionArr[i2] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i2).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, com.google.common.primitives.Ints.toArray(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, java.util.Map<java.lang.Integer, androidx.media3.common.TrackSelectionOverride> map) {
        androidx.media3.common.TrackSelectionOverride trackSelectionOverride;
        for (int i = 0; i < trackGroupArray.length; i++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(java.lang.Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(java.lang.Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static void applyLegacyRendererOverrides(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void maybeConfigureRenderersForTunneling(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= mappedTrackInfo.getRendererCount()) {
                z = true;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i3);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i3], mappedTrackInfo.getTrackGroups(i3), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
            i3++;
        }
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = new androidx.media3.exoplayer.RendererConfiguration(0, true);
            rendererConfigurationArr[i2] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (androidx.media3.exoplayer.RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static void maybeConfigureRendererForOffload(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        int i = -1;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= mappedTrackInfo.getRendererCount()) {
                z = false;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i2);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (rendererType != 1 && exoTrackSelection != null) {
                z = true;
                break;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i2][mappedTrackInfo.getTrackGroups(i2).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i3++;
                    i = i2;
                }
            }
            i2++;
        }
        if (z || i3 != 1) {
            return;
        }
        int i4 = parameters.audioOffloadPreferences.isGaplessSupportRequired ? 1 : 2;
        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = rendererConfigurationArr[i];
        if (rendererConfiguration != null && rendererConfiguration.tunneling) {
            z2 = true;
        }
        rendererConfigurationArr[i] = new androidx.media3.exoplayer.RendererConfiguration(i4, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i, androidx.media3.common.Format format) {
        if (androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isSpeedChangeSupportRequired && (androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i) & 2048) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isGaplessSupportRequired) {
            return !(format.encoderDelay != 0 || format.encoderPadding != 0) || ((androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i) & 1024) != 0);
        }
        return true;
    }

    @java.lang.Deprecated
    protected static boolean isSupported(int i, boolean z) {
        return androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, z);
    }

    protected static java.lang.String normalizeUndeterminedLanguageToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    protected static int getFormatLanguageScore(androidx.media3.common.Format format, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        java.lang.String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        java.lang.String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return androidx.media3.common.util.Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, "-")[0].equals(androidx.media3.common.util.Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(androidx.media3.common.TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                androidx.media3.common.Format format = trackGroup.getFormat(i4);
                if (format.width > 0 && format.height > 0) {
                    android.graphics.Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z, i, i2, format.width, format.height);
                    int i5 = format.width * format.height;
                    if (format.width >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && format.height >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i5 < i3) {
                        i3 = i5;
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        } else {
            i2 = i;
            i = i2;
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        if (i5 >= i6) {
            return new android.graphics.Point(i2, androidx.media3.common.util.Util.ceilDivide(i6, i3));
        }
        return new android.graphics.Point(androidx.media3.common.util.Util.ceilDivide(i5, i4), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        if (i == 0 || i != i2) {
            return java.lang.Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    private static boolean isDolbyAudio(androidx.media3.common.Format format) {
        if (format.sampleMimeType == null) {
            return false;
        }
        java.lang.String str = format.sampleMimeType;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class TrackInfo<T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> {
        public final androidx.media3.common.Format format;
        public final int rendererIndex;
        public final androidx.media3.common.TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> {
            java.util.List<T> create(int i, androidx.media3.common.TrackGroup trackGroup, int[] iArr);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);

        public TrackInfo(int i, androidx.media3.common.TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.format = trackGroup.getFormat(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class VideoTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> createForTrackGroup(int i, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, int i2) {
            int maxVideoPixelsToRetainForViewport = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                int pixelCount = trackGroup.getFormat(i3).getPixelCount();
                builder.add(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo(i, trackGroup, i3, parameters, iArr[i3], i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        public VideoTrackInfo(int i, androidx.media3.common.TrackGroup trackGroup, int i2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, int i4, boolean z) {
            super(i, trackGroup, i2);
            this.parameters = parameters;
            int i5 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i4 & i5) != 0;
            this.isWithinMaxConstraints = z && (this.format.width == -1 || this.format.width <= parameters.maxVideoWidth) && ((this.format.height == -1 || this.format.height <= parameters.maxVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate <= ((float) parameters.maxVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxVideoBitrate)));
            this.isWithinMinConstraints = z && (this.format.width == -1 || this.format.width >= parameters.minVideoWidth) && ((this.format.height == -1 || this.format.height >= parameters.minVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate >= ((float) parameters.minVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate >= parameters.minVideoBitrate)));
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false);
            this.hasReasonableFrameRate = this.format.frameRate != -1.0f && this.format.frameRate >= MIN_REASONABLE_FRAME_RATE;
            this.bitrate = this.format.bitrate;
            this.pixelCount = this.format.getPixelCount();
            this.preferredRoleFlagsScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            int i6 = 0;
            while (true) {
                if (i6 >= parameters.preferredVideoMimeTypes.size()) {
                    i6 = Integer.MAX_VALUE;
                    break;
                } else if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredVideoMimeTypes.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            this.preferredMimeTypeMatchIndex = i6;
            this.usesPrimaryDecoder = androidx.media3.exoplayer.RendererCapabilities.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = androidx.media3.exoplayer.RendererCapabilities.getHardwareAccelerationSupport(i3) == 64;
            this.codecPreferenceScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i3, i5);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo) {
            return (this.allowMixedMimeTypes || androidx.media3.common.util.Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) && (this.parameters.allowVideoMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration));
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.format.roleFlags & 16384) != 0 || !androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (this.isWithinMaxConstraints || this.parameters.exceedVideoConstraintsIfNecessary) {
                return (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (i & i2) == 0) ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            com.google.common.collect.ComparisonChain comparisonChainCompareFalseFirst = com.google.common.collect.ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(java.lang.Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), com.google.common.collect.Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                comparisonChainCompareFalseFirst = comparisonChainCompareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return comparisonChainCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            com.google.common.collect.Ordering orderingReverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            com.google.common.collect.ComparisonChain comparisonChainStart = com.google.common.collect.ComparisonChain.start();
            if (videoTrackInfo.parameters.forceLowestBitrate) {
                comparisonChainStart = comparisonChainStart.compare(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            return comparisonChainStart.compare(java.lang.Integer.valueOf(videoTrackInfo.pixelCount), java.lang.Integer.valueOf(videoTrackInfo2.pixelCount), orderingReverse).compare(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), orderingReverse).result();
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> list2) {
            return com.google.common.collect.ComparisonChain.start().compare((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).compare(list.size(), list2.size()).compare((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AudioTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final java.lang.String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> createForTrackGroup(int i, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, boolean z, com.google.common.base.Predicate<androidx.media3.common.Format> predicate, int i2) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                builder.add(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo(i, trackGroup, i3, parameters, iArr[i3], z, predicate, i2));
            }
            return builder.build();
        }

        public AudioTrackInfo(int i, androidx.media3.common.TrackGroup trackGroup, int i2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, boolean z, com.google.common.base.Predicate<androidx.media3.common.Format> predicate, int i4) {
            int i5;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i, trackGroup, i2);
            this.parameters = parameters;
            int i6 = parameters.allowAudioNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowAudioMixedMimeTypeAdaptiveness && (i4 & i6) != 0;
            this.language = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false);
            int i7 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i7 >= parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i7), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            this.isDefaultSelectionFlag = (this.format.selectionFlags & 1) != 0;
            this.channelCount = this.format.channelCount;
            this.sampleRate = this.format.sampleRate;
            this.bitrate = this.format.bitrate;
            this.isWithinConstraints = (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxAudioBitrate) && (this.format.channelCount == -1 || this.format.channelCount <= parameters.maxAudioChannelCount) && predicate.apply(this.format);
            java.lang.String[] systemLanguageCodes = androidx.media3.common.util.Util.getSystemLanguageCodes();
            int i8 = 0;
            while (true) {
                if (i8 >= systemLanguageCodes.length) {
                    formatLanguageScore2 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i8], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i8;
            this.localeLanguageScore = formatLanguageScore2;
            for (int i9 = 0; i9 < parameters.preferredAudioMimeTypes.size(); i9++) {
                if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredAudioMimeTypes.get(i9))) {
                    i5 = i9;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i5;
            this.usesPrimaryDecoder = androidx.media3.exoplayer.RendererCapabilities.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = androidx.media3.exoplayer.RendererCapabilities.getHardwareAccelerationSupport(i3) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i3, z, i6);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            return (this.parameters.allowAudioMixedChannelCountAdaptiveness || (this.format.channelCount != -1 && this.format.channelCount == audioTrackInfo.format.channelCount)) && (this.allowMixedMimeTypes || (this.format.sampleMimeType != null && android.text.TextUtils.equals(this.format.sampleMimeType, audioTrackInfo.format.sampleMimeType))) && ((this.parameters.allowAudioMixedSampleRateAdaptiveness || (this.format.sampleRate != -1 && this.format.sampleRate == audioTrackInfo.format.sampleRate)) && (this.parameters.allowAudioMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration)));
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            com.google.common.collect.Ordering orderingReverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            com.google.common.collect.ComparisonChain comparisonChainCompare = com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(java.lang.Integer.valueOf(this.preferredLanguageIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredLanguageIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(java.lang.Integer.valueOf(this.localeLanguageMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(java.lang.Integer.valueOf(this.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), com.google.common.collect.Ordering.natural().reverse());
            if (this.parameters.forceLowestBitrate) {
                comparisonChainCompare = comparisonChainCompare.compare(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(audioTrackInfo.bitrate), androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            com.google.common.collect.ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compare(java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(audioTrackInfo.channelCount), orderingReverse).compare(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(audioTrackInfo.sampleRate), orderingReverse);
            if (androidx.media3.common.util.Util.areEqual(this.language, audioTrackInfo.language)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(audioTrackInfo.bitrate), orderingReverse);
            }
            return comparisonChainCompare2.result();
        }

        private int evaluateSelectionEligibility(int i, boolean z, int i2) {
            if (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            if (this.parameters.audioOffloadPreferences.audioOffloadMode != 2 || androidx.media3.exoplayer.trackselection.DefaultTrackSelector.rendererSupportsOffload(this.parameters, i, this.format)) {
                return (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, false) || !this.isWithinConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (!this.parameters.allowMultipleAdaptiveSelections && z) || this.parameters.audioOffloadPreferences.audioOffloadMode == 2 || (i & i2) == 0) ? 1 : 2;
            }
            return 0;
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> list2) {
            return ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list)).compareTo((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TextTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            return false;
        }

        public static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> createForTrackGroup(int i, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, java.lang.String str) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str));
            }
            return builder.build();
        }

        public TextTrackInfo(int i, androidx.media3.common.TrackGroup trackGroup, int i2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, java.lang.String str) {
            com.google.common.collect.ImmutableList<java.lang.String> immutableListOf;
            int formatLanguageScore;
            super(i, trackGroup, i2);
            int i4 = 0;
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false);
            int i5 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i5 & 1) != 0;
            this.isForced = (i5 & 2) != 0;
            if (parameters.preferredTextLanguages.isEmpty()) {
                immutableListOf = com.google.common.collect.ImmutableList.of("");
            } else {
                immutableListOf = parameters.preferredTextLanguages;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListOf.size()) {
                    i6 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, immutableListOf.get(i6), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.preferredLanguageIndex = i6;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore2 = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, str, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore2 > 0);
            if (androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i4 = 1;
            }
            this.selectionEligibility = i4;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            com.google.common.collect.ComparisonChain comparisonChainCompare = com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(java.lang.Integer.valueOf(this.preferredLanguageIndex), java.lang.Integer.valueOf(textTrackInfo.preferredLanguageIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(java.lang.Boolean.valueOf(this.isForced), java.lang.Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? com.google.common.collect.Ordering.natural() : com.google.common.collect.Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return comparisonChainCompare.result();
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImageTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo imageTrackInfo) {
            return false;
        }

        public static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> createForTrackGroup(int i, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo(i, trackGroup, i2, parameters, iArr[i2]));
            }
            return builder.build();
        }

        public ImageTrackInfo(int i, androidx.media3.common.TrackGroup trackGroup, int i2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3) {
            super(i, trackGroup, i2);
            this.selectionEligibility = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            this.pixelCount = this.format.getPixelCount();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo imageTrackInfo) {
            return java.lang.Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    private static final class OtherTrackScore implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(androidx.media3.common.Format format, int i) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore) {
            return com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SpatializerWrapperV32 {
        private android.os.Handler handler;
        private android.media.Spatializer.OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final android.media.Spatializer spatializer;

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32 tryCreateInstance(android.content.Context context) {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32(audioManager.getSpatializer());
        }

        private SpatializerWrapperV32(android.media.Spatializer spatializer) {
            this.spatializer = spatializer;
            this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        }

        public void ensureInitialized(final androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector, android.os.Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new android.media.Spatializer.OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                final android.os.Handler handler = new android.os.Handler(looper);
                this.handler = handler;
                android.media.Spatializer spatializer = this.spatializer;
                java.util.Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new java.util.concurrent.Executor() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$SpatializerWrapperV32$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Executor
                    public final void execute(java.lang.Runnable runnable) {
                        handler.post(runnable);
                    }
                }, this.listener);
            }
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean canBeSpatialized(androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.common.Format format) {
            int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig((androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
            if (format.sampleRate != -1) {
                channelMask.setSampleRate(format.sampleRate);
            }
            return this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public void release() {
            android.media.Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.listener;
            if (onSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }
}
