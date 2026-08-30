package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26 extends androidx.media.AudioAttributesImplApi21 {
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(android.media.AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return this.mAudioAttributes.getVolumeControlStream();
    }

    static class Builder extends androidx.media.AudioAttributesImplApi21.Builder {
        Builder() {
        }

        Builder(java.lang.Object obj) {
            super(obj);
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImpl build() {
            return new androidx.media.AudioAttributesImplApi26(this.mFwkBuilder.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public androidx.media.AudioAttributesImplApi26.Builder setUsage(int i) {
            this.mFwkBuilder.setUsage(i);
            return this;
        }
    }
}
