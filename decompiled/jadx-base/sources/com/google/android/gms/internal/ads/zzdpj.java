package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpj {
    private final java.util.Map zza = new java.util.HashMap();

    zzdpj() {
    }

    @javax.annotation.Nullable
    public final synchronized com.google.android.gms.internal.ads.zzdpi zza(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzdpi) this.zza.get(str);
    }

    public final java.lang.String zzb(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbrs zzbrsVar;
        com.google.android.gms.internal.ads.zzdpi zzdpiVarZza = zza(str);
        return (zzdpiVarZza == null || (zzbrsVar = zzdpiVarZza.zzb) == null) ? "" : zzbrsVar.toString();
    }

    final synchronized void zzc(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfdh zzfdhVar) {
        com.google.android.gms.internal.ads.zzbrs zzbrsVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzbrs zzbrsVarZzf = null;
        if (zzfdhVar == null) {
            zzbrsVarZze = null;
        } else {
            try {
                zzbrsVarZze = zzfdhVar.zze();
            } catch (com.google.android.gms.internal.ads.zzfcq unused) {
                zzbrsVarZze = null;
            }
        }
        if (zzfdhVar != null) {
            try {
                zzbrsVarZzf = zzfdhVar.zzf();
            } catch (com.google.android.gms.internal.ads.zzfcq unused2) {
            }
        }
        boolean z = true;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjk)).booleanValue()) {
            if (zzfdhVar == null) {
                z = false;
            } else {
                try {
                    zzfdhVar.zzC();
                } catch (com.google.android.gms.internal.ads.zzfcq unused3) {
                    z = false;
                }
            }
        }
        this.zza.put(str, new com.google.android.gms.internal.ads.zzdpi(str, zzbrsVarZze, zzbrsVarZzf, z));
    }

    final synchronized void zzd(java.lang.String str, com.google.android.gms.internal.ads.zzbrd zzbrdVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new com.google.android.gms.internal.ads.zzdpi(str, zzbrdVar.zzf(), zzbrdVar.zzg(), true));
        } catch (java.lang.Throwable unused) {
        }
    }
}
