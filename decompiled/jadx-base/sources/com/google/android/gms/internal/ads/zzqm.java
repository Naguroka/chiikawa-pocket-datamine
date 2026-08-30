package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqm implements com.google.android.gms.internal.ads.zzpm {
    private static final java.lang.Object zza = new java.lang.Object();
    private static java.util.concurrent.ScheduledExecutorService zzb;
    private static int zzc;
    private com.google.android.gms.internal.ads.zzbe zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;
    private java.nio.ByteBuffer zzL;
    private int zzM;
    private java.nio.ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private com.google.android.gms.internal.ads.zzf zzT;
    private com.google.android.gms.internal.ads.zzoo zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private android.os.Looper zzY;
    private long zzZ;
    private long zzaa;
    private android.os.Handler zzab;
    private final com.google.android.gms.internal.ads.zzqc zzac;
    private final com.google.android.gms.internal.ads.zzps zzad;
    private final android.content.Context zzd;
    private final com.google.android.gms.internal.ads.zzpr zze;
    private final com.google.android.gms.internal.ads.zzqw zzf;
    private final com.google.android.gms.internal.ads.zzfxn zzg;
    private final com.google.android.gms.internal.ads.zzfxn zzh;
    private final com.google.android.gms.internal.ads.zzpq zzi;
    private final java.util.ArrayDeque zzj;
    private com.google.android.gms.internal.ads.zzqk zzk;
    private final com.google.android.gms.internal.ads.zzqg zzl;
    private final com.google.android.gms.internal.ads.zzqg zzm;
    private final com.google.android.gms.internal.ads.zzpz zzn;
    private com.google.android.gms.internal.ads.zzog zzo;
    private com.google.android.gms.internal.ads.zzpj zzp;
    private com.google.android.gms.internal.ads.zzqb zzq;
    private com.google.android.gms.internal.ads.zzqb zzr;
    private com.google.android.gms.internal.ads.zzce zzs;
    private android.media.AudioTrack zzt;
    private com.google.android.gms.internal.ads.zzoi zzu;
    private com.google.android.gms.internal.ads.zzon zzv;
    private com.google.android.gms.internal.ads.zzqf zzw;
    private com.google.android.gms.internal.ads.zze zzx;
    private com.google.android.gms.internal.ads.zzqd zzy;
    private com.google.android.gms.internal.ads.zzqd zzz;

    /* synthetic */ zzqm(com.google.android.gms.internal.ads.zzqa zzqaVar, com.google.android.gms.internal.ads.zzql zzqlVar) {
        com.google.android.gms.internal.ads.zzoi zzoiVarZzc;
        android.content.Context context = zzqaVar.zza;
        this.zzd = context;
        com.google.android.gms.internal.ads.zze zzeVar = com.google.android.gms.internal.ads.zze.zza;
        this.zzx = zzeVar;
        com.google.android.gms.internal.ads.zzql zzqlVar2 = null;
        if (context != null) {
            com.google.android.gms.internal.ads.zzoi zzoiVar = com.google.android.gms.internal.ads.zzoi.zza;
            int i = com.google.android.gms.internal.ads.zzei.zza;
            zzoiVarZzc = com.google.android.gms.internal.ads.zzoi.zzc(context, zzeVar, null);
        } else {
            zzoiVarZzc = zzqaVar.zzb;
        }
        this.zzu = zzoiVarZzc;
        this.zzac = zzqaVar.zzf;
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        com.google.android.gms.internal.ads.zzps zzpsVar = zzqaVar.zzg;
        zzpsVar.getClass();
        this.zzad = zzpsVar;
        this.zzi = new com.google.android.gms.internal.ads.zzpq(new com.google.android.gms.internal.ads.zzqh(this, zzqlVar2));
        com.google.android.gms.internal.ads.zzpr zzprVar = new com.google.android.gms.internal.ads.zzpr();
        this.zze = zzprVar;
        com.google.android.gms.internal.ads.zzqw zzqwVar = new com.google.android.gms.internal.ads.zzqw();
        this.zzf = zzqwVar;
        this.zzg = com.google.android.gms.internal.ads.zzfxn.zzq(new com.google.android.gms.internal.ads.zzcl(), zzprVar, zzqwVar);
        this.zzh = com.google.android.gms.internal.ads.zzfxn.zzo(new com.google.android.gms.internal.ads.zzqv());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new com.google.android.gms.internal.ads.zzf(0, 0.0f);
        this.zzz = new com.google.android.gms.internal.ads.zzqd(com.google.android.gms.internal.ads.zzbe.zza, 0L, 0L, null);
        this.zzA = com.google.android.gms.internal.ads.zzbe.zza;
        this.zzB = false;
        this.zzj = new java.util.ArrayDeque();
        this.zzl = new com.google.android.gms.internal.ads.zzqg();
        this.zzm = new com.google.android.gms.internal.ads.zzqg();
        this.zzn = zzqaVar.zze;
    }

    public static /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzqm zzqmVar) {
        if (zzqmVar.zzaa >= 300000) {
            ((com.google.android.gms.internal.ads.zzqq) zzqmVar.zzp).zza.zzn = true;
            zzqmVar.zzaa = 0L;
        }
    }

    static /* synthetic */ void zzI(android.media.AudioTrack audioTrack, final com.google.android.gms.internal.ads.zzpj zzpjVar, android.os.Handler handler, final com.google.android.gms.internal.ads.zzpg zzpgVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpjVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.gms.internal.ads.zzqq) zzpjVar).zza.zzc.zzd(zzpgVar);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (java.lang.Throwable th) {
            if (zzpjVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.gms.internal.ads.zzqq) zzpjVar).zza.zzc.zzd(zzpgVar);
                    }
                });
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzr;
        return zzqbVar.zzc == 0 ? this.zzC / ((long) zzqbVar.zzb) : this.zzD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzr;
        if (zzqbVar.zzc != 0) {
            return this.zzF;
        }
        long j = this.zzE;
        long j2 = zzqbVar.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return ((j + j2) - 1) / j2;
    }

    private final android.media.AudioTrack zzN(com.google.android.gms.internal.ads.zzqb zzqbVar) throws com.google.android.gms.internal.ads.zzpi {
        try {
            return zzac(zzqbVar.zza(), this.zzx, this.zzS, zzqbVar.zza);
        } catch (com.google.android.gms.internal.ads.zzpi e) {
            com.google.android.gms.internal.ads.zzpj zzpjVar = this.zzp;
            if (zzpjVar != null) {
                zzpjVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j) {
        com.google.android.gms.internal.ads.zzbe zzbeVar;
        boolean z;
        if (zzab()) {
            com.google.android.gms.internal.ads.zzqc zzqcVar = this.zzac;
            zzbeVar = this.zzA;
            zzqcVar.zzc(zzbeVar);
        } else {
            zzbeVar = com.google.android.gms.internal.ads.zzbe.zza;
        }
        com.google.android.gms.internal.ads.zzbe zzbeVar2 = zzbeVar;
        this.zzA = zzbeVar2;
        if (zzab()) {
            com.google.android.gms.internal.ads.zzqc zzqcVar2 = this.zzac;
            z = this.zzB;
            zzqcVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzB = z;
        this.zzj.add(new com.google.android.gms.internal.ads.zzqd(zzbeVar2, java.lang.Math.max(0L, j), com.google.android.gms.internal.ads.zzei.zzt(zzM(), this.zzr.zze), null));
        zzX();
        com.google.android.gms.internal.ads.zzpj zzpjVar = this.zzp;
        if (zzpjVar != null) {
            ((com.google.android.gms.internal.ads.zzqq) zzpjVar).zza.zzc.zzw(this.zzB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private final void zzP(long j) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzpj zzpjVar;
        if (this.zzN == null || this.zzm.zzc()) {
            return;
        }
        int iRemaining = this.zzN.remaining();
        boolean z = true;
        int iWrite = this.zzt.write(this.zzN, iRemaining, 1);
        this.zzV = android.os.SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((com.google.android.gms.internal.ads.zzei.zza < 24 || iWrite != -6) && iWrite != -32) {
                z = false;
            } else if (zzM() <= 0) {
                if (zzaa(this.zzt)) {
                    zzQ();
                } else {
                    z = false;
                }
            }
            com.google.android.gms.internal.ads.zzpl zzplVar = new com.google.android.gms.internal.ads.zzpl(iWrite, this.zzr.zza, z);
            com.google.android.gms.internal.ads.zzpj zzpjVar2 = this.zzp;
            if (zzpjVar2 != null) {
                zzpjVar2.zza(zzplVar);
            }
            if (zzplVar.zzb) {
                this.zzu = com.google.android.gms.internal.ads.zzoi.zza;
                throw zzplVar;
            }
            this.zzm.zzb(zzplVar);
            return;
        }
        this.zzm.zza();
        if (zzaa(this.zzt)) {
            if (this.zzF > 0) {
                this.zzX = false;
            }
            if (this.zzR && (zzpjVar = this.zzp) != null && iWrite < iRemaining) {
            }
        }
        int i = this.zzr.zzc;
        if (i == 0) {
            this.zzE += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i != 0) {
                com.google.android.gms.internal.ads.zzcw.zzf(this.zzN == this.zzL);
                this.zzF += ((long) this.zzG) * ((long) this.zzM);
            }
            this.zzN = null;
        }
    }

    private final void zzQ() {
        if (this.zzr.zzc == 1) {
            this.zzW = true;
        }
    }

    private final void zzR() {
        if (this.zzv != null || this.zzd == null) {
            return;
        }
        this.zzY = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.zzon zzonVar = new com.google.android.gms.internal.ads.zzon(this.zzd, new com.google.android.gms.internal.ads.zzpw(this), this.zzx, this.zzU);
        this.zzv = zzonVar;
        this.zzu = zzonVar.zzc();
    }

    private final void zzS() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzb(zzM());
        if (zzaa(this.zzt)) {
            this.zzQ = false;
        }
        this.zzt.stop();
    }

    private final void zzT(long j) throws java.lang.Exception {
        zzP(j);
        if (this.zzN != null) {
            return;
        }
        if (!this.zzs.zzh()) {
            java.nio.ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzP(j);
                return;
            }
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                java.nio.ByteBuffer byteBufferZzb = this.zzs.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb);
                    zzP(j);
                } else {
                    java.nio.ByteBuffer byteBuffer2 = this.zzL;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzL);
                    }
                }
            } while (this.zzN == null);
            return;
        }
    }

    private final void zzU(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        com.google.android.gms.internal.ads.zzqd zzqdVar = new com.google.android.gms.internal.ads.zzqd(zzbeVar, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null);
        if (zzZ()) {
            this.zzy = zzqdVar;
        } else {
            this.zzz = zzqdVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:62:0x0192  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01be  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x004b A[SYNTHETIC] */
    private final void zzV(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzN == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzr.zzc == 0) {
                int iZzp = (int) com.google.android.gms.internal.ads.zzei.zzp(com.google.android.gms.internal.ads.zzei.zzs(20L), this.zzr.zze);
                long jZzM = zzM();
                long j = iZzp;
                if (jZzM < j) {
                    com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzr;
                    int i12 = zzqbVar.zzg;
                    int i13 = zzqbVar.zzd;
                    java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining()).order(java.nio.ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) jZzM;
                    while (byteBuffer.hasRemaining() && i14 < iZzp) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i12 != 1610612736) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                float fMax = java.lang.Math.max(-1.0f, java.lang.Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    fMax = -fMax;
                                    f = -2.1474836E9f;
                                } else {
                                    f = 2.1474836E9f;
                                }
                                i3 = (int) (fMax * f);
                            }
                            i4 = (int) ((((long) i3) * ((long) i14)) / j);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i12 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else {
                                    if (i12 == 1610612736) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i13) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i14)) / j);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 4) {
                            if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else {
                                if (i12 == 1610612736) {
                                    throw new java.lang.IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i13) {
                            i14++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzN = byteBuffer2;
        }
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzt.setVolume(this.zzK);
        }
    }

    private final void zzX() {
        com.google.android.gms.internal.ads.zzce zzceVar = this.zzr.zzi;
        this.zzs = zzceVar;
        zzceVar.zzc();
    }

    private final boolean zzY() throws java.lang.Exception {
        java.nio.ByteBuffer byteBuffer;
        if (!this.zzs.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzN == null;
        }
        this.zzs.zzd();
        zzT(Long.MIN_VALUE);
        return this.zzs.zzg() && ((byteBuffer = this.zzN) == null || !byteBuffer.hasRemaining());
    }

    private final boolean zzZ() {
        return this.zzt != null;
    }

    private static boolean zzaa(android.media.AudioTrack audioTrack) {
        return com.google.android.gms.internal.ads.zzei.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzr;
        if (zzqbVar.zzc != 0) {
            return false;
        }
        int i = zzqbVar.zza.zzF;
        return true;
    }

    private static final android.media.AudioTrack zzac(com.google.android.gms.internal.ads.zzpg zzpgVar, com.google.android.gms.internal.ads.zze zzeVar, int i, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzpi {
        android.media.AudioTrack audioTrack;
        try {
            if (com.google.android.gms.internal.ads.zzei.zza >= 23) {
                android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(com.google.android.gms.internal.ads.zzei.zzx(zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzpgVar.zze).setSessionId(i);
                if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                    sessionId.setOffloadedPlayback(zzpgVar.zzd);
                }
                audioTrack = sessionId.build();
            } else {
                android.media.AudioAttributes audioAttributes = zzeVar.zza().zza;
                int i2 = zzpgVar.zzb;
                int i3 = zzpgVar.zzc;
                int i4 = zzpgVar.zza;
                audioTrack = new android.media.AudioTrack(audioAttributes, com.google.android.gms.internal.ads.zzei.zzx(i2, i3, i4), zzpgVar.zze, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (java.lang.Exception unused) {
            }
            throw new com.google.android.gms.internal.ads.zzpi(state, zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza, zzabVar, zzpgVar.zzd, null);
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
            throw new com.google.android.gms.internal.ads.zzpi(0, zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza, zzabVar, zzpgVar.zzd, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzA(com.google.android.gms.internal.ads.zzab zzabVar) {
        return zza(zzabVar) != 0;
    }

    public final void zzJ(com.google.android.gms.internal.ads.zzoi zzoiVar) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.zzY;
        if (looper != looperMyLooper) {
            java.lang.String name = looper == null ? "null" : looper.getThread().getName();
            throw new java.lang.IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        if (zzoiVar.equals(this.zzu)) {
            return;
        }
        this.zzu = zzoiVar;
        com.google.android.gms.internal.ads.zzpj zzpjVar = this.zzp;
        if (zzpjVar != null) {
            ((com.google.android.gms.internal.ads.zzqq) zzpjVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final int zza(com.google.android.gms.internal.ads.zzab zzabVar) {
        zzR();
        if (!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            return this.zzu.zzb(zzabVar, this.zzx) != null ? 2 : 0;
        }
        if (com.google.android.gms.internal.ads.zzei.zzJ(zzabVar.zzF)) {
            return zzabVar.zzF != 2 ? 1 : 2;
        }
        com.google.android.gms.internal.ads.zzdo.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzabVar.zzF);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final long zzb(boolean z) {
        long jZzq;
        if (!zzZ() || this.zzI) {
            return Long.MIN_VALUE;
        }
        long jMin = java.lang.Math.min(this.zzi.zza(z), com.google.android.gms.internal.ads.zzei.zzt(zzM(), this.zzr.zze));
        while (!this.zzj.isEmpty() && jMin >= ((com.google.android.gms.internal.ads.zzqd) this.zzj.getFirst()).zzc) {
            this.zzz = (com.google.android.gms.internal.ads.zzqd) this.zzj.remove();
        }
        long j = jMin - this.zzz.zzc;
        if (this.zzj.isEmpty()) {
            jZzq = this.zzz.zzb + this.zzac.zza(j);
        } else {
            com.google.android.gms.internal.ads.zzqd zzqdVar = (com.google.android.gms.internal.ads.zzqd) this.zzj.getFirst();
            jZzq = zzqdVar.zzb - com.google.android.gms.internal.ads.zzei.zzq(zzqdVar.zzc - jMin, this.zzz.zza.zzb);
        }
        long jZzb = this.zzac.zzb();
        long jZzt = jZzq + com.google.android.gms.internal.ads.zzei.zzt(jZzb, this.zzr.zze);
        long j2 = this.zzZ;
        if (jZzb > j2) {
            long jZzt2 = com.google.android.gms.internal.ads.zzei.zzt(jZzb - j2, this.zzr.zze);
            this.zzZ = jZzb;
            this.zzaa += jZzt2;
            if (this.zzab == null) {
                this.zzab = new android.os.Handler(android.os.Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages(null);
            this.zzab.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzqm.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final com.google.android.gms.internal.ads.zzbe zzc() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final com.google.android.gms.internal.ads.zzor zzd(com.google.android.gms.internal.ads.zzab zzabVar) {
        return this.zzW ? com.google.android.gms.internal.ads.zzor.zza : this.zzad.zza(zzabVar, this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zze(com.google.android.gms.internal.ads.zzab zzabVar, int i, int[] iArr) throws com.google.android.gms.internal.ads.zzph {
        int iIntValue;
        com.google.android.gms.internal.ads.zzce zzceVar;
        int iZzk;
        int iIntValue2;
        int iZzk2;
        int i2;
        int i3;
        int iMax;
        zzR();
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            com.google.android.gms.internal.ads.zzcw.zzd(com.google.android.gms.internal.ads.zzei.zzJ(zzabVar.zzF));
            iZzk = com.google.android.gms.internal.ads.zzei.zzk(zzabVar.zzF) * zzabVar.zzD;
            com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
            int i4 = zzabVar.zzF;
            zzfxkVar.zzh(this.zzg);
            zzfxkVar.zzg(this.zzac.zze());
            com.google.android.gms.internal.ads.zzce zzceVar2 = new com.google.android.gms.internal.ads.zzce(zzfxkVar.zzi());
            if (zzceVar2.equals(this.zzs)) {
                zzceVar2 = this.zzs;
            }
            this.zzf.zzq(zzabVar.zzG, zzabVar.zzH);
            this.zze.zzo(iArr);
            try {
                com.google.android.gms.internal.ads.zzcf zzcfVarZza = zzceVar2.zza(new com.google.android.gms.internal.ads.zzcf(zzabVar.zzE, zzabVar.zzD, zzabVar.zzF));
                iIntValue = zzcfVarZza.zzd;
                i2 = zzcfVarZza.zzb;
                int i5 = zzcfVarZza.zzc;
                iIntValue2 = com.google.android.gms.internal.ads.zzei.zzi(i5);
                zzceVar = zzceVar2;
                iZzk2 = com.google.android.gms.internal.ads.zzei.zzk(iIntValue) * i5;
                i3 = 0;
            } catch (com.google.android.gms.internal.ads.zzcg e) {
                throw new com.google.android.gms.internal.ads.zzph(e, zzabVar);
            }
        } else {
            com.google.android.gms.internal.ads.zzce zzceVar3 = new com.google.android.gms.internal.ads.zzce(com.google.android.gms.internal.ads.zzfxn.zzn());
            int i6 = zzabVar.zzE;
            com.google.android.gms.internal.ads.zzor zzorVar = com.google.android.gms.internal.ads.zzor.zza;
            android.util.Pair pairZzb = this.zzu.zzb(zzabVar, this.zzx);
            if (pairZzb == null) {
                throw new com.google.android.gms.internal.ads.zzph("Unable to configure passthrough for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzabVar))), zzabVar);
            }
            iIntValue = ((java.lang.Integer) pairZzb.first).intValue();
            zzceVar = zzceVar3;
            iZzk = -1;
            iIntValue2 = ((java.lang.Integer) pairZzb.second).intValue();
            iZzk2 = -1;
            i2 = i6;
            i3 = 2;
        }
        if (iIntValue == 0) {
            throw new com.google.android.gms.internal.ads.zzph("Invalid output encoding (mode=" + i3 + ") for: " + java.lang.String.valueOf(zzabVar), zzabVar);
        }
        if (iIntValue2 == 0) {
            throw new com.google.android.gms.internal.ads.zzph("Invalid output channel config (mode=" + i3 + ") for: " + java.lang.String.valueOf(zzabVar), zzabVar);
        }
        int i7 = zzabVar.zzj;
        if (androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS.equals(zzabVar.zzo) && i7 == -1) {
            i7 = 768000;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        com.google.android.gms.internal.ads.zzcw.zzf(minBufferSize != -2);
        int i8 = iZzk2 != -1 ? iZzk2 : 1;
        int i9 = 250000;
        if (i3 == 0) {
            iMax = java.lang.Math.max(com.google.android.gms.internal.ads.zzqo.zza(250000, i2, i8), java.lang.Math.min(minBufferSize * 4, com.google.android.gms.internal.ads.zzqo.zza(750000, i2, i8)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i9 = 500000;
            } else if (iIntValue == 8) {
                i9 = 1000000;
                iIntValue = 8;
            }
            iMax = com.google.android.gms.internal.ads.zzgaq.zzb((((long) i9) * ((long) (i7 != -1 ? com.google.android.gms.internal.ads.zzgaj.zzb(i7, 8, java.math.RoundingMode.CEILING) : com.google.android.gms.internal.ads.zzqo.zzb(iIntValue)))) / 1000000);
        } else {
            iMax = com.google.android.gms.internal.ads.zzgaq.zzb((((long) com.google.android.gms.internal.ads.zzqo.zzb(iIntValue)) * 50000000) / 1000000);
        }
        int iMax2 = (((java.lang.Math.max(minBufferSize, iMax) + i8) - 1) / i8) * i8;
        this.zzW = false;
        com.google.android.gms.internal.ads.zzqb zzqbVar = new com.google.android.gms.internal.ads.zzqb(zzabVar, iZzk, i3, iZzk2, i2, iIntValue2, iIntValue, iMax2, zzceVar, false, false, false);
        if (zzZ()) {
            this.zzq = zzqbVar;
        } else {
            this.zzr = zzqbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzf() {
        com.google.android.gms.internal.ads.zzqf zzqfVar;
        if (zzZ()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new com.google.android.gms.internal.ads.zzqd(this.zzA, 0L, 0L, null);
            this.zzJ = 0L;
            this.zzy = null;
            this.zzj.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzt.pause();
            }
            if (zzaa(this.zzt)) {
                com.google.android.gms.internal.ads.zzqk zzqkVar = this.zzk;
                zzqkVar.getClass();
                zzqkVar.zzb(this.zzt);
            }
            final com.google.android.gms.internal.ads.zzpg zzpgVarZza = this.zzr.zza();
            com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzq;
            if (zzqbVar != null) {
                this.zzr = zzqbVar;
                this.zzq = null;
            }
            this.zzi.zzc();
            if (com.google.android.gms.internal.ads.zzei.zza >= 24 && (zzqfVar = this.zzw) != null) {
                zzqfVar.zzb();
                this.zzw = null;
            }
            final android.media.AudioTrack audioTrack = this.zzt;
            final com.google.android.gms.internal.ads.zzpj zzpjVar = this.zzp;
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    final java.lang.String str = "ExoPlayer:AudioTrackReleaseThread";
                    zzb = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzeh
                        public final /* synthetic */ java.lang.String zza = "ExoPlayer:AudioTrackReleaseThread";

                        @Override // java.util.concurrent.ThreadFactory
                        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                            return new java.lang.Thread(runnable, this.zza);
                        }
                    });
                }
                zzc++;
                zzb.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.ads.zzqm.zzI(audioTrack, zzpjVar, handler, zzpgVarZza);
                    }
                }, 20L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        android.os.Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzg() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzh() {
        this.zzR = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzi() {
        this.zzR = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzj() throws com.google.android.gms.internal.ads.zzpl {
        if (!this.zzO && zzZ() && zzY()) {
            zzS();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzk() {
        com.google.android.gms.internal.ads.zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzl() {
        zzf();
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = this.zzg;
        int size = zzfxnVar.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzch) zzfxnVar.get(i)).zzf();
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVar2 = this.zzh;
        int size2 = zzfxnVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((com.google.android.gms.internal.ads.zzch) zzfxnVar2.get(i2)).zzf();
        }
        com.google.android.gms.internal.ads.zzce zzceVar = this.zzs;
        if (zzceVar != null) {
            zzceVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzm(com.google.android.gms.internal.ads.zze zzeVar) {
        if (this.zzx.equals(zzeVar)) {
            return;
        }
        this.zzx = zzeVar;
        com.google.android.gms.internal.ads.zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzg(zzeVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzn(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzo(com.google.android.gms.internal.ads.zzf zzfVar) {
        if (this.zzT.equals(zzfVar)) {
            return;
        }
        if (this.zzt != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzp(com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zzi.zze(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzq(com.google.android.gms.internal.ads.zzpj zzpjVar) {
        this.zzp = zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzr(int i, int i2) {
        android.media.AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzs(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        this.zzA = new com.google.android.gms.internal.ads.zzbe(java.lang.Math.max(0.1f, java.lang.Math.min(zzbeVar.zzb, 8.0f)), java.lang.Math.max(0.1f, java.lang.Math.min(zzbeVar.zzc, 8.0f)));
        zzU(zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzt(com.google.android.gms.internal.ads.zzog zzogVar) {
        this.zzo = zzogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzv(boolean z) {
        this.zzB = z;
        zzU(this.zzA);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzw(float f) {
        if (this.zzK != f) {
            this.zzK = f;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0284  */
    /* JADX WARN: Code duplicated, block: B:140:0x0290  */
    /* JADX WARN: Code duplicated, block: B:143:0x029a  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:158:0x030c  */
    /* JADX WARN: Code duplicated, block: B:221:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzx(java.nio.ByteBuffer byteBuffer, long j, int i) throws java.lang.Exception {
        android.media.AudioTrack audioTrackZzN;
        com.google.android.gms.internal.ads.zzon zzonVar;
        com.google.android.gms.internal.ads.zzog zzogVar;
        boolean z;
        int iZzb;
        int iPosition;
        byte b;
        int i2;
        int i3;
        int i4;
        byte b2;
        int i5;
        int i6;
        java.nio.ByteBuffer byteBuffer2 = this.zzL;
        com.google.android.gms.internal.ads.zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzY()) {
                return false;
            }
            com.google.android.gms.internal.ads.zzqb zzqbVar = this.zzq;
            com.google.android.gms.internal.ads.zzqb zzqbVar2 = this.zzr;
            if (zzqbVar2.zzc == zzqbVar.zzc && zzqbVar2.zzg == zzqbVar.zzg && zzqbVar2.zze == zzqbVar.zze && zzqbVar2.zzf == zzqbVar.zzf && zzqbVar2.zzd == zzqbVar.zzd) {
                boolean z2 = zzqbVar2.zzj;
                boolean z3 = zzqbVar.zzj;
                boolean z4 = zzqbVar2.zzk;
                boolean z5 = zzqbVar.zzk;
                this.zzr = zzqbVar;
                this.zzq = null;
                android.media.AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzaa(audioTrack)) {
                    boolean z6 = this.zzr.zzk;
                }
            } else {
                zzS();
                if (zzy()) {
                    return false;
                }
                zzf();
            }
            zzO(j);
        }
        if (!zzZ()) {
            try {
                if (this.zzl.zzc()) {
                    return false;
                }
                try {
                    com.google.android.gms.internal.ads.zzqb zzqbVar3 = this.zzr;
                    zzqbVar3.getClass();
                    audioTrackZzN = zzN(zzqbVar3);
                } catch (com.google.android.gms.internal.ads.zzpi e) {
                    com.google.android.gms.internal.ads.zzqb zzqbVar4 = this.zzr;
                    if (zzqbVar4.zzh > 1000000) {
                        com.google.android.gms.internal.ads.zzab zzabVar = zzqbVar4.zza;
                        int i7 = zzqbVar4.zzb;
                        int i8 = zzqbVar4.zzc;
                        int i9 = zzqbVar4.zzd;
                        int i10 = zzqbVar4.zze;
                        int i11 = zzqbVar4.zzf;
                        int i12 = zzqbVar4.zzg;
                        com.google.android.gms.internal.ads.zzce zzceVar = zzqbVar4.zzi;
                        boolean z7 = zzqbVar4.zzj;
                        boolean z8 = zzqbVar4.zzk;
                        boolean z9 = zzqbVar4.zzl;
                        com.google.android.gms.internal.ads.zzqb zzqbVar5 = new com.google.android.gms.internal.ads.zzqb(zzabVar, i7, i8, i9, i10, i11, i12, 1000000, zzceVar, false, false, false);
                        try {
                            audioTrackZzN = zzN(zzqbVar5);
                            this.zzr = zzqbVar5;
                        } catch (com.google.android.gms.internal.ads.zzpi e2) {
                            e.addSuppressed(e2);
                            zzQ();
                            throw e;
                        }
                    }
                    zzQ();
                    throw e;
                }
                this.zzt = audioTrackZzN;
                if (zzaa(audioTrackZzN)) {
                    android.media.AudioTrack audioTrack2 = this.zzt;
                    if (this.zzk == null) {
                        this.zzk = new com.google.android.gms.internal.ads.zzqk(this);
                    }
                    this.zzk.zza(audioTrack2);
                    boolean z10 = this.zzr.zzk;
                }
                if (com.google.android.gms.internal.ads.zzei.zza >= 31 && (zzogVar = this.zzo) != null) {
                    android.media.AudioTrack audioTrack3 = this.zzt;
                    android.media.metrics.LogSessionId logSessionIdZza = zzogVar.zza();
                    if (!logSessionIdZza.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                        audioTrack3.setLogSessionId(logSessionIdZza);
                    }
                }
                this.zzS = this.zzt.getAudioSessionId();
                com.google.android.gms.internal.ads.zzpq zzpqVar = this.zzi;
                android.media.AudioTrack audioTrack4 = this.zzt;
                com.google.android.gms.internal.ads.zzqb zzqbVar6 = this.zzr;
                zzpqVar.zzd(audioTrack4, zzqbVar6.zzc == 2, zzqbVar6.zzg, zzqbVar6.zzd, zzqbVar6.zzh);
                zzW();
                int i13 = this.zzT.zza;
                com.google.android.gms.internal.ads.zzoo zzooVar = this.zzU;
                if (zzooVar != null && com.google.android.gms.internal.ads.zzei.zza >= 23) {
                    com.google.android.gms.internal.ads.zzpx.zza(this.zzt, zzooVar);
                    com.google.android.gms.internal.ads.zzon zzonVar2 = this.zzv;
                    if (zzonVar2 != null) {
                        zzonVar2.zzh(this.zzU.zza);
                    }
                }
                if (com.google.android.gms.internal.ads.zzei.zza >= 24 && (zzonVar = this.zzv) != null) {
                    this.zzw = new com.google.android.gms.internal.ads.zzqf(this.zzt, zzonVar);
                }
                this.zzI = true;
                com.google.android.gms.internal.ads.zzpj zzpjVar = this.zzp;
                if (zzpjVar != null) {
                    ((com.google.android.gms.internal.ads.zzqq) zzpjVar).zza.zzc.zzc(this.zzr.zza());
                }
            } catch (com.google.android.gms.internal.ads.zzpi e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzl.zzb(e3);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzI) {
            this.zzJ = java.lang.Math.max(0L, j);
            this.zzH = false;
            this.zzI = false;
            zzO(j);
            if (this.zzR) {
                zzi();
            }
        }
        if (!this.zzi.zzj(zzM())) {
            return false;
        }
        if (this.zzL == null) {
            com.google.android.gms.internal.ads.zzcw.zzd(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            com.google.android.gms.internal.ads.zzqb zzqbVar7 = this.zzr;
            if (zzqbVar7.zzc != 0 && this.zzG == 0) {
                int i14 = zzqbVar7.zzg;
                if (i14 == 20) {
                    z = true;
                    iZzb = com.google.android.gms.internal.ads.zzadi.zzb(byteBuffer);
                } else if (i14 != 30) {
                    switch (i14) {
                        case 5:
                        case 6:
                            iZzb = com.google.android.gms.internal.ads.zzabn.zza(byteBuffer);
                            z = true;
                            break;
                        case 7:
                        case 8:
                            int i15 = com.google.android.gms.internal.ads.zzacm.zza;
                            if (byteBuffer.getInt(0) == -233094848) {
                                z = true;
                                iZzb = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iZzb = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b = byteBuffer.get(iPosition);
                                    if (b != -2) {
                                        if (b != -1) {
                                            if (b != 31) {
                                                i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i5 = byteBuffer.get(iPosition + 5) & 252;
                                                i3 = 2;
                                            } else {
                                                i3 = 2;
                                                i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b2 = byteBuffer.get(iPosition + 6);
                                            }
                                            i2 = (i5 >> i3) | i4;
                                            z = true;
                                        } else {
                                            i3 = 2;
                                            i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b2 = byteBuffer.get(iPosition + 7);
                                        }
                                        i5 = b2 & 60;
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        z = true;
                                        i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iZzb = (i2 + (z ? 1 : 0)) * 32;
                                } else {
                                    iZzb = 4096;
                                }
                                z = true;
                            }
                            break;
                        case 9:
                            iZzb = com.google.android.gms.internal.ads.zzadg.zzc(com.google.android.gms.internal.ads.zzei.zzj(byteBuffer, byteBuffer.position()));
                            if (iZzb == -1) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                            iZzb = 1024;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            iZzb = 2048;
                            z = true;
                            break;
                        default:
                            switch (i14) {
                                case 14:
                                    int i16 = com.google.android.gms.internal.ads.zzabn.zza;
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i17 = iPosition2;
                                    while (true) {
                                        if (i17 > iLimit) {
                                            i6 = -1;
                                        } else if ((com.google.android.gms.internal.ads.zzei.zzj(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                            i6 = i17 - iPosition2;
                                        } else {
                                            i17++;
                                        }
                                    }
                                    if (i6 != -1) {
                                        iZzb = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iZzb = 0;
                                    }
                                    break;
                                case 15:
                                    iZzb = 512;
                                    break;
                                case 16:
                                    iZzb = 1024;
                                    break;
                                case 17:
                                    int i18 = com.google.android.gms.internal.ads.zzabq.zza;
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iZzb = com.google.android.gms.internal.ads.zzabq.zza(new com.google.android.gms.internal.ads.zzdx(bArr, 16)).zzc;
                                    break;
                                case 18:
                                    iZzb = com.google.android.gms.internal.ads.zzabn.zza(byteBuffer);
                                    break;
                                default:
                                    throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i14);
                            }
                            z = true;
                            break;
                    }
                } else {
                    int i19 = com.google.android.gms.internal.ads.zzacm.zza;
                    if (byteBuffer.getInt(0) == -233094848) {
                        if (byteBuffer.getInt(0) == -398277519) {
                            iZzb = 1024;
                        } else if (byteBuffer.getInt(0) != 622876772) {
                            iZzb = 4096;
                        } else {
                            iPosition = byteBuffer.position();
                            b = byteBuffer.get(iPosition);
                            if (b != -2) {
                                if (b != -1) {
                                    if (b != 31) {
                                        i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                        i5 = byteBuffer.get(iPosition + 5) & 252;
                                        i3 = 2;
                                    } else {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                        b2 = byteBuffer.get(iPosition + 6);
                                    }
                                    i2 = (i5 >> i3) | i4;
                                    z = true;
                                } else {
                                    i3 = 2;
                                    i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    b2 = byteBuffer.get(iPosition + 7);
                                }
                                i5 = b2 & 60;
                                i2 = (i5 >> i3) | i4;
                                z = true;
                            } else {
                                z = true;
                                i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                            }
                            iZzb = (i2 + (z ? 1 : 0)) * 32;
                        }
                        z = true;
                    } else {
                        z = true;
                        iZzb = 1024;
                    }
                }
                this.zzG = iZzb;
                if (iZzb == 0) {
                    return z;
                }
            }
            if (this.zzy != null) {
                if (!zzY()) {
                    return false;
                }
                zzO(j);
                this.zzy = null;
            }
            long jZzt = this.zzJ + com.google.android.gms.internal.ads.zzei.zzt(zzL() - this.zzf.zzo(), this.zzr.zza.zzE);
            if (!this.zzH && java.lang.Math.abs(jZzt - j) > 200000) {
                com.google.android.gms.internal.ads.zzpj zzpjVar2 = this.zzp;
                if (zzpjVar2 != null) {
                    zzpjVar2.zza(new com.google.android.gms.internal.ads.zzpk(j, jZzt));
                }
                this.zzH = true;
            }
            if (this.zzH) {
                if (!zzY()) {
                    return false;
                }
                long j2 = j - jZzt;
                this.zzJ += j2;
                this.zzH = false;
                zzO(j);
                com.google.android.gms.internal.ads.zzpj zzpjVar3 = this.zzp;
                if (zzpjVar3 != null && j2 != 0) {
                    ((com.google.android.gms.internal.ads.zzqq) zzpjVar3).zza.zzao();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzC += (long) byteBuffer.remaining();
            } else {
                this.zzD += ((long) this.zzG) * ((long) i);
            }
            this.zzL = byteBuffer;
            this.zzM = i;
        }
        zzT(j);
        if (!this.zzL.hasRemaining()) {
            this.zzL = null;
            this.zzM = 0;
            return true;
        }
        if (!this.zzi.zzi(zzM())) {
            return false;
        }
        com.google.android.gms.internal.ads.zzdo.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzy() {
        if (zzZ()) {
            return !(com.google.android.gms.internal.ads.zzei.zza >= 29 && this.zzt.isOffloadedPlayback() && this.zzQ) && this.zzi.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzO && !zzy();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzu(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.zzU = audioDeviceInfo == null ? null : new com.google.android.gms.internal.ads.zzoo(audioDeviceInfo);
        com.google.android.gms.internal.ads.zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzh(audioDeviceInfo);
        }
        android.media.AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            com.google.android.gms.internal.ads.zzpx.zza(audioTrack, this.zzU);
        }
    }
}
