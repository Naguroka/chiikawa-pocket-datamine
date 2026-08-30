package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilities {
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final java.lang.String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final java.lang.String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final android.util.SparseArray<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    public static final androidx.media3.exoplayer.audio.AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new androidx.media3.exoplayer.audio.AudioCapabilities(com.google.common.collect.ImmutableList.of(androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile.DEFAULT_AUDIO_PROFILE));
    private static final com.google.common.collect.ImmutableList<java.lang.Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = com.google.common.collect.ImmutableList.of(2, 5, 6);
    static final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new com.google.common.collect.ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilities(android.content.Context context) {
        return getCapabilities(context, androidx.media3.common.AudioAttributes.DEFAULT, null);
    }

    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilities(android.content.Context context, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo) {
        return getCapabilitiesInternal(context, audioAttributes, (androidx.media3.common.util.Util.SDK_INT < 23 || audioDeviceInfo == null) ? null : new androidx.media3.exoplayer.audio.AudioDeviceInfoApi23(audioDeviceInfo));
    }

    static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternal(android.content.Context context, androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfoApi23);
    }

    static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternal(android.content.Context context, android.content.Intent intent, androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        android.media.AudioManager audioManager = (android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull(context.getSystemService("audio"));
        if (audioDeviceInfoApi23 == null) {
            audioDeviceInfoApi23 = androidx.media3.common.util.Util.SDK_INT >= 33 ? androidx.media3.exoplayer.audio.AudioCapabilities.Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 33 && (androidx.media3.common.util.Util.isTv(context) || androidx.media3.common.util.Util.isAutomotive(context))) {
            return androidx.media3.exoplayer.audio.AudioCapabilities.Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23 && androidx.media3.exoplayer.audio.AudioCapabilities.Api23.isBluetoothConnected(audioManager, audioDeviceInfoApi23)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        com.google.common.collect.ImmutableSet.Builder builder = new com.google.common.collect.ImmutableSet.Builder();
        builder.add(2);
        if (androidx.media3.common.util.Util.SDK_INT >= 29 && (androidx.media3.common.util.Util.isTv(context) || androidx.media3.common.util.Util.isAutomotive(context))) {
            builder.addAll((java.lang.Iterable) androidx.media3.exoplayer.audio.AudioCapabilities.Api29.getDirectPlaybackSupportedEncodings(audioAttributes));
            return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.common.primitives.Ints.toArray(builder.build()), 10));
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        boolean z = android.provider.Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z || deviceMaySetExternalSurroundSoundGlobalSetting()) && android.provider.Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            builder.addAll((java.lang.Iterable) EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                builder.addAll((java.lang.Iterable) com.google.common.primitives.Ints.asList(intArrayExtra));
            }
            return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.common.primitives.Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.common.primitives.Ints.toArray(builder.build()), 10));
    }

    static android.net.Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return android.provider.Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    @java.lang.Deprecated
    public AudioCapabilities(int[] iArr, int i) {
        this(getAudioProfiles(iArr, i));
    }

    private AudioCapabilities(java.util.List<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> list) {
        this.encodingToAudioProfile = new android.util.SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = list.get(i);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.encodingToAudioProfile.size(); i2++) {
            iMax = java.lang.Math.max(iMax, this.encodingToAudioProfile.valueAt(i2).maxChannelCount);
        }
        this.maxChannelCount = iMax;
    }

    public boolean supportsEncoding(int i) {
        return androidx.media3.common.util.Util.contains(this.encodingToAudioProfile, i);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    @java.lang.Deprecated
    public boolean isPassthroughPlaybackSupported(androidx.media3.common.Format format) {
        return isPassthroughPlaybackSupported(format, androidx.media3.common.AudioAttributes.DEFAULT);
    }

    public boolean isPassthroughPlaybackSupported(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    @java.lang.Deprecated
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, androidx.media3.common.AudioAttributes.DEFAULT);
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        int maxSupportedChannelCountForPassthrough;
        int encoding = androidx.media3.common.MimeTypes.getEncoding((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(java.lang.Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = (androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile) androidx.media3.common.util.Assertions.checkNotNull(this.encodingToAudioProfile.get(encoding));
        if (format.channelCount == -1 || encoding == 18) {
            maxSupportedChannelCountForPassthrough = audioProfile.getMaxSupportedChannelCountForPassthrough(format.sampleRate != -1 ? format.sampleRate : 48000, audioAttributes);
        } else {
            maxSupportedChannelCountForPassthrough = format.channelCount;
            if (!format.sampleMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_DTS_X) || androidx.media3.common.util.Util.SDK_INT >= 33) {
                if (!audioProfile.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                    return null;
                }
            } else if (maxSupportedChannelCountForPassthrough > 10) {
                return null;
            }
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(encoding), java.lang.Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.audio.AudioCapabilities)) {
            return false;
        }
        androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities = (androidx.media3.exoplayer.audio.AudioCapabilities) obj;
        return androidx.media3.common.util.Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (androidx.media3.common.util.Util.contentHashCode(this.encodingToAudioProfile) * 31);
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + com.ironsource.y8.i.e;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        return "Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) || "Xiaomi".equals(androidx.media3.common.util.Util.MANUFACTURER);
    }

    private static int getChannelConfigForPassthrough(int i) {
        if (androidx.media3.common.util.Util.SDK_INT <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT <= 26 && "fugu".equals(androidx.media3.common.util.Util.DEVICE) && i == 1) {
            i = 2;
        }
        return androidx.media3.common.util.Util.getAudioTrackChannelConfig(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> getAudioProfiles(java.util.List<android.media.AudioProfile> list) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(2, new java.util.HashSet(com.google.common.primitives.Ints.asList(12)));
        for (int i = 0; i < list.size(); i++) {
            android.media.AudioProfile audioProfile = list.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (androidx.media3.common.util.Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(java.lang.Integer.valueOf(format))) {
                    if (map.containsKey(java.lang.Integer.valueOf(format))) {
                        ((java.util.Set) androidx.media3.common.util.Assertions.checkNotNull((java.util.Set) map.get(java.lang.Integer.valueOf(format)))).addAll(com.google.common.primitives.Ints.asList(audioProfile.getChannelMasks()));
                    } else {
                        map.put(java.lang.Integer.valueOf(format), new java.util.HashSet(com.google.common.primitives.Ints.asList(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            builder.add(new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set<java.lang.Integer>) entry.getValue()));
        }
        return builder.build();
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> getAudioProfiles(int[] iArr, int i) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            builder.add(new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(i2, i));
        }
        return builder.build();
    }

    private static final class AudioProfile {
        public static final androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile DEFAULT_AUDIO_PROFILE;
        private final com.google.common.collect.ImmutableSet<java.lang.Integer> channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile;
            if (androidx.media3.common.util.Util.SDK_INT >= 33) {
                audioProfile = new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(2, getAllChannelMasksForMaxChannelCount(10));
            } else {
                audioProfile = new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(2, 10);
            }
            DEFAULT_AUDIO_PROFILE = audioProfile;
        }

        public AudioProfile(int i, java.util.Set<java.lang.Integer> set) {
            this.encoding = i;
            com.google.common.collect.ImmutableSet<java.lang.Integer> immutableSetCopyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) set);
            this.channelMasks = immutableSetCopyOf;
            com.google.common.collect.UnmodifiableIterator<java.lang.Integer> it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = java.lang.Math.max(iMax, java.lang.Integer.bitCount(it.next().intValue()));
            }
            this.maxChannelCount = iMax;
        }

        public AudioProfile(int i, int i2) {
            this.encoding = i;
            this.maxChannelCount = i2;
            this.channelMasks = null;
        }

        public boolean supportsChannelCount(int i) {
            if (this.channelMasks == null) {
                return i <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(i);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(java.lang.Integer.valueOf(audioTrackChannelConfig));
        }

        public int getMaxSupportedChannelCountForPassthrough(int i, androidx.media3.common.AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 29) {
                return androidx.media3.exoplayer.audio.AudioCapabilities.Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i, audioAttributes);
            }
            return ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(java.lang.Integer.valueOf(this.encoding), 0))).intValue();
        }

        private static com.google.common.collect.ImmutableSet<java.lang.Integer> getAllChannelMasksForMaxChannelCount(int i) {
            com.google.common.collect.ImmutableSet.Builder builder = new com.google.common.collect.ImmutableSet.Builder();
            for (int i2 = 1; i2 <= i; i2++) {
                builder.add(java.lang.Integer.valueOf(androidx.media3.common.util.Util.getAudioTrackChannelConfig(i2)));
            }
            return builder.build();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile)) {
                return false;
            }
            androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = (androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && androidx.media3.common.util.Util.areEqual(this.channelMasks, audioProfile.channelMasks);
        }

        public int hashCode() {
            int i = ((this.encoding * 31) + this.maxChannelCount) * 31;
            com.google.common.collect.ImmutableSet<java.lang.Integer> immutableSet = this.channelMasks;
            return i + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public java.lang.String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + com.ironsource.y8.i.e;
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static boolean isBluetoothConnected(android.media.AudioManager audioManager, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            android.media.AudioDeviceInfo[] devices = audioDeviceInfoApi23 == null ? ((android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull(audioManager)).getDevices(2) : new android.media.AudioDeviceInfo[]{audioDeviceInfoApi23.audioDeviceInfo};
            com.google.common.collect.ImmutableSet<java.lang.Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(java.lang.Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        private static com.google.common.collect.ImmutableSet<java.lang.Integer> getAllBluetoothDeviceTypes() {
            com.google.common.collect.ImmutableSet.Builder builderAdd = new com.google.common.collect.ImmutableSet.Builder().add((java.lang.Object[]) new java.lang.Integer[]{8, 7});
            if (androidx.media3.common.util.Util.SDK_INT >= 31) {
                builderAdd.add((java.lang.Object[]) new java.lang.Integer[]{26, 27});
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 33) {
                builderAdd.add(30);
            }
            return builderAdd.build();
        }
    }

    private static final class Api29 {
        private Api29() {
        }

        public static com.google.common.collect.ImmutableList<java.lang.Integer> getDirectPlaybackSupportedEncodings(androidx.media3.common.AudioAttributes audioAttributes) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            com.google.common.collect.UnmodifiableIterator<java.lang.Integer> it = androidx.media3.exoplayer.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (androidx.media3.common.util.Util.SDK_INT >= androidx.media3.common.util.Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    builder.add(java.lang.Integer.valueOf(iIntValue));
                }
            }
            builder.add(2);
            return builder.build();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2, androidx.media3.common.AudioAttributes audioAttributes) {
            for (int i3 = 10; i3 > 0; i3--) {
                int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3);
                if (audioTrackChannelConfig != 0 && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    private static final class Api33 {
        private Api33() {
        }

        public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternalForDirectPlayback(android.media.AudioManager audioManager, androidx.media3.common.AudioAttributes audioAttributes) {
            return new androidx.media3.exoplayer.audio.AudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes)));
        }

        public static androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 getDefaultRoutedDeviceForAttributes(android.media.AudioManager audioManager, androidx.media3.common.AudioAttributes audioAttributes) {
            try {
                java.util.List<android.media.AudioDeviceInfo> audioDevicesForAttributes = ((android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull(audioManager)).getAudioDevicesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.AudioDeviceInfoApi23(audioDevicesForAttributes.get(0));
            } catch (java.lang.RuntimeException unused) {
                return null;
            }
        }
    }
}
