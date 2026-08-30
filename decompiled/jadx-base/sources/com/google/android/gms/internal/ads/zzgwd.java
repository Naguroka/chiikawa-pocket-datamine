package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwd extends com.google.android.gms.internal.ads.zzgwg {
    private final int zzc;
    private final int zzd;

    zzgwd(byte[] bArr, int i, int i2) {
        super(bArr);
        zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final byte zza(int i) {
        zzy(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
