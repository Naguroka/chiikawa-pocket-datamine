package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbf implements android.content.ServiceConnection {
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zza;
    private final com.android.billingclient.api.BillingClientStateListener zzb;
    private final com.google.android.gms.internal.play_billing.zzbi zzc;
    private final com.google.android.gms.internal.play_billing.zzbi zzd;
    private final int zze;

    /* synthetic */ zzbf(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.BillingClientStateListener billingClientStateListener, int i, com.android.billingclient.api.zzbp zzbpVar) {
        java.util.Objects.requireNonNull(billingClientImpl);
        this.zza = billingClientImpl;
        this.zzc = com.google.android.gms.internal.play_billing.zzbi.zzc(billingClientImpl.zzJ);
        this.zzd = com.google.android.gms.internal.play_billing.zzbi.zzc(billingClientImpl.zzJ);
        this.zzb = billingClientStateListener;
        this.zze = i;
    }

    public static /* synthetic */ java.lang.Object zza(com.android.billingclient.api.zzbf zzbfVar) {
        android.os.Bundle bundle;
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        com.google.android.gms.internal.play_billing.zzie zzieVar;
        com.android.billingclient.api.BillingClientImpl billingClientImpl = zzbfVar.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb != 3) {
                boolean z = billingClientImpl.zzb == 1;
                if (android.text.TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new android.os.Bundle();
                    bundle.putString("accountName", null);
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, billingClientImpl.zzc, billingClientImpl.zzd, billingClientImpl.zzI.longValue());
                }
                com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
                synchronized (billingClientImpl.zza) {
                    zzamVar = billingClientImpl.zzi;
                }
                if (zzamVar == null) {
                    com.android.billingclient.api.BillingClientImpl billingClientImpl2 = zzbfVar.zza;
                    billingClientImpl2.zzaS(0);
                    int i = zzbfVar.zze;
                    com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL;
                    com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
                    billingClientImpl2.zzaR(zzieVar3, billingResult, i);
                    zzbfVar.zzg(billingResult);
                } else {
                    com.android.billingclient.api.BillingClientImpl billingClientImpl3 = zzbfVar.zza;
                    java.lang.String packageName = billingClientImpl3.zzg.getPackageName();
                    int iZzw = 3;
                    int i2 = 25;
                    while (true) {
                        if (i2 < 3) {
                            i2 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iZzw = zzamVar.zzw(i2, packageName, "subs");
                            } catch (java.lang.Exception e) {
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                if (e instanceof android.os.DeadObjectException) {
                                    zzieVar = com.google.android.gms.internal.play_billing.zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                } else if (e instanceof android.os.RemoteException) {
                                    zzieVar = com.google.android.gms.internal.play_billing.zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                } else {
                                    zzieVar = e instanceof java.lang.SecurityException ? com.google.android.gms.internal.play_billing.zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : com.google.android.gms.internal.play_billing.zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                }
                                java.lang.String strZza = zzieVar.equals(com.google.android.gms.internal.play_billing.zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? com.android.billingclient.api.zzcg.zza(e) : null;
                                zzbfVar.zza.zzaS(0);
                                zzbfVar.zzf(com.android.billingclient.api.BillingClientImpl.zzl(e), zzieVar, strZza, z);
                                zzbfVar.zzg(com.android.billingclient.api.BillingClientImpl.zzl(e));
                            }
                        } else {
                            iZzw = zzamVar.zzc(i2, packageName, "subs", bundle);
                        }
                        if (iZzw == 0) {
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i2);
                            break;
                        }
                        i2--;
                    }
                    billingClientImpl3.zzl = i2 >= 5;
                    billingClientImpl3.zzk = i2 >= 3;
                    if (i2 < 3) {
                        zzieVar2 = com.google.android.gms.internal.play_billing.zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    for (int i3 = 25; i3 >= 3; i3--) {
                        iZzw = bundle == null ? zzamVar.zzw(i3, packageName, "inapp") : zzamVar.zzc(i3, packageName, "inapp", bundle);
                        if (iZzw == 0) {
                            billingClientImpl3.zzm = i3;
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + billingClientImpl3.zzm);
                            break;
                        }
                    }
                    com.android.billingclient.api.BillingClientImpl.zzac(billingClientImpl3, billingClientImpl3.zzm);
                    if (billingClientImpl3.zzm < 3) {
                        zzieVar2 = com.google.android.gms.internal.play_billing.zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    com.android.billingclient.api.BillingClientImpl.zzae(billingClientImpl3, iZzw);
                    if (iZzw != 0) {
                        com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzb;
                        zzbfVar.zzf(billingResult2, zzieVar2, null, z);
                        zzbfVar.zzg(billingResult2);
                    } else {
                        try {
                            java.lang.Long lZze = zzbfVar.zze(z);
                            if (z) {
                                com.google.android.gms.internal.play_billing.zzhz zzhzVarZzc = com.google.android.gms.internal.play_billing.zzib.zzc();
                                zzhzVarZzc.zzo(6);
                                com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
                                int i4 = zzbfVar.zze;
                                zzjtVarZzc.zza(i4 > 0);
                                zzjtVarZzc.zzl(i4);
                                if (lZze != null) {
                                    zzjtVarZzc.zzm(lZze.longValue());
                                }
                                com.android.billingclient.api.BillingClientImpl billingClientImpl4 = zzbfVar.zza;
                                zzhzVarZzc.zzn(zzjtVarZzc);
                                billingClientImpl4.zzaQ((com.google.android.gms.internal.play_billing.zzib) zzhzVarZzc.zze());
                            } else {
                                com.google.android.gms.internal.play_billing.zzjm zzjmVarZzc = com.google.android.gms.internal.play_billing.zzjo.zzc();
                                com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
                                zzicVarZzc.zzo(0);
                                zzjmVarZzc.zza(zzicVarZzc);
                                if (lZze != null) {
                                    zzjmVarZzc.zzl(lZze.longValue());
                                }
                                zzbfVar.zza.zzh.zzj((com.google.android.gms.internal.play_billing.zzjo) zzjmVarZzc.zze());
                            }
                        } catch (java.lang.Throwable th) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
                        }
                        zzbfVar.zzg(com.android.billingclient.api.zzcj.zzi);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void zzb(com.android.billingclient.api.zzbf zzbfVar) {
        com.android.billingclient.api.BillingClientImpl billingClientImpl = zzbfVar.zza;
        billingClientImpl.zzaS(0);
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzaR(zzieVar, billingResult, zzbfVar.zze);
        zzbfVar.zzg(billingResult);
    }

    private final java.lang.Long zze(boolean z) {
        if (z) {
            com.google.android.gms.internal.play_billing.zzbi zzbiVar = this.zzc;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return java.lang.Long.valueOf(zzbiVar.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
        }
        com.google.android.gms.internal.play_billing.zzbi zzbiVar2 = this.zzd;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return java.lang.Long.valueOf(zzbiVar2.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
    }

    private final void zzf(com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.String str, boolean z) {
        try {
            com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
            zzicVarZzc.zzo(billingResult.getResponseCode());
            zzicVarZzc.zzl(billingResult.getDebugMessage());
            zzicVarZzc.zzn(zzieVar);
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            java.lang.Long lZze = zze(z);
            if (!z) {
                com.google.android.gms.internal.play_billing.zzjm zzjmVarZzc = com.google.android.gms.internal.play_billing.zzjo.zzc();
                zzjmVarZzc.zza(zzicVarZzc);
                if (lZze != null) {
                    zzjmVarZzc.zzl(lZze.longValue());
                }
                this.zza.zzh.zzj((com.google.android.gms.internal.play_billing.zzjo) zzjmVarZzc.zze());
                return;
            }
            com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
            int i = this.zze;
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            if (lZze != null) {
                zzjtVarZzc.zzm(lZze.longValue());
            }
            com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
            com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(6);
            zzhvVarZzc.zzo(zzjtVarZzc);
            billingClientImpl.zzaO((com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzg(com.android.billingclient.api.BillingResult billingResult) {
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            try {
                this.zzb.onBillingSetupFinished(billingResult);
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service died.");
        try {
            com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
            if (com.android.billingclient.api.BillingClientImpl.zzai(billingClientImpl)) {
                com.android.billingclient.api.zzch zzchVar = billingClientImpl.zzh;
                com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
                zzhvVarZzc.zzp(6);
                com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
                zzicVarZzc.zzn(com.google.android.gms.internal.play_billing.zzie.BINDING_DIED);
                zzhvVarZzc.zzl(zzicVarZzc);
                com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
                int i = this.zze;
                zzjtVarZzc.zza(i > 0);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                zzchVar.zza((com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze());
            } else {
                billingClientImpl.zzh.zzi(com.google.android.gms.internal.play_billing.zzij.zzd());
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
        com.android.billingclient.api.BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            if (billingClientImpl2.zzb != 3 && billingClientImpl2.zzb != 0) {
                billingClientImpl2.zzaS(0);
                billingClientImpl2.zzaV();
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service connected.");
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            billingClientImpl.zzi = com.google.android.gms.internal.play_billing.zzal.zzs(iBinder);
            if (com.android.billingclient.api.BillingClientImpl.zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzbd
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.android.billingclient.api.zzbf.zza(this.zza);
                    return null;
                }
            }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.zzbf.zzb(this.zza);
                }
            }, billingClientImpl.zzan(), billingClientImpl.zzF()) == null) {
                int i = this.zze;
                com.android.billingclient.api.BillingResult billingResultZzaq = billingClientImpl.zzaq();
                billingClientImpl.zzaR(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, billingResultZzaq, i);
                zzg(billingResultZzaq);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
            if (com.android.billingclient.api.BillingClientImpl.zzai(billingClientImpl)) {
                com.android.billingclient.api.zzch zzchVar = billingClientImpl.zzh;
                com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
                zzhvVarZzc.zzp(6);
                com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
                zzicVarZzc.zzn(com.google.android.gms.internal.play_billing.zzie.SERVICE_DISCONNECTED);
                zzhvVarZzc.zzl(zzicVarZzc);
                com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
                int i = this.zze;
                zzjtVarZzc.zza(i > 0);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                zzchVar.zza((com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze());
            } else {
                billingClientImpl.zzh.zzk(com.google.android.gms.internal.play_billing.zzjs.zzd());
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
        com.google.android.gms.internal.play_billing.zzbi zzbiVar = this.zzd;
        zzbiVar.zzd();
        zzbiVar.zze();
        com.android.billingclient.api.BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            if (billingClientImpl2.zzb == 3) {
                return;
            }
            billingClientImpl2.zzaS(0);
            try {
                this.zzb.onBillingServiceDisconnected();
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
            }
        }
    }

    public final void zzc() {
        com.google.android.gms.internal.play_billing.zzbi zzbiVar = this.zzc;
        zzbiVar.zzd();
        zzbiVar.zze();
    }

    final boolean zzd() {
        return this.zze > 0;
    }
}
