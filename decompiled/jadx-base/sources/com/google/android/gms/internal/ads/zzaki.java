package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaki implements com.google.android.gms.internal.ads.zzadt {
    private final com.google.android.gms.internal.ads.zzadt zza;
    private final com.google.android.gms.internal.ads.zzakd zzb;
    private com.google.android.gms.internal.ads.zzakf zzg;
    private com.google.android.gms.internal.ads.zzab zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = com.google.android.gms.internal.ads.zzei.zzf;
    private final com.google.android.gms.internal.ads.zzdy zzc = new com.google.android.gms.internal.ads.zzdy();

    public zzaki(com.google.android.gms.internal.ads.zzadt zzadtVar, com.google.android.gms.internal.ads.zzakd zzakdVar) {
        this.zza = zzadtVar;
        this.zzb = zzakdVar;
    }

    private final void zzb(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int iMax = java.lang.Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        java.lang.System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    final /* synthetic */ void zza(long j, int i, com.google.android.gms.internal.ads.zzajx zzajxVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzh);
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = zzajxVar.zza;
        long j2 = zzajxVar.zzc;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(zzfxnVar.size());
        java.util.Iterator<E> it = zzfxnVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.zzco) it.next()).zza());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzc;
        int length = bArrMarshall.length;
        zzdyVar.zzJ(bArrMarshall, length);
        this.zza.zzr(this.zzc, length);
        long j3 = zzajxVar.zzb;
        if (j3 == androidx.media3.common.C.TIME_UNSET) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzt;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzt(j, i, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z) {
        return com.google.android.gms.internal.ads.zzadr.zza(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzg(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z, int i2) throws java.io.IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i, z, 0);
        }
        zzb(i);
        int iZza = zzlVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzm(com.google.android.gms.internal.ads.zzab zzabVar) {
        java.lang.String str = zzabVar.zzo;
        str.getClass();
        com.google.android.gms.internal.ads.zzcw.zzd(com.google.android.gms.internal.ads.zzbb.zzb(str) == 3);
        if (!zzabVar.equals(this.zzh)) {
            this.zzh = zzabVar;
            this.zzg = this.zzb.zzc(zzabVar) ? this.zzb.zzb(zzabVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzabVar);
            return;
        }
        com.google.android.gms.internal.ads.zzadt zzadtVar = this.zza;
        com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
        zzzVarZzb.zzaa(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES);
        zzzVarZzb.zzA(zzabVar.zzo);
        zzzVarZzb.zzae(Long.MAX_VALUE);
        zzzVarZzb.zzE(this.zzb.zza(zzabVar));
        zzadtVar.zzm(zzzVarZzb.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        com.google.android.gms.internal.ads.zzadr.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzs(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzs(zzdyVar, i, i2);
            return;
        }
        zzb(i);
        zzdyVar.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzt(final long j, final int i, int i2, int i3, com.google.android.gms.internal.ads.zzads zzadsVar) {
        if (this.zzg == null) {
            this.zza.zzt(j, i, i2, i3, zzadsVar);
            return;
        }
        com.google.android.gms.internal.ads.zzcw.zze(zzadsVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        this.zzg.zza(this.zzf, i4, i2, com.google.android.gms.internal.ads.zzake.zza(), new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzakh
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                this.zza.zza(j, i, (com.google.android.gms.internal.ads.zzajx) obj);
            }
        });
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
