package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzju implements com.google.android.gms.internal.measurement.zzjr {
    private static com.google.android.gms.internal.measurement.zzju zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;
    private boolean zzd;

    private zzju() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    private zzju(android.content.Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new com.google.android.gms.internal.measurement.zzjt(this, null);
    }

    static com.google.android.gms.internal.measurement.zzju zza(android.content.Context context) {
        com.google.android.gms.internal.measurement.zzju zzjuVar;
        synchronized (com.google.android.gms.internal.measurement.zzju.class) {
            if (zza == null) {
                zza = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.measurement.zzju(context) : new com.google.android.gms.internal.measurement.zzju();
            }
            com.google.android.gms.internal.measurement.zzju zzjuVar2 = zza;
            if (zzjuVar2 == null || zzjuVar2.zzc == null || zzjuVar2.zzd) {
                zzjuVar = (com.google.android.gms.internal.measurement.zzju) com.google.common.base.Preconditions.checkNotNull(zza);
            } else {
                try {
                    context.getContentResolver().registerContentObserver(com.google.android.gms.internal.measurement.zzjc.zza, true, zza.zzc);
                    ((com.google.android.gms.internal.measurement.zzju) com.google.common.base.Preconditions.checkNotNull(zza)).zzd = true;
                } catch (java.lang.SecurityException e) {
                    android.util.Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                }
                zzjuVar = (com.google.android.gms.internal.measurement.zzju) com.google.common.base.Preconditions.checkNotNull(zza);
            }
            throw th;
        }
        return zzjuVar;
    }

    static synchronized void zze() {
        android.content.Context context;
        com.google.android.gms.internal.measurement.zzju zzjuVar = zza;
        if (zzjuVar != null && (context = zzjuVar.zzb) != null && zzjuVar.zzc != null && zzjuVar.zzd) {
            context.getContentResolver().unregisterContentObserver(zza.zzc);
        }
        zza = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb(final java.lang.String str) {
        android.content.Context context = this.zzb;
        if (context != null && !com.google.android.gms.internal.measurement.zzji.zza(context)) {
            try {
                return (java.lang.String) com.google.android.gms.internal.measurement.zzjp.zza(new com.google.android.gms.internal.measurement.zzjq() { // from class: com.google.android.gms.internal.measurement.zzjs
                    @Override // com.google.android.gms.internal.measurement.zzjq
                    public final java.lang.Object zza() {
                        return com.google.android.gms.internal.measurement.zzjb.zza(((android.content.Context) com.google.common.base.Preconditions.checkNotNull(this.zza.zzb)).getContentResolver(), str, null);
                    }
                });
            } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e) {
                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
            }
        }
        return null;
    }
}
