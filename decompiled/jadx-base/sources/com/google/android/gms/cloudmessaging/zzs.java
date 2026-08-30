package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzs {
    final int zza;
    final com.google.android.gms.tasks.TaskCompletionSource zzb = new com.google.android.gms.tasks.TaskCompletionSource();
    final int zzc;
    final android.os.Bundle zzd;

    zzs(int i, int i2, android.os.Bundle bundle) {
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    public final java.lang.String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + zzb() + "}";
    }

    abstract void zza(android.os.Bundle bundle);

    abstract boolean zzb();

    final void zzc(com.google.android.gms.cloudmessaging.zzt zztVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.zzb.setException(zztVar);
    }

    final void zzd(java.lang.Object obj) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + java.lang.String.valueOf(obj));
        }
        this.zzb.setResult(obj);
    }
}
