package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class zzcff extends android.webkit.WebViewClient implements com.google.android.gms.internal.ads.zzcgp {
    public static final /* synthetic */ int zzb = 0;
    private com.google.android.gms.internal.ads.zzdrw zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final com.google.android.gms.internal.ads.zzebv zzG;
    private android.view.View.OnAttachStateChangeListener zzH;
    protected com.google.android.gms.internal.ads.zzbxu zza;
    private final com.google.android.gms.internal.ads.zzcex zzc;
    private final com.google.android.gms.internal.ads.zzbbj zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private com.google.android.gms.internal.ads.zzcgn zzi;
    private com.google.android.gms.internal.ads.zzcgo zzj;
    private com.google.android.gms.internal.ads.zzbif zzk;
    private com.google.android.gms.internal.ads.zzbih zzl;
    private com.google.android.gms.internal.ads.zzdds zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;
    private com.google.android.gms.internal.ads.zzbsh zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final java.util.HashMap zze = new java.util.HashMap();
    private final java.lang.Object zzf = new java.lang.Object();
    private int zzp = 0;
    private java.lang.String zzq = "";
    private java.lang.String zzr = "";
    private com.google.android.gms.internal.ads.zzbsc zzz = null;
    private final java.util.HashSet zzF = new java.util.HashSet(java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfC)).split(",")));

    public zzcff(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, boolean z, com.google.android.gms.internal.ads.zzbsh zzbshVar, com.google.android.gms.internal.ads.zzbsc zzbscVar, com.google.android.gms.internal.ads.zzebv zzebvVar) {
        this.zzd = zzbbjVar;
        this.zzc = zzcexVar;
        this.zzs = z;
        this.zzx = zzbshVar;
        this.zzG = zzebvVar;
    }

    private static android.webkit.WebResourceResponse zzW() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaU)).booleanValue()) {
            return new android.webkit.WebResourceResponse("", "", new java.io.ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final android.webkit.WebResourceResponse zzX(java.lang.String str, java.util.Map map) throws java.io.IOException {
        java.net.URL url = new java.net.URL(str);
        try {
            android.net.TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw new java.io.IOException("Too many redirects (20)");
                }
                java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (java.util.Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                    throw new java.io.IOException("Invalid protocol.");
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzv.zzq().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                android.webkit.WebResourceResponse webResourceResponseZzb = null;
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    java.lang.String contentType = httpURLConnection.getContentType();
                    java.lang.String strTrim = "";
                    java.lang.String strTrim2 = android.text.TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    java.lang.String contentType2 = httpURLConnection.getContentType();
                    if (!android.text.TextUtils.isEmpty(contentType2)) {
                        java.lang.String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                                if (strArrSplit[i2].trim().startsWith(com.json.zb.M)) {
                                    java.lang.String[] strArrSplit2 = strArrSplit[i2].trim().split(com.ironsource.y8.i.b);
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    java.lang.String str2 = strTrim;
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    java.util.HashMap map2 = new java.util.HashMap(headerFields.size());
                    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    webResourceResponseZzb = com.google.android.gms.ads.internal.zzv.zzr().zzb(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                } else {
                    java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                    if (headerField == null) {
                        throw new java.io.IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        java.net.URL url2 = new java.net.URL(url, headerField);
                        java.lang.String protocol = url2.getProtocol();
                        if (protocol == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Protocol is null");
                            webResourceResponseZzb = zzW();
                        } else if (protocol.equals(androidx.webkit.ProxyConfig.MATCH_HTTP) || protocol.equals("https")) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unsupported scheme: " + protocol);
                            webResourceResponseZzb = zzW();
                        }
                    }
                }
                android.net.TrafficStats.clearThreadStatsTag();
                return webResourceResponseZzb;
            }
        } catch (java.lang.Throwable th) {
            android.net.TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzY(java.util.Map map, java.util.List list, java.lang.String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (java.lang.String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((java.lang.String) map.get(str2)));
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzbjp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzZ() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((android.view.View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final android.view.View view, final com.google.android.gms.internal.ads.zzbxu zzbxuVar, final int i) {
        if (!zzbxuVar.zzi() || i <= 0) {
            return;
        }
        zzbxuVar.zzg(view);
        if (zzbxuVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcey
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(view, zzbxuVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzab(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        return zzcexVar.zzD() != null && zzcexVar.zzD().zzb();
    }

    private static final boolean zzac(boolean z, com.google.android.gms.internal.ads.zzcex zzcexVar) {
        return (!z || zzcexVar.zzO().zzi() || zzcexVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri uri = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzk(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzB = true;
            com.google.android.gms.internal.ads.zzcgo zzcgoVar = this.zzj;
            if (zzcgoVar != null) {
                zzcgoVar.zza();
                this.zzj = null;
            }
            zzh();
            if (this.zzc.zzL() != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlM)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return zzc(str, java.util.Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri uriZza = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzk(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                java.lang.String scheme = uriZza.getScheme();
                if (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zza;
                        if (zzbxuVar != null) {
                            zzbxuVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    com.google.android.gms.internal.ads.zzdds zzddsVar = this.zzm;
                    if (zzddsVar != null) {
                        zzddsVar.zzdd();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView unable to handle URL: ".concat(java.lang.String.valueOf(str)));
            } else {
                try {
                    com.google.android.gms.internal.ads.zzava zzavaVarZzI = this.zzc.zzI();
                    com.google.android.gms.internal.ads.zzfcn zzfcnVarZzS = this.zzc.zzS();
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlR)).booleanValue() || zzfcnVarZzS == null) {
                        if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                            android.content.Context context = this.zzc.getContext();
                            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
                            uriZza = zzavaVarZzI.zza(uriZza, context, (android.view.View) zzcexVar, zzcexVar.zzi());
                        }
                    } else if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                        android.content.Context context2 = this.zzc.getContext();
                        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc;
                        uriZza = zzfcnVarZzS.zza(uriZza, context2, (android.view.View) zzcexVar2, zzcexVar2.zzi());
                    }
                } catch (com.google.android.gms.internal.ads.zzavb unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(java.lang.String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzc()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null);
                    com.google.android.gms.internal.ads.zzcex zzcexVar3 = this.zzc;
                    zzv(zzcVar, true, false, zzcexVar3 != null ? zzcexVar3.zzr() : "");
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean zZzac = zzac(zZzaF, zzcexVar);
        boolean z4 = true;
        if (!zZzac && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        com.google.android.gms.internal.ads.zzcfe zzcfeVar = zZzaF ? null : new com.google.android.gms.internal.ads.zzcfe(this.zzc, this.zzh);
        com.google.android.gms.internal.ads.zzbif zzbifVar = this.zzk;
        com.google.android.gms.internal.ads.zzbih zzbihVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc;
        zzy(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaVar, zzcfeVar, zzbifVar, zzbihVar, zzacVar, zzcexVar2, z, i, str, zzcexVar2.zzn(), z4 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null, z3));
    }

    public final void zzB(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        synchronized (this.zzf) {
            java.util.List copyOnWriteArrayList = (java.util.List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzC(com.google.android.gms.internal.ads.zzcgn zzcgnVar) {
        this.zzi = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzD(int i, int i2) {
        com.google.android.gms.internal.ads.zzbsc zzbscVar = this.zzz;
        if (zzbscVar != null) {
            zzbscVar.zze(i, i2);
        }
    }

    public final void zzE(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzH() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcez
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzI(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzJ(com.google.android.gms.internal.ads.zzcgo zzcgoVar) {
        this.zzj = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzK(com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar) {
        zzO("/click");
        if (zzebkVar == null || zzfjaVar == null) {
            zzB("/click", new com.google.android.gms.internal.ads.zzbin(this.zzm, zzcmkVar));
        } else {
            zzB("/click", new com.google.android.gms.internal.ads.zzfcr(this.zzm, zzcmkVar, zzfjaVar, zzebkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzL(com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        zzO("/click");
        zzB("/click", new com.google.android.gms.internal.ads.zzbin(this.zzm, zzcmkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzM(com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        zzO("/open");
        zzB("/open", new com.google.android.gms.internal.ads.zzbkb(this.zzy, this.zzz, zzebkVar, zzdrwVar, zzcmkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzN(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            zzO("/logScionEvent");
            new java.util.HashMap();
            zzB("/logScionEvent", new com.google.android.gms.internal.ads.zzbjv(this.zzc.getContext(), zzfboVar.zzaw));
        }
    }

    public final void zzO(java.lang.String str) {
        synchronized (this.zzf) {
            java.util.List list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzP(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        synchronized (this.zzf) {
            java.util.List list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbjpVar);
        }
    }

    public final void zzQ(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        synchronized (this.zzf) {
            java.util.List<com.google.android.gms.internal.ads.zzbjp> list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.ads.zzbjp zzbjpVar : list) {
                if (predicate.apply(zzbjpVar)) {
                    arrayList.add(zzbjpVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzR() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzS() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final boolean zzT() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzU() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzV(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.internal.ads.zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z, com.google.android.gms.internal.ads.zzbjs zzbjsVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbsj zzbsjVar, com.google.android.gms.internal.ads.zzbxu zzbxuVar, final com.google.android.gms.internal.ads.zzebk zzebkVar, final com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzbkj zzbkjVar, com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzbki zzbkiVar, com.google.android.gms.internal.ads.zzbkc zzbkcVar, com.google.android.gms.internal.ads.zzbjq zzbjqVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxuVar, null) : zzbVar;
        this.zzz = new com.google.android.gms.internal.ads.zzbsc(this.zzc, zzbsjVar);
        this.zza = zzbxuVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbb)).booleanValue()) {
            zzB("/adMetadata", new com.google.android.gms.internal.ads.zzbie(zzbifVar));
        }
        if (zzbihVar != null) {
            zzB("/appEvent", new com.google.android.gms.internal.ads.zzbig(zzbihVar));
        }
        zzB("/backButton", com.google.android.gms.internal.ads.zzbjo.zzj);
        zzB("/refresh", com.google.android.gms.internal.ads.zzbjo.zzk);
        zzB("/canOpenApp", com.google.android.gms.internal.ads.zzbjo.zzb);
        zzB("/canOpenURLs", com.google.android.gms.internal.ads.zzbjo.zza);
        zzB("/canOpenIntents", com.google.android.gms.internal.ads.zzbjo.zzc);
        zzB("/close", com.google.android.gms.internal.ads.zzbjo.zzd);
        zzB("/customClose", com.google.android.gms.internal.ads.zzbjo.zze);
        zzB("/instrument", com.google.android.gms.internal.ads.zzbjo.zzn);
        zzB("/delayPageLoaded", com.google.android.gms.internal.ads.zzbjo.zzp);
        zzB("/delayPageClosed", com.google.android.gms.internal.ads.zzbjo.zzq);
        zzB("/getLocationInfo", com.google.android.gms.internal.ads.zzbjo.zzr);
        zzB("/log", com.google.android.gms.internal.ads.zzbjo.zzg);
        zzB("/mraid", new com.google.android.gms.internal.ads.zzbjw(zzbVar2, this.zzz, zzbsjVar));
        com.google.android.gms.internal.ads.zzbsh zzbshVar = this.zzx;
        if (zzbshVar != null) {
            zzB("/mraidLoaded", zzbshVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new com.google.android.gms.internal.ads.zzbkb(zzbVar2, this.zzz, zzebkVar, zzdrwVar, zzcmkVar));
        zzB("/precache", new com.google.android.gms.internal.ads.zzcdf());
        zzB("/touch", com.google.android.gms.internal.ads.zzbjo.zzi);
        zzB("/video", com.google.android.gms.internal.ads.zzbjo.zzl);
        zzB("/videoMeta", com.google.android.gms.internal.ads.zzbjo.zzm);
        if (zzebkVar == null || zzfjaVar == null) {
            zzB("/click", new com.google.android.gms.internal.ads.zzbin(zzddsVar, zzcmkVar));
            zzB("/httpTrack", com.google.android.gms.internal.ads.zzbjo.zzf);
        } else {
            zzB("/click", new com.google.android.gms.internal.ads.zzfcr(zzddsVar, zzcmkVar, zzfjaVar, zzebkVar));
            zzB("/httpTrack", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzfcs
                @Override // com.google.android.gms.internal.ads.zzbjp
                public final void zza(java.lang.Object obj, java.util.Map map) {
                    com.google.android.gms.internal.ads.zzceo zzceoVar = (com.google.android.gms.internal.ads.zzceo) obj;
                    java.lang.String str = (java.lang.String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    com.google.android.gms.internal.ads.zzfbo zzfboVarZzD = zzceoVar.zzD();
                    if (zzfboVarZzD != null && !zzfboVarZzD.zzai) {
                        zzfjaVar.zzd(str, zzfboVarZzD.zzax, null);
                        return;
                    }
                    com.google.android.gms.internal.ads.zzfbr zzfbrVarZzR = ((com.google.android.gms.internal.ads.zzcga) zzceoVar).zzR();
                    if (zzfbrVarZzR != null) {
                        zzebkVar.zzd(new com.google.android.gms.internal.ads.zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), zzfbrVarZzR.zzb, str, 2));
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            java.util.Map map = new java.util.HashMap();
            if (this.zzc.zzD() != null) {
                map = this.zzc.zzD().zzaw;
            }
            zzB("/logScionEvent", new com.google.android.gms.internal.ads.zzbjv(this.zzc.getContext(), map));
        }
        if (zzbjsVar != null) {
            zzB("/setInterstitialProperties", new com.google.android.gms.internal.ads.zzbjr(zzbjsVar));
        }
        if (zzbkjVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkjVar);
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjg)).booleanValue() && zzbkiVar != null) {
            zzB("/shareSheet", zzbkiVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue() && zzbkcVar != null) {
            zzB("/inspectorOutOfContextTest", zzbkcVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjp)).booleanValue() && zzbjqVar != null) {
            zzB("/inspectorStorage", zzbjqVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlr)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", com.google.android.gms.internal.ads.zzbjo.zzu);
            zzB("/presentPlayStoreOverlay", com.google.android.gms.internal.ads.zzbjo.zzv);
            zzB("/expandPlayStoreOverlay", com.google.android.gms.internal.ads.zzbjo.zzw);
            zzB("/collapsePlayStoreOverlay", com.google.android.gms.internal.ads.zzbjo.zzx);
            zzB("/closePlayStoreOverlay", com.google.android.gms.internal.ads.zzbjo.zzy);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdr)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", com.google.android.gms.internal.ads.zzbjo.zzA);
            zzB("/resetPAID", com.google.android.gms.internal.ads.zzbjo.zzz);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlL)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
            if (zzcexVar.zzD() != null && zzcexVar.zzD().zzar) {
                zzB("/writeToLocalStorage", com.google.android.gms.internal.ads.zzbjo.zzB);
                zzB("/clearLocalStorageKeys", com.google.android.gms.internal.ads.zzbjo.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbifVar;
        this.zzl = zzbihVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzddsVar;
        this.zzA = zzdrwVar;
        this.zzn = z;
    }

    public final android.view.ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final android.view.ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:58:0x017d, B:60:0x018f, B:61:0x0196, B:71:0x01cf, B:73:0x01e1, B:74:0x01e8), top: B:104:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0289 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:62:0x01a1, B:63:0x01c4, B:89:0x0289, B:77:0x0213, B:78:0x0239, B:75:0x01ec, B:42:0x0143, B:27:0x00d7, B:79:0x023a, B:81:0x0244, B:83:0x024a, B:85:0x027d, B:91:0x0298, B:93:0x029e, B:95:0x02ac), top: B:107:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x029e A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:62:0x01a1, B:63:0x01c4, B:89:0x0289, B:77:0x0213, B:78:0x0239, B:75:0x01ec, B:42:0x0143, B:27:0x00d7, B:79:0x023a, B:81:0x0244, B:83:0x024a, B:85:0x027d, B:91:0x0298, B:93:0x029e, B:95:0x02ac), top: B:107:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02b1 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    protected final android.webkit.WebResourceResponse zzc(java.lang.String str, java.util.Map map) {
        int i;
        java.io.InputStream inputStreamZza;
        java.lang.Long l;
        java.io.InputStream inputStreamZzc;
        final boolean z;
        final boolean z2;
        java.lang.String str2;
        try {
            java.util.Map map2 = new java.util.HashMap();
            if (this.zzc.zzD() != null) {
                map2 = this.zzc.zzD().zzaw;
            }
            java.lang.String strZzc = com.google.android.gms.internal.ads.zzbyk.zzc(str, this.zzc.getContext(), this.zzE, map2);
            if (!strZzc.equals(str)) {
                return zzX(strZzc, map);
            }
            com.google.android.gms.internal.ads.zzbav zzbavVarZza = com.google.android.gms.internal.ads.zzbav.zza(android.net.Uri.parse(str));
            if (zzbavVarZza != null) {
                java.util.HashMap map3 = new java.util.HashMap();
                map3.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
                android.net.Uri uri = android.net.Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    java.util.List listZzf = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(org.objectweb.asm.signature.SignatureVisitor.SUPER)).zzf(uri.getQueryParameter("range"));
                    if (listZzf.size() == 2) {
                        int i2 = java.lang.Integer.parseInt((java.lang.String) listZzf.get(0));
                        int i3 = java.lang.Integer.parseInt((java.lang.String) listZzf.get(1)) + 1;
                        if (i2 > 0) {
                            zzbavVarZza.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                final boolean z3 = "X-Afma-Gcache-CachedBytes";
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeq)).booleanValue()) {
                    zzbavVarZza.zzi = com.google.android.gms.internal.ads.zzfve.zzc(this.zzc.zzr());
                    zzbavVarZza.zzj = this.zzc.zzf();
                    if (zzbavVarZza.zzg) {
                        l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzes);
                    } else {
                        l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzer);
                    }
                    try {
                        long jLongValue = l.longValue();
                        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                        com.google.android.gms.ads.internal.zzv.zzd();
                        java.util.concurrent.Future futureZza = com.google.android.gms.internal.ads.zzbbg.zza(this.zzc.getContext(), zzbavVarZza);
                        try {
                            com.google.android.gms.internal.ads.zzbbh zzbbhVar = (com.google.android.gms.internal.ads.zzbbh) futureZza.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(zzbbhVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(zzbbhVar.zzf()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(zzbbhVar.zze()));
                                    map3.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(zzbbhVar.zza()));
                                    inputStreamZzc = zzbbhVar.zzc();
                                    if (i != -1) {
                                        try {
                                            inputStreamZzc = com.google.android.gms.internal.ads.zzgad.zza(inputStreamZzc, i);
                                        } catch (java.lang.InterruptedException e) {
                                            e = e;
                                            z2 = true;
                                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            java.lang.Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z2, jElapsedRealtime2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                        } catch (java.util.concurrent.ExecutionException e2) {
                                            e = e2;
                                            z = true;
                                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z, jElapsedRealtime3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                        } catch (java.util.concurrent.TimeoutException e3) {
                                            e = e3;
                                            z = true;
                                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z, jElapsedRealtime4);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                        }
                                    }
                                    final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                    final boolean z4 = true;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzp(z4, jElapsedRealtime5);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime5 + "ms";
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    z3 = 1;
                                    final long jElapsedRealtime6 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzp(z3, jElapsedRealtime6);
                                        }
                                    });
                                    com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime6 + "ms");
                                    throw th;
                                }
                            } catch (java.lang.InterruptedException e4) {
                                e = e4;
                                inputStreamZzc = null;
                            } catch (java.util.concurrent.ExecutionException e5) {
                                e = e5;
                                inputStreamZzc = null;
                                z = true;
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime7 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzp(z, jElapsedRealtime7);
                                    }
                                });
                                str2 = "Cache connection took " + jElapsedRealtime7 + "ms";
                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                inputStreamZza = inputStreamZzc;
                                if (inputStreamZza != null) {
                                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                    return null;
                                }
                                return null;
                            } catch (java.util.concurrent.TimeoutException e6) {
                                e = e6;
                                inputStreamZzc = null;
                                z = true;
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime8 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzp(z, jElapsedRealtime8);
                                    }
                                });
                                str2 = "Cache connection took " + jElapsedRealtime8 + "ms";
                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                inputStreamZza = inputStreamZzc;
                                if (inputStreamZza != null) {
                                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                    return null;
                                }
                                return null;
                            }
                        } catch (java.lang.InterruptedException e7) {
                            e = e7;
                            inputStreamZzc = null;
                            z2 = false;
                        } catch (java.util.concurrent.ExecutionException e8) {
                            e = e8;
                            inputStreamZzc = null;
                            z = false;
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime9 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(z, jElapsedRealtime9);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime9 + "ms";
                            com.google.android.gms.ads.internal.util.zze.zza(str2);
                            inputStreamZza = inputStreamZzc;
                            if (inputStreamZza != null) {
                                return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                return null;
                            }
                            return null;
                        } catch (java.util.concurrent.TimeoutException e9) {
                            e = e9;
                            inputStreamZzc = null;
                            z = false;
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzev)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime10 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(z, jElapsedRealtime10);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime10 + "ms";
                            com.google.android.gms.ads.internal.util.zze.zza(str2);
                            inputStreamZza = inputStreamZzc;
                            if (inputStreamZza != null) {
                                return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                return null;
                            }
                            return null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            z3 = 0;
                        }
                        com.google.android.gms.ads.internal.util.zze.zza(str2);
                        inputStreamZza = inputStreamZzc;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzbas zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(zzbavVarZza);
                    if (zzbasVarZzb == null || !zzbasVarZzb.zze()) {
                        inputStreamZza = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(zzbasVarZzb.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(zzbasVarZzb.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(zzbasVarZzb.zzf()));
                        map3.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(zzbasVarZzb.zza()));
                        java.io.InputStream inputStreamZzc2 = zzbasVarZzb.zzc();
                        inputStreamZza = i != -1 ? com.google.android.gms.internal.ads.zzgad.zza(inputStreamZzc2, i) : inputStreamZzc2;
                    }
                }
                if (inputStreamZza != null) {
                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                }
            }
            if (com.google.android.gms.ads.internal.util.client.zzl.zzk() || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeh.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzX(str, map);
        } catch (java.lang.Exception | java.lang.NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "AdWebViewClient.interceptRequest");
            return zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        com.google.android.gms.internal.ads.zzdds zzddsVar = this.zzm;
        if (zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final com.google.android.gms.internal.ads.zzdrw zze() {
        return this.zzA;
    }

    public final void zzh() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() && this.zzc.zzm() != null) {
                com.google.android.gms.internal.ads.zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            com.google.android.gms.internal.ads.zzcgn zzcgnVar = this.zzi;
            boolean z = false;
            if (!this.zzC && !this.zzo) {
                z = true;
            }
            zzcgnVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzi() {
        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            zzbxuVar.zze();
            this.zza = null;
        }
        zzZ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            com.google.android.gms.internal.ads.zzbsc zzbscVar = this.zzz;
            if (zzbscVar != null) {
                zzbscVar.zza(true);
                this.zzz = null;
            }
        }
    }

    public final void zzj(boolean z) {
        this.zzE = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzk(android.net.Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        java.util.HashMap map = this.zze;
        java.lang.String path = uri.getPath();
        java.util.List list = (java.util.List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgB)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zzg() == null) {
                return;
            }
            final java.lang.String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfa
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    int i = com.google.android.gms.internal.ads.zzcff.zzb;
                    com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(strSubstring);
                }
            });
            return;
        }
        java.lang.String encodedQuery = uri.getEncodedQuery();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfB)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfD)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.ads.internal.zzv.zzq().zzb(uri), new com.google.android.gms.internal.ads.zzcfd(this, list, path, uri), com.google.android.gms.internal.ads.zzbzw.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        zzY(com.google.android.gms.ads.internal.util.zzs.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzl() {
        com.google.android.gms.internal.ads.zzbbj zzbbjVar = this.zzd;
        if (zzbbjVar != null) {
            zzbbjVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = com.google.android.gms.games.GamesActivityResultCodes.RESULT_APP_MISCONFIGURED;
        this.zzq = "Page loaded delay cancel.";
        zzh();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzm() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzn() {
        this.zzD--;
        zzh();
    }

    final /* synthetic */ void zzo() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zzc.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzz();
        }
    }

    final /* synthetic */ void zzp(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzq(android.view.View view, com.google.android.gms.internal.ads.zzbxu zzbxuVar, int i) {
        zzaa(view, zzbxuVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzr(int i, int i2, boolean z) {
        com.google.android.gms.internal.ads.zzbsh zzbshVar = this.zzx;
        if (zzbshVar != null) {
            zzbshVar.zzb(i, i2);
        }
        com.google.android.gms.internal.ads.zzbsc zzbscVar = this.zzz;
        if (zzbscVar != null) {
            zzbscVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzs() {
        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            android.webkit.WebView webViewZzG = this.zzc.zzG();
            if (androidx.core.view.ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzaa(webViewZzG, zzbxuVar, 10);
                return;
            }
            zzZ();
            com.google.android.gms.internal.ads.zzcfc zzcfcVar = new com.google.android.gms.internal.ads.zzcfc(this, zzbxuVar);
            this.zzH = zzcfcVar;
            ((android.view.View) this.zzc).addOnAttachStateChangeListener(zzcfcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        com.google.android.gms.internal.ads.zzdds zzddsVar = this.zzm;
        if (zzddsVar != null) {
            zzddsVar.zzu();
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean z3 = zzac(zZzaF, zzcexVar) || z2;
        boolean z4 = z3 || !z;
        com.google.android.gms.ads.internal.client.zza zzaVar = z3 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = zZzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc;
        zzy(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzacVar, zzcexVar2.zzn(), zzcexVar2, z4 ? null : this.zzm, str));
    }

    public final void zzw(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.internal.ads.zzebv zzebvVar = this.zzG;
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        zzy(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcexVar, zzcexVar.zzn(), str, str2, 14, zzebvVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        boolean zZzac = zzac(zzcexVar.zzaF(), zzcexVar);
        boolean z3 = true;
        if (!zZzac && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc;
        zzy(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaVar, zzrVar, zzacVar, zzcexVar2, z, i, zzcexVar2.zzn(), z3 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }

    public final void zzy(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        com.google.android.gms.internal.ads.zzbsc zzbscVar = this.zzz;
        boolean zZzf = zzbscVar != null ? zzbscVar.zzf() : false;
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZzf, this.zzA);
        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            java.lang.String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxuVar.zzh(str);
        }
    }

    public final void zzz(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean zZzac = zzac(zZzaF, zzcexVar);
        boolean z3 = true;
        if (!zZzac && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        com.google.android.gms.internal.ads.zzcfe zzcfeVar = zZzaF ? null : new com.google.android.gms.internal.ads.zzcfe(this.zzc, this.zzh);
        com.google.android.gms.internal.ads.zzbif zzbifVar = this.zzk;
        com.google.android.gms.internal.ads.zzbih zzbihVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc;
        zzy(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaVar, zzcfeVar, zzbifVar, zzbihVar, zzacVar, zzcexVar2, z, i, str, str2, zzcexVar2.zzn(), z3 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }
}
