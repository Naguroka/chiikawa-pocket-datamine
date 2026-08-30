package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzx extends com.google.android.gms.internal.ads.zzfzz {
    private zzfzx(com.google.android.gms.internal.ads.zzfzv zzfzvVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        super(zzfzvVar, ch);
        com.google.android.gms.internal.ads.zzfun.zze(zzfzvVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final int zza(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzfzy {
        java.lang.CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new com.google.android.gms.internal.ads.zzfzy("Invalid input length " + charSequenceZzg.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZzg.charAt(i)) << 18) | (this.zzb.zzb(charSequenceZzg.charAt(i3)) << 12);
            bArr[i2] = (byte) (iZzb >>> 16);
            int i5 = i3 + 1;
            if (i5 < charSequenceZzg.length()) {
                int i6 = i5 + 1;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzg.charAt(i5)) << 6);
                i2 = i4 + 1;
                bArr[i4] = (byte) ((iZzb2 >>> 8) & 255);
                if (i6 < charSequenceZzg.length()) {
                    bArr[i2] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzg.charAt(i6))) & 255);
                    i2++;
                    i = i6 + 1;
                } else {
                    i = i6;
                }
            } else {
                i = i5;
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    final com.google.android.gms.internal.ads.zzgaa zzb(com.google.android.gms.internal.ads.zzfzv zzfzvVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.zzfzx(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final void zzc(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.ads.zzfun.zzk(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            int i7 = bArr[i5] & 255;
            int i8 = i5 + 1;
            int i9 = (i6 << 16) | (i7 << 8) | (bArr[i8] & 255);
            appendable.append(this.zzb.zza(i9 >>> 18));
            appendable.append(this.zzb.zza((i9 >>> 12) & 63));
            appendable.append(this.zzb.zza((i9 >>> 6) & 63));
            appendable.append(this.zzb.zza(i9 & 63));
            i3 = i8 + 1;
        }
        if (i3 < i2) {
            zzh(appendable, bArr, i3, i2 - i3);
        }
    }

    zzfzx(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.zzfzv(str, str2.toCharArray()), ch);
    }
}
