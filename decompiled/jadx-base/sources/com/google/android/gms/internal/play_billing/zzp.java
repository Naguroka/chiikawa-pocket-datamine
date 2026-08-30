package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzp {
    java.lang.Object zza;
    com.google.android.gms.internal.play_billing.zzt zzb;
    private com.google.android.gms.internal.play_billing.zzv zzc = com.google.android.gms.internal.play_billing.zzv.zze();
    private boolean zzd;

    zzp() {
    }

    protected final void finalize() {
        com.google.android.gms.internal.play_billing.zzv zzvVar;
        com.google.android.gms.internal.play_billing.zzt zztVar = this.zzb;
        if (zztVar != null && !zztVar.isDone()) {
            zztVar.zzc(new com.google.android.gms.internal.play_billing.zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza)))));
        }
        if (this.zzd || (zzvVar = this.zzc) == null) {
            return;
        }
        zzvVar.zzd(null);
    }

    final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc.zzd(null);
    }

    public final boolean zzb(java.lang.Object obj) {
        this.zzd = true;
        com.google.android.gms.internal.play_billing.zzt zztVar = this.zzb;
        boolean z = zztVar != null && zztVar.zza(obj);
        if (z) {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
        return z;
    }
}
