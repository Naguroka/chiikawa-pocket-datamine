package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfzz extends com.google.android.gms.internal.ads.zzgaa {

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.ads.zzgaa zza;
    final com.google.android.gms.internal.ads.zzfzv zzb;

    @javax.annotation.CheckForNull
    final java.lang.Character zzc;

    zzfzz(com.google.android.gms.internal.ads.zzfzv zzfzvVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        this.zzb = zzfzvVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzfzvVar.zze('=')) {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzfun.zzi(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfzz) {
            com.google.android.gms.internal.ads.zzfzz zzfzzVar = (com.google.android.gms.internal.ads.zzfzz) obj;
            if (this.zzb.equals(zzfzzVar.zzb) && java.util.Objects.equals(this.zzc, zzfzzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Character ch = this.zzc;
        return java.util.Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    int zza(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzfzy {
        com.google.android.gms.internal.ads.zzfzv zzfzvVar;
        java.lang.CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new com.google.android.gms.internal.ads.zzfzy("Invalid input length " + charSequenceZzg.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzfzvVar = this.zzb;
                if (i3 >= zzfzvVar.zzc) {
                    break;
                }
                jZzb <<= zzfzvVar.zzb;
                if (i + i3 < charSequenceZzg.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzg.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzfzvVar.zzd;
            int i6 = i4 * zzfzvVar.zzb;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zzb.zzc;
        }
        return i2;
    }

    com.google.android.gms.internal.ads.zzgaa zzb(com.google.android.gms.internal.ads.zzfzv zzfzvVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.zzfzz(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    void zzc(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.ads.zzfun.zzk(0, i2, bArr.length);
        while (i3 < i2) {
            zzh(appendable, bArr, i3, java.lang.Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final int zzd(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final int zze(int i) {
        com.google.android.gms.internal.ads.zzfzv zzfzvVar = this.zzb;
        return zzfzvVar.zzc * com.google.android.gms.internal.ads.zzgaj.zzb(i, zzfzvVar.zzd, java.math.RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final com.google.android.gms.internal.ads.zzgaa zzf() {
        com.google.android.gms.internal.ads.zzgaa zzgaaVarZzb = this.zza;
        if (zzgaaVarZzb == null) {
            com.google.android.gms.internal.ads.zzfzv zzfzvVar = this.zzb;
            com.google.android.gms.internal.ads.zzfzv zzfzvVarZzc = zzfzvVar.zzc();
            zzgaaVarZzb = zzfzvVarZzc == zzfzvVar ? this : zzb(zzfzvVarZzc, this.zzc);
            this.zza = zzgaaVarZzb;
        }
        return zzgaaVarZzb;
    }

    final void zzh(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfun.zzk(i, i + i2, bArr.length);
        int i3 = 0;
        com.google.android.gms.internal.ads.zzfun.zze(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = (i2 + 1) * 8;
        com.google.android.gms.internal.ads.zzfzv zzfzvVar = this.zzb;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzfzvVar.zzb) - i3);
            com.google.android.gms.internal.ads.zzfzv zzfzvVar2 = this.zzb;
            appendable.append(zzfzvVar2.zza(((int) j2) & zzfzvVar2.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i3 += this.zzb.zzb;
            }
        }
    }

    zzfzz(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.zzfzv(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final java.lang.CharSequence zzg(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.lang.Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
