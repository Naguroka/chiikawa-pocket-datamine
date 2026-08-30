package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzl extends com.google.android.gms.internal.play_billing.zzd {
    zzl() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final void zza(com.google.android.gms.internal.play_billing.zzm zzmVar, com.google.android.gms.internal.play_billing.zzm zzmVar2) {
        zzmVar.zzc = zzmVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final void zzb(com.google.android.gms.internal.play_billing.zzm zzmVar, java.lang.Thread thread) {
        zzmVar.zzb = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zzc(com.google.android.gms.internal.play_billing.zzo zzoVar, com.google.android.gms.internal.play_billing.zzh zzhVar, com.google.android.gms.internal.play_billing.zzh zzhVar2) {
        synchronized (zzoVar) {
            if (zzoVar.zzd != zzhVar) {
                return false;
            }
            zzoVar.zzd = zzhVar2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zzd(com.google.android.gms.internal.play_billing.zzo zzoVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (zzoVar) {
            if (zzoVar.zzc != obj) {
                return false;
            }
            zzoVar.zzc = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zze(com.google.android.gms.internal.play_billing.zzo zzoVar, com.google.android.gms.internal.play_billing.zzm zzmVar, com.google.android.gms.internal.play_billing.zzm zzmVar2) {
        synchronized (zzoVar) {
            if (zzoVar.zze != zzmVar) {
                return false;
            }
            zzoVar.zze = zzmVar2;
            return true;
        }
    }
}
