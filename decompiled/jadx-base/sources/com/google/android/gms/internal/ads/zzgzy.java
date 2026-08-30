package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzy extends com.google.android.gms.internal.ads.zzhad {
    zzgzy() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry entryZzg = zzg(i);
                if (((com.google.android.gms.internal.ads.zzgxf) ((com.google.android.gms.internal.ads.zzgzz) entryZzg).zza()).zze()) {
                    entryZzg.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzd()) {
                if (((com.google.android.gms.internal.ads.zzgxf) entry.getKey()).zze()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
