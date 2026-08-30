package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbxp implements com.google.android.gms.internal.ads.zzbxu {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.List zzc = java.util.Collections.synchronizedList(new java.util.ArrayList());
    boolean zza;
    private final com.google.android.gms.internal.ads.zzhbn zzd;
    private final java.util.LinkedHashMap zze;
    private final android.content.Context zzh;
    private final com.google.android.gms.internal.ads.zzbxr zzi;
    private final java.util.List zzf = new java.util.ArrayList();
    private final java.util.List zzg = new java.util.ArrayList();
    private final java.lang.Object zzj = new java.lang.Object();
    private java.util.HashSet zzk = new java.util.HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxp(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbxr zzbxrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbxq zzbxqVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbxrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new java.util.LinkedHashMap();
        this.zzi = zzbxrVar;
        java.util.Iterator it = zzbxrVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((java.lang.String) it.next()).toLowerCase(java.util.Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(java.util.Locale.ENGLISH));
        com.google.android.gms.internal.ads.zzhbn zzhbnVarZzc = com.google.android.gms.internal.ads.zzhdm.zzc();
        zzhbnVarZzc.zzn(9);
        zzhbnVarZzc.zzj(str);
        zzhbnVarZzc.zzh(str);
        com.google.android.gms.internal.ads.zzhbo zzhboVarZzc = com.google.android.gms.internal.ads.zzhbp.zzc();
        java.lang.String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhboVarZzc.zza(str2);
        }
        zzhbnVarZzc.zzg((com.google.android.gms.internal.ads.zzhbp) zzhboVarZzc.zzbr());
        com.google.android.gms.internal.ads.zzhdd zzhddVarZzc = com.google.android.gms.internal.ads.zzhde.zzc();
        zzhddVarZzc.zzc(com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzh).isCallerInstantApp());
        java.lang.String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhddVarZzc.zza(str3);
        }
        long apkVersion = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhddVarZzc.zzb(apkVersion);
        }
        zzhbnVarZzc.zzf((com.google.android.gms.internal.ads.zzhde) zzhddVarZzc.zzbr());
        this.zzd = zzhbnVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final com.google.android.gms.internal.ads.zzbxr zza() {
        return this.zzi;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(java.util.Map map) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzhdb zzhdbVar;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzm;
        if (map != null) {
            try {
                for (java.lang.String str : map.keySet()) {
                    org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject((java.lang.String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                try {
                                    zzhdbVar = (com.google.android.gms.internal.ads.zzhdb) this.zze.get(str);
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            if (zzhdbVar == null) {
                                com.google.android.gms.internal.ads.zzbxt.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhdbVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbet.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        synchronized (this.zzj) {
            java.util.Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((com.google.android.gms.internal.ads.zzhdc) ((com.google.android.gms.internal.ads.zzhdb) it.next()).zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (com.google.android.gms.internal.ads.zzbxt.zzb()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (com.google.android.gms.internal.ads.zzhdc zzhdcVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhdcVar.zzc());
                    sb.append("] ");
                    sb.append(zzhdcVar.zzg());
                }
                com.google.android.gms.internal.ads.zzbxt.zza(sb.toString());
            }
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((com.google.android.gms.internal.ads.zzhdm) this.zzd.zzbr()).zzaV());
            if (com.google.android.gms.internal.ads.zzbxt.zzb()) {
                listenableFutureZzb.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbxm
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.ads.zzbxt.zza("Pinged SB successfully.");
                    }
                }, com.google.android.gms.internal.ads.zzbzw.zza);
            }
            listenableFutureZzm = com.google.android.gms.internal.ads.zzgch.zzm(listenableFutureZzb, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbxn
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final java.lang.Object apply(java.lang.Object obj) {
                    int i2 = com.google.android.gms.internal.ads.zzbxp.zzb;
                    return null;
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
        }
        return listenableFutureZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzd(java.lang.String str, java.util.Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((com.google.android.gms.internal.ads.zzhdb) this.zze.get(str)).zze(4);
                }
                return;
            }
            com.google.android.gms.internal.ads.zzhdb zzhdbVarZzd = com.google.android.gms.internal.ads.zzhdc.zzd();
            int iZza = com.google.android.gms.internal.ads.zzhda.zza(i);
            if (iZza != 0) {
                zzhdbVarZzd.zze(iZza);
            }
            zzhdbVarZzd.zzb(this.zze.size());
            zzhdbVarZzd.zzd(str);
            com.google.android.gms.internal.ads.zzhca zzhcaVarZzc = com.google.android.gms.internal.ads.zzhcd.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str2 = entry.getKey() != null ? (java.lang.String) entry.getKey() : "";
                    java.lang.String str3 = entry.getValue() != null ? (java.lang.String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(java.util.Locale.ENGLISH))) {
                        com.google.android.gms.internal.ads.zzhby zzhbyVarZzc = com.google.android.gms.internal.ads.zzhbz.zzc();
                        zzhbyVarZzc.zza(com.google.android.gms.internal.ads.zzgwj.zzw(str2));
                        zzhbyVarZzc.zzb(com.google.android.gms.internal.ads.zzgwj.zzw(str3));
                        zzhcaVarZzc.zza((com.google.android.gms.internal.ads.zzhbz) zzhbyVarZzc.zzbr());
                    }
                }
            }
            zzhdbVarZzd.zzc((com.google.android.gms.internal.ads.zzhcd) zzhcaVarZzc.zzbr());
            this.zze.put(str, zzhdbVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(java.util.Collections.emptyMap()), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzbxk
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return this.zza.zzb((java.util.Map) obj);
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzo = com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzn, 10L, java.util.concurrent.TimeUnit.SECONDS, com.google.android.gms.internal.ads.zzbzw.zzd);
            com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzn, new com.google.android.gms.internal.ads.zzbxo(this, listenableFutureZzo), com.google.android.gms.internal.ads.zzbzw.zzg);
            zzc.add(listenableFutureZzo);
        }
    }

    final /* synthetic */ void zzf(android.graphics.Bitmap bitmap) {
        com.google.android.gms.internal.ads.zzgwh zzgwhVarZzt = com.google.android.gms.internal.ads.zzgwj.zzt();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, zzgwhVarZzt);
        synchronized (this.zzj) {
            com.google.android.gms.internal.ads.zzhbn zzhbnVar = this.zzd;
            com.google.android.gms.internal.ads.zzhcv zzhcvVarZzc = com.google.android.gms.internal.ads.zzhcx.zzc();
            zzhcvVarZzc.zza(zzgwhVarZzt.zzb());
            zzhcvVarZzc.zzb(androidx.media3.common.MimeTypes.IMAGE_PNG);
            zzhcvVarZzc.zzc(2);
            zzhbnVar.zzi((com.google.android.gms.internal.ads.zzhcx) zzhcvVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(android.view.View view) {
        android.graphics.Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzv.zzq();
            final android.graphics.Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    android.graphics.Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? android.graphics.Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (java.lang.RuntimeException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to capture the web view", e);
                    }
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Width or height of view is zero");
                        } else {
                            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
                            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (java.lang.RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                com.google.android.gms.internal.ads.zzbxt.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbxl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzf(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh(java.lang.String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzi() {
        return com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
