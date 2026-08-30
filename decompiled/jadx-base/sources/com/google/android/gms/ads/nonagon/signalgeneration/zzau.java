package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzau extends com.google.android.gms.internal.ads.zzbyt {
    protected static final java.util.List zza = new java.util.ArrayList(java.util.Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final java.util.List zzb = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final java.util.List zzc = new java.util.ArrayList(java.util.Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final java.util.List zzd = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final java.util.List zzB;
    private final java.util.List zzC;
    private final java.util.List zzD;
    private final java.util.List zzE;
    private final com.google.android.gms.internal.ads.zzbdq zzI;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzJ;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzK;
    private final com.google.android.gms.internal.ads.zzcgx zzf;
    private android.content.Context zzg;
    private final com.google.android.gms.internal.ads.zzava zzh;
    private final com.google.android.gms.internal.ads.zzfcn zzi;
    private final com.google.android.gms.internal.ads.zzfdi zzj;
    private final com.google.android.gms.internal.ads.zzgcs zzk;
    private final java.util.concurrent.ScheduledExecutorService zzl;
    private com.google.android.gms.internal.ads.zzbuc zzm;
    private final com.google.android.gms.internal.ads.zzdsb zzp;
    private final com.google.android.gms.internal.ads.zzfja zzq;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzy;
    private java.lang.String zzz;
    private android.graphics.Point zzn = new android.graphics.Point();
    private android.graphics.Point zzo = new android.graphics.Point();
    private final java.util.concurrent.atomic.AtomicInteger zzx = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicBoolean zzF = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzG = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicInteger zzH = new java.util.concurrent.atomic.AtomicInteger(0);
    private final boolean zzr = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzha)).booleanValue();
    private final boolean zzs = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgZ)).booleanValue();
    private final boolean zzt = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhc)).booleanValue();
    private final boolean zzu = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhe)).booleanValue();
    private final java.lang.String zzv = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhd);
    private final java.lang.String zzw = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhf);
    private final java.lang.String zzA = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhg);

    zzau(com.google.android.gms.internal.ads.zzcgx zzcgxVar, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzfdi zzfdiVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdsb zzdsbVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbdq zzbdqVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar) {
        java.util.List listZzaa;
        this.zzf = zzcgxVar;
        this.zzg = context;
        this.zzh = zzavaVar;
        this.zzi = zzfcnVar;
        this.zzj = zzfdiVar;
        this.zzk = zzgcsVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdsbVar;
        this.zzq = zzfjaVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdqVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhh)).booleanValue()) {
            this.zzB = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhi));
            this.zzC = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhj));
            this.zzD = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhk));
            listZzaa = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhl));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    static /* bridge */ /* synthetic */ void zzH(com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.zzO((android.net.Uri) it.next())) {
                zzauVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ android.net.Uri zzQ(android.net.Uri uri, java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzR(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i, java.lang.String str3, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzbyy zzbyyVar) {
        com.google.android.gms.ads.internal.client.zzs zzsVar2;
        byte b;
        com.google.android.gms.internal.ads.zzfch zzfchVar = new com.google.android.gms.internal.ads.zzfch();
        if ("REWARDED".equals(str2)) {
            zzfchVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfchVar.zzp().zza(3);
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzab zzabVarZzp = this.zzf.zzp();
        com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
        zzcvaVar.zzf(context);
        zzfchVar.zzt(str == null ? "adUnitId" : str);
        zzfchVar.zzH(zzmVar == null ? new com.google.android.gms.ads.internal.client.zzn().zza() : zzmVar);
        if (zzsVar == null) {
            switch (str2) {
                case "NATIVE":
                    b = 3;
                    break;
                case "APP_OPEN_AD":
                    b = 4;
                    break;
                case "REWARDED":
                    b = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b = 2;
                    break;
                case "BANNER":
                    b = 0;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                zzsVar2 = new com.google.android.gms.ads.internal.client.zzs(context, com.google.android.gms.ads.AdSize.BANNER);
            } else if (b == 1 || b == 2) {
                zzsVar2 = com.google.android.gms.ads.internal.client.zzs.zzd();
            } else if (b != 3) {
                zzsVar2 = b != 4 ? new com.google.android.gms.ads.internal.client.zzs() : com.google.android.gms.ads.internal.client.zzs.zzb();
            } else {
                zzsVar2 = com.google.android.gms.ads.internal.client.zzs.zzc();
            }
        } else {
            zzsVar2 = zzsVar;
        }
        zzfchVar.zzs(zzsVar2);
        zzfchVar.zzz(true);
        zzfchVar.zzA(bundle);
        zzcvaVar.zzk(zzfchVar.zzJ());
        zzcvaVar.zzi(i);
        zzabVarZzp.zza(zzcvaVar.zzl());
        com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzax();
        zzaxVar.zzb(str2);
        zzaxVar.zzc(str3);
        zzaxVar.zzd(zzbyyVar);
        zzabVarZzp.zzb(new com.google.android.gms.ads.nonagon.signalgeneration.zzaz(zzaxVar, null));
        new com.google.android.gms.internal.ads.zzdbk();
        return zzabVarZzp.zzc();
    }

    private final com.google.common.util.concurrent.ListenableFuture zzS(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zzdnl[] zzdnlVarArr = new com.google.android.gms.internal.ads.zzdnl[1];
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(this.zzj.zza(), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzv(zzdnlVarArr, str, (com.google.android.gms.internal.ads.zzdnl) obj);
            }
        }, this.zzk);
        listenableFutureZzn.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(zzdnlVarArr);
            }
        }, this.zzk);
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzm((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(listenableFutureZzn), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhy)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzl), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                int i = com.google.android.gms.ads.nonagon.signalgeneration.zzau.zze;
                return ((org.json.JSONObject) obj).optString("nas");
            }
        }, this.zzk), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                int i = com.google.android.gms.ads.nonagon.signalgeneration.zzau.zze;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", (java.lang.Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        } else {
            com.google.android.gms.internal.ads.zzgch.zzr(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkV)).booleanValue() ? com.google.android.gms.internal.ads.zzgch.zzk(new com.google.android.gms.internal.ads.zzgbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.zzgbn
                public final com.google.common.util.concurrent.ListenableFuture zza() {
                    return this.zza.zzu();
                }
            }, com.google.android.gms.internal.ads.zzbzw.zza) : zzR(this.zzg, null, com.google.android.gms.ads.AdFormat.BANNER.name(), null, null, 0, null, new android.os.Bundle(), null).zzb(), new com.google.android.gms.ads.nonagon.signalgeneration.zzat(this), this.zzf.zzC());
        }
    }

    private final void zzU() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzju)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjx)).booleanValue()) {
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjB)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(java.util.List list, final com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar, boolean z) {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhx)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbttVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((android.net.Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(list))));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final android.net.Uri uri = (android.net.Uri) it2.next();
            if (zzO(uri)) {
                listenableFutureZzb = this.zzk.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.zza.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureZzb = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar = this.zza;
                            return com.google.android.gms.internal.ads.zzgch.zzm(zzauVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new com.google.android.gms.internal.ads.zzfuc(zzauVar, (android.net.Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                public final /* synthetic */ android.net.Uri zza;

                                {
                                    this.zza = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.zzfuc
                                public final java.lang.Object apply(java.lang.Object obj2) {
                                    return com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzQ(this.zza, (java.lang.String) obj2);
                                }
                            }, zzauVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                listenableFutureZzb = com.google.android.gms.internal.ads.zzgch.zzh(uri);
            }
            arrayList.add(listenableFutureZzb);
        }
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzd(arrayList), new com.google.android.gms.ads.nonagon.signalgeneration.zzas(this, zzbttVar, z), this.zzf.zzC());
    }

    private final void zzW(final java.util.List list, final com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar, boolean z) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhx)).booleanValue()) {
            try {
                zzbttVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = this.zzk.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureZzb = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return this.zza.zzw((java.util.ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzb, new com.google.android.gms.ads.nonagon.signalgeneration.zzar(this, zzbttVar, z), this.zzf.zzC());
    }

    private static boolean zzX(android.net.Uri uri, java.util.List list, java.util.List list2) {
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        if (host != null && path != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((java.lang.String) it.next())) {
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((java.lang.String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        java.util.Map map;
        com.google.android.gms.internal.ads.zzbuc zzbucVar = this.zzm;
        return (zzbucVar == null || (map = zzbucVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.net.Uri zzZ(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        java.lang.String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return android.net.Uri.parse(string.substring(0, i) + str + com.ironsource.y8.i.b + str2 + com.ironsource.y8.i.c + string.substring(i));
    }

    private static final java.util.List zzaa(java.lang.String str) {
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str, ",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArrSplit) {
            if (!com.google.android.gms.internal.ads.zzfve.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzr(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzbyy zzbyyVar) {
        if (!com.google.android.gms.internal.ads.zzfhk.zza() || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            com.google.android.gms.internal.ads.zzfhh zzfhhVarZza = ((com.google.android.gms.ads.nonagon.signalgeneration.zzac) com.google.android.gms.internal.ads.zzgch.zzp(listenableFuture)).zza();
            zzfhhVarZza.zzd(new java.util.ArrayList(java.util.Collections.singletonList(zzbyyVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyyVar.zzd;
            zzfhhVarZza.zzb(zzmVar == null ? "" : zzmVar.zzp);
            zzfhhVarZza.zzf(zzbyyVar.zzd.zzm);
            return zzfhhVarZza;
        } catch (java.util.concurrent.ExecutionException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ java.util.ArrayList zzB(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            if (!zzP(uri) || android.text.TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ java.util.ArrayList zzC(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws java.lang.Exception {
        java.lang.String strZzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (android.text.TextUtils.isEmpty(strZzh)) {
            throw new java.lang.Exception("Failed to get view signals.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new java.lang.Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzdnl[] zzdnlVarArr) {
        com.google.android.gms.internal.ads.zzdnl zzdnlVar = zzdnlVarArr[0];
        if (zzdnlVar != null) {
            this.zzj.zzb(com.google.android.gms.internal.ads.zzgch.zzh(zzdnlVar));
        }
    }

    final boolean zzO(android.net.Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    final boolean zzP(android.net.Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjH)).booleanValue()) {
            return com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), (androidx.browser.customtabs.CustomTabsClient) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), str, (androidx.browser.customtabs.CustomTabsCallback) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3));
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzI.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007e A[PHI: r1
  0x007e: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v23 int) binds: [B:6:0x0057, B:8:0x0063, B:11:0x0072, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102  */
    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, final com.google.android.gms.internal.ads.zzbyy zzbyyVar, com.google.android.gms.internal.ads.zzbyr zzbyrVar) {
        final int i;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb;
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb2;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn;
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza(), zzbyyVar.zzd.zzz);
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(context, 22);
        zzfgwVarZza.zzi();
        int i2 = 0;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhq)).booleanValue() && zzbyyVar.zzd.zzc.getBoolean("optimize_for_app_start", false) && java.util.Objects.equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzbyyVar.zzd), "requester_type_8")) {
            i2 = 2;
            if (zzbyyVar.zze == 2) {
                i = i2;
            } else {
                i = 1;
            }
        } else {
            i = i2;
        }
        if ("UNKNOWN".equals(zzbyyVar.zzb)) {
            java.util.List arrayList = new java.util.ArrayList();
            if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhp)).isEmpty()) {
                arrayList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhp)).split(","));
            }
            if (arrayList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzbyyVar.zzd))) {
                listenableFutureZzb2 = com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
                listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkV)).booleanValue()) {
                    listenableFutureZzb2 = com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.zza.zzq(zzbyyVar, i, bundle);
                        }
                    });
                    listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb2, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            return ((com.google.android.gms.ads.nonagon.signalgeneration.zzac) obj).zzb();
                        }
                    }, com.google.android.gms.internal.ads.zzbzw.zza);
                } else {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVarZzR = zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
                    com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(zzacVarZzR);
                    listenableFutureZzb = zzacVarZzR.zzb();
                    listenableFuture = listenableFutureZzh;
                }
            }
            listenableFuture = listenableFutureZzb2;
            listenableFutureZzb = listenableFutureZzn;
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkV)).booleanValue()) {
                listenableFutureZzb2 = com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.zza.zzq(zzbyyVar, i, bundle);
                    }
                });
                listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb2, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return ((com.google.android.gms.ads.nonagon.signalgeneration.zzac) obj).zzb();
                    }
                }, com.google.android.gms.internal.ads.zzbzw.zza);
                listenableFuture = listenableFutureZzb2;
                listenableFutureZzb = listenableFutureZzn;
            } else {
                com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVarZzR2 = zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzh2 = com.google.android.gms.internal.ads.zzgch.zzh(zzacVarZzR2);
                listenableFutureZzb = zzacVarZzR2.zzb();
                listenableFuture = listenableFutureZzh2;
            }
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzb, new com.google.android.gms.ads.nonagon.signalgeneration.zzaq(this, listenableFuture, zzbyyVar, zzbyrVar, zzfgwVarZza), this.zzf.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(com.google.android.gms.internal.ads.zzbuc zzbucVar) {
        this.zzm = zzbucVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        zzV(list, iObjectWrapper, zzbttVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        zzW(list, iObjectWrapper, zzbttVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjt)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzho)).booleanValue()) {
                zzU();
            }
            android.webkit.WebView webView = (android.webkit.WebView) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzj(webView, this.zzK, com.google.android.gms.internal.ads.zzbzw.zzf);
            webView.addJavascriptInterface(new com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzjVar), "gmaSdk");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzs();
            }
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzb.zze()).booleanValue()) {
                    com.google.android.gms.internal.ads.zzbzw.zzd.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjVar.zzb();
                        }
                    }, 0L, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjE)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzho)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhx)).booleanValue()) {
            android.view.MotionEvent motionEvent = (android.view.MotionEvent) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            com.google.android.gms.internal.ads.zzbuc zzbucVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, zzbucVar == null ? null : zzbucVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        zzV(list, iObjectWrapper, zzbttVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        zzW(list, iObjectWrapper, zzbttVar, false);
    }

    final /* synthetic */ android.net.Uri zzn(android.net.Uri uri, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzfcn zzfcnVar;
        try {
            uri = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlR)).booleanValue() || (zzfcnVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null) : zzfcnVar.zza(uri, this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (com.google.android.gms.internal.ads.zzavb e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new java.lang.Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzac zzq(com.google.android.gms.internal.ads.zzbyy zzbyyVar, int i, android.os.Bundle bundle) throws java.lang.Exception {
        return zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzu() throws java.lang.Exception {
        return zzR(this.zzg, null, com.google.android.gms.ads.AdFormat.BANNER.name(), null, null, 0, null, new android.os.Bundle(), null).zzb();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzv(com.google.android.gms.internal.ads.zzdnl[] zzdnlVarArr, java.lang.String str, com.google.android.gms.internal.ads.zzdnl zzdnlVar) throws java.lang.Exception {
        zzdnlVarArr[0] = zzdnlVar;
        android.content.Context context = this.zzg;
        com.google.android.gms.internal.ads.zzbuc zzbucVar = this.zzm;
        java.util.Map map = zzbucVar.zzb;
        org.json.JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map, zzbucVar.zza, null);
        org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(this.zzg, this.zzm.zza);
        org.json.JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(this.zzm.zza);
        org.json.JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(this.zzg, this.zzm.zza);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnlVar.zzg(str, jSONObject);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzw(final java.util.ArrayList arrayList) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zzB(arrayList, (java.lang.String) obj);
            }
        }, this.zzk);
    }
}
