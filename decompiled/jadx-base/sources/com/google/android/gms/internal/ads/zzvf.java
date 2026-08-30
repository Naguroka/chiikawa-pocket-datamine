package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvf implements com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zztv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzvk zza;
    private final android.net.Uri zzc;
    private final com.google.android.gms.internal.ads.zzgx zzd;
    private final com.google.android.gms.internal.ads.zzuz zze;
    private final com.google.android.gms.internal.ads.zzacq zzf;
    private final com.google.android.gms.internal.ads.zzda zzg;
    private volatile boolean zzi;
    private long zzk;
    private com.google.android.gms.internal.ads.zzadt zzm;
    private boolean zzn;
    private final com.google.android.gms.internal.ads.zzadj zzh = new com.google.android.gms.internal.ads.zzadj();
    private boolean zzj = true;
    private final long zzb = com.google.android.gms.internal.ads.zztx.zza();
    private com.google.android.gms.internal.ads.zzgd zzl = zzi(0);

    public zzvf(com.google.android.gms.internal.ads.zzvk zzvkVar, android.net.Uri uri, com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzuz zzuzVar, com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzda zzdaVar) {
        this.zza = zzvkVar;
        this.zzc = uri;
        this.zzd = new com.google.android.gms.internal.ads.zzgx(zzfyVar);
        this.zze = zzuzVar;
        this.zzf = zzacqVar;
        this.zzg = zzdaVar;
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzvf zzvfVar, long j, long j2) {
        zzvfVar.zzh.zza = j;
        zzvfVar.zzk = j2;
        zzvfVar.zzj = true;
        zzvfVar.zzn = false;
    }

    private final com.google.android.gms.internal.ads.zzgd zzi(long j) {
        com.google.android.gms.internal.ads.zzgb zzgbVar = new com.google.android.gms.internal.ads.zzgb();
        zzgbVar.zzd(this.zzc);
        zzgbVar.zzc(j);
        zzgbVar.zza(6);
        zzgbVar.zzb(com.google.android.gms.internal.ads.zzvk.zzb);
        return zzgbVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01e0 */
    @Override // com.google.android.gms.internal.ads.zzyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws java.lang.Throwable {
        int i;
        boolean z;
        int i2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEquals;
        int i3;
        com.google.android.gms.internal.ads.zzl zzlVar;
        int i4;
        int i5;
        int i6;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                com.google.android.gms.internal.ads.zzgd zzgdVarZzi = zzi(j);
                this.zzl = zzgdVarZzi;
                long jZzb = this.zzd.zzb(zzgdVarZzi);
                if (this.zzi) {
                    com.google.android.gms.internal.ads.zzuz zzuzVar = this.zze;
                    if (zzuzVar.zzb() != -1) {
                        this.zzh.zza = zzuzVar.zzb();
                    }
                    com.google.android.gms.internal.ads.zzga.zza(this.zzd);
                    return;
                }
                if (jZzb != -1) {
                    jZzb += j;
                    com.google.android.gms.internal.ads.zzvk.zzC(this.zza);
                }
                long j2 = jZzb;
                com.google.android.gms.internal.ads.zzvk zzvkVar = this.zza;
                java.util.Map mapZze = this.zzd.zze();
                java.util.List list = (java.util.List) mapZze.get("icy-br");
                if (list != null) {
                    java.lang.String str4 = (java.lang.String) list.get(0);
                    try {
                        i6 = java.lang.Integer.parseInt(str4) * 1000;
                        if (i6 > 0) {
                            i2 = i6;
                            z = true;
                        } else {
                            try {
                                com.google.android.gms.internal.ads.zzdo.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                                z = false;
                                i2 = -1;
                            } catch (java.lang.NumberFormatException unused) {
                                com.google.android.gms.internal.ads.zzdo.zzf("IcyHeaders", "Invalid bitrate header: ".concat(java.lang.String.valueOf(str4)));
                                z = false;
                                i2 = i6;
                            }
                        }
                    } catch (java.lang.NumberFormatException unused2) {
                        i6 = -1;
                    }
                } else {
                    z = false;
                    i2 = -1;
                }
                java.util.List list2 = (java.util.List) mapZze.get("icy-genre");
                if (list2 != null) {
                    str = (java.lang.String) list2.get(0);
                    z = true;
                } else {
                    str = null;
                }
                java.util.List list3 = (java.util.List) mapZze.get("icy-name");
                if (list3 != null) {
                    str2 = (java.lang.String) list3.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                java.util.List list4 = (java.util.List) mapZze.get("icy-url");
                if (list4 != null) {
                    str3 = (java.lang.String) list4.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                java.util.List list5 = (java.util.List) mapZze.get("icy-pub");
                if (list5 != null) {
                    zEquals = ((java.lang.String) list5.get(0)).equals("1");
                    z = true;
                } else {
                    zEquals = false;
                }
                java.util.List list6 = (java.util.List) mapZze.get("icy-metaint");
                if (list6 != null) {
                    java.lang.String str5 = (java.lang.String) list6.get(0);
                    try {
                        i5 = java.lang.Integer.parseInt(str5);
                        if (i5 > 0) {
                            i3 = i5;
                            z = true;
                        } else {
                            try {
                                com.google.android.gms.internal.ads.zzdo.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                i3 = -1;
                            } catch (java.lang.NumberFormatException unused3) {
                                com.google.android.gms.internal.ads.zzdo.zzf("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(str5)));
                                i3 = i5;
                            }
                        }
                    } catch (java.lang.NumberFormatException unused4) {
                        i5 = -1;
                    }
                } else {
                    i3 = -1;
                }
                zzvkVar.zzs = z ? new com.google.android.gms.internal.ads.zzafr(i2, str, str2, str3, zEquals, i3) : null;
                com.google.android.gms.internal.ads.zzgx zzgxVar = this.zzd;
                com.google.android.gms.internal.ads.zzvk zzvkVar2 = this.zza;
                if (zzvkVar2.zzs == null || zzvkVar2.zzs.zzf == -1) {
                    zzlVar = zzgxVar;
                } else {
                    com.google.android.gms.internal.ads.zztw zztwVar = new com.google.android.gms.internal.ads.zztw(zzgxVar, zzvkVar2.zzs.zzf, this);
                    com.google.android.gms.internal.ads.zzadt zzadtVarZzv = this.zza.zzv();
                    this.zzm = zzadtVarZzv;
                    zzadtVarZzv.zzm(com.google.android.gms.internal.ads.zzvk.zzc);
                    zzlVar = zztwVar;
                }
                try {
                    this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                    if (this.zza.zzs != null) {
                        this.zze.zzc();
                    }
                    if (this.zzj) {
                        this.zze.zzf(j, this.zzk);
                        i = 0;
                        try {
                            this.zzj = false;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            int i7 = i;
                            if (i7 != 1) {
                                com.google.android.gms.internal.ads.zzuz zzuzVar2 = this.zze;
                                if (zzuzVar2.zzb() != -1) {
                                    this.zzh.zza = zzuzVar2.zzb();
                                }
                            }
                            com.google.android.gms.internal.ads.zzga.zza(this.zzd);
                            throw th;
                        }
                    } else {
                        i = 0;
                    }
                    long j3 = j;
                    int iZza = i;
                    while (iZza == 0) {
                        if (this.zzi) {
                            iZza = i;
                            break;
                        }
                        try {
                            this.zzg.zza();
                            iZza = this.zze.zza(this.zzh);
                            long jZzb2 = this.zze.zzb();
                            if (jZzb2 > this.zza.zzj + j3) {
                                this.zzg.zzc();
                                com.google.android.gms.internal.ads.zzvk zzvkVar3 = this.zza;
                                zzvkVar3.zzq.post(zzvkVar3.zzp);
                                j3 = jZzb2;
                            }
                        } catch (java.lang.InterruptedException unused5) {
                            throw new java.io.InterruptedIOException();
                        }
                    }
                    if (iZza == 1) {
                        i4 = i;
                    } else {
                        com.google.android.gms.internal.ads.zzuz zzuzVar3 = this.zze;
                        if (zzuzVar3.zzb() != -1) {
                            this.zzh.zza = zzuzVar3.zzb();
                        }
                        i4 = iZza;
                    }
                    com.google.android.gms.internal.ads.zzga.zza(this.zzd);
                    if (i4 != 0) {
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                i = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        long jMax = !this.zzn ? this.zzk : java.lang.Math.max(com.google.android.gms.internal.ads.zzvk.zzr(this.zza, true), this.zzk);
        int iZzb = zzdyVar.zzb();
        com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzm;
        zzadtVar.getClass();
        zzadtVar.zzr(zzdyVar, iZzb);
        zzadtVar.zzt(jMax, 1, iZzb, 0, null);
        this.zzn = true;
    }
}
