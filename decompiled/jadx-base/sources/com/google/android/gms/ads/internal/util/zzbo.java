package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbo {
    private static com.google.android.gms.internal.ads.zzapp zza;
    private static final java.lang.Object zzb = new java.lang.Object();

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x003c, B:14:0x0034, B:16:0x003e), top: B:21:0x0010 }] */
    public zzbo(android.content.Context context) {
        com.google.android.gms.internal.ads.zzapp zzappVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                com.google.android.gms.internal.ads.zzbcl.zza(context);
                if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    zzappVarZza = com.google.android.gms.internal.ads.zzaqt.zza(context, null);
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzew)).booleanValue()) {
                        zzappVarZza = com.google.android.gms.ads.internal.util.zzaz.zzb(context);
                    } else {
                        zzappVarZza = com.google.android.gms.internal.ads.zzaqt.zza(context, null);
                    }
                }
                zza = zzappVarZza;
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        zza.zza(new com.google.android.gms.ads.internal.util.zzbm(str, null, zzcabVar));
        return zzcabVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(int i, java.lang.String str, java.util.Map map, byte[] bArr) {
        com.google.android.gms.ads.internal.util.zzbk zzbkVar = new com.google.android.gms.ads.internal.util.zzbk(null);
        com.google.android.gms.ads.internal.util.zzbi zzbiVar = new com.google.android.gms.ads.internal.util.zzbi(this, str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        com.google.android.gms.ads.internal.util.zzbj zzbjVar = new com.google.android.gms.ads.internal.util.zzbj(this, i, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbjVar.zzl(), zzbjVar.zzx());
            } catch (com.google.android.gms.internal.ads.zzaou e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            }
        }
        zza.zza(zzbjVar);
        return zzbkVar;
    }
}
