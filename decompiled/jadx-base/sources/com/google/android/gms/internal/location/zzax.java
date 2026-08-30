package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzax extends com.google.android.gms.internal.location.zzaj {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zza;

    public zzax(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zza = resultHolder;
    }

    private final void zze(int i) {
        if (this.zza == null) {
            android.util.Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new java.lang.Exception());
            return;
        }
        this.zza.setResult(com.google.android.gms.location.LocationStatusCodes.zzb(com.google.android.gms.location.LocationStatusCodes.zza(i)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, java.lang.String[] strArr) {
        android.util.Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new java.lang.Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, java.lang.String[] strArr) {
        zze(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, android.app.PendingIntent pendingIntent) {
        zze(i);
    }
}
