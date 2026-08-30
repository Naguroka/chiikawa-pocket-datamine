package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjf extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjf(com.google.android.gms.internal.measurement.zzjh zzjhVar, android.os.Handler handler) {
        super(null);
        this.zza = zzjhVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza.set(true);
    }
}
