package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdu extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdu(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.String str, java.lang.String str2, android.content.Context context, android.os.Bundle bundle) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = this.zze;
            java.lang.String str4 = this.zza;
            java.lang.String str5 = this.zzb;
            if (zzffVar.zzX(str4, str5)) {
                str2 = str4;
                str3 = str5;
                str = zzffVar.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            android.content.Context context = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            zzffVar.zzj = zzffVar.zzf(context, true);
            if (zzffVar.zzj == null) {
                android.util.Log.w(zzffVar.zzd, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
            int remoteVersion = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
            ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzffVar.zzj)).initialize(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), new com.google.android.gms.internal.measurement.zzdh(119002L, java.lang.Math.max(localVersion, remoteVersion), remoteVersion < localVersion, str, str2, str3, this.zzd, com.google.android.gms.measurement.internal.zzig.zza(context)), this.zzh);
        } catch (java.lang.Exception e) {
            this.zze.zzU(e, true, false);
        }
    }
}
