package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdov {
    private final com.google.android.gms.internal.ads.zzcvr zza;
    private final com.google.android.gms.internal.ads.zzddq zzb;
    private final com.google.android.gms.internal.ads.zzcxa zzc;
    private final com.google.android.gms.internal.ads.zzcxn zzd;
    private final com.google.android.gms.internal.ads.zzcxz zze;
    private final com.google.android.gms.internal.ads.zzdap zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzddm zzh;
    private final com.google.android.gms.internal.ads.zzcnh zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final com.google.android.gms.internal.ads.zzbxu zzk;
    private final com.google.android.gms.internal.ads.zzava zzl;
    private final com.google.android.gms.internal.ads.zzdag zzm;
    private final com.google.android.gms.internal.ads.zzebk zzn;
    private final com.google.android.gms.internal.ads.zzfja zzo;
    private final com.google.android.gms.internal.ads.zzdrw zzp;
    private final com.google.android.gms.internal.ads.zzcmk zzq;
    private final com.google.android.gms.internal.ads.zzdpb zzr;

    public zzdov(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzcxn zzcxnVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzdap zzdapVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzddm zzddmVar, com.google.android.gms.internal.ads.zzcnh zzcnhVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbxu zzbxuVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzdag zzdagVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzddq zzddqVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzdpb zzdpbVar) {
        this.zza = zzcvrVar;
        this.zzc = zzcxaVar;
        this.zzd = zzcxnVar;
        this.zze = zzcxzVar;
        this.zzf = zzdapVar;
        this.zzg = executor;
        this.zzh = zzddmVar;
        this.zzi = zzcnhVar;
        this.zzj = zzbVar;
        this.zzk = zzbxuVar;
        this.zzl = zzavaVar;
        this.zzm = zzdagVar;
        this.zzn = zzebkVar;
        this.zzo = zzfjaVar;
        this.zzp = zzdrwVar;
        this.zzb = zzddqVar;
        this.zzq = zzcmkVar;
        this.zzr = zzdpbVar;
    }

    public static final com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzcex zzcexVar, java.lang.String str, java.lang.String str2, final android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        zzcexVar.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.zzcab zzcabVar2 = zzcabVar;
                if (z) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
                        bundle.putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                    }
                    zzcabVar2.zzc(null);
                    return;
                }
                zzcabVar2.zzd(new java.lang.Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcexVar.zzae(str, str2, null);
        return zzcabVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(java.lang.String str, java.lang.String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(android.view.View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcex zzcexVar2, java.util.Map map) {
        this.zzi.zzh(zzcexVar);
    }

    final /* synthetic */ boolean zzh(android.view.View view, android.view.MotionEvent motionEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(final com.google.android.gms.internal.ads.zzcex zzcexVar, boolean z, com.google.android.gms.internal.ads.zzbjs zzbjsVar, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzc;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        zzcexVar.zzN().zzV(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new com.google.android.gms.internal.ads.zzbih() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbih
            public final void zzb(java.lang.String str, java.lang.String str2) {
                this.zza.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                this.zza.zze();
            }
        }, z, zzbjsVar, this.zzj, new com.google.android.gms.internal.ads.zzdou(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcexVar.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzcexVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.zza.zzf(view);
            }
        });
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcK)).booleanValue() && (zzauvVarZzc = this.zzl.zzc()) != null) {
            zzauvVarZzc.zzo(zzcexVar.zzF());
        }
        this.zzh.zzo(zzcexVar, this.zzg);
        this.zzh.zzo(new com.google.android.gms.internal.ads.zzayk() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzayk
            public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
                com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
                android.graphics.Rect rect = zzayjVar.zzd;
                zzcgpVarZzN.zzr(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcexVar.zzF());
        zzcexVar.zzag("/trackActiveViewUnit", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzg(zzcexVar, (com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        this.zzi.zzi(zzcexVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
    }
}
