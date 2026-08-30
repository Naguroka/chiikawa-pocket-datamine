package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkd extends com.google.android.gms.internal.measurement.zzki {
    zzkd(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Double d, boolean z) {
        super(zzkfVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid double value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
