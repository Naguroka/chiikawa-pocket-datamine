package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzuu implements com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzud {
    private final com.google.android.gms.internal.ads.zzue[] zza;
    private com.google.android.gms.internal.ads.zzud zze;
    private com.google.android.gms.internal.ads.zzwj zzf;
    private final java.util.ArrayList zzc = new java.util.ArrayList();
    private final java.util.HashMap zzd = new java.util.HashMap();
    private com.google.android.gms.internal.ads.zzwa zzh = new com.google.android.gms.internal.ads.zztq(com.google.android.gms.internal.ads.zzfxn.zzn(), com.google.android.gms.internal.ads.zzfxn.zzn());
    private final java.util.IdentityHashMap zzb = new java.util.IdentityHashMap();
    private com.google.android.gms.internal.ads.zzue[] zzg = new com.google.android.gms.internal.ads.zzue[0];

    public zzuu(com.google.android.gms.internal.ads.zztr zztrVar, long[] jArr, com.google.android.gms.internal.ads.zzue... zzueVarArr) {
        this.zza = zzueVarArr;
        for (int i = 0; i < zzueVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new com.google.android.gms.internal.ads.zzwg(zzueVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, com.google.android.gms.internal.ads.zzlp zzlpVar) {
        com.google.android.gms.internal.ads.zzue[] zzueVarArr = this.zzg;
        return (zzueVarArr.length > 0 ? zzueVarArr[0] : this.zza[0]).zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        long j = -9223372036854775807L;
        for (com.google.android.gms.internal.ads.zzue zzueVar : this.zzg) {
            long jZzd = zzueVar.zzd();
            if (jZzd == androidx.media3.common.C.TIME_UNSET) {
                if (j != androidx.media3.common.C.TIME_UNSET && zzueVar.zze(j) != j) {
                    throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == androidx.media3.common.C.TIME_UNSET) {
                for (com.google.android.gms.internal.ads.zzue zzueVar2 : this.zzg) {
                    if (zzueVar2 == zzueVar) {
                        break;
                    }
                    if (zzueVar2.zze(jZzd) != jZzd) {
                        throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new java.lang.IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            com.google.android.gms.internal.ads.zzue[] zzueVarArr = this.zzg;
            if (i >= zzueVarArr.length) {
                return jZze;
            }
            if (zzueVarArr[i].zze(jZze) != jZze) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzxvVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzxvVarArr.length;
            if (i2 >= length) {
                break;
            }
            com.google.android.gms.internal.ads.zzvy zzvyVar = zzvyVarArr[i2];
            java.lang.Integer num = zzvyVar != null ? (java.lang.Integer) this.zzb.get(zzvyVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            com.google.android.gms.internal.ads.zzxv zzxvVar = zzxvVarArr[i2];
            if (zzxvVar != null) {
                java.lang.String str = zzxvVar.zzg().zzb;
                iArr2[i2] = java.lang.Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.zzb.clear();
        com.google.android.gms.internal.ads.zzvy[] zzvyVarArr2 = new com.google.android.gms.internal.ads.zzvy[length];
        com.google.android.gms.internal.ads.zzvy[] zzvyVarArr3 = new com.google.android.gms.internal.ads.zzvy[length];
        com.google.android.gms.internal.ads.zzxv[] zzxvVarArr2 = new com.google.android.gms.internal.ads.zzxv[length];
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = i; i4 < zzxvVarArr.length; i4++) {
                zzvyVarArr3[i4] = iArr[i4] == i3 ? zzvyVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    com.google.android.gms.internal.ads.zzxv zzxvVar2 = zzxvVarArr[i4];
                    zzxvVar2.getClass();
                    com.google.android.gms.internal.ads.zzbr zzbrVar = (com.google.android.gms.internal.ads.zzbr) this.zzd.get(zzxvVar2.zzg());
                    zzbrVar.getClass();
                    zzxvVarArr2[i4] = new com.google.android.gms.internal.ads.zzut(zzxvVar2, zzbrVar);
                } else {
                    zzxvVarArr2[i4] = null;
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            com.google.android.gms.internal.ads.zzxv[] zzxvVarArr3 = zzxvVarArr2;
            com.google.android.gms.internal.ads.zzvy[] zzvyVarArr4 = zzvyVarArr3;
            long jZzf = this.zza[i3].zzf(zzxvVarArr2, zArr, zzvyVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzxvVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    com.google.android.gms.internal.ads.zzvy zzvyVar2 = zzvyVarArr4[i5];
                    zzvyVar2.getClass();
                    zzvyVarArr2[i5] = zzvyVar2;
                    this.zzb.put(zzvyVar2, java.lang.Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    com.google.android.gms.internal.ads.zzcw.zzf(zzvyVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i3]);
            }
            i3++;
            arrayList = arrayList2;
            zzxvVarArr2 = zzxvVarArr3;
            zzvyVarArr3 = zzvyVarArr4;
            i = 0;
        }
        int i6 = i;
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.System.arraycopy(zzvyVarArr2, i6, zzvyVarArr, i6, length);
        this.zzg = (com.google.android.gms.internal.ads.zzue[]) arrayList3.toArray(new com.google.android.gms.internal.ads.zzue[i6]);
        this.zzh = new com.google.android.gms.internal.ads.zztq(arrayList3, com.google.android.gms.internal.ads.zzfyd.zzb(arrayList3, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.internal.ads.zzue) obj).zzh().zzc();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzwa zzwaVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zze;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        this.zzc.remove(zzueVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (com.google.android.gms.internal.ads.zzue zzueVar2 : this.zza) {
            i += zzueVar2.zzh().zzb;
        }
        com.google.android.gms.internal.ads.zzbr[] zzbrVarArr = new com.google.android.gms.internal.ads.zzbr[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzue[] zzueVarArr = this.zza;
            if (i2 >= zzueVarArr.length) {
                this.zzf = new com.google.android.gms.internal.ads.zzwj(zzbrVarArr);
                com.google.android.gms.internal.ads.zzud zzudVar = this.zze;
                zzudVar.getClass();
                zzudVar.zzi(this);
                return;
            }
            com.google.android.gms.internal.ads.zzwj zzwjVarZzh = zzueVarArr[i2].zzh();
            int i4 = zzwjVarZzh.zzb;
            int i5 = 0;
            while (i5 < i4) {
                com.google.android.gms.internal.ads.zzbr zzbrVarZzb = zzwjVarZzh.zzb(i5);
                com.google.android.gms.internal.ads.zzab[] zzabVarArr = new com.google.android.gms.internal.ads.zzab[zzbrVarZzb.zza];
                for (int i6 = 0; i6 < zzbrVarZzb.zza; i6++) {
                    com.google.android.gms.internal.ads.zzab zzabVarZzb = zzbrVarZzb.zzb(i6);
                    com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVarZzb.zzb();
                    java.lang.String str = zzabVarZzb.zza;
                    if (str == null) {
                        str = "";
                    }
                    zzzVarZzb.zzM(i2 + ":" + str);
                    zzabVarArr[i6] = zzzVarZzb.zzag();
                }
                com.google.android.gms.internal.ads.zzbr zzbrVar = new com.google.android.gms.internal.ads.zzbr(i2 + ":" + zzbrVarZzb.zzb, zzabVarArr);
                this.zzd.put(zzbrVar, zzbrVarZzb);
                zzbrVarArr[i3] = zzbrVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        for (com.google.android.gms.internal.ads.zzue zzueVar : this.zzg) {
            zzueVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws java.io.IOException {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzue[] zzueVarArr = this.zza;
            if (i >= zzueVarArr.length) {
                return;
            }
            zzueVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zze = zzudVar;
        java.util.Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzue[] zzueVarArr = this.zza;
            if (i >= zzueVarArr.length) {
                return;
            }
            zzueVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final com.google.android.gms.internal.ads.zzue zzn(int i) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zza[i];
        return zzueVar instanceof com.google.android.gms.internal.ads.zzwg ? ((com.google.android.gms.internal.ads.zzwg) zzueVar).zzn() : zzueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzkjVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzue) this.zzc.get(i)).zzo(zzkjVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zzh.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final com.google.android.gms.internal.ads.zzwj zzh() {
        com.google.android.gms.internal.ads.zzwj zzwjVar = this.zzf;
        zzwjVar.getClass();
        return zzwjVar;
    }
}
