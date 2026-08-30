package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecl implements com.google.android.gms.internal.ads.zzecm {
    static /* synthetic */ com.google.android.gms.internal.ads.zzecr zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzecn zzecnVar, java.lang.String str4, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.zzeco zzecoVar) {
        com.google.android.gms.internal.ads.zzflc zzflcVarZza = com.google.android.gms.internal.ads.zzflc.zza("Google", str2);
        com.google.android.gms.internal.ads.zzflb zzflbVarZzp = zzp("javascript");
        com.google.android.gms.internal.ads.zzfku zzfkuVarZzn = zzn(zzecnVar.toString());
        if (zzflbVarZzp == com.google.android.gms.internal.ads.zzflb.NONE) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkuVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzecnVar))));
            return null;
        }
        com.google.android.gms.internal.ads.zzflb zzflbVarZzp2 = zzp(str4);
        if (zzfkuVarZzn == com.google.android.gms.internal.ads.zzfku.VIDEO && zzflbVarZzp2 == com.google.android.gms.internal.ads.zzflb.NONE) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(java.lang.String.valueOf(str4)));
            return null;
        }
        com.google.android.gms.internal.ads.zzfkr zzfkrVarZzb = com.google.android.gms.internal.ads.zzfkr.zzb(zzflcVarZza, webView, str5, "");
        return new com.google.android.gms.internal.ads.zzecr(com.google.android.gms.internal.ads.zzfkp.zza(com.google.android.gms.internal.ads.zzfkq.zza(zzfkuVarZzn, zzo(zzecoVar.toString()), zzflbVarZzp, zzflbVarZzp2, true), zzfkrVarZzb), zzfkrVarZzb);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzecr zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.zzecn zzecnVar, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.zzeco zzecoVar) {
        com.google.android.gms.internal.ads.zzflc zzflcVarZza = com.google.android.gms.internal.ads.zzflc.zza(str, str2);
        com.google.android.gms.internal.ads.zzflb zzflbVarZzp = zzp("javascript");
        com.google.android.gms.internal.ads.zzflb zzflbVarZzp2 = zzp(str4);
        com.google.android.gms.internal.ads.zzfku zzfkuVarZzn = zzn(zzecnVar.toString());
        if (zzflbVarZzp == com.google.android.gms.internal.ads.zzflb.NONE) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkuVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzecnVar))));
            return null;
        }
        if (zzfkuVarZzn == com.google.android.gms.internal.ads.zzfku.VIDEO && zzflbVarZzp2 == com.google.android.gms.internal.ads.zzflb.NONE) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(java.lang.String.valueOf(str4)));
            return null;
        }
        com.google.android.gms.internal.ads.zzfkr zzfkrVarZzc = com.google.android.gms.internal.ads.zzfkr.zzc(zzflcVarZza, webView, str5, "");
        return new com.google.android.gms.internal.ads.zzecr(com.google.android.gms.internal.ads.zzfkp.zza(com.google.android.gms.internal.ads.zzfkq.zza(zzfkuVarZzn, zzo(zzecoVar.toString()), zzflbVarZzp, zzflbVarZzp2, true), zzfkrVarZzc), zzfkrVarZzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static com.google.android.gms.internal.ads.zzfku zzn(java.lang.String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return com.google.android.gms.internal.ads.zzfku.HTML_DISPLAY;
        }
        if (b == 1) {
            return com.google.android.gms.internal.ads.zzfku.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzfku.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static com.google.android.gms.internal.ads.zzfkx zzo(java.lang.String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return com.google.android.gms.internal.ads.zzfkx.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? com.google.android.gms.internal.ads.zzfkx.UNSPECIFIED : com.google.android.gms.internal.ads.zzfkx.ONE_PIXEL;
        }
        return com.google.android.gms.internal.ads.zzfkx.DEFINED_BY_JAVASCRIPT;
    }

    private static com.google.android.gms.internal.ads.zzflb zzp(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE.equals(str)) {
            return com.google.android.gms.internal.ads.zzflb.NATIVE;
        }
        return "javascript".equals(str) ? com.google.android.gms.internal.ads.zzflb.JAVASCRIPT : com.google.android.gms.internal.ads.zzflb.NONE;
    }

    private static final java.lang.Object zzq(com.google.android.gms.internal.ads.zzeck zzeckVar) {
        try {
            return zzeckVar.zza();
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final com.google.android.gms.internal.ads.zzecr zza(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final com.google.android.gms.internal.ads.zzeco zzecoVar, final com.google.android.gms.internal.ads.zzecn zzecnVar, final java.lang.String str5) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() || !com.google.android.gms.internal.ads.zzfkn.zzb()) {
            return null;
        }
        final java.lang.String str6 = "";
        final java.lang.String str7 = "javascript";
        final java.lang.String str8 = "Google";
        return (com.google.android.gms.internal.ads.zzecr) zzq(new com.google.android.gms.internal.ads.zzeck(str8, str, str7, zzecnVar, str4, webView, str5, str6, zzecoVar) { // from class: com.google.android.gms.internal.ads.zzeca
            public final /* synthetic */ java.lang.String zzb;
            public final /* synthetic */ com.google.android.gms.internal.ads.zzecn zzd;
            public final /* synthetic */ java.lang.String zze;
            public final /* synthetic */ android.webkit.WebView zzf;
            public final /* synthetic */ java.lang.String zzg;
            public final /* synthetic */ com.google.android.gms.internal.ads.zzeco zzi;
            public final /* synthetic */ java.lang.String zza = "Google";
            public final /* synthetic */ java.lang.String zzc = "javascript";
            public final /* synthetic */ java.lang.String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzecnVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzecoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeck
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzecl.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final com.google.android.gms.internal.ads.zzecr zzb(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final com.google.android.gms.internal.ads.zzeco zzecoVar, final com.google.android.gms.internal.ads.zzecn zzecnVar, final java.lang.String str6) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() || !com.google.android.gms.internal.ads.zzfkn.zzb()) {
            return null;
        }
        final java.lang.String str7 = "";
        final java.lang.String str8 = "javascript";
        return (com.google.android.gms.internal.ads.zzecr) zzq(new com.google.android.gms.internal.ads.zzeck(str5, str, str8, str4, zzecnVar, webView, str6, str7, zzecoVar) { // from class: com.google.android.gms.internal.ads.zzecd
            public final /* synthetic */ java.lang.String zza;
            public final /* synthetic */ java.lang.String zzb;
            public final /* synthetic */ java.lang.String zzd;
            public final /* synthetic */ com.google.android.gms.internal.ads.zzecn zze;
            public final /* synthetic */ android.webkit.WebView zzf;
            public final /* synthetic */ java.lang.String zzg;
            public final /* synthetic */ com.google.android.gms.internal.ads.zzeco zzi;
            public final /* synthetic */ java.lang.String zzc = "javascript";
            public final /* synthetic */ java.lang.String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzecnVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzecoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeck
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzecl.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final com.google.android.gms.internal.ads.zzfla zze(final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, final android.webkit.WebView webView, boolean z) {
        final boolean z2 = true;
        return (com.google.android.gms.internal.ads.zzfla) zzq(new com.google.android.gms.internal.ads.zzeck(webView, z2) { // from class: com.google.android.gms.internal.ads.zzeci
            public final /* synthetic */ android.webkit.WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeck
            public final java.lang.Object zza() {
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zza;
                return com.google.android.gms.internal.ads.zzfla.zzb(com.google.android.gms.internal.ads.zzflc.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final java.lang.String zzf(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue()) {
            return (java.lang.String) zzq(new com.google.android.gms.internal.ads.zzeck() { // from class: com.google.android.gms.internal.ads.zzecg
                @Override // com.google.android.gms.internal.ads.zzeck
                public final java.lang.Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzg(final com.google.android.gms.internal.ads.zzfkp zzfkpVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() && com.google.android.gms.internal.ads.zzfkn.zzb()) {
                    zzfkpVar.zzb(view, com.google.android.gms.internal.ads.zzfkw.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzh(final com.google.android.gms.internal.ads.zzfla zzflaVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.lang.Runnable
            public final void run() {
                zzflaVar.zzf(view, com.google.android.gms.internal.ads.zzfkw.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzi(final com.google.android.gms.internal.ads.zzfkp zzfkpVar) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() && com.google.android.gms.internal.ads.zzfkn.zzb()) {
                    zzfkpVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzj(final com.google.android.gms.internal.ads.zzfkp zzfkpVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() && com.google.android.gms.internal.ads.zzfkn.zzb()) {
                    zzfkpVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzk(final com.google.android.gms.internal.ads.zzfkp zzfkpVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue() && com.google.android.gms.internal.ads.zzfkn.zzb()) {
            java.util.Objects.requireNonNull(zzfkpVar);
            zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzecc
                @Override // java.lang.Runnable
                public final void run() {
                    zzfkpVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final boolean zzl(final android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue()) {
            java.lang.Boolean bool = (java.lang.Boolean) zzq(new com.google.android.gms.internal.ads.zzeck() { // from class: com.google.android.gms.internal.ads.zzece
                @Override // com.google.android.gms.internal.ads.zzeck
                public final java.lang.Object zza() {
                    if (com.google.android.gms.internal.ads.zzfkn.zzb()) {
                        return true;
                    }
                    com.google.android.gms.internal.ads.zzfkn.zza(context);
                    return java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.zzfkn.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzm(final com.google.android.gms.internal.ads.zzfla zzflaVar, final com.google.android.gms.internal.ads.zzcfo zzcfoVar) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final void run() {
                zzflaVar.zzg(zzcfoVar);
            }
        });
    }
}
