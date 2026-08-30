package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzex extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ android.app.Activity zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzex(com.google.android.gms.internal.measurement.zzfe zzfeVar, android.os.Bundle bundle, android.app.Activity activity) {
        super(zzfeVar.zza, true);
        this.zza = bundle;
        this.zzb = activity;
        this.zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle = new android.os.Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                java.lang.Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof android.os.Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (android.os.Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        com.google.android.gms.internal.measurement.zzcv zzcvVar = (com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzj);
        android.app.Activity activity = this.zzb;
        zzcvVar.onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle, this.zzi);
    }
}
