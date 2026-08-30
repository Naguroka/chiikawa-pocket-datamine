package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzs> CREATOR = new com.google.android.gms.ads.internal.client.zzt();
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final com.google.android.gms.ads.internal.client.zzs[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(android.util.DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static com.google.android.gms.ads.internal.client.zzs zzb() {
        return new com.google.android.gms.ads.internal.client.zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static com.google.android.gms.ads.internal.client.zzs zzc() {
        return new com.google.android.gms.ads.internal.client.zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static com.google.android.gms.ads.internal.client.zzs zzd() {
        return new com.google.android.gms.ads.internal.client.zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int zze(android.util.DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzs(android.content.Context context, com.google.android.gms.ads.AdSize adSize) {
        this(context, new com.google.android.gms.ads.AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    public zzs(android.content.Context context, com.google.android.gms.ads.AdSize[] adSizeArr) {
        int height;
        int i;
        int iZze;
        java.lang.String str;
        int dimensionPixelSize;
        com.google.android.gms.ads.AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        boolean zZzh = com.google.android.gms.ads.zzc.zzh(adSize);
        this.zzo = zZzh;
        if (zIsFluid) {
            this.zze = com.google.android.gms.ads.AdSize.BANNER.getWidth();
            height = com.google.android.gms.ads.AdSize.BANNER.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zza(adSize);
            this.zzb = height;
        } else if (zZzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z = this.zze == -1;
        boolean z2 = height == -2;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i2 = displayMetrics3.heightPixels;
                        int i3 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i4 = displayMetrics3.heightPixels;
                        int i5 = displayMetrics3.widthPixels;
                        if (i4 != i2 || i5 != i3) {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        } else {
                            int i6 = displayMetrics.widthPixels;
                            com.google.android.gms.ads.internal.client.zzbc.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i6 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.zze;
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, this.zze);
        }
        if (z2) {
            iZze = zze(displayMetrics);
        } else {
            iZze = this.zzb;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, iZze);
        if (z || z2) {
            this.zza = i + "x" + iZze + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (zIsFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new com.google.android.gms.ads.internal.client.zzs[length];
            for (int i7 = 0; i7 < adSizeArr.length; i7++) {
                this.zzg[i7] = new com.google.android.gms.ads.internal.client.zzs(context, adSizeArr[i7]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    zzs(java.lang.String str, int i, int i2, boolean z, int i3, int i4, com.google.android.gms.ads.internal.client.zzs[] zzsVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzsVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
