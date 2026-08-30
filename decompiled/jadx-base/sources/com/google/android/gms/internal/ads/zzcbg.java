package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzcbg extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcax {
    final com.google.android.gms.internal.ads.zzcbu zza;
    private final com.google.android.gms.internal.ads.zzcbs zzb;
    private final android.widget.FrameLayout zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzbda zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzcay zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private java.lang.String zzn;
    private java.lang.String[] zzo;
    private android.graphics.Bitmap zzp;
    private final android.widget.ImageView zzq;
    private boolean zzr;

    public zzcbg(android.content.Context context, com.google.android.gms.internal.ads.zzcbs zzcbsVar, int i, boolean z, com.google.android.gms.internal.ads.zzbda zzbdaVar, com.google.android.gms.internal.ads.zzcbr zzcbrVar) {
        super(context);
        this.zzb = zzcbsVar;
        this.zze = zzbdaVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcbsVar.zzj());
        com.google.android.gms.internal.ads.zzcaz zzcazVar = zzcbsVar.zzj().zza;
        com.google.android.gms.internal.ads.zzcbt zzcbtVar = new com.google.android.gms.internal.ads.zzcbt(context, zzcbsVar.zzn(), zzcbsVar.zzs(), zzbdaVar, zzcbsVar.zzk());
        com.google.android.gms.internal.ads.zzcay zzcemVar = i == 3 ? new com.google.android.gms.internal.ads.zzcem(context, zzcbtVar) : i == 2 ? new com.google.android.gms.internal.ads.zzcck(context, zzcbtVar, zzcbsVar, z, com.google.android.gms.internal.ads.zzcbk.zza(zzcbsVar), zzcbrVar) : new com.google.android.gms.internal.ads.zzcaw(context, zzcbsVar, z, com.google.android.gms.internal.ads.zzcbk.zza(zzcbsVar), zzcbrVar, new com.google.android.gms.internal.ads.zzcbt(context, zzcbsVar.zzn(), zzcbsVar.zzs(), zzbdaVar, zzcbsVar.zzk()));
        this.zzg = zzcemVar;
        android.view.View view = new android.view.View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcemVar, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzS)).booleanValue()) {
            frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzP)).booleanValue()) {
            zzn();
        }
        this.zzq = new android.widget.ImageView(context);
        this.zzf = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzU)).longValue();
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzR)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbdaVar != null) {
            zzbdaVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new com.google.android.gms.internal.ads.zzcbu(this);
        zzcemVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(java.lang.String str, java.lang.String... strArr) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str);
        java.lang.String str2 = null;
        for (java.lang.String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            this.zza.zza();
            final com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
            if (zzcayVar != null) {
                com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                java.util.Objects.requireNonNull(zzcayVar);
                zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcba
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcayVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcbc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcax
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcbf(this, z));
    }

    public final void zzA(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzz(i);
    }

    public final void zzB(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzS)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzB(i);
    }

    public final void zzE(java.lang.String str, java.lang.String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zze(f);
        zzcayVar.zzn();
    }

    public final void zzH(float f, float f2) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            zzcayVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zzd(false);
        zzcayVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzca)).booleanValue()) {
            this.zza.zza();
        }
        zzK(com.ironsource.y8.h.g0, new java.lang.String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzb(java.lang.String str, java.lang.String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzc(java.lang.String str, java.lang.String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzd() {
        zzK("pause", new java.lang.String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zze() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzca)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzf() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar != null && this.zzm == 0) {
            float fZzc = zzcayVar.zzc();
            com.google.android.gms.internal.ads.zzcay zzcayVar2 = this.zzg;
            zzK("canplaythrough", "duration", java.lang.String.valueOf(fZzc / 1000.0f), "videoWidth", java.lang.String.valueOf(zzcayVar2.zze()), "videoHeight", java.lang.String.valueOf(zzcayVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcbb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcbd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcbe(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int iMax = java.lang.Math.max(i / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzT)).intValue(), 1);
            int iMax2 = java.lang.Math.max(i2 / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzT)).intValue(), 1);
            android.graphics.Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = android.graphics.Bitmap.createBitmap(iMax, iMax2, android.graphics.Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            com.google.android.gms.internal.ads.zzbda zzbdaVar = this.zze;
            if (zzbdaVar != null) {
                zzbdaVar.zzd("spinner_jank", java.lang.Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final java.lang.Integer zzl() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            return zzcayVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        android.widget.TextView textView = new android.widget.TextView(zzcayVar.getContext());
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        textView.setText(java.lang.String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(com.google.android.gms.ads.impl.R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(androidx.core.view.InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            zzcayVar.zzt();
        }
        zzJ();
    }

    final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new java.lang.String[0]);
    }

    final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", java.lang.String.valueOf(z));
    }

    public final void zzr(java.lang.Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new java.lang.String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zzd(true);
        zzcayVar.zzn();
    }

    final void zzt() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        long jZza = zzcayVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f = jZza / 1000.0f;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue()) {
            zzK("timeupdate", "time", java.lang.String.valueOf(f), "totalBytes", java.lang.String.valueOf(this.zzg.zzh()), "qoeCachedBytes", java.lang.String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", java.lang.String.valueOf(this.zzg.zzg()), "droppedFrames", java.lang.String.valueOf(this.zzg.zzb()), "reportTime", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", java.lang.String.valueOf(f));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzo();
    }

    public final void zzv() {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzp();
    }

    public final void zzw(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzq(i);
    }

    public final void zzx(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzx(i);
    }

    public final void zzz(int i) {
        com.google.android.gms.internal.ads.zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzy(i);
    }
}
