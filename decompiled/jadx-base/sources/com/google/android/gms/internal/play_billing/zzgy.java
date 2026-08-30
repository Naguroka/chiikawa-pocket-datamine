package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgy extends com.google.android.gms.internal.play_billing.zzhd {
    zzgy() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry entryZzg = zzg(i);
                if (((com.google.android.gms.internal.play_billing.zzey) ((com.google.android.gms.internal.play_billing.zzgz) entryZzg).zza()).zze()) {
                    entryZzg.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzd()) {
                if (((com.google.android.gms.internal.play_billing.zzey) entry.getKey()).zze()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
