package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznv extends com.google.android.gms.internal.measurement.zzoa {
    zznv() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry entryZzg = zzg(i);
                if (((com.google.android.gms.internal.measurement.zzlt) ((com.google.android.gms.internal.measurement.zznw) entryZzg).zza()).zze()) {
                    entryZzg.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzd()) {
                if (((com.google.android.gms.internal.measurement.zzlt) entry.getKey()).zze()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
