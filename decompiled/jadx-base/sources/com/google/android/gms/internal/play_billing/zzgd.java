package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgd implements com.google.android.gms.internal.play_billing.zzgw {
    private static final com.google.android.gms.internal.play_billing.zzgj zza = new com.google.android.gms.internal.play_billing.zzgb();
    private final com.google.android.gms.internal.play_billing.zzgj zzb;

    public zzgd() {
        com.google.android.gms.internal.play_billing.zzgj zzgjVar = zza;
        int i = com.google.android.gms.internal.play_billing.zzgs.zza;
        com.google.android.gms.internal.play_billing.zzgc zzgcVar = new com.google.android.gms.internal.play_billing.zzgc(com.google.android.gms.internal.play_billing.zzfd.zza(), zzgjVar);
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        this.zzb = zzgcVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgw
    public final com.google.android.gms.internal.play_billing.zzgv zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.play_billing.zzgx.zza;
        if (!com.google.android.gms.internal.play_billing.zzfi.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.play_billing.zzgs.zza;
        }
        com.google.android.gms.internal.play_billing.zzgi zzgiVarZzb = this.zzb.zzb(cls);
        if (zzgiVarZzb.zzb()) {
            int i3 = com.google.android.gms.internal.play_billing.zzgs.zza;
            return com.google.android.gms.internal.play_billing.zzgp.zzc(com.google.android.gms.internal.play_billing.zzgx.zzm(), com.google.android.gms.internal.play_billing.zzex.zza(), zzgiVarZzb.zza());
        }
        int i4 = com.google.android.gms.internal.play_billing.zzgs.zza;
        return com.google.android.gms.internal.play_billing.zzgo.zzl(cls, zzgiVarZzb, com.google.android.gms.internal.play_billing.zzgr.zza(), com.google.android.gms.internal.play_billing.zzfz.zza(), com.google.android.gms.internal.play_billing.zzgx.zzm(), zzgiVarZzb.zzc() + (-1) != 1 ? com.google.android.gms.internal.play_billing.zzex.zza() : null, com.google.android.gms.internal.play_billing.zzgh.zza());
    }
}
