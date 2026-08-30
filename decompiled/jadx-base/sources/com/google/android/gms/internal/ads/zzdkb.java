package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdkb {
    private final com.google.android.gms.internal.ads.zzdow zza;
    private final com.google.android.gms.internal.ads.zzdnl zzb;
    private android.view.ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkb(com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzdnl zzdnlVar) {
        this.zza = zzdowVar;
        this.zzb = zzdnlVar;
    }

    private static final int zzf(android.content.Context context, java.lang.String str, int i) {
        try {
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
    }

    public final android.view.View zza(final android.view.View view, final android.view.WindowManager windowManager) throws com.google.android.gms.internal.ads.zzcfj {
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zzcexVarZza.zzF().setVisibility(4);
        zzcexVarZza.zzF().setContentDescription("policy_validator");
        zzcexVarZza.zzag("/sendMessageToSdk", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzb((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/hideValidatorOverlay", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzc(windowManager, view, (com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/open", new com.google.android.gms.internal.ads.zzbkb(null, null, null, null, null));
        this.zzb.zzm(new java.lang.ref.WeakReference(zzcexVarZza), "/loadNativeAdPolicyViolations", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzd(view, windowManager, (com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        this.zzb.zzm(new java.lang.ref.WeakReference(zzcexVarZza), "/showValidatorOverlay", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Show native ad policy validator overlay.");
                ((com.google.android.gms.internal.ads.zzcex) obj).zzF().setVisibility(0);
            }
        });
        return zzcexVarZza.zzF();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(android.view.WindowManager windowManager, android.view.View view, com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hide native ad policy validator overlay.");
        zzcexVar.zzF().setVisibility(8);
        if (zzcexVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcexVar.zzF());
        }
        zzcexVar.destroy();
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final android.view.View view, final android.view.WindowManager windowManager, final com.google.android.gms.internal.ads.zzcex zzcexVar, final java.util.Map map) {
        zzcexVar.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                this.zza.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        android.content.Context context = view.getContext();
        int iZzf = zzf(context, (java.lang.String) map.get("validator_width"), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhV)).intValue());
        int iZzf2 = zzf(context, (java.lang.String) map.get("validator_height"), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhW)).intValue());
        int iZzf3 = zzf(context, (java.lang.String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (java.lang.String) map.get("validator_y"), 0);
        zzcexVar.zzaj(com.google.android.gms.internal.ads.zzcgr.zzb(iZzf, iZzf2));
        try {
            zzcexVar.zzG().getSettings().setUseWideViewPort(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhX)).booleanValue());
            zzcexVar.zzG().getSettings().setLoadWithOverviewMode(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhY)).booleanValue());
        } catch (java.lang.NullPointerException unused) {
        }
        final android.view.WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbv.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzcexVar.zzF(), layoutParamsZzb);
        final java.lang.String str = (java.lang.String) map.get("orientation");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdka
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        com.google.android.gms.internal.ads.zzcex zzcexVar2 = zzcexVar;
                        if (zzcexVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        android.view.WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        java.lang.String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzcexVar2.zzF(), layoutParams);
                    }
                }
            };
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        java.lang.String str2 = (java.lang.String) map.get("overlay_url");
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        zzcexVar.loadUrl(str2);
    }

    final /* synthetic */ void zze(java.util.Map map, boolean z, int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (java.lang.String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }
}
