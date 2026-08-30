package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdsv implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.internal.ads.zzcwo, com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzfgo {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzdsj zzb;
    private long zzc;

    public zzdsv(com.google.android.gms.internal.ads.zzdsj zzdsjVar, com.google.android.gms.internal.ads.zzcgx zzcgxVar) {
        this.zzb = zzdsjVar;
        this.zza = java.util.Collections.singletonList(zzcgxVar);
    }

    private final void zzg(java.lang.Class cls, java.lang.String str, java.lang.Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(java.lang.String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, com.json.ju.f, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String str, java.lang.String str2) {
        zzg(com.google.android.gms.ads.admanager.AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, com.json.ju.g, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, com.json.ju.k, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, com.json.ju.c, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        zzg(com.google.android.gms.internal.ads.zzfgg.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        zzg(com.google.android.gms.internal.ads.zzfgg.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str, java.lang.Throwable th) {
        zzg(com.google.android.gms.internal.ads.zzfgg.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        zzg(com.google.android.gms.internal.ads.zzfgg.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(android.content.Context context) {
        zzg(com.google.android.gms.internal.ads.zzcwo.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(android.content.Context context) {
        zzg(com.google.android.gms.internal.ads.zzcwo.class, com.ironsource.y8.h.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(android.content.Context context) {
        zzg(com.google.android.gms.internal.ads.zzcwo.class, com.ironsource.y8.h.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        zzg(com.google.android.gms.internal.ads.zzcyq.class, "onAdRequest", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, "onRewarded", zzbvwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(com.google.android.gms.internal.ads.zzcvw.class, "onAdFailedToLoad", java.lang.Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, "onRewardedVideoCompleted", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzg(com.google.android.gms.internal.ads.zzcvt.class, "onRewardedVideoStarted", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzg(com.google.android.gms.internal.ads.zzcwn.class, "onAdImpression", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
        zzg(com.google.android.gms.internal.ads.zzcxh.class, com.json.ju.j, new java.lang.Object[0]);
    }
}
