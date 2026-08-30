package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjt extends android.database.ContentObserver {
    zzjt(com.google.android.gms.internal.measurement.zzju zzjuVar, android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.measurement.zzki.zzc();
    }
}
