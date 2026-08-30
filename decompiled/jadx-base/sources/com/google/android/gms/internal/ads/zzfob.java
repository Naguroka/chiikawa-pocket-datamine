package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfob {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzfni zzc;
    private final com.google.android.gms.internal.ads.zzfnk zzd;
    private final com.google.android.gms.internal.ads.zzfoa zze;
    private final com.google.android.gms.internal.ads.zzfoa zzf;
    private com.google.android.gms.tasks.Task zzg;
    private com.google.android.gms.tasks.Task zzh;

    zzfob(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfni zzfniVar, com.google.android.gms.internal.ads.zzfnk zzfnkVar, com.google.android.gms.internal.ads.zzfny zzfnyVar, com.google.android.gms.internal.ads.zzfnz zzfnzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfniVar;
        this.zzd = zzfnkVar;
        this.zze = zzfnyVar;
        this.zzf = zzfnzVar;
    }

    public static com.google.android.gms.internal.ads.zzfob zze(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfni zzfniVar, com.google.android.gms.internal.ads.zzfnk zzfnkVar) {
        final com.google.android.gms.internal.ads.zzfob zzfobVar = new com.google.android.gms.internal.ads.zzfob(context, executor, zzfniVar, zzfnkVar, new com.google.android.gms.internal.ads.zzfny(), new com.google.android.gms.internal.ads.zzfnz());
        if (zzfobVar.zzd.zzh()) {
            zzfobVar.zzg = zzfobVar.zzh(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfnv
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzfobVar.zzg = com.google.android.gms.tasks.Tasks.forResult(zzfobVar.zze.zza());
        }
        zzfobVar.zzh = zzfobVar.zzh(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzd();
            }
        });
        return zzfobVar;
    }

    private static com.google.android.gms.internal.ads.zzasy zzg(com.google.android.gms.tasks.Task task, com.google.android.gms.internal.ads.zzasy zzasyVar) {
        return !task.isSuccessful() ? zzasyVar : (com.google.android.gms.internal.ads.zzasy) task.getResult();
    }

    private final com.google.android.gms.tasks.Task zzh(java.util.concurrent.Callable callable) {
        return com.google.android.gms.tasks.Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfnx
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzasy zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final com.google.android.gms.internal.ads.zzasy zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzasy zzc() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzasc zzascVarZza = com.google.android.gms.internal.ads.zzasy.zza();
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        java.lang.String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            java.util.UUID uuidFromString = java.util.UUID.fromString(id);
            byte[] bArr = new byte[16];
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = android.util.Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzascVarZza.zzs(id);
            zzascVarZza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zzascVarZza.zzab(6);
        }
        return (com.google.android.gms.internal.ads.zzasy) zzascVarZza.zzbr();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzasy zzd() throws java.lang.Exception {
        android.content.Context context = this.zza;
        return com.google.android.gms.internal.ads.zzfnq.zza(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzf(java.lang.Exception exc) {
        if (exc instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
