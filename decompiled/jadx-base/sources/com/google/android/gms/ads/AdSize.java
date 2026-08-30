package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final com.google.android.gms.ads.AdSize BANNER = new com.google.android.gms.ads.AdSize(320, 50, "320x50_mb");
    public static final com.google.android.gms.ads.AdSize FULL_BANNER = new com.google.android.gms.ads.AdSize(468, 60, "468x60_as");
    public static final com.google.android.gms.ads.AdSize LARGE_BANNER = new com.google.android.gms.ads.AdSize(320, 100, "320x100_as");
    public static final com.google.android.gms.ads.AdSize LEADERBOARD = new com.google.android.gms.ads.AdSize(728, 90, "728x90_as");
    public static final com.google.android.gms.ads.AdSize MEDIUM_RECTANGLE = new com.google.android.gms.ads.AdSize(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250, "300x250_as");
    public static final com.google.android.gms.ads.AdSize WIDE_SKYSCRAPER = new com.google.android.gms.ads.AdSize(org.objectweb.asm.Opcodes.IF_ICMPNE, 600, "160x600_as");

    @java.lang.Deprecated
    public static final com.google.android.gms.ads.AdSize SMART_BANNER = new com.google.android.gms.ads.AdSize(-1, -2, "smart_banner");
    public static final com.google.android.gms.ads.AdSize FLUID = new com.google.android.gms.ads.AdSize(-3, -4, "fluid");
    public static final com.google.android.gms.ads.AdSize INVALID = new com.google.android.gms.ads.AdSize(0, 0, "invalid");
    public static final com.google.android.gms.ads.AdSize zza = new com.google.android.gms.ads.AdSize(50, 50, "50x50_mb");
    public static final com.google.android.gms.ads.AdSize SEARCH = new com.google.android.gms.ads.AdSize(-3, 0, "search_v2");

    public AdSize(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : java.lang.String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : java.lang.String.valueOf(i2)) + "_as");
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 0);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getCurrentOrientationInterscrollerAdSize(android.content.Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    public static com.google.android.gms.ads.AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static com.google.android.gms.ads.AdSize getLandscapeAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 2);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static com.google.android.gms.ads.AdSize getLandscapeInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getLandscapeInterscrollerAdSize(android.content.Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    public static com.google.android.gms.ads.AdSize getPortraitAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 1);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static com.google.android.gms.ads.AdSize getPortraitInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getPortraitInterscrollerAdSize(android.content.Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    private static com.google.android.gms.ads.AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        adSize.zzi = i2;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.ads.AdSize)) {
            return false;
        }
        com.google.android.gms.ads.AdSize adSize = (com.google.android.gms.ads.AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public java.lang.String toString() {
        return this.zzd;
    }

    final int zza() {
        return this.zzi;
    }

    final int zzb() {
        return this.zzg;
    }

    final void zzc(int i) {
        this.zzg = i;
    }

    final void zzd(int i) {
        this.zzi = i;
    }

    final void zze(boolean z) {
        this.zzf = true;
    }

    final void zzf(boolean z) {
        this.zzh = true;
    }

    final boolean zzg() {
        return this.zze;
    }

    final boolean zzh() {
        return this.zzf;
    }

    final boolean zzi() {
        return this.zzh;
    }

    public int getHeightInPixels(android.content.Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return com.google.android.gms.ads.internal.client.zzs.zza(context.getResources().getDisplayMetrics());
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
    }

    public int getWidthInPixels(android.content.Context context) {
        int i = this.zzb;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzs> creator = com.google.android.gms.ads.internal.client.zzs.CREATOR;
        return displayMetrics.widthPixels;
    }

    AdSize(int i, int i2, java.lang.String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new java.lang.IllegalArgumentException("Invalid width for AdSize: " + i);
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new java.lang.IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }
}
