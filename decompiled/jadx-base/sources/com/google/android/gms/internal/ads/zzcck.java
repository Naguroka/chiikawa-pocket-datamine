package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcck extends com.google.android.gms.internal.ads.zzcay implements android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzcbi {
    private final com.google.android.gms.internal.ads.zzcbs zzc;
    private final com.google.android.gms.internal.ads.zzcbt zzd;
    private final com.google.android.gms.internal.ads.zzcbr zze;
    private com.google.android.gms.internal.ads.zzcax zzf;
    private android.view.Surface zzg;
    private com.google.android.gms.internal.ads.zzcbj zzh;
    private java.lang.String zzi;
    private java.lang.String[] zzj;
    private boolean zzk;
    private int zzl;
    private com.google.android.gms.internal.ads.zzcbq zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcck(android.content.Context context, com.google.android.gms.internal.ads.zzcbt zzcbtVar, com.google.android.gms.internal.ads.zzcbs zzcbsVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzcbr zzcbrVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcbsVar;
        this.zzd = zzcbtVar;
        this.zzn = z;
        this.zze = zzcbrVar;
        setSurfaceTextureListener(this);
        zzcbtVar.zza(this);
    }

    private static java.lang.String zzT(java.lang.String str, java.lang.Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null && !z) {
            zzcbjVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z) {
            if (!zzad()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcbjVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            com.google.android.gms.internal.ads.zzcde zzcdeVarZzp = this.zzc.zzp(this.zzi);
            if (zzcdeVarZzp instanceof com.google.android.gms.internal.ads.zzcdn) {
                com.google.android.gms.internal.ads.zzcbj zzcbjVarZza = ((com.google.android.gms.internal.ads.zzcdn) zzcdeVarZzp).zza();
                this.zzh = zzcbjVarZza;
                zzcbjVarZza.zzP(num);
                if (!this.zzh.zzV()) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcdeVarZzp instanceof com.google.android.gms.internal.ads.zzcdk)) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache miss: ".concat(java.lang.String.valueOf(this.zzi)));
                    return;
                }
                com.google.android.gms.internal.ads.zzcdk zzcdkVar = (com.google.android.gms.internal.ads.zzcdk) zzcdeVarZzp;
                java.lang.String strZzF = zzF();
                java.nio.ByteBuffer byteBufferZzl = zzcdkVar.zzl();
                boolean zZzm = zzcdkVar.zzm();
                java.lang.String strZzk = zzcdkVar.zzk();
                if (strZzk == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache URL is null.");
                    return;
                } else {
                    com.google.android.gms.internal.ads.zzcbj zzcbjVarZzE = zzE(num);
                    this.zzh = zzcbjVarZzE;
                    zzcbjVarZzE.zzG(new android.net.Uri[]{android.net.Uri.parse(strZzk)}, strZzF, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.zzh = zzE(num);
            java.lang.String strZzF2 = zzF();
            android.net.Uri[] uriArr = new android.net.Uri[this.zzj.length];
            int i = 0;
            while (true) {
                java.lang.String[] strArr = this.zzj;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = android.net.Uri.parse(strArr[i]);
                i++;
            }
            this.zzh.zzF(uriArr, strZzF2);
        }
        this.zzh.zzL(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzV()) {
            int iZzt = this.zzh.zzt();
            this.zzl = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
            if (zzcbjVar != null) {
                zzcbjVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(android.view.Surface surface, boolean z) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbjVar.zzS(surface, z);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        return (zzcbjVar == null || !zzcbjVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            com.google.android.gms.internal.ads.zzcbq zzcbqVar = new com.google.android.gms.internal.ads.zzcbq(getContext());
            this.zzm = zzcbqVar;
            zzcbqVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            android.graphics.SurfaceTexture surfaceTextureZzb = this.zzm.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        zzo();
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            android.view.Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, final int i, final int i2) {
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcca
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzA(int i) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzB(int i) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    final com.google.android.gms.internal.ads.zzcbj zzE(java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzcbr zzcbrVar = this.zze;
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = this.zzc;
        com.google.android.gms.internal.ads.zzcef zzcefVar = new com.google.android.gms.internal.ads.zzcef(zzcbsVar.getContext(), zzcbrVar, zzcbsVar, num);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        return zzcefVar;
    }

    final java.lang.String zzF() {
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = this.zzc;
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcbsVar.getContext(), zzcbsVar.zzn().afmaVersion);
    }

    final /* synthetic */ void zzG(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzH() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zza();
        }
    }

    final /* synthetic */ void zzI() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzf();
        }
    }

    final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzK(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzg();
        }
    }

    final /* synthetic */ void zzM() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzh();
        }
    }

    final /* synthetic */ void zzN() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzi();
        }
    }

    final /* synthetic */ void zzO(int i, int i2) {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzP() {
        float fZza = this.zzb.zza();
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbjVar.zzT(fZza, false);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
    }

    final /* synthetic */ void zzQ(int i) {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzR() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzd();
        }
    }

    final /* synthetic */ void zzS() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final java.lang.String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String strZzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("ExoPlayerAdapter error: ".concat(strZzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(strZzT);
            }
        });
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String strZzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("ExoPlayerAdapter exception: ".concat(strZzT));
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcce
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcbz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(com.google.android.gms.internal.ads.zzcax zzcaxVar) {
        this.zzf = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(java.lang.String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcbx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final java.lang.Integer zzw() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzx(int i) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzy(int i) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzz(int i) {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzM(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzC(java.lang.String str, java.lang.String[] strArr, java.lang.Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new java.lang.String[]{str};
        } else {
            this.zzj = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        }
        java.lang.String str2 = this.zzi;
        boolean z = this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4;
        this.zzi = str;
        zzW(z, num);
    }
}
