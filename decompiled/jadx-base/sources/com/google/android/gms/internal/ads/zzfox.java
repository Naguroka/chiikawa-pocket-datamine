package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfox {
    final java.io.File zza;
    private final java.io.File zzb;
    private final android.content.SharedPreferences zzc;
    private final int zzd;

    public zzfox(android.content.Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        java.io.File dir = context.getDir("pccache", 0);
        com.google.android.gms.internal.ads.zzfoy.zza(dir, false);
        this.zzb = dir;
        java.io.File dir2 = context.getDir("tmppccache", 0);
        com.google.android.gms.internal.ads.zzfoy.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final java.io.File zzd() {
        java.io.File file = new java.io.File(this.zzb, java.lang.Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final java.lang.String zze() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final java.lang.String zzf() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(com.google.android.gms.internal.ads.zzaxw zzaxwVar, com.google.android.gms.internal.ads.zzfpd zzfpdVar) {
        boolean z;
        java.lang.String strZzk = zzaxwVar.zzc().zzk();
        byte[] bArrZzA = zzaxwVar.zzf().zzA();
        byte[] bArrZzA2 = zzaxwVar.zzd().zzA();
        if (!android.text.TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            com.google.android.gms.internal.ads.zzfoy.zzd(this.zza);
            this.zza.mkdirs();
            com.google.android.gms.internal.ads.zzfoy.zzc(strZzk, this.zza).mkdirs();
            java.io.File fileZzb = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || com.google.android.gms.internal.ads.zzfoy.zze(fileZzb, bArrZzA)) && com.google.android.gms.internal.ads.zzfoy.zze(com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                java.io.File fileZzb2 = com.google.android.gms.internal.ads.zzfoy.zzb(zzaxwVar.zzc().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfpdVar != null && !zzfpdVar.zza(fileZzb2)) {
                    return false;
                }
                java.lang.String strZzk2 = zzaxwVar.zzc().zzk();
                if (android.text.TextUtils.isEmpty(strZzk2)) {
                    z = false;
                } else {
                    java.io.File fileZzb3 = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk2, "pcam.jar", this.zza);
                    java.io.File fileZzb4 = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk2, "pcbc", this.zza);
                    java.io.File fileZzb5 = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk2, "pcam.jar", zzd());
                    java.io.File fileZzb6 = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        com.google.android.gms.internal.ads.zzaxx zzaxxVarZzd = com.google.android.gms.internal.ads.zzaxz.zzd();
                        zzaxxVarZzd.zze(zzaxwVar.zzc().zzk());
                        zzaxxVarZzd.zza(zzaxwVar.zzc().zzj());
                        zzaxxVarZzd.zzb(zzaxwVar.zzc().zza());
                        zzaxxVarZzd.zzd(zzaxwVar.zzc().zzc());
                        zzaxxVarZzd.zzc(zzaxwVar.zzc().zzb());
                        com.google.android.gms.internal.ads.zzaxz zzaxzVar = (com.google.android.gms.internal.ads.zzaxz) zzaxxVarZzd.zzbr();
                        com.google.android.gms.internal.ads.zzaxz zzaxzVarZzb = zzb(1);
                        android.content.SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzaxzVarZzb != null && !zzaxzVar.zzk().equals(zzaxzVarZzb.zzk())) {
                            editorEdit.putString(zze(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzaxzVarZzb.zzaV()));
                        }
                        editorEdit.putString(zzf(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzaxzVar.zzaV()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                com.google.android.gms.internal.ads.zzaxz zzaxzVarZzb2 = zzb(1);
                if (zzaxzVarZzb2 != null) {
                    hashSet.add(zzaxzVarZzb2.zzk());
                }
                com.google.android.gms.internal.ads.zzaxz zzaxzVarZzb3 = zzb(2);
                if (zzaxzVarZzb3 != null) {
                    hashSet.add(zzaxzVarZzb3.zzk());
                }
                for (java.io.File file : zzd().listFiles()) {
                    java.lang.String name = file.getName();
                    if (!hashSet.contains(name)) {
                        com.google.android.gms.internal.ads.zzfoy.zzd(com.google.android.gms.internal.ads.zzfoy.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    final com.google.android.gms.internal.ads.zzaxz zzb(int i) {
        java.lang.String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = com.google.android.gms.common.util.Hex.stringToBytes(string);
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
            com.google.android.gms.internal.ads.zzaxz zzaxzVarZzh = com.google.android.gms.internal.ads.zzaxz.zzh(com.google.android.gms.internal.ads.zzgwj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            java.lang.String strZzk = zzaxzVarZzh.zzk();
            java.io.File fileZzb = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcam", zzd());
            }
            java.io.File fileZzb2 = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzaxzVarZzh;
            }
            return null;
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
        }
    }

    public final com.google.android.gms.internal.ads.zzfow zzc(int i) {
        com.google.android.gms.internal.ads.zzaxz zzaxzVarZzb = zzb(1);
        if (zzaxzVarZzb == null) {
            return null;
        }
        java.lang.String strZzk = zzaxzVarZzb.zzk();
        java.io.File fileZzb = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcam", zzd());
        }
        return new com.google.android.gms.internal.ads.zzfow(zzaxzVarZzb, fileZzb, com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcbc", zzd()), com.google.android.gms.internal.ads.zzfoy.zzb(strZzk, "pcopt", zzd()));
    }
}
