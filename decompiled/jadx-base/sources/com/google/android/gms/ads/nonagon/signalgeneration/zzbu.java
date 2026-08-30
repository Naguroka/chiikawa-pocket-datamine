package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbu extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface zzb;

    zzbu(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface taggingLibraryJsInterface, java.lang.String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(java.lang.String.valueOf(str)));
        java.lang.String strConcat = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zzk.zza().toString()) : "";
        java.lang.String str2 = this.zza;
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str2;
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue() : 0L);
        objArr[3] = strConcat;
        final java.lang.String str3 = java.lang.String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb.zzb.evaluateJavascript(str3, null);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str3, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        final java.lang.String str;
        java.lang.String query = queryInfo.getQuery();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue() : 0L);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zzk.zza());
            }
            str = java.lang.String.format(java.util.Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (org.json.JSONException unused) {
            java.lang.String strConcat = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zzk.zza().toString()) : "";
            java.lang.String str2 = this.zza;
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = java.lang.Long.valueOf(((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue() : 0L);
            objArr[3] = strConcat;
            str = java.lang.String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb.zzb.evaluateJavascript(str, null);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }
}
