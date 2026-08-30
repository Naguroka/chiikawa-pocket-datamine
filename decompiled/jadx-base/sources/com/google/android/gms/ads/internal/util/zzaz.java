package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaz extends com.google.android.gms.internal.ads.zzaqb {
    private final android.content.Context zzb;

    private zzaz(android.content.Context context, com.google.android.gms.internal.ads.zzaqa zzaqaVar) {
        super(zzaqaVar);
        this.zzb = context;
    }

    public static com.google.android.gms.internal.ads.zzapp zzb(android.content.Context context) {
        com.google.android.gms.internal.ads.zzapp zzappVar = new com.google.android.gms.internal.ads.zzapp(new com.google.android.gms.internal.ads.zzaqi(new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), context.getCacheDir(), "admob_volley")), 20971520), new com.google.android.gms.ads.internal.util.zzaz(context, new com.google.android.gms.internal.ads.zzaqn(null, null)), 4);
        zzappVar.zzd();
        return zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb, com.google.android.gms.internal.ads.zzapf
    public final com.google.android.gms.internal.ads.zzapi zza(com.google.android.gms.internal.ads.zzapm zzapmVar) throws com.google.android.gms.internal.ads.zzapv {
        if (zzapmVar.zza() == 0) {
            if (java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzex), zzapmVar.zzk())) {
                android.content.Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 13400000)) {
                    com.google.android.gms.internal.ads.zzapi zzapiVarZza = new com.google.android.gms.internal.ads.zzblm(this.zzb).zza(zzapmVar);
                    if (zzapiVarZza != null) {
                        com.google.android.gms.ads.internal.util.zze.zza("Got gmscore asset response: ".concat(java.lang.String.valueOf(zzapmVar.zzk())));
                        return zzapiVarZza;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Failed to get gmscore asset response: ".concat(java.lang.String.valueOf(zzapmVar.zzk())));
                }
            }
        }
        return super.zza(zzapmVar);
    }
}
