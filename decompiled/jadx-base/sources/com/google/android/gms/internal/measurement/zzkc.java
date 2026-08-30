package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkc extends com.google.android.gms.internal.measurement.zzki {
    zzkc(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Boolean bool, boolean z) {
        super(zzkfVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.google.android.gms.internal.measurement.zzjc.zzc.matcher(str).matches()) {
                return true;
            }
            if (com.google.android.gms.internal.measurement.zzjc.zzd.matcher(str).matches()) {
                return false;
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid boolean value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
