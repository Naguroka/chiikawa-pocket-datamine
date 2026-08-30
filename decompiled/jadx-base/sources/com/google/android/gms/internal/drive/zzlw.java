package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlw<T> implements com.google.android.gms.internal.drive.zzmf<T> {
    private final com.google.android.gms.internal.drive.zzlq zzuh;
    private final boolean zzui;
    private final com.google.android.gms.internal.drive.zzmx<?, ?> zzur;
    private final com.google.android.gms.internal.drive.zzjy<?> zzus;

    private zzlw(com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzlq zzlqVar) {
        this.zzur = zzmxVar;
        this.zzui = zzjyVar.zze(zzlqVar);
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
    }

    static <T> com.google.android.gms.internal.drive.zzlw<T> zza(com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return new com.google.android.gms.internal.drive.zzlw<>(zzmxVar, zzjyVar, zzlqVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzuh.zzcz().zzde();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
            return false;
        }
        if (this.zzui) {
            return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int iHashCode = this.zzur.zzr(t).hashCode();
        return this.zzui ? (iHashCode * 53) + this.zzus.zzb(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        com.google.android.gms.internal.drive.zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzmh.zza(this.zzus, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        for (T t2 : this.zzus.zzb(t)) {
            com.google.android.gms.internal.drive.zzkd zzkdVar = (com.google.android.gms.internal.drive.zzkd) t2.getKey();
            if (zzkdVar.zzcr() != com.google.android.gms.internal.drive.zznr.MESSAGE || zzkdVar.zzcs() || zzkdVar.zzct()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (t2 instanceof com.google.android.gms.internal.drive.zzkv) {
                zznsVar.zza(zzkdVar.zzcp(), (java.lang.Object) ((com.google.android.gms.internal.drive.zzkv) t2).zzdq().zzbl());
            } else {
                zznsVar.zza(zzkdVar.zzcp(), t2.getValue());
            }
        }
        com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar = this.zzur;
        zzmxVar.zzc(zzmxVar.zzr(t), zznsVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) t;
        com.google.android.gms.internal.drive.zzmy zzmyVarZzfb = zzkkVar.zzrq;
        if (zzmyVarZzfb == com.google.android.gms.internal.drive.zzmy.zzfa()) {
            zzmyVarZzfb = com.google.android.gms.internal.drive.zzmy.zzfb();
            zzkkVar.zzrq = zzmyVarZzfb;
        }
        ((com.google.android.gms.internal.drive.zzkk.zzc) t).zzdg();
        com.google.android.gms.internal.drive.zzkk.zzd zzdVar = null;
        while (i < i2) {
            int iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
            int i3 = zzizVar.zznk;
            if (i3 == 11) {
                int i4 = 0;
                com.google.android.gms.internal.drive.zzjc zzjcVar = null;
                while (iZza < i2) {
                    iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza, zzizVar);
                    int i5 = zzizVar.zznk;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZza = com.google.android.gms.internal.drive.zziy.zza(i5, bArr, iZza, i2, zzizVar);
                        } else {
                            iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza, zzizVar);
                            i4 = zzizVar.zznk;
                            zzdVar = (com.google.android.gms.internal.drive.zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (zzdVar != null) {
                                com.google.android.gms.internal.drive.zzmd.zzej();
                                throw new java.lang.NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                iZza = com.google.android.gms.internal.drive.zziy.zze(bArr, iZza, zzizVar);
                                zzjcVar = (com.google.android.gms.internal.drive.zzjc) zzizVar.zznm;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iZza = com.google.android.gms.internal.drive.zziy.zza(i5, bArr, iZza, i2, zzizVar);
                        }
                    }
                }
                if (zzjcVar != null) {
                    zzmyVarZzfb.zzb((i4 << 3) | 2, zzjcVar);
                }
                i = iZza;
            } else if ((i3 & 7) == 2) {
                zzdVar = (com.google.android.gms.internal.drive.zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i3 >>> 3);
                if (zzdVar != null) {
                    com.google.android.gms.internal.drive.zzmd.zzej();
                    throw new java.lang.NoSuchMethodError();
                }
                i = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, iZza, i2, zzmyVarZzfb, zzizVar);
            } else {
                i = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, iZza, i2, zzizVar);
            }
        }
        if (i != i2) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        this.zzur.zzd(t);
        this.zzus.zzd(t);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        return this.zzus.zzb(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar = this.zzur;
        int iZzs = zzmxVar.zzs(zzmxVar.zzr(t)) + 0;
        return this.zzui ? iZzs + this.zzus.zzb(t).zzco() : iZzs;
    }
}
