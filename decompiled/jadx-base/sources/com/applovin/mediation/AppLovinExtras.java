package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinExtras {

    public static class Keys {
        public static final java.lang.String KEY_WATERMARK = "google_watermark";
        public static final java.lang.String MUTE_AUDIO = "mute_audio";

        private Keys() {
        }
    }

    public static class Builder {
        private boolean muteAudio;

        public com.applovin.mediation.AppLovinExtras.Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }

        public android.os.Bundle build() {
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putBoolean(com.applovin.mediation.AppLovinExtras.Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }
    }
}
