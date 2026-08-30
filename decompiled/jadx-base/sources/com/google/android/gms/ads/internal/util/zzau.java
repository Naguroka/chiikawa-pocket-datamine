package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzau {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzduv zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private int zzg;
    private int zzh;
    private android.graphics.PointF zzi;
    private android.graphics.PointF zzj;
    private android.os.Handler zzk;
    private java.lang.Runnable zzl;

    public zzau(android.content.Context context) {
        this.zzg = 0;
        this.zzl = new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        };
        this.zza = context;
        this.zzh = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzv.zzu().zza();
        this.zzb = com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    private final void zzs(android.content.Context context) {
        final int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        int iOrdinal = this.zzb.zza().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iZzu : iZzu3;
        } else {
            i = iZzu2;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(context);
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(i);
        builderZzL.setTitle("Setup gesture");
        builderZzL.setSingleChoiceItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), i, new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderZzL.setNegativeButton("Dismiss", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                this.zza.zzr();
            }
        });
        builderZzL.setPositiveButton("Save", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                this.zza.zzh(atomicInteger, i, iZzu2, iZzu3, dialogInterface, i2);
            }
        });
        builderZzL.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzL.create().show();
    }

    private final boolean zzt(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(this.zzi.x - f) < ((float) this.zzh) && java.lang.Math.abs(this.zzi.y - f2) < ((float) this.zzh) && java.lang.Math.abs(this.zzj.x - f3) < ((float) this.zzh) && java.lang.Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private static final int zzu(java.util.List list, java.lang.String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzc() {
        zzs(this.zza);
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    final /* synthetic */ void zzh(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, int i2, int i3, android.content.DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zzm(com.google.android.gms.internal.ads.zzdur.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zzm(com.google.android.gms.internal.ads.zzdur.FLICK);
            } else {
                this.zzb.zzm(com.google.android.gms.internal.ads.zzdur.NONE);
            }
        }
        zzr();
    }

    final /* synthetic */ void zzi(java.lang.String str, android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzT(this.zza, android.content.Intent.createChooser(new android.content.Intent("android.intent.action.SEND").setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void zzj(int i, int i2, int i3, int i4, int i5, android.content.DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Creative Preview] selected.");
                com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzl();
                    }
                });
                return;
            }
            if (i6 == i3) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Troubleshooting] selected.");
                com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzk();
                    }
                });
                return;
            }
            if (i6 == i4) {
                com.google.android.gms.internal.ads.zzduv zzduvVar = this.zzb;
                final com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                com.google.android.gms.internal.ads.zzgcs zzgcsVar2 = com.google.android.gms.internal.ads.zzbzw.zza;
                if (zzduvVar.zzq()) {
                    zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd();
                        }
                    });
                    return;
                } else {
                    zzgcsVar2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzgcsVar);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                com.google.android.gms.internal.ads.zzduv zzduvVar2 = this.zzb;
                final com.google.android.gms.internal.ads.zzgcs zzgcsVar3 = com.google.android.gms.internal.ads.zzbzw.zzf;
                com.google.android.gms.internal.ads.zzgcs zzgcsVar4 = com.google.android.gms.internal.ads.zzbzw.zza;
                if (zzduvVar2.zzq()) {
                    zzgcsVar3.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zza();
                        }
                    });
                    return;
                } else {
                    zzgcsVar4.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(zzgcsVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.zza instanceof android.app.Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        java.lang.String str = this.zzc;
        final java.lang.String str2 = "No debug information";
        if (!android.text.TextUtils.isEmpty(str)) {
            android.net.Uri uriBuild = new android.net.Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.android.gms.ads.internal.zzv.zzq();
            java.util.Map mapZzP = com.google.android.gms.ads.internal.util.zzs.zzP(uriBuild);
            for (java.lang.String str3 : mapZzP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((java.lang.String) mapZzP.get(str3));
                sb.append("\n\n");
            }
            java.lang.String strTrim = sb.toString().trim();
            if (!android.text.TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        builderZzL.setMessage(str2);
        builderZzL.setTitle("Ad Information");
        builderZzL.setPositiveButton("Share", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface2, int i7) {
                this.zza.zzi(str2, dialogInterface2, i7);
            }
        });
        builderZzL.setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface2, int i7) {
            }
        });
        builderZzL.create().show();
    }

    final /* synthetic */ void zzk() {
        com.google.android.gms.ads.internal.util.zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
        java.lang.String str = this.zzd;
        java.lang.String str2 = this.zze;
        java.lang.String str3 = this.zzf;
        boolean zZzm = zzayVarZzt.zzm();
        android.content.Context context = this.zza;
        zzayVarZzt.zzh(zzayVarZzt.zzj(context, str, str2));
        if (!zzayVarZzt.zzm()) {
            zzayVarZzt.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !android.text.TextUtils.isEmpty(str3)) {
            zzayVarZzt.zze(context, str2, str3, str);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for debug signals.");
        zzayVarZzt.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void zzl() {
        com.google.android.gms.ads.internal.util.zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
        android.content.Context context = this.zza;
        java.lang.String str = this.zzd;
        java.lang.String str2 = this.zze;
        if (!zzayVarZzt.zzk(context, str, str2)) {
            zzayVarZzt.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzayVarZzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Creative is not pushed for this device.");
            zzayVarZzt.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzayVarZzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("The app is not linked for creative preview.");
            zzayVarZzt.zzd(context, str, str2);
        } else if ("0".equals(zzayVarZzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for in app preview.");
            zzayVarZzt.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new android.graphics.PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new android.graphics.PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeJ)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !zzt(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(java.lang.String str) {
        this.zzd = str;
    }

    public final void zzo(java.lang.String str) {
        this.zze = str;
    }

    public final void zzp(java.lang.String str) {
        this.zzc = str;
    }

    public final void zzq(java.lang.String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof android.app.Activity)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            java.lang.String str = "Creative preview (enabled)";
            if (true == android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            java.lang.String str2 = true != com.google.android.gms.ads.internal.zzv.zzt().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzv.zzq();
            android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            builderZzL.setTitle("Select a debug mode").setItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    this.zza.zzj(iZzu, iZzu2, iZzu3, iZzu4, iZzu5, dialogInterface, i);
                }
            });
            builderZzL.create().show();
        } catch (android.view.WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("", e);
        }
    }

    public zzau(android.content.Context context, java.lang.String str) {
        this(context);
        this.zzc = str;
    }
}
