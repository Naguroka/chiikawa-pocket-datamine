package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbyj {
    static com.google.android.gms.internal.ads.zzbyj zza;

    public static synchronized com.google.android.gms.internal.ads.zzbyj zzd(android.content.Context context) {
        com.google.android.gms.internal.ads.zzbyj zzbyjVar = zza;
        if (zzbyjVar != null) {
            return zzbyjVar;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.internal.ads.zzbcl.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
        zzgVarZzi.zzp(applicationContext);
        com.google.android.gms.internal.ads.zzbyb zzbybVar = new com.google.android.gms.internal.ads.zzbyb(null);
        zzbybVar.zzb(applicationContext);
        zzbybVar.zzc(com.google.android.gms.ads.internal.zzv.zzC());
        zzbybVar.zza(zzgVarZzi);
        zzbybVar.zzd(com.google.android.gms.ads.internal.zzv.zzo());
        com.google.android.gms.internal.ads.zzbyj zzbyjVarZze = zzbybVar.zze();
        zza = zzbyjVarZze;
        zzbyjVarZze.zza().zza();
        com.google.android.gms.internal.ads.zzbyn zzbynVarZzc = zza.zzc();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaE)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            java.util.Map mapZzw = com.google.android.gms.ads.internal.util.zzs.zzw((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaF));
            java.util.Iterator it = mapZzw.keySet().iterator();
            while (it.hasNext()) {
                zzbynVarZzc.zzc((java.lang.String) it.next());
            }
            zzbynVarZzc.zzd(new com.google.android.gms.internal.ads.zzbyl(zzbynVarZzc, mapZzw));
        }
        return zza;
    }

    abstract com.google.android.gms.internal.ads.zzbxv zza();

    abstract com.google.android.gms.internal.ads.zzbxz zzb();

    abstract com.google.android.gms.internal.ads.zzbyn zzc();
}
