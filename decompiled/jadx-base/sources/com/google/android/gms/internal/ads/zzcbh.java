package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcbh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcbs zzb;
    private final android.view.ViewGroup zzc;
    private com.google.android.gms.internal.ads.zzcbg zzd;

    public zzcbh(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcexVar;
        this.zzd = null;
    }

    public final com.google.android.gms.internal.ads.zzcbg zza() {
        return this.zzd;
    }

    public final java.lang.Integer zzb() {
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            return zzcbgVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, com.google.android.gms.internal.ads.zzcbr zzcbrVar) {
        if (this.zzd != null) {
            return;
        }
        com.google.android.gms.internal.ads.zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = this.zzb;
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = new com.google.android.gms.internal.ads.zzcbg(context, zzcbsVar, i5, z, zzcbsVar.zzm().zza(), zzcbrVar);
        this.zzd = zzcbgVar;
        this.zzc.addView(zzcbgVar, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onPause must be called from the UI thread.");
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzu();
        }
    }

    public final void zzg(int i) {
        com.google.android.gms.internal.ads.zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzC(i);
        }
    }
}
