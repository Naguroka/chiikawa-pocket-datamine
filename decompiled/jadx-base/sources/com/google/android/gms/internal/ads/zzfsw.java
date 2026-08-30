package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfsw {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzfto zzc = new com.google.android.gms.internal.ads.zzfto("OverlayDisplayService");
    private static final android.content.Intent zzd = new android.content.Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final com.google.android.gms.internal.ads.zzftn zza;
    private final java.lang.String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfss] */
    zzfsw(android.content.Context context) {
        if (com.google.android.gms.internal.ads.zzftq.zza(context)) {
            this.zza = new com.google.android.gms.internal.ads.zzftn(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new java.lang.Object() { // from class: com.google.android.gms.internal.ads.zzfss
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    static /* synthetic */ boolean zzh(java.lang.String str) {
        return !zzk(str);
    }

    private static void zzi(java.lang.String str, java.util.function.Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean zzj(com.google.android.gms.internal.ads.zzftb zzftbVar, java.lang.String str, java.util.List list) {
        if (list.stream().anyMatch(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.ads.zzfst
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfsw.zzh((java.lang.String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new java.lang.Object[0]);
        com.google.android.gms.internal.ads.zzfsz zzfszVarZzc = com.google.android.gms.internal.ads.zzfta.zzc();
        zzfszVarZzc.zzb(8160);
        zzftbVar.zza(zzfszVarZzc.zzc());
        return false;
    }

    private static boolean zzk(java.lang.String str) {
        return com.google.android.gms.internal.ads.zzfve.zzc(str).trim().isEmpty();
    }

    final void zza() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new java.lang.Object[0]);
        this.zza.zzn();
    }

    final void zzb(final com.google.android.gms.internal.ads.zzfsd zzfsdVar, final com.google.android.gms.internal.ads.zzftb zzftbVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftbVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", java.util.Arrays.asList(zzfsdVar.zzb(), zzfsdVar.zza()))) {
            this.zza.zzi(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(zzfsdVar, zzftbVar);
                }
            });
        }
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfsd zzfsdVar, com.google.android.gms.internal.ads.zzftb zzftbVar) {
        try {
            com.google.android.gms.internal.ads.zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            com.google.android.gms.internal.ads.zzfrn zzfrnVar = (com.google.android.gms.internal.ads.zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfsdVar.zzb(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsp
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }
            });
            zzi(zzfsdVar.zza(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsq
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("appId", (java.lang.String) obj);
                }
            });
            zzfrnVar.zze(bundle, new com.google.android.gms.internal.ads.zzfsv(this, zzftbVar));
        } catch (android.os.RemoteException e) {
            zzc.zzb(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfsy zzfsyVar, com.google.android.gms.internal.ads.zzftb zzftbVar) {
        try {
            com.google.android.gms.internal.ads.zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            com.google.android.gms.internal.ads.zzfrn zzfrnVar = (com.google.android.gms.internal.ads.zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfsyVar.zzf());
            zzi(zzfsyVar.zzg(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsu
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("adFieldEnifd", (java.lang.String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfsyVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfsyVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfsyVar.zze());
            zzi(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsi
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("deeplinkUrl", (java.lang.String) obj);
                }
            });
            zzi(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsj
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }
            });
            zzi(zzfsyVar.zzh(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsk
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("appId", (java.lang.String) obj);
                }
            });
            zzi(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsl
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (java.lang.String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfrnVar.zzf(str, bundle, new com.google.android.gms.internal.ads.zzfsv(this, zzftbVar));
        } catch (android.os.RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzftd zzftdVar, int i, com.google.android.gms.internal.ads.zzftb zzftbVar) {
        try {
            com.google.android.gms.internal.ads.zzftn zzftnVar = this.zza;
            zzftnVar.getClass();
            com.google.android.gms.internal.ads.zzfrn zzfrnVar = (com.google.android.gms.internal.ads.zzfrn) zzftnVar.zzc();
            if (zzfrnVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzftdVar.zzb(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsh
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i2 = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }
            });
            zzi(zzftdVar.zza(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfsn
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i2 = com.google.android.gms.internal.ads.zzfsw.zzb;
                    bundle.putString("appId", (java.lang.String) obj);
                }
            });
            zzfrnVar.zzg(bundle, new com.google.android.gms.internal.ads.zzfsv(this, zzftbVar));
        } catch (android.os.RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", java.lang.Integer.valueOf(i), this.zze);
        }
    }

    final void zzf(final com.google.android.gms.internal.ads.zzfsy zzfsyVar, final com.google.android.gms.internal.ads.zzftb zzftbVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftbVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", java.util.Arrays.asList(null, zzfsyVar.zzh()))) {
            this.zza.zzi(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd(zzfsyVar, zzftbVar);
                }
            });
        }
    }

    final void zzg(final com.google.android.gms.internal.ads.zzftd zzftdVar, final com.google.android.gms.internal.ads.zzftb zzftbVar, final int i) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftbVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", java.util.Arrays.asList(zzftdVar.zzb(), zzftdVar.zza()))) {
            this.zza.zzi(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfso
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzftdVar, i, zzftbVar);
                }
            });
        }
    }
}
