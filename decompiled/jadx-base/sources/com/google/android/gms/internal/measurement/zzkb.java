package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkb extends com.google.android.gms.internal.measurement.zzki {
    zzkb(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Long l, boolean z) {
        super(zzkfVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid long value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
