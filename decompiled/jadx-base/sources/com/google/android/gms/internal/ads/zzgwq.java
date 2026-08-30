package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwq implements com.google.android.gms.internal.ads.zzgzp {
    private final com.google.android.gms.internal.ads.zzgwp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwq(com.google.android.gms.internal.ads.zzgwp zzgwpVar) {
        com.google.android.gms.internal.ads.zzgye.zzc(zzgwpVar, "input");
        this.zza = zzgwpVar;
        zzgwpVar.zzc = this;
    }

    private final void zzO(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgzvVar.zzh(obj, this, zzgxbVar);
            if (this.zzb != this.zzc) {
                throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
            }
            this.zzc = i;
        } catch (java.lang.Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final void zzP(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
        int iZzm = zzgwpVar.zzm();
        if (zzgwpVar.zza >= zzgwpVar.zzb) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = zzgwpVar.zzd(iZzm);
        this.zza.zza++;
        zzgzvVar.zzh(obj, this, zzgxbVar);
        this.zza.zzy(0);
        com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
        zzgwpVar2.zza--;
        zzgwpVar2.zzz(iZzd);
    }

    private final void zzQ(int i) throws java.io.IOException {
        if (this.zza.zzc() != i) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws java.io.IOException {
        if ((this.zzb & 7) != i) {
            throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
    }

    public static com.google.android.gms.internal.ads.zzgwq zzq(com.google.android.gms.internal.ads.zzgwp zzgwpVar) {
        com.google.android.gms.internal.ads.zzgwq zzgwqVar = zzgwpVar.zzc;
        return zzgwqVar != null ? zzgwqVar : new com.google.android.gms.internal.ads.zzgwq(zzgwpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzA(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgyrVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(java.lang.Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzB(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxi) {
            com.google.android.gms.internal.ads.zzgxi zzgxiVar = (com.google.android.gms.internal.ads.zzgxi) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxiVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxiVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(java.lang.Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(java.lang.Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    @java.lang.Deprecated
    public final void zzC(java.util.List list, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            java.lang.Object objZze = zzgzvVar.zze();
            zzO(objZze, zzgzvVar, zzgxbVar);
            zzgzvVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzD(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzE(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzF(java.util.List list, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            java.lang.Object objZze = zzgzvVar.zze();
            zzP(objZze, zzgzvVar, zzgxbVar);
            zzgzvVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzG(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxsVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzH(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgyrVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(java.lang.Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzI(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzJ(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(java.util.List list, boolean z) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof com.google.android.gms.internal.ads.zzgyo) && !z) {
            com.google.android.gms.internal.ads.zzgyo zzgyoVar = (com.google.android.gms.internal.ads.zzgyo) list;
            do {
                zzp();
                zzgyoVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzL(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzM(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final boolean zzN() throws java.io.IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final double zza() throws java.io.IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final float zzb() throws java.io.IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzc() throws java.io.IOException {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        if (iZzl == 0 || iZzl == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzl >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zze() throws java.io.IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzf() throws java.io.IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzg() throws java.io.IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzh() throws java.io.IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzi() throws java.io.IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzj() throws java.io.IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzk() throws java.io.IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzl() throws java.io.IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzm() throws java.io.IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzn() throws java.io.IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzo() throws java.io.IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final com.google.android.gms.internal.ads.zzgwj zzp() throws java.io.IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final java.lang.String zzr() throws java.io.IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final java.lang.String zzs() throws java.io.IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzt(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzR(3);
        zzO(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzu(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzR(2);
        zzP(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzv(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgvz) {
            com.google.android.gms.internal.ads.zzgvz zzgvzVar = (com.google.android.gms.internal.ads.zzgvz) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgvzVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgvzVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzw(java.util.List list) throws java.io.IOException {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzx(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgwy) {
            com.google.android.gms.internal.ads.zzgwy zzgwyVar = (com.google.android.gms.internal.ads.zzgwy) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgwyVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgwyVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(java.lang.Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(java.lang.Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzy(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzz(java.util.List list) throws java.io.IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxsVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(java.lang.Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }
}
