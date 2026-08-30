package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpw {
    final android.content.Context zza;

    public zzpw(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
