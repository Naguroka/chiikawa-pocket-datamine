package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyu implements com.google.android.gms.internal.ads.zzgzw {
    private static final com.google.android.gms.internal.ads.zzgza zza = new com.google.android.gms.internal.ads.zzgys();
    private final com.google.android.gms.internal.ads.zzgza zzb;

    public zzgyu() {
        com.google.android.gms.internal.ads.zzgza zzgzaVar = zza;
        int i = com.google.android.gms.internal.ads.zzgzm.zza;
        com.google.android.gms.internal.ads.zzgyt zzgytVar = new com.google.android.gms.internal.ads.zzgyt(com.google.android.gms.internal.ads.zzgxk.zza(), zzgzaVar);
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        this.zzb = zzgytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final com.google.android.gms.internal.ads.zzgzv zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.ads.zzgzx.zza;
        if (!com.google.android.gms.internal.ads.zzgxr.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        }
        com.google.android.gms.internal.ads.zzgyz zzgyzVarZzb = this.zzb.zzb(cls);
        if (zzgyzVarZzb.zzb()) {
            int i3 = com.google.android.gms.internal.ads.zzgzm.zza;
            return com.google.android.gms.internal.ads.zzgzg.zzc(com.google.android.gms.internal.ads.zzgzx.zzm(), com.google.android.gms.internal.ads.zzgxe.zza(), zzgyzVarZzb.zza());
        }
        int i4 = com.google.android.gms.internal.ads.zzgzm.zza;
        return com.google.android.gms.internal.ads.zzgzf.zzm(cls, zzgyzVarZzb, com.google.android.gms.internal.ads.zzgzj.zza(), com.google.android.gms.internal.ads.zzgyq.zza(), com.google.android.gms.internal.ads.zzgzx.zzm(), zzgyzVarZzb.zzc() + (-1) != 1 ? com.google.android.gms.internal.ads.zzgxe.zza() : null, com.google.android.gms.internal.ads.zzgyy.zza());
    }
}
