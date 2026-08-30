package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzie implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zzb;

    zzie(com.google.android.gms.measurement.internal.zzif zzifVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzifVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final java.lang.String zza(java.lang.String str) {
        java.util.Map map = (java.util.Map) this.zzb.zzf.get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (java.lang.String) map.get(str);
    }
}
