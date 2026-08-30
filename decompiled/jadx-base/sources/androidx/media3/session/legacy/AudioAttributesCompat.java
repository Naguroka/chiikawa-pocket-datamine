package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat {
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    static final int FLAG_ALL = 1023;
    static final int FLAG_ALL_PUBLIC = 273;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    static final int FLAG_BEACON = 8;
    static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
    static final int FLAG_BYPASS_MUTE = 128;
    static final int FLAG_DEEP_BUFFER = 512;
    public static final int FLAG_HW_AV_SYNC = 16;
    static final int FLAG_HW_HOTWORD = 32;
    static final int FLAG_LOW_LATENCY = 256;
    static final int FLAG_SCO = 4;
    static final int FLAG_SECURE = 2;
    static final int INVALID_STREAM_TYPE = -1;
    private static final int[] SDK_USAGES;
    private static final int SUPPRESSIBLE_CALL = 2;
    private static final int SUPPRESSIBLE_NOTIFICATION = 1;
    private static final android.util.SparseIntArray SUPPRESSIBLE_USAGES;
    static final java.lang.String TAG = "AudioAttributesCompat";
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    static boolean sForceLegacyBehavior;
    public final androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl mImpl;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    public interface AudioAttributesImpl {

        public interface Builder {
            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl build();

            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder setContentType(int i);

            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder setFlags(int i);

            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder setLegacyStreamType(int i);

            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder setUsage(int i);
        }

        java.lang.Object getAudioAttributes();

        int getContentType();

        int getFlags();

        int getLegacyStreamType();

        int getRawLegacyStreamType();

        int getUsage();

        int getVolumeControlStream();
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        SUPPRESSIBLE_USAGES = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        SDK_USAGES = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat(androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl audioAttributesImpl) {
        this.mImpl = audioAttributesImpl;
    }

    public int getVolumeControlStream() {
        return this.mImpl.getVolumeControlStream();
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getAudioAttributes();
    }

    public int getLegacyStreamType() {
        return this.mImpl.getLegacyStreamType();
    }

    public static androidx.media3.session.legacy.AudioAttributesCompat wrap(java.lang.Object obj) {
        if (sForceLegacyBehavior) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return new androidx.media3.session.legacy.AudioAttributesCompat(new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi26((android.media.AudioAttributes) obj));
        }
        return new androidx.media3.session.legacy.AudioAttributesCompat(new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21((android.media.AudioAttributes) obj));
    }

    public int getContentType() {
        return this.mImpl.getContentType();
    }

    public int getUsage() {
        return this.mImpl.getUsage();
    }

    public int getFlags() {
        return this.mImpl.getFlags();
    }

    public static class Builder {
        final androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder mBuilderImpl;

        public Builder() {
            if (androidx.media3.session.legacy.AudioAttributesCompat.sForceLegacyBehavior) {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder();
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi26.Builder();
            } else {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder();
            }
        }

        public Builder(androidx.media3.session.legacy.AudioAttributesCompat audioAttributesCompat) {
            if (androidx.media3.session.legacy.AudioAttributesCompat.sForceLegacyBehavior) {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder(audioAttributesCompat);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi26.Builder(androidx.media3.common.util.Assertions.checkNotNull(audioAttributesCompat.unwrap()));
            } else {
                this.mBuilderImpl = new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder(androidx.media3.common.util.Assertions.checkNotNull(audioAttributesCompat.unwrap()));
            }
        }

        public androidx.media3.session.legacy.AudioAttributesCompat build() {
            return new androidx.media3.session.legacy.AudioAttributesCompat(this.mBuilderImpl.build());
        }

        public androidx.media3.session.legacy.AudioAttributesCompat.Builder setUsage(int i) {
            this.mBuilderImpl.setUsage(i);
            return this;
        }

        public androidx.media3.session.legacy.AudioAttributesCompat.Builder setContentType(int i) {
            this.mBuilderImpl.setContentType(i);
            return this;
        }

        public androidx.media3.session.legacy.AudioAttributesCompat.Builder setFlags(int i) {
            this.mBuilderImpl.setFlags(i);
            return this;
        }

        public androidx.media3.session.legacy.AudioAttributesCompat.Builder setLegacyStreamType(int i) {
            this.mBuilderImpl.setLegacyStreamType(i);
            return this;
        }
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public java.lang.String toString() {
        return this.mImpl.toString();
    }

    static java.lang.String usageToString(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    static abstract class AudioManagerHidden {
        public static final int STREAM_ACCESSIBILITY = 10;
        public static final int STREAM_BLUETOOTH_SCO = 6;
        public static final int STREAM_SYSTEM_ENFORCED = 7;
        public static final int STREAM_TTS = 9;

        private AudioManagerHidden() {
        }
    }

    public static void setForceLegacyBehavior(boolean z) {
        sForceLegacyBehavior = z;
    }

    int getRawLegacyStreamType() {
        return this.mImpl.getRawLegacyStreamType();
    }

    static int toVolumeStreamType(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (z) {
                    throw new java.lang.IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
                }
                return 3;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.session.legacy.AudioAttributesCompat)) {
            return false;
        }
        androidx.media3.session.legacy.AudioAttributesCompat audioAttributesCompat = (androidx.media3.session.legacy.AudioAttributesCompat) obj;
        androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl audioAttributesImpl = this.mImpl;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.mImpl == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.mImpl);
    }

    public static class AudioAttributesImplBase implements androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl {
        public int mContentType;
        public int mFlags;
        public int mLegacyStream;
        public int mUsage;

        static int usageForStreamType(int i) {
            switch (i) {
                case 0:
                    return 2;
                case 1:
                case 7:
                    return 13;
                case 2:
                    return 6;
                case 3:
                    return 1;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 2;
                case 8:
                    return 3;
                case 9:
                default:
                    return 0;
                case 10:
                    return 11;
            }
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public java.lang.Object getAudioAttributes() {
            return null;
        }

        public AudioAttributesImplBase() {
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
        }

        AudioAttributesImplBase(int i, int i2, int i3, int i4) {
            this.mContentType = i;
            this.mFlags = i2;
            this.mUsage = i3;
            this.mLegacyStream = i4;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getVolumeControlStream() {
            return androidx.media3.session.legacy.AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getLegacyStreamType() {
            int i = this.mLegacyStream;
            return i != -1 ? i : androidx.media3.session.legacy.AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getRawLegacyStreamType() {
            return this.mLegacyStream;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getContentType() {
            return this.mContentType;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getUsage() {
            return this.mUsage;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getFlags() {
            int i = this.mFlags;
            int legacyStreamType = getLegacyStreamType();
            if (legacyStreamType == 6) {
                i |= 4;
            } else if (legacyStreamType == 7) {
                i |= 1;
            }
            return i & androidx.media3.session.legacy.AudioAttributesCompat.FLAG_ALL_PUBLIC;
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.mContentType), java.lang.Integer.valueOf(this.mFlags), java.lang.Integer.valueOf(this.mUsage), java.lang.Integer.valueOf(this.mLegacyStream)});
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase)) {
                return false;
            }
            androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase audioAttributesImplBase = (androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase) obj;
            return this.mContentType == audioAttributesImplBase.getContentType() && this.mFlags == audioAttributesImplBase.getFlags() && this.mUsage == audioAttributesImplBase.getUsage() && this.mLegacyStream == audioAttributesImplBase.mLegacyStream;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioAttributesCompat:");
            if (this.mLegacyStream != -1) {
                sb.append(" stream=").append(this.mLegacyStream);
                sb.append(" derived");
            }
            sb.append(" usage=").append(androidx.media3.session.legacy.AudioAttributesCompat.usageToString(this.mUsage)).append(" content=").append(this.mContentType).append(" flags=0x").append(java.lang.Integer.toHexString(this.mFlags).toUpperCase(java.util.Locale.ROOT));
            return sb.toString();
        }

        static class Builder implements androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder {
            private int mContentType;
            private int mFlags;
            private int mLegacyStream;
            private int mUsage;

            Builder() {
                this.mUsage = 0;
                this.mContentType = 0;
                this.mFlags = 0;
                this.mLegacyStream = -1;
            }

            Builder(androidx.media3.session.legacy.AudioAttributesCompat audioAttributesCompat) {
                this.mUsage = 0;
                this.mContentType = 0;
                this.mFlags = 0;
                this.mLegacyStream = -1;
                this.mUsage = audioAttributesCompat.getUsage();
                this.mContentType = audioAttributesCompat.getContentType();
                this.mFlags = audioAttributesCompat.getFlags();
                this.mLegacyStream = audioAttributesCompat.getRawLegacyStreamType();
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl build() {
                return new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder setUsage(int i) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        this.mUsage = i;
                        return this;
                    case 16:
                        this.mUsage = 12;
                        return this;
                    default:
                        this.mUsage = 0;
                        return this;
                }
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder setContentType(int i) {
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                    this.mContentType = i;
                } else {
                    this.mContentType = 0;
                }
                return this;
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder setFlags(int i) {
                this.mFlags = (i & 1023) | this.mFlags;
                return this;
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder setLegacyStreamType(int i) {
                if (i == 10) {
                    throw new java.lang.IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
                }
                this.mLegacyStream = i;
                return setInternalLegacyStreamType(i);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            private androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.Builder setInternalLegacyStreamType(int i) {
                switch (i) {
                    case 0:
                        this.mContentType = 1;
                        break;
                    case 1:
                        this.mContentType = 4;
                        break;
                    case 2:
                        this.mContentType = 4;
                        break;
                    case 3:
                        this.mContentType = 2;
                        break;
                    case 4:
                        this.mContentType = 4;
                        break;
                    case 5:
                        this.mContentType = 4;
                        break;
                    case 6:
                        this.mContentType = 1;
                        this.mFlags |= 4;
                        break;
                    case 7:
                        this.mFlags = 1 | this.mFlags;
                        this.mContentType = 4;
                        break;
                    case 8:
                        this.mContentType = 4;
                        break;
                    case 9:
                        this.mContentType = 4;
                        break;
                    case 10:
                        this.mContentType = 1;
                        break;
                    default:
                        androidx.media3.common.util.Log.e(androidx.media3.session.legacy.AudioAttributesCompat.TAG, "Invalid stream type " + i + " for AudioAttributesCompat");
                        break;
                }
                this.mUsage = androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplBase.usageForStreamType(i);
                return this;
            }
        }
    }

    public static class AudioAttributesImplApi21 implements androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl {
        public android.media.AudioAttributes mAudioAttributes;
        public int mLegacyStreamType;

        public AudioAttributesImplApi21() {
            this.mLegacyStreamType = -1;
        }

        AudioAttributesImplApi21(android.media.AudioAttributes audioAttributes) {
            this(audioAttributes, -1);
        }

        AudioAttributesImplApi21(android.media.AudioAttributes audioAttributes, int i) {
            this.mAudioAttributes = audioAttributes;
            this.mLegacyStreamType = i;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public java.lang.Object getAudioAttributes() {
            return this.mAudioAttributes;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getVolumeControlStream() {
            return androidx.media3.session.legacy.AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getLegacyStreamType() {
            int i = this.mLegacyStreamType;
            return i != -1 ? i : androidx.media3.session.legacy.AudioAttributesCompat.toVolumeStreamType(false, getFlags(), getUsage());
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getRawLegacyStreamType() {
            return this.mLegacyStreamType;
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getContentType() {
            return ((android.media.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.mAudioAttributes)).getContentType();
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getUsage() {
            return ((android.media.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.mAudioAttributes)).getUsage();
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getFlags() {
            return ((android.media.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.mAudioAttributes)).getFlags();
        }

        public int hashCode() {
            return ((android.media.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.mAudioAttributes)).hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21) {
                return java.util.Objects.equals(this.mAudioAttributes, ((androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21) obj).mAudioAttributes);
            }
            return false;
        }

        public java.lang.String toString() {
            return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
        }

        static class Builder implements androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder {
            final android.media.AudioAttributes.Builder mFwkBuilder;

            Builder() {
                this.mFwkBuilder = new android.media.AudioAttributes.Builder();
            }

            Builder(java.lang.Object obj) {
                this.mFwkBuilder = new android.media.AudioAttributes.Builder((android.media.AudioAttributes) obj);
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl build() {
                return new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21(this.mFwkBuilder.build());
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder setUsage(int i) {
                if (i == 16) {
                    i = 12;
                }
                this.mFwkBuilder.setUsage(i);
                return this;
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder setContentType(int i) {
                this.mFwkBuilder.setContentType(i);
                return this;
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder setFlags(int i) {
                this.mFwkBuilder.setFlags(i);
                return this;
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder setLegacyStreamType(int i) {
                this.mFwkBuilder.setLegacyStreamType(i);
                return this;
            }
        }
    }

    public static class AudioAttributesImplApi26 extends androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21 {
        public AudioAttributesImplApi26() {
        }

        AudioAttributesImplApi26(android.media.AudioAttributes audioAttributes) {
            super(audioAttributes, -1);
        }

        @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21, androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl
        public int getVolumeControlStream() {
            return ((android.media.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.mAudioAttributes)).getVolumeControlStream();
        }

        static class Builder extends androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder {
            Builder() {
            }

            Builder(java.lang.Object obj) {
                super(obj);
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder, androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl build() {
                return new androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi26(this.mFwkBuilder.build());
            }

            @Override // androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi21.Builder, androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImpl.Builder
            public androidx.media3.session.legacy.AudioAttributesCompat.AudioAttributesImplApi26.Builder setUsage(int i) {
                this.mFwkBuilder.setUsage(i);
                return this;
            }
        }
    }
}
