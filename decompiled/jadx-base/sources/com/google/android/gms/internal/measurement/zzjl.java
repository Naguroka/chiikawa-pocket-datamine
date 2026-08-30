package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjl extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjl(com.google.android.gms.internal.measurement.zzjm zzjmVar, android.os.Handler handler) {
        super(null);
        this.zza = zzjmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzf();
    }
}
