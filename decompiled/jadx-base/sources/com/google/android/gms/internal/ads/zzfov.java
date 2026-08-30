package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfov implements com.google.android.gms.internal.ads.zzfnl {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzfow zzb;
    private final com.google.android.gms.internal.ads.zzfph zzc;
    private final com.google.android.gms.internal.ads.zzfni zzd;

    zzfov(java.lang.Object obj, com.google.android.gms.internal.ads.zzfow zzfowVar, com.google.android.gms.internal.ads.zzfph zzfphVar, com.google.android.gms.internal.ads.zzfni zzfniVar) {
        this.zza = obj;
        this.zzb = zzfowVar;
        this.zzc = zzfphVar;
        this.zzd = zzfniVar;
    }

    private static java.lang.String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzatm zzatmVarZza = com.google.android.gms.internal.ads.zzatn.zza();
        zzatmVarZza.zzc(5);
        zzatmVarZza.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArr, 0, bArr.length));
        return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzatn) zzatmVarZza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(java.util.Map map, java.util.Map map2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
        } catch (java.lang.Exception e) {
            this.zzd.zzc(2007, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", java.util.Map.class, java.util.Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized java.lang.String zza(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, android.app.Activity activity) {
        java.util.Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized java.lang.String zzb(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        java.util.Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized java.lang.String zzc(android.content.Context context, java.lang.String str) {
        java.util.Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized void zzd(java.lang.String str, android.view.MotionEvent motionEvent) throws com.google.android.gms.internal.ads.zzfpf {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.HashMap map = new java.util.HashMap();
            map.put("t", new java.lang.Throwable());
            map.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", java.util.Map.class).invoke(this.zza, map);
            this.zzd.zzd(3003, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfpf(2005, e);
        }
    }

    public final synchronized int zze() throws com.google.android.gms.internal.ads.zzfpf {
        try {
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfpf(2006, e);
        }
        return ((java.lang.Integer) this.zza.getClass().getDeclaredMethod("lcs", new java.lang.Class[0]).invoke(this.zza, new java.lang.Object[0])).intValue();
    }

    final com.google.android.gms.internal.ads.zzfow zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws com.google.android.gms.internal.ads.zzfpf {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new java.lang.Class[0]).invoke(this.zza, new java.lang.Object[0]);
            this.zzd.zzd(3001, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfpf(2003, e);
        }
    }

    final synchronized boolean zzh() throws com.google.android.gms.internal.ads.zzfpf {
        try {
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfpf(2001, e);
        }
        return ((java.lang.Boolean) this.zza.getClass().getDeclaredMethod(com.ironsource.y8.a.f, new java.lang.Class[0]).invoke(this.zza, new java.lang.Object[0])).booleanValue();
    }
}
