package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcaw extends com.google.android.gms.internal.ads.zzcay implements android.view.TextureView.SurfaceTextureListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener {
    private static final java.util.Map zzc;
    private final com.google.android.gms.internal.ads.zzcbs zzd;
    private final com.google.android.gms.internal.ads.zzcbt zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private android.media.MediaPlayer zzi;
    private android.net.Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private com.google.android.gms.internal.ads.zzcbq zzn;
    private final boolean zzo;
    private int zzp;
    private com.google.android.gms.internal.ads.zzcax zzq;
    private boolean zzr;
    private java.lang.Integer zzs;

    static {
        java.util.HashMap map = new java.util.HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcaw(android.content.Context context, com.google.android.gms.internal.ads.zzcbs zzcbsVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzcbr zzcbrVar, com.google.android.gms.internal.ads.zzcbt zzcbtVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcbsVar;
        this.zze = zzcbtVar;
        this.zzo = z;
        this.zzf = z2;
        zzcbtVar.zza(this);
    }

    private final void zzD() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        android.graphics.SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzv.zzl();
            android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                com.google.android.gms.internal.ads.zzcbq zzcbqVar = new com.google.android.gms.internal.ads.zzcbq(getContext());
                this.zzn = zzcbqVar;
                zzcbqVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                android.graphics.SurfaceTexture surfaceTextureZzb = this.zzn.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            com.google.android.gms.ads.internal.zzv.zzm();
            this.zzi.setSurface(new android.view.Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzF(1);
        } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize MediaPlayer at ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zzj))), e);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
            this.zzn = null;
        }
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzG(float f) {
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    private final boolean zzH() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzcaw zzcawVar, android.media.MediaPlayer mediaPlayer) {
        android.media.MediaFormat format;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() || zzcawVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            android.media.MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                java.util.HashMap map = new java.util.HashMap();
                for (android.media.MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            android.media.MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", java.lang.String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (java.lang.ClassCastException unused) {
                                        map.put("frameRate", java.lang.String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcawVar.zzs = numValueOf;
                                    map.put("bitRate", java.lang.String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (android.os.Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcawVar.zzd.zzd("onMetadataEvent", map);
            }
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcap(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        java.util.Map map = zzc;
        java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i));
        java.lang.String str2 = (java.lang.String) map.get(java.lang.Integer.valueOf(i2));
        com.google.android.gms.ads.internal.util.client.zzo.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcaq(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        java.util.Map map = zzc;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((java.lang.String) map.get(java.lang.Integer.valueOf(i))) + ":" + ((java.lang.String) map.get(java.lang.Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = getDefaultSize(this.zzk, i);
        int defaultSize2 = getDefaultSize(this.zzl, i2);
        if (this.zzk > 0 && this.zzl > 0 && this.zzn == null) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int size = android.view.View.MeasureSpec.getSize(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int size2 = android.view.View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i3 = this.zzk;
                        i4 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.zzk;
                int i8 = i7 * size2;
                int i9 = this.zzl;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i3 = this.zzk;
                        i4 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = i3;
                            size2 = i4;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcao(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzp;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcar(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcat(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzp;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcas(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcan
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final java.lang.String toString() {
        return getClass().getName() + "@" + java.lang.Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        if (android.os.Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * ((long) this.zzm)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        if (this.zzs != null) {
            return ((long) zzc()) * ((long) this.zzs.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final java.lang.String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    final /* synthetic */ void zzm(int i) {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzq;
        if (zzcaxVar != null) {
            zzcaxVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcav(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcau(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (!zzH()) {
            this.zzp = i;
        } else {
            this.zzi.seekTo(i);
            this.zzp = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(com.google.android.gms.internal.ads.zzcax zzcaxVar) {
        this.zzq = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        com.google.android.gms.internal.ads.zzbav zzbavVarZza = com.google.android.gms.internal.ads.zzbav.zza(uri);
        if (zzbavVarZza == null || zzbavVarZza.zza != null) {
            if (zzbavVarZza != null) {
                uri = android.net.Uri.parse(zzbavVarZza.zza);
            }
            this.zzj = uri;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        android.media.MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
        com.google.android.gms.internal.ads.zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzf(f, f2);
        }
    }
}
