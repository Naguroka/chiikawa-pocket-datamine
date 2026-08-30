package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzfma {
    private final java.lang.String zza;
    private com.google.android.gms.internal.ads.zzfnc zzb;
    private long zzc;
    private int zzd;

    public zzfma(java.lang.String str) {
        zzb();
        this.zza = str;
        this.zzb = new com.google.android.gms.internal.ads.zzfnc(null);
    }

    public final android.webkit.WebView zza() {
        return (android.webkit.WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = java.lang.System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(java.lang.String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        com.google.android.gms.internal.ads.zzflr.zza().zzh(zza(), this.zza, str);
    }

    public final void zze() {
        com.google.android.gms.internal.ads.zzflr.zza().zzc(zza(), this.zza);
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzflr.zza().zzd(zza(), this.zza, zzfkqVar.zzb());
    }

    public final void zzg(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, com.ironsource.aa.a.d, java.lang.Long.valueOf(date.getTime()));
        com.google.android.gms.internal.ads.zzflr.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(java.lang.String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            com.google.android.gms.internal.ads.zzflr.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(com.google.android.gms.internal.ads.zzfkt zzfktVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar) {
        zzj(zzfktVar, zzfkrVar, null);
    }

    protected final void zzj(com.google.android.gms.internal.ads.zzfkt zzfktVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar, org.json.JSONObject jSONObject) {
        java.lang.String strZzh = zzfktVar.zzh();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "environment", "app");
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "adSessionType", zzfkrVar.zzd());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject3, "deviceType", android.os.Build.MANUFACTURER + "; " + android.os.Build.MODEL);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject3, "osVersion", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject3, com.json.ce.y, com.json.y8.d);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "deviceInfo", jSONObject3);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "deviceCategory", com.google.android.gms.internal.ads.zzfmf.zza().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject4, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfkrVar.zze().zzb());
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject4, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfkrVar.zze().zzc());
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject5, "appId", com.google.android.gms.internal.ads.zzflp.zzb().zza().getApplicationContext().getPackageName());
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "app", jSONObject5);
        if (zzfkrVar.zzf() != null) {
            com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "contentUrl", zzfkrVar.zzf());
        }
        if (zzfkrVar.zzg() != null) {
            com.google.android.gms.internal.ads.zzfmg.zze(jSONObject2, "customReferenceData", zzfkrVar.zzg());
        }
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        java.util.Iterator it = zzfkrVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzflr.zza().zzj(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzk(boolean z) {
        if (zzp()) {
            com.google.android.gms.internal.ads.zzflr.zza().zzi(zza(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f) {
        com.google.android.gms.internal.ads.zzflr.zza().zze(zza(), this.zza, f);
    }

    public final void zzm(boolean z) {
        if (zzp()) {
            com.google.android.gms.internal.ads.zzflr.zza().zzg(zza(), this.zza, true != z ? "unlocked" : "locked");
        }
    }

    final void zzn(android.webkit.WebView webView) {
        this.zzb = new com.google.android.gms.internal.ads.zzfnc(webView);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != null;
    }
}
