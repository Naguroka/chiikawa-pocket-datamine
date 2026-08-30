package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcgx implements com.google.android.gms.internal.ads.zzckx {

    @javax.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzcgx zza;

    private static synchronized com.google.android.gms.internal.ads.zzcgx zzG(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i, boolean z, int i2, com.google.android.gms.internal.ads.zzcid zzcidVar) {
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = zza;
        if (zzcgxVar != null) {
            return zzcgxVar;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zze.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzbbv.zzd(context);
        }
        com.google.android.gms.internal.ads.zzfdf zzfdfVarZzd = com.google.android.gms.internal.ads.zzfdf.zzd(context);
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZzc = zzfdfVarZzd.zzc(244410000, false, i2);
        zzfdfVarZzd.zzf(zzbpeVar);
        com.google.android.gms.internal.ads.zzcis zzcisVar = new com.google.android.gms.internal.ads.zzcis(null);
        com.google.android.gms.internal.ads.zzcgy zzcgyVar = new com.google.android.gms.internal.ads.zzcgy();
        zzcgyVar.zzf(versionInfoParcelZzc);
        zzcgyVar.zze(context);
        zzcgyVar.zzd(jCurrentTimeMillis);
        zzcisVar.zzb(new com.google.android.gms.internal.ads.zzcha(zzcgyVar, null));
        zzcisVar.zzc(new com.google.android.gms.internal.ads.zzcjn(zzcidVar));
        com.google.android.gms.internal.ads.zzcgx zzcgxVarZza = zzcisVar.zza();
        com.google.android.gms.ads.internal.zzv.zzp().zzu(context, versionInfoParcelZzc);
        com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzv.zzq().zzm(context);
        com.google.android.gms.ads.internal.zzv.zzq().zzl(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzv.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzv.zzw().zzb(context);
        zzcgxVarZza.zza().zzc();
        com.google.android.gms.internal.ads.zzbyj.zzd(context);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaI)).booleanValue()) {
                new com.google.android.gms.internal.ads.zzeax(context, versionInfoParcelZzc, new com.google.android.gms.internal.ads.zzbbj(new com.google.android.gms.internal.ads.zzbbp(context)), new com.google.android.gms.internal.ads.zzeac(new com.google.android.gms.internal.ads.zzdzy(context), zzcgxVarZza.zzB())).zzb(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
            }
        }
        zza = zzcgxVarZza;
        return zzcgxVarZza;
    }

    public static com.google.android.gms.internal.ads.zzcgx zzb(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) {
        return zzG(context, zzbpeVar, 244410000, false, i, new com.google.android.gms.internal.ads.zzcid());
    }

    public abstract com.google.android.gms.internal.ads.zzfjj zzA();

    public abstract com.google.android.gms.internal.ads.zzgcs zzB();

    public abstract java.util.concurrent.Executor zzC();

    public abstract java.util.concurrent.ScheduledExecutorService zzD();

    public abstract com.google.android.gms.internal.ads.zzbzb zzE();

    @Override // com.google.android.gms.internal.ads.zzckx
    public final com.google.android.gms.internal.ads.zzbzb zzF() {
        return zzE();
    }

    public abstract com.google.android.gms.ads.internal.util.zzcb zza();

    public abstract com.google.android.gms.internal.ads.zzcjy zzc();

    public abstract com.google.android.gms.internal.ads.zzcnz zzd();

    public abstract com.google.android.gms.internal.ads.zzcpp zze();

    public abstract com.google.android.gms.internal.ads.zzcyl zzf();

    public abstract com.google.android.gms.internal.ads.zzdft zzg();

    public abstract com.google.android.gms.internal.ads.zzdgp zzh();

    public abstract com.google.android.gms.internal.ads.zzdoe zzi();

    public abstract com.google.android.gms.internal.ads.zzdrw zzj();

    public abstract com.google.android.gms.internal.ads.zzdtg zzk();

    public abstract com.google.android.gms.internal.ads.zzduv zzl();

    public abstract com.google.android.gms.internal.ads.zzdvs zzm();

    public abstract com.google.android.gms.internal.ads.zzebv zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzq();

    @Override // com.google.android.gms.internal.ads.zzckx
    public final com.google.android.gms.internal.ads.zzeuu zzr(com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i) {
        return zzs(new com.google.android.gms.internal.ads.zzevx(zzbvkVar, i));
    }

    protected abstract com.google.android.gms.internal.ads.zzeuu zzs(com.google.android.gms.internal.ads.zzevx zzevxVar);

    public abstract com.google.android.gms.internal.ads.zzewo zzt();

    public abstract com.google.android.gms.internal.ads.zzeyc zzu();

    public abstract com.google.android.gms.internal.ads.zzezt zzv();

    public abstract com.google.android.gms.internal.ads.zzfbh zzw();

    public abstract com.google.android.gms.internal.ads.zzfcy zzx();

    public abstract com.google.android.gms.internal.ads.zzfdi zzy();

    public abstract com.google.android.gms.internal.ads.zzfhk zzz();
}
