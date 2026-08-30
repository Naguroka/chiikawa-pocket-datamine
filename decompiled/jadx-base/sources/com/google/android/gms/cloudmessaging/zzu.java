package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzu extends com.google.android.gms.cloudmessaging.zzs {
    zzu(int i, int i2, android.os.Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final void zza(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final boolean zzb() {
        return false;
    }
}
