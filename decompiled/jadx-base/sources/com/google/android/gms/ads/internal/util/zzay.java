package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay {
    private com.google.android.gms.internal.ads.zzduv zzg;
    private final java.lang.Object zzb = new java.lang.Object();
    private java.lang.String zzc = "";
    private java.lang.String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected java.lang.String zza = "";

    /* JADX WARN: Multi-variable type inference failed */
    protected static final java.lang.String zzo(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.google.common.net.HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbo(context).zzb(0, str, map, null);
        try {
            return (java.lang.String) listenableFutureZzb.get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeO)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Interrupted while retrieving a response from: ".concat(java.lang.String.valueOf(str)), e);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (java.util.concurrent.TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Timeout while retrieving a response from: ".concat(java.lang.String.valueOf(str)), e2);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (java.lang.Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving a response from: ".concat(java.lang.String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    private final android.net.Uri zzp(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (android.text.TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    str5 = new java.lang.String(com.google.android.gms.common.util.IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), com.adjust.sdk.Constants.ENCODING);
                } catch (java.io.IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (android.text.TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzc = java.util.UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    java.lang.String str6 = this.zzc;
                    try {
                        java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(com.adjust.sdk.Constants.ENCODING));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (java.lang.Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error writing to file in internal storage.", e);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            } else {
                str4 = this.zzc;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final com.google.android.gms.internal.ads.zzduv zza() {
        return this.zzg;
    }

    public final java.lang.String zzb() {
        java.lang.String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(android.content.Context context) {
        com.google.android.gms.internal.ads.zzduv zzduvVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue() || (zzduvVar = this.zzg) == null) {
            return;
        }
        zzduvVar.zzh(new com.google.android.gms.ads.internal.util.zzav(this, context), com.google.android.gms.internal.ads.zzduu.DEBUG_MENU);
    }

    public final void zzd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzU(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeK), str, str2));
    }

    public final void zze(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.net.Uri.Builder builderBuildUpon = zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeN), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzM(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(z);
                com.google.android.gms.internal.ads.zzduv zzduvVar = this.zzg;
                if (zzduvVar != null) {
                    zzduvVar.zzl(z);
                }
            }
        }
    }

    public final void zzg(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zzg = zzduvVar;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    protected final void zzi(android.content.Context context, java.lang.String str, boolean z, boolean z2) {
        if (context instanceof android.app.Activity) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.ads.internal.util.zzax(this, context, str, z, z2));
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean zzj(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strZzo = zzo(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeM), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(strZzo)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new org.json.JSONObject(strZzo.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzi.zzw(str);
            }
            return zEquals;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    final boolean zzk(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strZzo = zzo(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeL), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(strZzo)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for in app preview.");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(strZzo.trim());
            java.lang.String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
                boolean z = "0".equals(this.zza) || "2".equals(this.zza);
                zzf(z);
                com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (!z) {
                    str = "";
                }
                zzgVarZzi.zzw(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
