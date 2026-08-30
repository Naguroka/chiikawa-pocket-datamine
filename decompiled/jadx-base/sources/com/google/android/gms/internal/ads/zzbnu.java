package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbnu implements com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbnt {
    private final com.google.android.gms.internal.ads.zzbnt zza;
    private final java.util.HashSet zzb = new java.util.HashSet();

    public zzbnu(com.google.android.gms.internal.ads.zzbnt zzbntVar) {
        this.zza = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zza(java.lang.String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbml.zzc(this, str, str2);
    }

    public final void zzc() {
        for (java.util.AbstractMap.SimpleEntry simpleEntry : this.zzb) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(java.lang.String.valueOf(((com.google.android.gms.internal.ads.zzbjp) simpleEntry.getValue()).toString())));
            this.zza.zzr((java.lang.String) simpleEntry.getKey(), (com.google.android.gms.internal.ads.zzbjp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zzd(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzbml.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zze(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbml.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzl(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbml.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzq(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzq(str, zzbjpVar);
        this.zzb.add(new java.util.AbstractMap.SimpleEntry(str, zzbjpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzr(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzr(str, zzbjpVar);
        this.zzb.remove(new java.util.AbstractMap.SimpleEntry(str, zzbjpVar));
    }
}
