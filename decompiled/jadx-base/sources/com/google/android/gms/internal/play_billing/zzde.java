package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzde extends com.google.android.gms.internal.play_billing.zzcq {
    private com.google.android.gms.internal.play_billing.zzcz zzd;
    private java.util.concurrent.ScheduledFuture zze;

    private zzde(com.google.android.gms.internal.play_billing.zzcz zzczVar) {
        this.zzd = zzczVar;
    }

    static com.google.android.gms.internal.play_billing.zzcz zzs(com.google.android.gms.internal.play_billing.zzcz zzczVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.internal.play_billing.zzde zzdeVar = new com.google.android.gms.internal.play_billing.zzde(zzczVar);
        com.google.android.gms.internal.play_billing.zzdb zzdbVar = new com.google.android.gms.internal.play_billing.zzdb(zzdeVar);
        zzdeVar.zze = scheduledExecutorService.schedule(zzdbVar, 28500L, timeUnit);
        zzczVar.zzb(zzdbVar, com.google.android.gms.internal.play_billing.zzcp.INSTANCE);
        return zzdeVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    protected final java.lang.String zzd() {
        com.google.android.gms.internal.play_billing.zzcz zzczVar = this.zzd;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zze;
        if (zzczVar == null) {
            return null;
        }
        java.lang.String str = "inputFuture=[" + zzczVar.toString() + com.ironsource.y8.i.e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    protected final void zzg() {
        com.google.android.gms.internal.play_billing.zzcz zzczVar = this.zzd;
        if ((this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj.zza) & (zzczVar != null)) {
            java.lang.Object obj = this.valueField;
            zzczVar.cancel((obj instanceof com.google.android.gms.internal.play_billing.zzcj.zza) && ((com.google.android.gms.internal.play_billing.zzcj.zza) obj).zzc);
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzd = null;
        this.zze = null;
    }
}
