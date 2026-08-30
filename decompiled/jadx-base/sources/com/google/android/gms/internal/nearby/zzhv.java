package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhv extends android.database.ContentObserver {
    zzhv(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.nearby.zzhw.zzk.set(true);
    }
}
