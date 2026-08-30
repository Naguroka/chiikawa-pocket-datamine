package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzba {
    private final com.google.android.gms.ads.internal.client.zzk zza;
    private final com.google.android.gms.ads.internal.client.zzi zzb;
    private final com.google.android.gms.ads.internal.client.zzfe zzc;
    private final com.google.android.gms.internal.ads.zzbhv zzd;
    private final com.google.android.gms.internal.ads.zzbtb zze;
    private final com.google.android.gms.internal.ads.zzbhw zzf;
    private com.google.android.gms.internal.ads.zzbuj zzg;
    private final com.google.android.gms.ads.internal.client.zzl zzh;

    public zzba(com.google.android.gms.ads.internal.client.zzk zzkVar, com.google.android.gms.ads.internal.client.zzi zziVar, com.google.android.gms.ads.internal.client.zzfe zzfeVar, com.google.android.gms.internal.ads.zzbhv zzbhvVar, com.google.android.gms.internal.ads.zzbxb zzbxbVar, com.google.android.gms.internal.ads.zzbtb zzbtbVar, com.google.android.gms.internal.ads.zzbhw zzbhwVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfeVar;
        this.zzd = zzbhvVar;
        this.zze = zzbtbVar;
        this.zzf = zzbhwVar;
        this.zzh = zzlVar;
    }

    static /* bridge */ /* synthetic */ void zzv(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        com.google.android.gms.ads.internal.client.zzbc.zzb().zzn(context, com.google.android.gms.ads.internal.client.zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zzd(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.ads.internal.client.zzbu) new com.google.android.gms.ads.internal.client.zzar(this, context, str, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzby zze(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.ads.internal.client.zzby) new com.google.android.gms.ads.internal.client.zzan(this, context, zzsVar, str, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzby zzf(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.ads.internal.client.zzby) new com.google.android.gms.ads.internal.client.zzap(this, context, zzsVar, str, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzci zzg(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.ads.internal.client.zzci) new com.google.android.gms.ads.internal.client.zzat(this, context, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzdu zzh(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.ads.internal.client.zzdu) new com.google.android.gms.ads.internal.client.zzaf(this, context, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbga zzj(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        return (com.google.android.gms.internal.ads.zzbga) new com.google.android.gms.ads.internal.client.zzax(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbgg zzk(android.view.View view, java.util.HashMap map, java.util.HashMap map2) {
        return (com.google.android.gms.internal.ads.zzbgg) new com.google.android.gms.ads.internal.client.zzaz(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final com.google.android.gms.internal.ads.zzbkr zzn(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        return (com.google.android.gms.internal.ads.zzbkr) new com.google.android.gms.ads.internal.client.zzal(this, context, zzbpeVar, onH5AdsEventListener).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbsx zzo(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.internal.ads.zzbsx) new com.google.android.gms.ads.internal.client.zzaj(this, context, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbte zzq(android.app.Activity activity) {
        com.google.android.gms.ads.internal.client.zzad zzadVar = new com.google.android.gms.ads.internal.client.zzad(this, activity);
        android.content.Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (com.google.android.gms.internal.ads.zzbte) zzadVar.zzd(activity, booleanExtra);
    }

    public final com.google.android.gms.internal.ads.zzbwp zzs(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.internal.ads.zzbwp) new com.google.android.gms.ads.internal.client.zzab(this, context, str, zzbpeVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbyu zzt(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        return (com.google.android.gms.internal.ads.zzbyu) new com.google.android.gms.ads.internal.client.zzah(this, context, zzbpeVar).zzd(context, false);
    }
}
