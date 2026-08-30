package com.google.android.gms.ads.preload;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PreloadConfiguration {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.AdFormat zzb;
    private final com.google.android.gms.ads.AdRequest zzc;
    private final int zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static class Builder {
        private final java.lang.String zza;
        private final com.google.android.gms.ads.AdFormat zzb;
        private com.google.android.gms.ads.AdRequest zzc = new com.google.android.gms.ads.AdRequest.Builder().build();
        private int zzd;

        public Builder(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration build() {
            return new com.google.android.gms.ads.preload.PreloadConfiguration(this, null);
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setAdRequest(com.google.android.gms.ads.AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setBufferSize(int i) {
            this.zzd = i;
            return this;
        }
    }

    /* synthetic */ PreloadConfiguration(com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder, com.google.android.gms.ads.preload.zza zzaVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    public com.google.android.gms.ads.AdFormat getAdFormat() {
        return this.zzb;
    }

    public com.google.android.gms.ads.AdRequest getAdRequest() {
        return this.zzc;
    }

    public java.lang.String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
