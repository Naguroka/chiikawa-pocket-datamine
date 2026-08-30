package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzefs implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdgq zzb;
    private final java.util.concurrent.Executor zzc;

    public zzefs(android.content.Context context, com.google.android.gms.internal.ads.zzdgq zzdgqVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzdgqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(com.google.android.gms.internal.ads.zzfca zzfcaVar, int i) {
        return zzfcaVar.zza.zza.zzg.contains(java.lang.Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzdif zzdifVarZzah;
        com.google.android.gms.internal.ads.zzbpp zzbppVarZzD = ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzD();
        com.google.android.gms.internal.ads.zzbpq zzbpqVarZzE = ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzE();
        com.google.android.gms.internal.ads.zzbpt zzbptVarZzd = ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzd();
        if (zzbptVarZzd != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = com.google.android.gms.internal.ads.zzdif.zzt(zzbptVarZzd);
        } else if (zzbppVarZzD != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = com.google.android.gms.internal.ads.zzdif.zzai(zzbppVarZzD);
        } else if (zzbppVarZzD != null && zzc(zzfcaVar, 2)) {
            zzdifVarZzah = com.google.android.gms.internal.ads.zzdif.zzag(zzbppVarZzD);
        } else if (zzbpqVarZzE != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = com.google.android.gms.internal.ads.zzdif.zzaj(zzbpqVarZzE);
        } else {
            if (zzbpqVarZzE == null || !zzc(zzfcaVar, 1)) {
                throw new com.google.android.gms.internal.ads.zzegu(1, "No native ad mappers");
            }
            zzdifVarZzah = com.google.android.gms.internal.ads.zzdif.zzah(zzbpqVarZzE);
        }
        if (zzdifVarZzah != null) {
            com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
            if (zzfcjVar.zzg.contains(java.lang.Integer.toString(zzdifVarZzah.zzc()))) {
                com.google.android.gms.internal.ads.zzdih zzdihVarZze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdir(zzdifVarZzah), new com.google.android.gms.internal.ads.zzdkk(zzbpqVarZzE, zzbppVarZzD, zzbptVarZzd));
                ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzdihVarZze.zzk());
                zzdihVarZze.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzc);
                return zzdihVarZze.zza();
            }
        }
        throw new com.google.android.gms.internal.ads.zzegu(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzfdh zzfdhVar = (com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        java.lang.String string = zzfboVar.zzv.toString();
        java.lang.String strZzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs);
        com.google.android.gms.internal.ads.zzbpk zzbpkVar = (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar2 = zzfcaVar.zza.zza;
        zzfdhVar.zzp(this.zza, zzfcjVar.zzd, string, strZzm, zzbpkVar, zzfcjVar2.zzi, zzfcjVar2.zzg);
    }
}
