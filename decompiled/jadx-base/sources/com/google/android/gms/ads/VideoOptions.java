package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public com.google.android.gms.ads.VideoOptions build() {
            return new com.google.android.gms.ads.VideoOptions(this, null);
        }

        public com.google.android.gms.ads.VideoOptions.Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        public com.google.android.gms.ads.VideoOptions.Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.ads.VideoOptions.Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ VideoOptions(com.google.android.gms.ads.VideoOptions.Builder builder, com.google.android.gms.ads.zzj zzjVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zza = zzgaVar.zza;
        this.zzb = zzgaVar.zzb;
        this.zzc = zzgaVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}
