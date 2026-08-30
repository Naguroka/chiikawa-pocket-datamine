package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {
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

    @Override // androidx.media.AudioAttributesImpl
    public java.lang.Object getAudioAttributes() {
        return this.mAudioAttributes;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return androidx.media.AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i = this.mLegacyStreamType;
        return i != -1 ? i : androidx.media.AudioAttributesCompat.toVolumeStreamType(false, getFlags(), getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.mLegacyStreamType;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.mAudioAttributes.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.mAudioAttributes.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.mAudioAttributes.getFlags();
    }

    public int hashCode() {
        return this.mAudioAttributes.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media.AudioAttributesImplApi21) {
            return this.mAudioAttributes.equals(((androidx.media.AudioAttributesImplApi21) obj).mAudioAttributes);
        }
        return false;
    }

    public java.lang.String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
    }

    static class Builder implements androidx.media.AudioAttributesImpl.Builder {
        final android.media.AudioAttributes.Builder mFwkBuilder;

        Builder() {
            this.mFwkBuilder = new android.media.AudioAttributes.Builder();
        }

        Builder(java.lang.Object obj) {
            this.mFwkBuilder = new android.media.AudioAttributes.Builder((android.media.AudioAttributes) obj);
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImpl build() {
            return new androidx.media.AudioAttributesImplApi21(this.mFwkBuilder.build());
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplApi21.Builder setUsage(int i) {
            if (i == 16) {
                i = 12;
            }
            this.mFwkBuilder.setUsage(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplApi21.Builder setContentType(int i) {
            this.mFwkBuilder.setContentType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplApi21.Builder setFlags(int i) {
            this.mFwkBuilder.setFlags(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplApi21.Builder setLegacyStreamType(int i) {
            this.mFwkBuilder.setLegacyStreamType(i);
            return this;
        }
    }
}
