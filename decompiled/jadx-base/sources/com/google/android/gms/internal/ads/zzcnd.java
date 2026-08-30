package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnd implements com.google.android.gms.internal.ads.zzbnz {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzayg zzb;
    private final android.os.PowerManager zzc;

    public zzcnd(android.content.Context context, com.google.android.gms.internal.ads.zzayg zzaygVar) {
        this.zza = context;
        this.zzb = zzaygVar;
        this.zzc = (android.os.PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final org.json.JSONObject zzb(com.google.android.gms.internal.ads.zzcng zzcngVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzayj zzayjVar = zzcngVar.zzf;
        if (zzayjVar == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new org.json.JSONException("Active view Info cannot be null.");
            }
            boolean z = zzayjVar.zza;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(com.ironsource.aa.a.d, zzcngVar.zzd).put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcngVar.zzc;
            jSONObjectPut.put("isStopped", false).put("isPaused", zzcngVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzs().zza()).put(com.ironsource.y8.i.P, com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Display defaultDisplay = ((android.view.WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzayjVar.zzb).put("isAttachedToWindow", z).put("viewBox", new org.json.JSONObject().put("top", zzayjVar.zzc.top).put("bottom", zzayjVar.zzc.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, zzayjVar.zzc.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, zzayjVar.zzc.right)).put("adBox", new org.json.JSONObject().put("top", zzayjVar.zzd.top).put("bottom", zzayjVar.zzd.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, zzayjVar.zzd.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, zzayjVar.zzd.right)).put("globalVisibleBox", new org.json.JSONObject().put("top", zzayjVar.zze.top).put("bottom", zzayjVar.zze.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, zzayjVar.zze.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, zzayjVar.zze.right)).put("globalVisibleBoxVisible", zzayjVar.zzf).put("localVisibleBox", new org.json.JSONObject().put("top", zzayjVar.zzg.top).put("bottom", zzayjVar.zzg.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, zzayjVar.zzg.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, zzayjVar.zzg.right)).put("localVisibleBoxVisible", zzayjVar.zzh).put("hitBox", new org.json.JSONObject().put("top", zzayjVar.zzi.top).put("bottom", zzayjVar.zzi.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, zzayjVar.zzi.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, zzayjVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put(com.json.pg.k, zzcngVar.zza);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzby)).booleanValue()) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List<android.graphics.Rect> list = zzayjVar.zzk;
                if (list != null) {
                    for (android.graphics.Rect rect2 : list) {
                        jSONArray2.put(new org.json.JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, rect2.left).put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!android.text.TextUtils.isEmpty(zzcngVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
