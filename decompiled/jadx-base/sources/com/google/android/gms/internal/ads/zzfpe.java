package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfpe {
    private static final java.lang.Object zza = new java.lang.Object();
    private final android.content.Context zzb;
    private final android.content.SharedPreferences zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzfol zze;
    private boolean zzf;

    public zzfpe(android.content.Context context, int i, com.google.android.gms.internal.ads.zzfol zzfolVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = java.lang.Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfolVar;
        this.zzf = z;
    }

    private final java.io.File zze(java.lang.String str) {
        return new java.io.File(new java.io.File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static java.lang.String zzf(com.google.android.gms.internal.ads.zzaxw zzaxwVar) {
        com.google.android.gms.internal.ads.zzaxx zzaxxVarZzd = com.google.android.gms.internal.ads.zzaxz.zzd();
        zzaxxVarZzd.zze(zzaxwVar.zzc().zzk());
        zzaxxVarZzd.zza(zzaxwVar.zzc().zzj());
        zzaxxVarZzd.zzb(zzaxwVar.zzc().zza());
        zzaxxVarZzd.zzd(zzaxwVar.zzc().zzc());
        zzaxxVarZzd.zzc(zzaxwVar.zzc().zzb());
        return com.google.android.gms.common.util.Hex.bytesToStringLowercase(((com.google.android.gms.internal.ads.zzaxz) zzaxxVarZzd.zzbr()).zzaV());
    }

    private final java.lang.String zzg() {
        return "FBAMTD".concat(java.lang.String.valueOf(this.zzd));
    }

    private final java.lang.String zzh() {
        return "LATMTD".concat(java.lang.String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        this.zze.zza(i, j);
    }

    private final void zzj(int i, long j, java.lang.String str) {
        this.zze.zzb(i, j, str);
    }

    private final com.google.android.gms.internal.ads.zzaxz zzk(int i) {
        java.lang.String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = com.google.android.gms.common.util.Hex.stringToBytes(string);
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
            return com.google.android.gms.internal.ads.zzaxz.zzi(com.google.android.gms.internal.ads.zzgwj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.zzf ? com.google.android.gms.internal.ads.zzgxb.zza() : com.google.android.gms.internal.ads.zzgxb.zzb());
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            return null;
        } catch (java.lang.NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (java.lang.RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzaxw zzaxwVar) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zza) {
            if (!com.google.android.gms.internal.ads.zzfoy.zze(new java.io.File(zze(zzaxwVar.zzc().zzk()), "pcbc"), zzaxwVar.zzd().zzA())) {
                zzi(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, jCurrentTimeMillis);
                return false;
            }
            java.lang.String strZzf = zzf(zzaxwVar);
            android.content.SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzaxw zzaxwVar, com.google.android.gms.internal.ads.zzfpd zzfpdVar) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zza) {
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzk = zzk(1);
            java.lang.String strZzk = zzaxwVar.zzc().zzk();
            if (zzaxzVarZzk != null && zzaxzVarZzk.zzk().equals(strZzk)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.io.File fileZze = zze(strZzk);
            if (fileZze.exists()) {
                zzj(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? "0" : "1") + ",f:" + (true != fileZze.isFile() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
            } else if (!fileZze.mkdirs()) {
                zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
                return false;
            }
            java.io.File fileZze2 = zze(strZzk);
            java.io.File file = new java.io.File(fileZze2, "pcam.jar");
            java.io.File file2 = new java.io.File(fileZze2, "pcbc");
            if (!com.google.android.gms.internal.ads.zzfoy.zze(file, zzaxwVar.zzf().zzA())) {
                zzi(4016, jCurrentTimeMillis);
                return false;
            }
            if (!com.google.android.gms.internal.ads.zzfoy.zze(file2, zzaxwVar.zzd().zzA())) {
                zzi(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfpdVar != null && !zzfpdVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                com.google.android.gms.internal.ads.zzfoy.zzd(fileZze2);
                return false;
            }
            java.lang.String strZzf = zzf(zzaxwVar);
            long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
            java.lang.String string = this.zzc.getString(zzh(), null);
            android.content.SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            if (string != null) {
                editorEdit.putString(zzg(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return false;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzk2 = zzk(1);
            if (zzaxzVarZzk2 != null) {
                hashSet.add(zzaxzVarZzk2.zzk());
            }
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzk3 = zzk(2);
            if (zzaxzVarZzk3 != null) {
                hashSet.add(zzaxzVarZzk3.zzk());
            }
            for (java.io.File file3 : new java.io.File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    com.google.android.gms.internal.ads.zzfoy.zzd(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final com.google.android.gms.internal.ads.zzfow zzc(int i) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zza) {
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzk = zzk(1);
            if (zzaxzVarZzk == null) {
                zzi(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, jCurrentTimeMillis);
                return null;
            }
            java.io.File fileZze = zze(zzaxzVarZzk.zzk());
            java.io.File file = new java.io.File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new java.io.File(fileZze, "pcam");
            }
            java.io.File file2 = new java.io.File(fileZze, "pcbc");
            java.io.File file3 = new java.io.File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new com.google.android.gms.internal.ads.zzfow(zzaxzVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zza) {
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzk = zzk(1);
            if (zzaxzVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            java.io.File fileZze = zze(zzaxzVarZzk.zzk());
            if (!new java.io.File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new java.io.File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
