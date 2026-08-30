package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcfz extends com.google.android.gms.ads.internal.client.zzea {
    private final com.google.android.gms.internal.ads.zzcbs zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzee zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private com.google.android.gms.internal.ads.zzbhe zzn;
    private final java.lang.Object zzb = new java.lang.Object();
    private boolean zzh = true;

    public zzcfz(com.google.android.gms.internal.ads.zzcbs zzcbsVar, float f, boolean z, boolean z2) {
        this.zza = zzcbsVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(final int i, final int i2, final boolean z, final boolean z2) {
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i, i2, z, z2);
            }
        });
    }

    private final void zzx(java.lang.String str, java.util.Map map) {
        final java.util.HashMap map2 = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        map2.put("action", str);
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr(map2);
            }
        });
    }

    public final void zzc(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmF)).booleanValue()) {
                this.zzj = f;
            }
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (java.lang.Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z2) {
            try {
                com.google.android.gms.internal.ads.zzbhe zzbheVar = this.zzn;
                if (zzbheVar != null) {
                    zzbheVar.zze();
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i2, i, z3, z);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0055 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0059 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    final /* synthetic */ void zzd(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        com.google.android.gms.ads.internal.client.zzee zzeeVar2;
        com.google.android.gms.ads.internal.client.zzee zzeeVar3;
        com.google.android.gms.ads.internal.client.zzee zzeeVar4;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i2 = 1;
                i3 = 1;
                z3 = true;
            }
            boolean z6 = i != i2;
            if (z6 && i3 == 1) {
                z4 = true;
                i3 = 1;
            } else {
                z4 = false;
            }
            boolean z7 = z6 && i3 == 2;
            boolean z8 = z6 && i3 == 3;
            this.zzg = z5 || z3;
            if (z3) {
                try {
                    com.google.android.gms.ads.internal.client.zzee zzeeVar5 = this.zzf;
                    if (zzeeVar5 != null) {
                        zzeeVar5.zzi();
                    }
                    if (z4 && (zzeeVar4 = this.zzf) != null) {
                        zzeeVar4.zzh();
                    }
                    if (z7 && (zzeeVar3 = this.zzf) != null) {
                        zzeeVar3.zzg();
                    }
                    if (z8) {
                        zzeeVar2 = this.zzf;
                        if (zzeeVar2 != null) {
                            zzeeVar2.zze();
                        }
                        this.zza.zzw();
                    }
                    if (z != z2 && (zzeeVar = this.zzf) != null) {
                        zzeeVar.zzf(z2);
                    }
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            } else {
                if (z4) {
                    zzeeVar4.zzh();
                }
                if (z7) {
                    zzeeVar3.zzg();
                }
                if (z8) {
                    zzeeVar2 = this.zzf;
                    if (zzeeVar2 != null) {
                        zzeeVar2.zze();
                    }
                    this.zza.zzw();
                }
                if (z != z2) {
                    zzeeVar.zzf(z2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        synchronized (this.zzb) {
            zzeeVar = this.zzf;
        }
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) {
        zzx(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
        synchronized (this.zzb) {
            this.zzf = zzeeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        boolean z;
        java.lang.Object obj = this.zzb;
        boolean zZzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    final /* synthetic */ void zzr(java.util.Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        java.lang.Object obj = this.zzb;
        boolean z = zzgaVar.zza;
        boolean z2 = zzgaVar.zzb;
        boolean z3 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzx("initialState", com.google.android.gms.common.util.CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void zzt(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(com.google.android.gms.internal.ads.zzbhe zzbheVar) {
        synchronized (this.zzb) {
            this.zzn = zzbheVar;
        }
    }
}
