package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmu implements com.google.android.gms.internal.ads.zzflv {
    private static final com.google.android.gms.internal.ads.zzfmu zza = new com.google.android.gms.internal.ads.zzfmu();
    private static final android.os.Handler zzb = new android.os.Handler(android.os.Looper.getMainLooper());
    private static android.os.Handler zzc = null;
    private static final java.lang.Runnable zzd = new com.google.android.gms.internal.ads.zzfmq();
    private static final java.lang.Runnable zze = new com.google.android.gms.internal.ads.zzfmr();
    private int zzg;
    private long zzm;
    private final java.util.List zzf = new java.util.ArrayList();
    private boolean zzh = false;
    private final java.util.List zzi = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzfmn zzk = new com.google.android.gms.internal.ads.zzfmn();
    private final com.google.android.gms.internal.ads.zzflx zzj = new com.google.android.gms.internal.ads.zzflx();
    private final com.google.android.gms.internal.ads.zzfmo zzl = new com.google.android.gms.internal.ads.zzfmo(new com.google.android.gms.internal.ads.zzfmx());

    zzfmu() {
    }

    public static com.google.android.gms.internal.ads.zzfmu zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzfmu zzfmuVar) {
        zzfmuVar.zzg = 0;
        zzfmuVar.zzi.clear();
        zzfmuVar.zzh = false;
        for (com.google.android.gms.internal.ads.zzfkt zzfktVar : com.google.android.gms.internal.ads.zzflk.zza().zzb()) {
        }
        zzfmuVar.zzm = java.lang.System.nanoTime();
        zzfmuVar.zzk.zzi();
        long jNanoTime = java.lang.System.nanoTime();
        com.google.android.gms.internal.ads.zzflw zzflwVarZza = zzfmuVar.zzj.zza();
        if (zzfmuVar.zzk.zze().size() > 0) {
            for (java.lang.String str : zzfmuVar.zzk.zze()) {
                org.json.JSONObject jSONObjectZza = zzflwVarZza.zza(null);
                android.view.View viewZza = zzfmuVar.zzk.zza(str);
                com.google.android.gms.internal.ads.zzflw zzflwVarZzb = zzfmuVar.zzj.zzb();
                java.lang.String strZzc = zzfmuVar.zzk.zzc(str);
                if (strZzc != null) {
                    org.json.JSONObject jSONObjectZza2 = zzflwVarZzb.zza(viewZza);
                    com.google.android.gms.internal.ads.zzfmg.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.internal.ads.zzfmh.zza("Error with setting not visible reason", e);
                    }
                    com.google.android.gms.internal.ads.zzfmg.zzc(jSONObjectZza, jSONObjectZza2);
                }
                com.google.android.gms.internal.ads.zzfmg.zzf(jSONObjectZza);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(str);
                zzfmuVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfmuVar.zzk.zzf().size() > 0) {
            org.json.JSONObject jSONObjectZza3 = zzflwVarZza.zza(null);
            zzfmuVar.zzk(null, zzflwVarZza, jSONObjectZza3, 1, false);
            com.google.android.gms.internal.ads.zzfmg.zzf(jSONObjectZza3);
            zzfmuVar.zzl.zzd(jSONObjectZza3, zzfmuVar.zzk.zzf(), jNanoTime);
            boolean z = zzfmuVar.zzh;
        } else {
            zzfmuVar.zzl.zzb();
        }
        zzfmuVar.zzk.zzg();
        long jNanoTime2 = java.lang.System.nanoTime() - zzfmuVar.zzm;
        if (zzfmuVar.zzf.size() > 0) {
            for (com.google.android.gms.internal.ads.zzfmt zzfmtVar : zzfmuVar.zzf) {
                int i = zzfmuVar.zzg;
                java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfmtVar.zzb();
                if (zzfmtVar instanceof com.google.android.gms.internal.ads.zzfms) {
                    int i2 = zzfmuVar.zzg;
                    ((com.google.android.gms.internal.ads.zzfms) zzfmtVar).zza();
                }
            }
        }
        com.google.android.gms.internal.ads.zzflu.zza().zzc();
    }

    private final void zzk(android.view.View view, com.google.android.gms.internal.ads.zzflw zzflwVar, org.json.JSONObject jSONObject, int i, boolean z) {
        zzflwVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        android.os.Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(android.view.View view, com.google.android.gms.internal.ads.zzflw zzflwVar, org.json.JSONObject jSONObject, boolean z) {
        int iZzl;
        boolean z2;
        if (com.google.android.gms.internal.ads.zzfml.zza(view) != null || (iZzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        org.json.JSONObject jSONObjectZza = zzflwVar.zza(view);
        com.google.android.gms.internal.ads.zzfmg.zzc(jSONObject, jSONObjectZza);
        java.lang.String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            com.google.android.gms.internal.ads.zzfmg.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", java.lang.Boolean.valueOf(this.zzk.zzk(view)));
            } catch (org.json.JSONException e) {
                com.google.android.gms.internal.ads.zzfmh.zza("Error with setting has window focus", e);
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.zzk.zzj(strZzd));
            if (boolValueOf.booleanValue()) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (org.json.JSONException e2) {
                    com.google.android.gms.internal.ads.zzfmh.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzk.zzh();
        } else {
            com.google.android.gms.internal.ads.zzfmm zzfmmVarZzb = this.zzk.zzb(view);
            if (zzfmmVarZzb != null) {
                com.google.android.gms.internal.ads.zzfln zzflnVarZza = zzfmmVarZzb.zza();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.ArrayList arrayListZzb = zzfmmVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((java.lang.String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzflnVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzflnVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzflnVarZza.zzc());
                } catch (org.json.JSONException e3) {
                    com.google.android.gms.internal.ads.zzfmh.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzflwVar, jSONObjectZza, iZzl, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new com.google.android.gms.internal.ads.zzfmp(this));
    }
}
