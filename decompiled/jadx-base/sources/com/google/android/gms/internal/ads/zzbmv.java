package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbmv implements com.google.android.gms.internal.ads.zzbmn, com.google.android.gms.internal.ads.zzbmm {
    private final com.google.android.gms.internal.ads.zzcex zza;

    public zzbmv(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.ads.internal.zza zzaVar) throws com.google.android.gms.internal.ads.zzcfj {
        com.google.android.gms.ads.internal.zzv.zzA();
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = com.google.android.gms.internal.ads.zzcfk.zza(context, com.google.android.gms.internal.ads.zzcgr.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, com.google.android.gms.internal.ads.zzbbj.zza(), null, null, null, null);
        this.zza = zzcexVarZza;
        zzcexVarZza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(java.lang.Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zza(final java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbml.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zzd(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzbml.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zze(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbml.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzf(final java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbms
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzg(final java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbmp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzh(java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        final java.lang.String str2 = java.lang.String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbmt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final com.google.android.gms.internal.ads.zzbnu zzj() {
        return new com.google.android.gms.internal.ads.zzbnu(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzk(final com.google.android.gms.internal.ads.zzbmy zzbmyVar) {
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = this.zza.zzN();
        java.util.Objects.requireNonNull(zzbmyVar);
        zzcgpVarZzN.zzJ(new com.google.android.gms.internal.ads.zzcgo() { // from class: com.google.android.gms.internal.ads.zzbmq
            @Override // com.google.android.gms.internal.ads.zzcgo
            public final void zza() {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                com.google.android.gms.internal.ads.zzbmy zzbmyVar2 = zzbmyVar;
                final long j = zzbmyVar2.zzc;
                final java.util.ArrayList arrayList = zzbmyVar2.zzb;
                arrayList.add(java.lang.Long.valueOf(jCurrentTimeMillis - j));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + java.lang.String.valueOf(arrayList.get(0)) + " ms.");
                com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                final com.google.android.gms.internal.ads.zzbns zzbnsVar = zzbmyVar2.zza;
                final com.google.android.gms.internal.ads.zzbnr zzbnrVar = zzbmyVar2.zzd;
                final com.google.android.gms.internal.ads.zzbmn zzbmnVar = zzbmyVar2.zze;
                zzfqwVar.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnsVar.zzj(zzbnrVar, zzbmnVar, arrayList, j);
                    }
                }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzl(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbml.zzd(this, str, jSONObject);
    }

    final /* synthetic */ void zzm(java.lang.String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzn(java.lang.String str) {
        this.zza.loadData(str, "text/html", com.adjust.sdk.Constants.ENCODING);
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        this.zza.loadUrl(str);
    }

    final /* synthetic */ void zzp(java.lang.String str) {
        this.zza.loadData(str, "text/html", com.adjust.sdk.Constants.ENCODING);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzq(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzag(str, new com.google.android.gms.internal.ads.zzbmu(this, zzbjpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzr(java.lang.String str, final com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzaA(str, new com.google.android.gms.common.util.Predicate() { // from class: com.google.android.gms.internal.ads.zzbmo
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbjp zzbjpVar2 = (com.google.android.gms.internal.ads.zzbjp) obj;
                if (zzbjpVar2 instanceof com.google.android.gms.internal.ads.zzbmu) {
                    return ((com.google.android.gms.internal.ads.zzbmu) zzbjpVar2).zzb.equals(zzbjpVar);
                }
                return false;
            }
        });
    }
}
