package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjf {
    static final android.widget.ImageView.ScaleType zza = android.widget.ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final com.google.android.gms.internal.ads.zzdik zzd;
    private final com.google.android.gms.internal.ads.zzdif zze;
    private final com.google.android.gms.internal.ads.zzdjt zzf;
    private final com.google.android.gms.internal.ads.zzdkb zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzbfl zzj;
    private final com.google.android.gms.internal.ads.zzdic zzk;

    public zzdjf(com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzdik zzdikVar, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdjt zzdjtVar, com.google.android.gms.internal.ads.zzdkb zzdkbVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.zzdic zzdicVar) {
        this.zzb = zzgVar;
        this.zzc = zzfcjVar;
        this.zzj = zzfcjVar.zzi;
        this.zzd = zzdikVar;
        this.zze = zzdifVar;
        this.zzf = zzdjtVar;
        this.zzg = zzdkbVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdicVar;
    }

    private final boolean zzi(android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdV)).booleanValue() ? new android.widget.FrameLayout.LayoutParams(-1, -1, 17) : new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(android.view.ViewGroup viewGroup) {
        com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
        if (zzdifVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdifVar.zzc() == 2 || zzdifVar.zzc() == 1) {
                this.zzb.zzF(this.zzc.zzf, java.lang.String.valueOf(zzdifVar.zzc()), z);
            } else if (zzdifVar.zzc() == 6) {
                this.zzb.zzF(this.zzc.zzf, "2", z);
                this.zzb.zzF(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        android.view.ViewGroup viewGroup;
        android.view.View viewZze;
        final android.view.ViewGroup viewGroup2;
        com.google.android.gms.internal.ads.zzbft zzbftVarZza;
        android.graphics.drawable.Drawable drawable;
        if (!this.zzd.zzf() && !this.zzd.zze()) {
            viewGroup = null;
            break;
        }
        java.lang.String[] strArr = {com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            android.view.View viewZzg = zzdkdVar.zzg(strArr[i]);
            if (viewZzg != null && (viewZzg instanceof android.view.ViewGroup)) {
                viewGroup = (android.view.ViewGroup) viewZzg;
                break;
            }
            i++;
        }
        android.content.Context context = zzdkdVar.zzf().getContext();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
        if (zzdifVar.zze() != null) {
            com.google.android.gms.internal.ads.zzbfl zzbflVar = this.zzj;
            viewZze = zzdifVar.zze();
            if (zzbflVar != null && viewGroup == null) {
                zzh(layoutParams, zzbflVar.zze);
                viewZze.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdifVar.zzl() instanceof com.google.android.gms.internal.ads.zzbfg) {
            com.google.android.gms.internal.ads.zzbfg zzbfgVar = (com.google.android.gms.internal.ads.zzbfg) zzdifVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfgVar.zzc());
                viewGroup = null;
            }
            android.view.View zzbfhVar = new com.google.android.gms.internal.ads.zzbfh(context, zzbfgVar, layoutParams);
            zzbfhVar.setContentDescription((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdT));
            viewZze = zzbfhVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkdVar.zzf().getContext());
                zzaVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZze);
                android.widget.FrameLayout frameLayoutZzh = zzdkdVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            zzdkdVar.zzq(zzdkdVar.zzk(), viewZze, true);
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = com.google.android.gms.internal.ads.zzdjb.zza;
        int size = zzfxnVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            android.view.View viewZzg2 = zzdkdVar.zzg((java.lang.String) zzfxnVar.get(i2));
            i2++;
            if (viewZzg2 instanceof android.view.ViewGroup) {
                viewGroup2 = (android.view.ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdjc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            com.google.android.gms.internal.ads.zzdif zzdifVar2 = this.zze;
            if (zzdifVar2.zzs() != null) {
                zzdifVar2.zzs().zzar(new com.google.android.gms.internal.ads.zzdje(zzdkdVar, viewGroup2));
                return;
            }
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjS)).booleanValue() && zzi(viewGroup2, false)) {
            com.google.android.gms.internal.ads.zzdif zzdifVar3 = this.zze;
            if (zzdifVar3.zzq() != null) {
                zzdifVar3.zzq().zzar(new com.google.android.gms.internal.ads.zzdje(zzdkdVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        android.view.View viewZzf = zzdkdVar.zzf();
        android.content.Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbftVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzi = zzbftVarZza.zzi();
            if (iObjectWrapperZzi == null || (drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzi)) == null) {
                return;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context2);
            imageView.setImageDrawable(drawable);
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzj = zzdkdVar.zzj();
            if (iObjectWrapperZzj == null) {
                imageView.setScaleType(zza);
            } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzga)).booleanValue()) {
                imageView.setScaleType((android.widget.ImageView.ScaleType) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzj));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (android.os.RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        if (zzdkdVar == null || this.zzf == null || zzdkdVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkdVar.zzh().addView(this.zzf.zza());
        } catch (com.google.android.gms.internal.ads.zzcfj e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        if (zzdkdVar == null) {
            return;
        }
        android.content.Context context = zzdkdVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzd.zza)) {
            if (!(context instanceof android.app.Activity)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdkdVar.zzh() == null) {
                return;
            }
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdkdVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
            } catch (com.google.android.gms.internal.ads.zzcfj e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        this.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdjd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdkdVar);
            }
        });
    }

    public final boolean zzf(android.view.ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(android.view.ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(android.widget.RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
