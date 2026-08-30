package com.google.android.gms.ads.formats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;

    @java.lang.Deprecated
    public static final int ORIENTATION_ANY = 0;

    @java.lang.Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @java.lang.Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final int zze;
    private final com.google.android.gms.ads.VideoOptions zzf;
    private final boolean zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface AdChoicesPlacement {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private com.google.android.gms.ads.VideoOptions zze;
        private boolean zza = false;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = false;
        private int zzf = 1;
        private boolean zzg = false;

        public com.google.android.gms.ads.formats.NativeAdOptions build() {
            return new com.google.android.gms.ads.formats.NativeAdOptions(this, null);
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setAdChoicesPlacement(int i) {
            this.zzf = i;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setImageOrientation(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setMediaAspectRatio(int i) {
            this.zzc = i;
            return this;
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzg = z;
            return this;
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setRequestMultipleImages(boolean z) {
            this.zzd = z;
            return this;
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setReturnUrlsForImageAssets(boolean z) {
            this.zza = z;
            return this;
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setVideoOptions(com.google.android.gms.ads.VideoOptions videoOptions) {
            this.zze = videoOptions;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(com.google.android.gms.ads.formats.NativeAdOptions.Builder builder, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
        this.zze = builder.zzf;
        this.zzf = builder.zze;
        this.zzg = builder.zzg;
    }

    public int getAdChoicesPlacement() {
        return this.zze;
    }

    @java.lang.Deprecated
    public int getImageOrientation() {
        return this.zzb;
    }

    public int getMediaAspectRatio() {
        return this.zzc;
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
        return this.zzf;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzd;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzg;
    }
}
