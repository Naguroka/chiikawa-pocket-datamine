package com.google.android.gms.ads.nativead;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final com.google.android.gms.ads.VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface AdChoicesPlacement {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private com.google.android.gms.ads.VideoOptions zzd;
        private boolean zza = false;
        private int zzb = 0;
        private boolean zzc = false;
        private int zze = 1;
        private boolean zzf = false;
        private boolean zzg = false;
        private int zzh = 0;
        private int zzi = 1;

        public com.google.android.gms.ads.nativead.NativeAdOptions build() {
            return new com.google.android.gms.ads.nativead.NativeAdOptions(this, null);
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder enableCustomClickGestureDirection(int i, boolean z) {
            this.zzg = z;
            this.zzh = i;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setAdChoicesPlacement(int i) {
            this.zze = i;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setMediaAspectRatio(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzf = z;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setRequestMultipleImages(boolean z) {
            this.zzc = z;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setReturnUrlsForImageAssets(boolean z) {
            this.zza = z;
            return this;
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setVideoOptions(com.google.android.gms.ads.VideoOptions videoOptions) {
            this.zzd = videoOptions;
            return this;
        }

        public final com.google.android.gms.ads.nativead.NativeAdOptions.Builder zzi(int i) {
            this.zzi = i;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface SwipeGestureDirection {
    }

    /* synthetic */ NativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions.Builder builder, com.google.android.gms.ads.nativead.zza zzaVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zze;
        this.zze = builder.zzd;
        this.zzf = builder.zzf;
        this.zzg = builder.zzg;
        this.zzh = builder.zzh;
        this.zzi = builder.zzi;
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final boolean zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzi;
    }
}
