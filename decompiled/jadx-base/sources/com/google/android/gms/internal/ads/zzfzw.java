package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzw extends com.google.android.gms.internal.ads.zzfzz {
    final char[] zza;

    private zzfzw(com.google.android.gms.internal.ads.zzfzv zzfzvVar) {
        super(zzfzvVar, null);
        this.zza = new char[512];
        com.google.android.gms.internal.ads.zzfun.zze(zzfzvVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzfzvVar.zza(i >>> 4);
            this.zza[i | 256] = zzfzvVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final int zza(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzfzy {
        if (charSequence.length() % 2 == 1) {
            throw new com.google.android.gms.internal.ads.zzfzy("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    final com.google.android.gms.internal.ads.zzgaa zzb(com.google.android.gms.internal.ads.zzfzv zzfzvVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.zzfzw(zzfzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final void zzc(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfun.zzk(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }

    zzfzw(java.lang.String str, java.lang.String str2) {
        this(new com.google.android.gms.internal.ads.zzfzv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
