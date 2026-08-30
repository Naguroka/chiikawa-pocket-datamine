package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {
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

    @Override // androidx.media.AudioAttributesImpl
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

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return androidx.media.AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i = this.mLegacyStream;
        return i != -1 ? i : androidx.media.AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.mLegacyStream;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.mContentType;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.mUsage;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i = this.mFlags;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i |= 4;
        } else if (legacyStreamType == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.mContentType), java.lang.Integer.valueOf(this.mFlags), java.lang.Integer.valueOf(this.mUsage), java.lang.Integer.valueOf(this.mLegacyStream)});
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesImplBase)) {
            return false;
        }
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = (androidx.media.AudioAttributesImplBase) obj;
        return this.mContentType == audioAttributesImplBase.getContentType() && this.mFlags == audioAttributesImplBase.getFlags() && this.mUsage == audioAttributesImplBase.getUsage() && this.mLegacyStream == audioAttributesImplBase.mLegacyStream;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioAttributesCompat:");
        if (this.mLegacyStream != -1) {
            sb.append(" stream=").append(this.mLegacyStream);
            sb.append(" derived");
        }
        sb.append(" usage=").append(androidx.media.AudioAttributesCompat.usageToString(this.mUsage)).append(" content=").append(this.mContentType).append(" flags=0x").append(java.lang.Integer.toHexString(this.mFlags).toUpperCase());
        return sb.toString();
    }

    static class Builder implements androidx.media.AudioAttributesImpl.Builder {
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

        Builder(androidx.media.AudioAttributesCompat audioAttributesCompat) {
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
            this.mUsage = audioAttributesCompat.getUsage();
            this.mContentType = audioAttributesCompat.getContentType();
            this.mFlags = audioAttributesCompat.getFlags();
            this.mLegacyStream = audioAttributesCompat.getRawLegacyStreamType();
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImpl build() {
            return new androidx.media.AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplBase.Builder setUsage(int i) {
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

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplBase.Builder setContentType(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.mContentType = i;
            } else {
                this.mContentType = 0;
            }
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplBase.Builder setFlags(int i) {
            this.mFlags = (i & 1023) | this.mFlags;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplBase.Builder setLegacyStreamType(int i) {
            if (i == 10) {
                throw new java.lang.IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.mLegacyStream = i;
            return setInternalLegacyStreamType(i);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private androidx.media.AudioAttributesImplBase.Builder setInternalLegacyStreamType(int i) {
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
                    android.util.Log.e("AudioAttributesCompat", "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.mUsage = androidx.media.AudioAttributesImplBase.usageForStreamType(i);
            return this;
        }
    }
}
