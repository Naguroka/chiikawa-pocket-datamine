package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzazj extends java.lang.Thread {
    private boolean zza;
    private boolean zzb;
    private final java.lang.Object zzc;
    private final com.google.android.gms.internal.ads.zzaza zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final java.lang.String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazj() {
        com.google.android.gms.internal.ads.zzaza zzazaVar = new com.google.android.gms.internal.ads.zzaza();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazaVar;
        this.zzc = new java.lang.Object();
        this.zzf = ((java.lang.Long) com.google.android.gms.internal.ads.zzbec.zzd.zze()).intValue();
        this.zzg = ((java.lang.Long) com.google.android.gms.internal.ads.zzbec.zza.zze()).intValue();
        this.zzh = ((java.lang.Long) com.google.android.gms.internal.ads.zzbec.zze.zze()).intValue();
        this.zzi = ((java.lang.Long) com.google.android.gms.internal.ads.zzbec.zzc.zze()).intValue();
        this.zzj = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzae)).intValue();
        this.zzk = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaf)).intValue();
        this.zzl = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzag)).intValue();
        this.zze = ((java.lang.Long) com.google.android.gms.internal.ads.zzbec.zzf.zze()).intValue();
        this.zzm = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzai);
        this.zzn = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaj)).booleanValue();
        this.zzo = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzak)).booleanValue();
        ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzal)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.os.PowerManager powerManager;
        while (true) {
            try {
                android.content.Context contextZzb = com.google.android.gms.ads.internal.zzv.zzb().zzb();
                try {
                    if (contextZzb != null) {
                        android.app.ActivityManager activityManager = (android.app.ActivityManager) contextZzb.getSystemService("activity");
                        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) contextZzb.getSystemService("keyguard");
                        if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (android.os.Process.myPid() == next.pid) {
                                        if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (android.os.PowerManager) contextZzb.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                            android.app.Activity activityZza = com.google.android.gms.ads.internal.zzv.zzb().zza();
                                            if (activityZza == null) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: no activity. Sleeping.");
                                                zze();
                                            } else {
                                                android.view.View viewFindViewById = null;
                                                try {
                                                    if (activityZza.getWindow() != null && activityZza.getWindow().getDecorView() != null) {
                                                        viewFindViewById = activityZza.getWindow().getDecorView().findViewById(android.R.id.content);
                                                    }
                                                } catch (java.lang.Exception e) {
                                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "ContentFetchTask.extractContent");
                                                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed getting root view of activity. Content not extracted.");
                                                }
                                                if (viewFindViewById != null) {
                                                    viewFindViewById.post(new com.google.android.gms.internal.ads.zzazf(this, viewFindViewById));
                                                }
                                            }
                                        }
                                        java.lang.Thread.sleep(this.zze * 1000);
                                    }
                                }
                            }
                        }
                        synchronized (this.zzc) {
                            while (this.zzb) {
                                try {
                                    com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchTask: waiting");
                                    this.zzc.wait();
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchTask: sleeping");
                    zze();
                    java.lang.Thread.sleep(this.zze * 1000);
                } catch (java.lang.InterruptedException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", e2);
                } catch (java.lang.Exception e3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", e3);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "ContentFetchTask.run");
                }
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.isInForeground");
            }
            synchronized (this.zzc) {
                while (this.zzb) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchTask: waiting");
                    this.zzc.wait();
                }
            }
        }
    }

    final com.google.android.gms.internal.ads.zzazi zza(android.view.View view, com.google.android.gms.internal.ads.zzayz zzayzVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new android.graphics.Rect());
            if ((view instanceof android.widget.TextView) && !(view instanceof android.widget.EditText)) {
                java.lang.CharSequence text = ((android.widget.TextView) view).getText();
                if (!android.text.TextUtils.isEmpty(text)) {
                    zzayzVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new com.google.android.gms.internal.ads.zzazi(this, 1, 0);
                }
            } else if ((view instanceof android.webkit.WebView) && !(view instanceof com.google.android.gms.internal.ads.zzcex)) {
                android.webkit.WebView webView = (android.webkit.WebView) view;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
                    zzayzVar.zzf();
                    webView.post(new com.google.android.gms.internal.ads.zzazh(this, zzayzVar, webView, globalVisibleRect));
                    return new com.google.android.gms.internal.ads.zzazi(this, 0, 1);
                }
            } else if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    com.google.android.gms.internal.ads.zzazi zzaziVarZza = zza(viewGroup.getChildAt(i3), zzayzVar);
                    i += zzaziVarZza.zza;
                    i2 += zzaziVarZza.zzb;
                }
                return new com.google.android.gms.internal.ads.zzazi(this, i, i2);
            }
        }
        return new com.google.android.gms.internal.ads.zzazi(this, 0, 0);
    }

    final void zzb(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.zzayz zzayzVar = new com.google.android.gms.internal.ads.zzayz(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            android.content.Context contextZzb = com.google.android.gms.ads.internal.zzv.zzb().zzb();
            if (contextZzb != null && !android.text.TextUtils.isEmpty(this.zzm)) {
                java.lang.String str = (java.lang.String) view.getTag(contextZzb.getResources().getIdentifier((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzah), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            com.google.android.gms.internal.ads.zzazi zzaziVarZza = zza(view, zzayzVar);
            zzayzVar.zzj();
            if (zzaziVarZza.zza == 0 && zzaziVarZza.zzb == 0) {
                return;
            }
            int i = zzaziVarZza.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zza(zzayzVar);
            } else if (zzayzVar.zzb() == 0) {
                return;
            }
            if (this.zzd.zzc(zzayzVar)) {
                return;
            }
            this.zzd.zza(zzayzVar);
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "ContentFetchTask.fetchContent");
        }
    }

    final void zzc(com.google.android.gms.internal.ads.zzayz zzayzVar, android.webkit.WebView webView, java.lang.String str, boolean z) {
        zzayzVar.zze();
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String strOptString = new org.json.JSONObject(str).optString("text");
                if (this.zzn || android.text.TextUtils.isEmpty(webView.getTitle())) {
                    zzayzVar.zzi(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzayzVar.zzi(webView.getTitle() + "\n" + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzayzVar.zzl()) {
                this.zzd.zzb(zzayzVar);
            }
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
