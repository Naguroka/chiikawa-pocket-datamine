package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
class BillingClientImpl extends com.android.billingclient.api.BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private com.android.billingclient.api.PendingPurchasesParams zzD;
    private boolean zzE;
    private boolean zzF;
    private volatile com.android.billingclient.api.BillingClientStateListener zzG;
    private java.util.concurrent.ExecutorService zzH;
    private final java.lang.Long zzI;
    private com.google.android.gms.internal.play_billing.zzbl zzJ;
    private final java.lang.Object zza;
    private volatile int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final android.os.Handler zze;
    private volatile com.android.billingclient.api.zzs zzf;
    private android.content.Context zzg;
    private com.android.billingclient.api.zzch zzh;
    private volatile com.google.android.gms.internal.play_billing.zzam zzi;
    private volatile com.android.billingclient.api.zzbf zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private BillingClientImpl(android.app.Activity activity, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, java.lang.String str, com.android.billingclient.api.BillingClient.Builder builder) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new com.android.billingclient.api.zzbq(), str, null, null, null, null, builder);
    }

    private void initialize(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.zzb zzbVar, java.lang.String str, com.android.billingclient.api.zzch zzchVar, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zziq zziqVarZzc = com.google.android.gms.internal.play_billing.zzis.zzc();
        zziqVarZzc.zzs(str);
        java.lang.String str2 = this.zzd;
        if (str2 != null) {
            zziqVarZzc.zzt(str2);
        }
        zziqVarZzc.zzq(this.zzg.getPackageName());
        zziqVarZzc.zzn(this.zzI.longValue());
        zziqVarZzc.zzr(builder.zza);
        zziqVarZzc.zza(android.os.Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (zzchVar != null) {
            this.zzh = zzchVar;
        } else {
            this.zzh = new com.android.billingclient.api.zzcl(this.zzg, (com.google.android.gms.internal.play_billing.zzis) zziqVarZzc.zze());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, purchasesUpdatedListener, null, zzbVar, null, this.zzh);
        this.zzD = pendingPurchasesParams;
        this.zzF = zzbVar != null;
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbl zzblVar = builder.zzb;
        this.zzE = builder.zza;
    }

    private int launchBillingFlowCpp(android.app.Activity activity, com.android.billingclient.api.BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        startConnection(new com.android.billingclient.api.zzbq(j));
    }

    public static /* synthetic */ java.lang.Void zzA(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws java.lang.Exception {
        billingClientImpl.zzaA(externalOfferAvailabilityListener);
        return null;
    }

    public static /* synthetic */ java.lang.Void zzB(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        billingClientImpl.zzaC(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ java.lang.Void zzC(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, java.lang.String str) throws java.lang.Exception {
        billingClientImpl.zzay(externalOfferReportingDetailsListener, null);
        return null;
    }

    public static /* synthetic */ java.lang.Void zzD(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws java.lang.Exception {
        billingClientImpl.zzax(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ java.lang.Void zzE(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws java.lang.Exception {
        billingClientImpl.zzaz(alternativeBillingOnlyAvailabilityListener);
        return null;
    }

    static java.util.concurrent.Future zzG(java.util.concurrent.Callable callable, long j, final java.lang.Runnable runnable, android.os.Handler handler, java.util.concurrent.ExecutorService executorService) {
        try {
            final java.util.concurrent.Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    java.lang.Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static /* synthetic */ void zzH(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener, com.android.billingclient.api.ConsumeParams consumeParams) {
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzI(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbt.zzk());
    }

    public static /* synthetic */ void zzJ(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) {
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* synthetic */ void zzL(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* synthetic */ void zzN(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) {
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
    }

    public static /* synthetic */ void zzP(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.BillingResult billingResult) {
        if (billingClientImpl.zzf.zzd() != null) {
            billingClientImpl.zzf.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.android.billingclient.api.zzs zzsVar = billingClientImpl.zzf;
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final /* synthetic */ java.lang.Void zzaA(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!zzaX(30000L)) {
                zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzB) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzamVar.zzq(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbm(externalOfferAvailabilityListener, this.zzh, this.zzm, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support launching external offer flow.");
                zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzA, com.google.android.gms.internal.play_billing.zzie.LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ java.lang.Void zzaB(com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            if (zzamVar == null) {
                zzaM(alternativeBillingOnlyInformationDialogListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
            } else {
                zzamVar.zzm(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbi(new java.lang.ref.WeakReference(activity), resultReceiver, null));
            }
        } catch (android.os.DeadObjectException e) {
            zzaM(alternativeBillingOnlyInformationDialogListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaM(alternativeBillingOnlyInformationDialogListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ java.lang.Void zzaC(com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            if (zzamVar == null) {
                zzaK(externalOfferInformationDialogListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
            } else {
                zzamVar.zzo(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbk(new java.lang.ref.WeakReference(activity), resultReceiver, null));
            }
        } catch (android.os.DeadObjectException e) {
            zzaK(externalOfferInformationDialogListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaK(externalOfferInformationDialogListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final void zzaD(com.android.billingclient.api.ConsumeParams consumeParams, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        int iZza;
        java.lang.String strZzj;
        java.lang.String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            if (zzamVar == null) {
                zzaG(consumeResponseListener, purchaseToken, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                return;
            }
            if (this.zzp) {
                java.lang.String packageName = this.zzg.getPackageName();
                boolean z = this.zzp;
                java.lang.String str = this.zzc;
                java.lang.String str2 = this.zzd;
                long jLongValue = this.zzI.longValue();
                android.os.Bundle bundle = new android.os.Bundle();
                if (z) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                }
                android.os.Bundle bundleZze = zzamVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundleZze, "BillingClient");
            } else {
                iZza = zzamVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                strZzj = "";
            }
            com.android.billingclient.api.BillingResult billingResultZza = com.android.billingclient.api.zzcj.zza(iZza, strZzj);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
            } else {
                zzaG(consumeResponseListener, purchaseToken, billingResultZza, com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + iZza, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaG(consumeResponseListener, purchaseToken, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
        } catch (java.lang.Exception e2) {
            zzaG(consumeResponseListener, purchaseToken, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e2);
        }
    }

    private final void zzaE(com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        zzbf(zzieVar, 3, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaF(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 14, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    private final void zzaG(com.android.billingclient.api.ConsumeResponseListener consumeResponseListener, java.lang.String str, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.String str2, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str2, exc);
        zzbf(zzieVar, 4, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaH(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 15, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaI(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 24, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 23, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaK(com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 25, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzaL(com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "getBillingConfig got an exception.", exc);
        zzbf(zzieVar, 13, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaM(com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        zzbf(zzieVar, 16, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzaN(int i, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.zzhx zzhxVar;
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "showInAppMessages error.", exc);
        com.android.billingclient.api.zzch zzchVar = this.zzh;
        java.lang.String strZza = com.android.billingclient.api.zzcg.zza(exc);
        try {
            com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
            zzicVarZzc.zzo(i);
            if (zzieVar != null) {
                zzicVarZzc.zzn(zzieVar);
            }
            if (strZza != null) {
                zzicVarZzc.zza(strZza);
            }
            com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(30);
            zzhxVar = (com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            zzhxVar = null;
        }
        zzchVar.zza(zzhxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaO(com.google.android.gms.internal.play_billing.zzhx zzhxVar) {
        try {
            this.zzh.zzb(zzhxVar, this.zzm);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaP(com.google.android.gms.internal.play_billing.zzhx zzhxVar, long j, boolean z) {
        try {
            this.zzh.zze(zzhxVar, this.zzm, j, z);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(com.google.android.gms.internal.play_billing.zzib zzibVar) {
        try {
            this.zzh.zzg(zzibVar, this.zzm);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(com.google.android.gms.internal.play_billing.zzie zzieVar, com.android.billingclient.api.BillingResult billingResult, int i) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            com.google.android.gms.internal.play_billing.zzhv zzhvVar = (com.google.android.gms.internal.play_billing.zzhv) com.android.billingclient.api.zzcg.zzb(zzieVar, 6, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED).zzm();
            com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            zzhvVar.zzo(zzjtVarZzc);
            zzaO((com.google.android.gms.internal.play_billing.zzhx) zzhvVar.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaS(int i) {
        synchronized (this.zza) {
            if (this.zzb == 3) {
                return;
            }
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Setting clientState from " + zzaZ(this.zzb) + " to " + zzaZ(i));
            this.zzb = i;
        }
    }

    private final synchronized void zzaT() {
        java.util.concurrent.ExecutorService executorService = this.zzH;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzH = null;
        }
    }

    private final void zzaU(com.android.billingclient.api.BillingClientStateListener billingClientStateListener, int i) {
        com.google.android.gms.internal.play_billing.zzie zzieVar;
        com.android.billingclient.api.BillingResult billingResultZzap;
        com.android.billingclient.api.BillingResult billingResult;
        synchronized (this.zza) {
            if (zzaY()) {
                billingResultZzap = zzap(i);
            } else {
                if (this.zzb == 1) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                    com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.BILLING_CLIENT_CONNECTING;
                    billingResult = com.android.billingclient.api.zzcj.zzd;
                    zzaR(zzieVar2, billingResult, i);
                } else if (this.zzb == 3) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.BILLING_CLIENT_CLOSED;
                    billingResult = com.android.billingclient.api.zzcj.zzj;
                    zzaR(zzieVar3, billingResult, i);
                } else {
                    zzaS(1);
                    if (i == 0) {
                        this.zzG = billingClientStateListener;
                        i = 0;
                    }
                    zzaV();
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Starting in-app billing setup.");
                    this.zzj = new com.android.billingclient.api.zzbf(this, billingClientStateListener, i, null);
                    this.zzj.zzc();
                    android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        zzieVar = com.google.android.gms.internal.play_billing.zzie.INTENT_SERVICE_NOT_FOUND;
                    } else {
                        android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                        if (resolveInfo.serviceInfo != null) {
                            java.lang.String str = resolveInfo.serviceInfo.packageName;
                            java.lang.String str2 = resolveInfo.serviceInfo.name;
                            if (!java.util.Objects.equals(str, "com.android.vending") || str2 == null) {
                                zzieVar = com.google.android.gms.internal.play_billing.zzie.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                                android.content.Intent intent2 = new android.content.Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                synchronized (this.zza) {
                                    if (this.zzb == 2) {
                                        billingResultZzap = zzap(i);
                                    } else if (this.zzb != 1) {
                                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        com.google.android.gms.internal.play_billing.zzie zzieVar4 = com.google.android.gms.internal.play_billing.zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                        billingResult = com.android.billingclient.api.zzcj.zzj;
                                        zzaR(zzieVar4, billingResult, i);
                                    } else {
                                        com.android.billingclient.api.zzbf zzbfVar = this.zzj;
                                        if ((i <= 0 || android.os.Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbfVar, 1) : this.zzg.bindService(intent2, 1, zzF(), zzbfVar)) {
                                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service was bonded successfully.");
                                            billingResultZzap = null;
                                        } else {
                                            zzieVar = com.google.android.gms.internal.play_billing.zzie.BILLING_SERVICE_BLOCKED;
                                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                        }
                                    }
                                }
                            }
                        } else {
                            zzieVar = com.google.android.gms.internal.play_billing.zzie.INVALID_PHONESKY_PACKAGE;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    zzaS(0);
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service unavailable on device.");
                    com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzb;
                    zzaR(zzieVar, billingResult2, i);
                    billingResultZzap = billingResult2;
                }
                billingResultZzap = billingResult;
            }
        }
        if (billingResultZzap != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultZzap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                    this.zzi = null;
                    this.zzj = null;
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzi = null;
                        this.zzj = null;
                    } catch (java.lang.Throwable th2) {
                        this.zzi = null;
                        this.zzj = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzaW(long j) {
        try {
            com.android.billingclient.api.BillingResult billingResult = (com.android.billingclient.api.BillingResult) zzar(1).get(android.os.Build.VERSION.SDK_INT < 29 ? 0L : androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.InterruptedException) {
                java.lang.Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
        }
        return zzaY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzaX(long j) {
        com.google.android.gms.internal.play_billing.zzbi zzbiVarZzb = com.google.android.gms.internal.play_billing.zzbi.zzb(this.zzJ);
        long jZza = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                long jMax = java.lang.Math.max(0L, jZza);
                if (jMax <= 0) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                    return zzaY();
                }
                com.android.billingclient.api.BillingResult billingResult = (com.android.billingclient.api.BillingResult) zzar(i).get(jMax, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (billingResult.getResponseCode() == 0) {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                    return zzaY();
                }
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
                jZza = 30000 - zzbiVarZzb.zza(java.util.concurrent.TimeUnit.MILLISECONDS);
                long jPow = ((long) java.lang.Math.pow(2.0d, i - 1)) * 1000;
                if (jZza < jPow) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return zzaY();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        java.lang.Thread.sleep(jPow);
                        jZza = 30000 - zzbiVarZzb.zza(java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.lang.InterruptedException e) {
                        java.lang.Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (java.lang.Exception e2) {
                if (e2 instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Max retries reached.");
        return zzaY();
    }

    private final boolean zzaY() {
        boolean z;
        synchronized (this.zza) {
            z = false;
            if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                z = true;
            }
        }
        return z;
    }

    private static final java.lang.String zzaZ(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i != 1) {
            return i != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    static /* bridge */ /* synthetic */ void zzac(com.android.billingclient.api.BillingClientImpl billingClientImpl, int i) {
        billingClientImpl.zzm = i;
        billingClientImpl.zzC = i >= 26;
        billingClientImpl.zzB = i >= 24;
        billingClientImpl.zzA = i >= 23;
        billingClientImpl.zzz = i >= 22;
        billingClientImpl.zzy = i >= 21;
        billingClientImpl.zzx = i >= 20;
        billingClientImpl.zzw = i >= 19;
        billingClientImpl.zzv = i >= 18;
        billingClientImpl.zzu = i >= 17;
        billingClientImpl.zzt = i >= 16;
        billingClientImpl.zzs = i >= 15;
        billingClientImpl.zzr = i >= 14;
        billingClientImpl.zzq = i >= 12;
        billingClientImpl.zzp = i >= 9;
        billingClientImpl.zzo = i >= 8;
        billingClientImpl.zzn = i >= 6;
    }

    static /* bridge */ /* synthetic */ void zzae(com.android.billingclient.api.BillingClientImpl billingClientImpl, int i) {
        if (i != 0) {
            billingClientImpl.zzaS(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            billingClientImpl.zzaS(2);
            com.android.billingclient.api.zzs zzsVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
            if (zzsVar != null) {
                zzsVar.zzg(billingClientImpl.zzy);
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzai(com.android.billingclient.api.BillingClientImpl billingClientImpl) {
        boolean z;
        synchronized (billingClientImpl.zza) {
            z = true;
            if (billingClientImpl.zzb != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ android.os.Bundle zzal(int i, java.lang.String str, java.lang.String str2, com.android.billingclient.api.BillingFlowParams billingFlowParams, android.os.Bundle bundle) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            return zzamVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzg(i, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (android.os.DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_EXCEPTION, com.android.billingclient.api.zzcg.zza(e));
        } catch (java.lang.Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_EXCEPTION, com.android.billingclient.api.zzcg.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ android.os.Bundle zzam(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            return zzamVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (android.os.DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_EXCEPTION, com.android.billingclient.api.zzcg.zza(e));
        } catch (java.lang.Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_EXCEPTION, com.android.billingclient.api.zzcg.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Handler zzan() {
        return android.os.Looper.myLooper() == null ? this.zze : new android.os.Handler(android.os.Looper.myLooper());
    }

    private final com.android.billingclient.api.zzbo zzao(com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.String str, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str, exc);
        zzbf(zzieVar, 7, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        return new com.android.billingclient.api.zzbo(billingResult.getResponseCode(), billingResult.getDebugMessage(), new java.util.ArrayList(), new java.util.ArrayList());
    }

    private final com.android.billingclient.api.BillingResult zzap(int i) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        com.google.android.gms.internal.play_billing.zzhz zzhzVarZzc = com.google.android.gms.internal.play_billing.zzib.zzc();
        zzhzVarZzc.zzo(6);
        com.google.android.gms.internal.play_billing.zzjt zzjtVarZzc = com.google.android.gms.internal.play_billing.zzjv.zzc();
        zzjtVarZzc.zzn(true);
        zzjtVarZzc.zza(i > 0);
        zzjtVarZzc.zzl(i);
        zzhzVarZzc.zzn(zzjtVarZzc);
        zzaQ((com.google.android.gms.internal.play_billing.zzib) zzhzVarZzc.zze());
        return com.android.billingclient.api.zzcj.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.BillingResult zzaq() {
        com.android.billingclient.api.BillingResult billingResult;
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i = 0; i < 2; i++) {
                if (this.zzb == iArr[i]) {
                    billingResult = com.android.billingclient.api.zzcj.zzj;
                }
            }
            billingResult = com.android.billingclient.api.zzcj.zzh;
        }
        return billingResult;
    }

    private final com.google.android.gms.internal.play_billing.zzcz zzar(final int i) {
        if (this.zzE && !zzaY()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzu
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final java.lang.Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return com.android.billingclient.api.BillingClientImpl.zzq(this.zza, i, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcu.zza(com.android.billingclient.api.zzcj.zzi);
    }

    private final /* synthetic */ java.lang.Object zzas(com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!zzaX(30000L)) {
                com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
                com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
                zzbd(zzieVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (android.text.TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.EMPTY_PURCHASE_TOKEN;
                com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzg;
                zzbd(zzieVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.zzp) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar != null) {
                    java.lang.String packageName = this.zzg.getPackageName();
                    java.lang.String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    java.lang.String str = this.zzc;
                    java.lang.String str2 = this.zzd;
                    long jLongValue = this.zzI.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    android.os.Bundle bundleZzd = zzamVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzcj.zza(com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzj(bundleZzd, "BillingClient")));
                    return null;
                }
                zzaE(acknowledgePurchaseResponseListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
            } else {
                com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.API_VERSION_NOT_V9;
                com.android.billingclient.api.BillingResult billingResult3 = com.android.billingclient.api.zzcj.zza;
                zzbd(zzieVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (android.os.DeadObjectException e) {
            zzaE(acknowledgePurchaseResponseListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e);
            return null;
        } catch (java.lang.Exception e2) {
            zzaE(acknowledgePurchaseResponseListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e2);
            return null;
        }
    }

    private final /* synthetic */ java.lang.Object zzat(com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        com.android.billingclient.api.zzbp zzbpVar = null;
        try {
            if (!zzaX(30000L)) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
                com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
                com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
                zzbd(zzieVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.zzv) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    zzaL(billingConfigResponseListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
                } else {
                    java.lang.String packageName = this.zzg.getPackageName();
                    java.lang.String str = this.zzc;
                    java.lang.String str2 = this.zzd;
                    long jLongValue = this.zzI.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    zzamVar.zzn(18, packageName, bundle, new com.android.billingclient.api.zzbj(billingConfigResponseListener, this.zzh, this.zzm, zzbpVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support get billing config.");
                com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.GET_BILLING_CONFIG_NOT_SUPPORTED;
                com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzy;
                zzbd(zzieVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaL(billingConfigResponseListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaL(billingConfigResponseListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ java.lang.Object zzau(android.os.Bundle bundle, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            if (zzamVar == null) {
                zzaN(-1, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
            } else {
                zzamVar.zzr(12, this.zzg.getPackageName(), bundle, new com.android.billingclient.api.zzbn(new java.lang.ref.WeakReference(activity), resultReceiver, null));
            }
        } catch (android.os.DeadObjectException e) {
            zzaN(-1, com.google.android.gms.internal.play_billing.zzie.SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaN(6, com.google.android.gms.internal.play_billing.zzie.SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final java.lang.String zzav(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams) {
        if (android.text.TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    private static java.lang.String zzaw() {
        try {
            return (java.lang.String) java.lang.Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private final /* synthetic */ java.lang.Void zzax(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        com.android.billingclient.api.zzbp zzbpVar = null;
        try {
            if (!zzaX(30000L)) {
                zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzamVar.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbg(alternativeBillingOnlyReportingDetailsListener, this.zzh, this.zzm, zzbpVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support alternative billing only.");
                zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzD, com.google.android.gms.internal.play_billing.zzie.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ java.lang.Void zzay(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, java.lang.String str) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        com.android.billingclient.api.zzbp zzbpVar = null;
        try {
            if (!zzaX(30000L)) {
                zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzz) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
                } else {
                    java.lang.String packageName = this.zzg.getPackageName();
                    long j = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    java.lang.String str2 = this.zzc;
                    java.lang.String str3 = this.zzd;
                    long jLongValue = this.zzI.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str3, jLongValue);
                    bundle.putLong("appInstallTimeMillis", j);
                    zzamVar.zzl(22, packageName, bundle, new com.android.billingclient.api.zzbh(externalOfferReportingDetailsListener, this.zzh, this.zzm, zzbpVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support external offer.");
                zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzt, com.google.android.gms.internal.play_billing.zzie.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final /* synthetic */ java.lang.Void zzaz(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws java.lang.Exception {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!zzaX(30000L)) {
                zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzamVar.zzp(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbl(alternativeBillingOnlyAvailabilityListener, this.zzh, this.zzm, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support alternative billing only.");
                zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzD, com.google.android.gms.internal.play_billing.zzie.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (android.os.DeadObjectException e) {
            zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
        } catch (java.lang.Exception e2) {
            zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e2);
        }
        return null;
    }

    private final com.android.billingclient.api.zzcw zzba(int i, com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.String str, java.lang.Exception exc) {
        zzbf(zzieVar, 9, billingResult, com.android.billingclient.api.zzcg.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str, exc);
        return new com.android.billingclient.api.zzcw(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x020d A[LOOP:0: B:92:0x004d->B:78:0x020d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9 A[SYNTHETIC] */
    public final com.android.billingclient.api.zzcw zzbb(java.lang.String str, boolean z, int i) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        int i2;
        int i3;
        android.os.Bundle bundleZzi;
        com.google.android.gms.internal.play_billing.zzie zzieVar;
        com.android.billingclient.api.BillingResult billingResult;
        com.google.android.gms.internal.play_billing.zzie zzieVar2;
        java.util.ArrayList<java.lang.String> stringArrayList;
        java.util.ArrayList<java.lang.String> stringArrayList2;
        java.util.ArrayList<java.lang.String> stringArrayList3;
        boolean z2;
        com.android.billingclient.api.Purchase purchase;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z3 = this.zzp;
        boolean z4 = this.zzw;
        boolean zIsEnabledForOneTimeProducts = this.zzD.isEnabledForOneTimeProducts();
        boolean zIsEnabledForPrepaidPlans = this.zzD.isEnabledForPrepaidPlans();
        long jLongValue = this.zzI.longValue();
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, this.zzc, this.zzd, jLongValue);
        int i4 = 1;
        if (z3 && zIsEnabledForOneTimeProducts) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z4 && zIsEnabledForPrepaidPlans) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        java.lang.String string = null;
        while (true) {
            try {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    return zzba(9, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (this.zzp) {
                    if (this.zzC) {
                        i3 = 26;
                    } else if (this.zzB) {
                        i3 = 24;
                    } else {
                        if (this.zzw) {
                            i3 = 19;
                        } else {
                            i2 = 9;
                        }
                        bundleZzi = zzamVar.zzi(i2, this.zzg.getPackageName(), str, string, bundle);
                    }
                    i2 = i3;
                    bundleZzi = zzamVar.zzi(i2, this.zzg.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzamVar.zzh(3, this.zzg.getPackageName(), str, string);
                }
                com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzh;
                if (bundleZzi == null) {
                    java.lang.Object[] objArr = new java.lang.Object[i4];
                    objArr[0] = "getPurchase()";
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("%s got null owned items list", objArr));
                    zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzi, "BillingClient");
                    java.lang.String strZzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundleZzi, "BillingClient");
                    com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(iZzb);
                    builderNewBuilder.setDebugMessage(strZzj);
                    com.android.billingclient.api.BillingResult billingResultBuild = builderNewBuilder.build();
                    if (iZzb != 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        objArr2[0] = "getPurchase()";
                        objArr2[i4] = java.lang.Integer.valueOf(iZzb);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("%s failed. Response code: %s", objArr2));
                        zzieVar2 = com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                        billingResult = billingResultBuild;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        java.util.ArrayList<java.lang.String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        java.util.ArrayList<java.lang.String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        java.util.ArrayList<java.lang.String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            java.lang.Object[] objArr3 = new java.lang.Object[i4];
                            objArr3[0] = "getPurchase()";
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("Bundle returned from %s contains null SKUs list.", objArr3));
                            zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            java.lang.Object[] objArr4 = new java.lang.Object[i4];
                            objArr4[0] = "getPurchase()";
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("Bundle returned from %s contains null purchases list.", objArr4));
                            zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            java.lang.Object[] objArr5 = new java.lang.Object[i4];
                            objArr5[0] = "getPurchase()";
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("Bundle returned from %s contains null signatures list.", objArr5));
                            zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_SIGNATURES_LIST;
                        } else {
                            billingResult = com.android.billingclient.api.zzcj.zzi;
                            zzieVar2 = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
                        }
                    } else {
                        java.lang.Object[] objArr6 = new java.lang.Object[i4];
                        objArr6[0] = "getPurchase()";
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", java.lang.String.format("Bundle returned from %s doesn't contain required fields.", objArr6));
                        zzieVar = com.google.android.gms.internal.play_billing.zzie.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (billingResult != com.android.billingclient.api.zzcj.zzi) {
                        return zzba(9, billingResult, zzieVar2, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z2 = false;
                    for (int i5 = 0; i5 < stringArrayList2.size(); i5++) {
                        java.lang.String str2 = stringArrayList2.get(i5);
                        java.lang.String str3 = stringArrayList3.get(i5);
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Sku is owned: ".concat(java.lang.String.valueOf(stringArrayList.get(i5))));
                        try {
                            purchase = new com.android.billingclient.api.Purchase(str2, str3);
                            if (android.text.TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList.add(purchase);
                        } catch (org.json.JSONException e) {
                            return zzba(9, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e);
                        }
                    }
                    if (z2) {
                        zzbd(com.google.android.gms.internal.play_billing.zzie.EMPTY_PURCHASE_TOKEN, 9, billingResult2);
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Continuation token: ".concat(java.lang.String.valueOf(string)));
                    if (android.text.TextUtils.isEmpty(string)) {
                        return new com.android.billingclient.api.zzcw(com.android.billingclient.api.zzcj.zzi, arrayList);
                    }
                    i4 = 1;
                }
                zzieVar2 = zzieVar;
                billingResult = billingResult2;
                if (billingResult != com.android.billingclient.api.zzcj.zzi) {
                    return zzba(9, billingResult, zzieVar2, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z2 = false;
                while (i5 < stringArrayList2.size()) {
                    java.lang.String str4 = stringArrayList2.get(i5);
                    java.lang.String str5 = stringArrayList3.get(i5);
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Sku is owned: ".concat(java.lang.String.valueOf(stringArrayList.get(i5))));
                    purchase = new com.android.billingclient.api.Purchase(str4, str5);
                    if (android.text.TextUtils.isEmpty(purchase.getPurchaseToken())) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "BUG: empty/null token!");
                        z2 = true;
                    }
                    arrayList.add(purchase);
                }
                if (z2) {
                    zzbd(com.google.android.gms.internal.play_billing.zzie.EMPTY_PURCHASE_TOKEN, 9, billingResult2);
                }
                string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Continuation token: ".concat(java.lang.String.valueOf(string)));
                if (android.text.TextUtils.isEmpty(string)) {
                    return new com.android.billingclient.api.zzcw(com.android.billingclient.api.zzcj.zzi, arrayList);
                }
                i4 = 1;
            } catch (android.os.DeadObjectException e2) {
                return zzba(9, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e2);
            } catch (java.lang.Exception e3) {
                return zzba(9, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e3);
            }
        }
    }

    private final void zzbc(com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, int i) {
        com.google.android.gms.internal.play_billing.zzib zzibVar = null;
        com.google.android.gms.internal.play_billing.zzhx zzhxVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i2 = com.android.billingclient.api.zzcg.zza;
            try {
                com.google.android.gms.internal.play_billing.zzhz zzhzVarZzc = com.google.android.gms.internal.play_billing.zzib.zzc();
                zzhzVarZzc.zzo(5);
                com.google.android.gms.internal.play_billing.zziw zziwVarZzc = com.google.android.gms.internal.play_billing.zziz.zzc();
                zziwVarZzc.zza(i);
                zzhzVarZzc.zzl((com.google.android.gms.internal.play_billing.zziz) zziwVarZzc.zze());
                zzibVar = (com.google.android.gms.internal.play_billing.zzib) zzhzVarZzc.zze();
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            }
            zzaQ(zzibVar);
            return;
        }
        int i3 = com.android.billingclient.api.zzcg.zza;
        try {
            com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
            com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
            zzicVarZzc.zzo(billingResult.getResponseCode());
            zzicVarZzc.zzl(billingResult.getDebugMessage());
            zzicVarZzc.zzn(zzieVar);
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(5);
            com.google.android.gms.internal.play_billing.zziw zziwVarZzc2 = com.google.android.gms.internal.play_billing.zziz.zzc();
            zziwVarZzc2.zza(i);
            zzhvVarZzc.zzm((com.google.android.gms.internal.play_billing.zziz) zziwVarZzc2.zze());
            zzhxVar = (com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze();
        } catch (java.lang.Exception e2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e2);
        }
        zzaO(zzhxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbd(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzaO(com.android.billingclient.api.zzcg.zzb(zzieVar, i, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbe(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult, long j) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            try {
                this.zzh.zzc(com.android.billingclient.api.zzcg.zzb(zzieVar, 2, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzm, j);
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbf(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult, java.lang.String str) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzaO(com.android.billingclient.api.zzcg.zzb(zzieVar, i, billingResult, str, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbg(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult, long j, boolean z) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzaP(com.android.billingclient.api.zzcg.zzb(zzieVar, 2, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), j, z);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbh(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult, java.lang.String str, long j, boolean z) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzaP(com.android.billingclient.api.zzcg.zzb(zzieVar, 2, billingResult, str, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), j, z);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private void zzbi(int i) {
        try {
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzaQ(com.android.billingclient.api.zzcg.zzc(i, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    static /* bridge */ /* synthetic */ com.android.billingclient.api.BillingResult zzl(java.lang.Exception exc) {
        return exc instanceof android.os.DeadObjectException ? com.android.billingclient.api.zzcj.zzj : com.android.billingclient.api.zzcj.zzh;
    }

    public static /* synthetic */ java.lang.Object zzq(com.android.billingclient.api.BillingClientImpl billingClientImpl, int i, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        billingClientImpl.zzaU(new com.android.billingclient.api.zzbc(billingClientImpl, zzpVar), i);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ java.lang.Object zzr(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener, com.android.billingclient.api.ConsumeParams consumeParams) {
        if (billingClientImpl.zzaX(30000L)) {
            billingClientImpl.zzaD(consumeParams, consumeResponseListener);
            return null;
        }
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
        billingClientImpl.zzbd(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ java.lang.Object zzs(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener, com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams) throws org.json.JSONException {
        if (!billingClientImpl.zzaX(30000L)) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
            billingClientImpl.zzbd(zzieVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            com.android.billingclient.api.zzbo zzboVarZzg = billingClientImpl.zzg(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzcj.zza(zzboVarZzg.zza(), zzboVarZzg.zzb()), new com.android.billingclient.api.QueryProductDetailsResult(zzboVarZzg.zzc(), zzboVarZzg.zzd()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying product details is not supported.");
        com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
        com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzr;
        billingClientImpl.zzbd(zzieVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        return null;
    }

    public static /* synthetic */ java.lang.Object zzt(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams) throws java.lang.Exception {
        billingClientImpl.zzas(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ java.lang.Object zzu(com.android.billingclient.api.BillingClientImpl billingClientImpl, android.os.Bundle bundle, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        billingClientImpl.zzau(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ java.lang.Object zzv(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) throws java.lang.Exception {
        billingClientImpl.zzat(billingConfigResponseListener);
        return null;
    }

    public static /* synthetic */ java.lang.Void zzz(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        billingClientImpl.zzaB(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, final com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzt(this.zza, acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzL(this.zza, acknowledgePurchaseResponseListener);
            }
        }, zzan(), zzF()) == null) {
            com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
            zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, billingResultZzaq);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzaq);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final com.android.billingclient.api.ConsumeParams consumeParams, final com.android.billingclient.api.ConsumeResponseListener consumeResponseListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzak
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.zzr(this.zza, consumeResponseListener, consumeParams);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzH(this.zza, consumeResponseListener, consumeParams);
            }
        }, zzan(), zzF()) == null) {
            com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
            zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, billingResultZzaq);
            consumeResponseListener.onConsumeResponse(billingResultZzaq, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzD(this.zza, alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaH(alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzan(), zzF()) == null) {
            zzaH(alternativeBillingOnlyReportingDetailsListener, zzaq(), com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        final java.lang.String str = null;
        if (zzG(new java.util.concurrent.Callable(externalOfferReportingDetailsListener, str) { // from class: com.android.billingclient.api.zzaq
            public final /* synthetic */ com.android.billingclient.api.ExternalOfferReportingDetailsListener zzb;

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzC(this.zza, this.zzb, null);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaI(externalOfferReportingDetailsListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzan(), zzF()) == null) {
            zzaI(externalOfferReportingDetailsListener, zzaq(), com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbi(12);
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    this.zzf.zzf();
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                        zzaV();
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                    }
                    try {
                        zzaT();
                        zzaS(3);
                    } catch (java.lang.Throwable th2) {
                        try {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                            zzaS(3);
                        } catch (java.lang.Throwable th3) {
                            zzaS(3);
                            this.zzG = null;
                            throw th3;
                        }
                    }
                    this.zzG = null;
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                    zzaV();
                    zzaT();
                    zzaS(3);
                    this.zzG = null;
                }
            } catch (java.lang.Throwable th4) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
            }
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(com.android.billingclient.api.GetBillingConfigParams getBillingConfigParams, final com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzv(this.zza, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzJ(this.zza, billingConfigResponseListener);
            }
        }, zzan(), zzF()) == null) {
            com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
            zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, billingResultZzaq);
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzaq, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i;
        synchronized (this.zza) {
            i = this.zzb;
        }
        return i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzE(this.zza, alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaF(alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzan(), zzF()) == null) {
            zzaF(alternativeBillingOnlyAvailabilityListener, zzaq(), com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzau
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzA(this.zza, externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaJ(externalOfferAvailabilityListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzan(), zzF()) == null) {
            zzaJ(externalOfferAvailabilityListener, zzaq(), com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    @Override // com.android.billingclient.api.BillingClient
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String str) {
        if (!zzaW(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS)) {
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            if (billingResult.getResponseCode() != 0) {
                zzbd(zzieVar, 5, billingResult);
            } else {
                zzbi(5);
            }
            return billingResult;
        }
        int i = com.android.billingclient.api.zzcj.zzG;
        switch (str) {
            case "subscriptions":
                com.android.billingclient.api.BillingResult billingResult2 = this.zzk ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzl;
                zzbc(billingResult2, com.google.android.gms.internal.play_billing.zzie.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                return billingResult2;
            case "subscriptionsUpdate":
                com.android.billingclient.api.BillingResult billingResult3 = this.zzl ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzm;
                zzbc(billingResult3, com.google.android.gms.internal.play_billing.zzie.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                return billingResult3;
            case "priceChangeConfirmation":
                com.android.billingclient.api.BillingResult billingResult4 = this.zzo ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzn;
                zzbc(billingResult4, com.google.android.gms.internal.play_billing.zzie.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                return billingResult4;
            case "bbb":
                com.android.billingclient.api.BillingResult billingResult5 = this.zzq ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzs;
                zzbc(billingResult5, com.google.android.gms.internal.play_billing.zzie.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                return billingResult5;
            case "aaa":
                com.android.billingclient.api.BillingResult billingResult6 = this.zzs ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzo;
                zzbc(billingResult6, com.google.android.gms.internal.play_billing.zzie.CROSS_APP_NOT_SUPPORTED, 6);
                return billingResult6;
            case "ddd":
                com.android.billingclient.api.BillingResult billingResult7 = this.zzr ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzq;
                zzbc(billingResult7, com.google.android.gms.internal.play_billing.zzie.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                return billingResult7;
            case "ccc":
                com.android.billingclient.api.BillingResult billingResult8 = this.zzt ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzp;
                zzbc(billingResult8, com.google.android.gms.internal.play_billing.zzie.MULTI_ITEM_NOT_SUPPORTED, 8);
                return billingResult8;
            case "eee":
                com.android.billingclient.api.BillingResult billingResult9 = this.zzt ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzp;
                zzbc(billingResult9, com.google.android.gms.internal.play_billing.zzie.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                return billingResult9;
            case "fff":
                com.android.billingclient.api.BillingResult billingResult10 = this.zzu ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzr;
                zzbc(billingResult10, com.google.android.gms.internal.play_billing.zzie.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                return billingResult10;
            case "ggg":
                com.android.billingclient.api.BillingResult billingResult11 = this.zzv ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzy;
                zzbc(billingResult11, com.google.android.gms.internal.play_billing.zzie.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                return billingResult11;
            case "hhh":
                com.android.billingclient.api.BillingResult billingResult12 = this.zzv ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzz;
                zzbc(billingResult12, com.google.android.gms.internal.play_billing.zzie.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                return billingResult12;
            case "iii":
                com.android.billingclient.api.BillingResult billingResult13 = this.zzx ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzC;
                zzbc(billingResult13, com.google.android.gms.internal.play_billing.zzie.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                return billingResult13;
            case "jjj":
                com.android.billingclient.api.BillingResult billingResult14 = this.zzy ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzD;
                zzbc(billingResult14, com.google.android.gms.internal.play_billing.zzie.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                return billingResult14;
            case "kkk":
                com.android.billingclient.api.BillingResult billingResult15 = this.zzB ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzA;
                zzbc(billingResult15, com.google.android.gms.internal.play_billing.zzie.LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED, 18);
                return billingResult15;
            case "lll":
                com.android.billingclient.api.BillingResult billingResult16 = this.zzA ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzu;
                zzbc(billingResult16, com.google.android.gms.internal.play_billing.zzie.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                return billingResult16;
            case "mmm":
                com.android.billingclient.api.BillingResult billingResult17 = this.zzB ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzv;
                zzbc(billingResult17, com.google.android.gms.internal.play_billing.zzie.AUTO_PAY_NOT_SUPPORTED, 20);
                return billingResult17;
            case "nnn":
                com.android.billingclient.api.BillingResult billingResult18 = this.zzC ? com.android.billingclient.api.zzcj.zzi : com.android.billingclient.api.zzcj.zzw;
                zzbc(billingResult18, com.google.android.gms.internal.play_billing.zzie.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                return billingResult18;
            default:
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unsupported feature: ".concat(java.lang.String.valueOf(str)));
                com.android.billingclient.api.BillingResult billingResult19 = com.android.billingclient.api.zzcj.zzx;
                zzbc(billingResult19, com.google.android.gms.internal.play_billing.zzie.UNKNOWN_FEATURE, 1);
                return billingResult19;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzE) {
            return true;
        }
        return zzaY();
    }

    /* JADX WARN: Code duplicated, block: B:183:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:187:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0503  */
    /* JADX WARN: Code duplicated, block: B:205:0x0507  */
    /* JADX WARN: Code duplicated, block: B:206:0x050a  */
    @Override // com.android.billingclient.api.BillingClient
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity activity, final com.android.billingclient.api.BillingFlowParams billingFlowParams) {
        boolean zZzd;
        final java.lang.String productId;
        final java.lang.String productType;
        long j;
        boolean z;
        java.util.concurrent.Future futureZzG;
        boolean z2;
        long j2;
        com.google.android.gms.internal.play_billing.zzie zzieVarZzb;
        java.lang.String string;
        java.lang.Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        android.content.Intent intent;
        int i;
        long jNextLong = new java.util.Random().nextLong();
        if (this.zzf == null || this.zzf.zzd() == null) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.MISSING_LISTENER;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzE;
            zzbe(zzieVar, 2, billingResult, jNextLong);
            return billingResult;
        }
        if (!zzaW(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS)) {
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzj;
            zzbe(zzieVar2, 2, billingResult2, jNextLong);
            zzm(billingResult2);
            return billingResult2;
        }
        synchronized (this.zza) {
            zZzd = this.zzj != null ? this.zzj.zzd() : false;
        }
        java.util.ArrayList arrayListZzj = billingFlowParams.zzj();
        java.util.List listZzk = billingFlowParams.zzk();
        java.lang.String str = null;
        com.android.billingclient.api.SkuDetails skuDetails = (com.android.billingclient.api.SkuDetails) com.google.android.gms.internal.play_billing.zzby.zza(arrayListZzj, null);
        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzby.zza(listZzk, null);
        if (skuDetails != null) {
            productId = skuDetails.getSku();
            productType = skuDetails.getType();
        } else {
            productId = productDetailsParams.zza().getProductId();
            productType = productDetailsParams.zza().getProductType();
        }
        if (productType.equals("subs") && !this.zzk) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult3 = com.android.billingclient.api.zzcj.zzl;
            zzbg(zzieVar3, 2, billingResult3, jNextLong, zZzd);
            zzm(billingResult3);
            return billingResult3;
        }
        if (billingFlowParams.zzt() && !this.zzn) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
            com.google.android.gms.internal.play_billing.zzie zzieVar4 = com.google.android.gms.internal.play_billing.zzie.EXTRA_PARAMS_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult4 = com.android.billingclient.api.zzcj.zzf;
            zzbg(zzieVar4, 2, billingResult4, jNextLong, zZzd);
            zzm(billingResult4);
            return billingResult4;
        }
        if (arrayListZzj.size() > 1 && !this.zzt) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            com.google.android.gms.internal.play_billing.zzie zzieVar5 = com.google.android.gms.internal.play_billing.zzie.MULTI_ITEM_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult5 = com.android.billingclient.api.zzcj.zzp;
            zzbg(zzieVar5, 2, billingResult5, jNextLong, zZzd);
            zzm(billingResult5);
            return billingResult5;
        }
        if (!listZzk.isEmpty() && !this.zzu) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            com.google.android.gms.internal.play_billing.zzie zzieVar6 = com.google.android.gms.internal.play_billing.zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult6 = com.android.billingclient.api.zzcj.zzr;
            zzbg(zzieVar6, 2, billingResult6, jNextLong, zZzd);
            zzm(billingResult6);
            return billingResult6;
        }
        com.android.billingclient.api.BillingResult billingResultZzd = billingFlowParams.zzd();
        if (billingResultZzd != com.android.billingclient.api.zzcj.zzi) {
            zzbg(com.google.android.gms.internal.play_billing.zzie.INVALID_BILLING_FLOW_PARAMS, 2, billingResultZzd, jNextLong, zZzd);
            zzm(billingResultZzd);
            return billingResultZzd;
        }
        if (this.zzn) {
            boolean z6 = this.zzp;
            boolean z7 = this.zzw;
            boolean zIsEnabledForOneTimeProducts = this.zzD.isEnabledForOneTimeProducts();
            boolean zIsEnabledForPrepaidPlans = this.zzD.isEnabledForPrepaidPlans();
            boolean z8 = this.zzF;
            java.lang.String str2 = this.zzc;
            final java.lang.String str3 = productType;
            java.lang.String str4 = this.zzd;
            final java.lang.String str5 = productId;
            long jLongValue = this.zzI.longValue();
            this.zzg.getPackageName();
            int i2 = com.google.android.gms.internal.play_billing.zzc.zza;
            final android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str4, jLongValue);
            bundle.putLong("billingClientTransactionId", jNextLong);
            if (billingFlowParams.zzb() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zzb());
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("accountId", billingFlowParams.zze());
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzf())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzf());
            }
            if (billingFlowParams.zzs()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new java.util.ArrayList<>(java.util.Arrays.asList(null)));
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzh())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzh());
            }
            billingFlowParams.zzg();
            if (!android.text.TextUtils.isEmpty(null)) {
                billingFlowParams.zzg();
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzi())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zzi());
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z6 && zIsEnabledForOneTimeProducts) {
                z3 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z3 = true;
            }
            if (z7 && zIsEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z3);
            }
            if (z8) {
                bundle.putBoolean("enableAlternativeBilling", z3);
            }
            billingFlowParams.zzc();
            billingFlowParams.zza();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams2 : billingFlowParams.zzk()) {
            }
            if (!arrayList.isEmpty()) {
                com.google.android.gms.internal.play_billing.zzdj zzdjVarZza = com.google.android.gms.internal.play_billing.zzdk.zza();
                zzdjVarZza.zza(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((com.google.android.gms.internal.play_billing.zzdk) zzdjVarZza.zze()).zzM());
            }
            if (arrayListZzj.isEmpty()) {
                j = jNextLong;
                z = zZzd;
                z4 = true;
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(listZzk.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>(listZzk.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.Integer> arrayList7 = new java.util.ArrayList<>();
                for (int i3 = 0; i3 < listZzk.size(); i3++) {
                    com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams3 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) listZzk.get(i3);
                    com.android.billingclient.api.ProductDetails productDetailsZza = productDetailsParams3.zza();
                    if (!productDetailsZza.zzb().isEmpty()) {
                        arrayList4.add(productDetailsZza.zzb());
                    }
                    arrayList5.add(productDetailsParams3.zzb());
                    java.lang.String strZzc = productDetailsZza.zzc();
                    if (productDetailsZza.zzd() != null && !productDetailsZza.zzd().isEmpty()) {
                        for (com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails : productDetailsZza.zzd()) {
                            if (!android.text.TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzb())) {
                                strZzc = oneTimePurchaseOfferDetails.zzb();
                                break;
                            }
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(strZzc)) {
                        arrayList6.add(strZzc);
                    }
                    if (i3 > 0) {
                        arrayList2.add(((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) listZzk.get(i3)).zza().getProductId());
                        arrayList3.add(((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) listZzk.get(i3)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                java.util.ArrayList<java.lang.String> arrayList8 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList9 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList10 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.Integer> arrayList11 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList12 = new java.util.ArrayList<>();
                java.util.Iterator it = arrayListZzj.iterator();
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (it.hasNext()) {
                    com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) it.next();
                    if (!skuDetails2.zzf().isEmpty()) {
                        arrayList8.add(skuDetails2.zzf());
                    }
                    java.lang.String strZzc2 = skuDetails2.zzc();
                    boolean z13 = zZzd;
                    java.lang.String strZzb = skuDetails2.zzb();
                    int iZza = skuDetails2.zza();
                    long j3 = jNextLong;
                    java.lang.String strZze = skuDetails2.zze();
                    arrayList9.add(strZzc2);
                    z9 |= !android.text.TextUtils.isEmpty(strZzc2);
                    arrayList10.add(strZzb);
                    z10 |= !android.text.TextUtils.isEmpty(strZzb);
                    arrayList11.add(java.lang.Integer.valueOf(iZza));
                    z11 |= iZza != 0;
                    z12 |= !android.text.TextUtils.isEmpty(strZze);
                    arrayList12.add(strZze);
                    it = it;
                    zZzd = z13;
                    jNextLong = j3;
                }
                j = jNextLong;
                z = zZzd;
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList9);
                }
                if (z10) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList10);
                }
                if (z11) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList11);
                }
                if (z12) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList12);
                }
                z4 = true;
                if (arrayListZzj.size() > 1) {
                    java.util.ArrayList<java.lang.String> arrayList13 = new java.util.ArrayList<>(arrayListZzj.size() - 1);
                    java.util.ArrayList<java.lang.String> arrayList14 = new java.util.ArrayList<>(arrayListZzj.size() - 1);
                    for (int i4 = 1; i4 < arrayListZzj.size(); i4++) {
                        arrayList13.add(((com.android.billingclient.api.SkuDetails) arrayListZzj.get(i4)).getSku());
                        arrayList14.add(((com.android.billingclient.api.SkuDetails) arrayListZzj.get(i4)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList13);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList14);
                }
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.zzr) {
                com.google.android.gms.internal.play_billing.zzie zzieVar7 = com.google.android.gms.internal.play_billing.zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                com.android.billingclient.api.BillingResult billingResult7 = com.android.billingclient.api.zzcj.zzq;
                zzbg(zzieVar7, 2, billingResult7, j, z);
                zzm(billingResult7);
                return billingResult7;
            }
            if (skuDetails == null || android.text.TextUtils.isEmpty(skuDetails.zzd())) {
                if (productDetailsParams == null || android.text.TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                    str = null;
                    z5 = false;
                } else {
                    bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    bundle.putString("accountName", str);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Activity's intent is null.");
                } else if (!android.text.TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    java.lang.String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        bundle.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        bundle.putString("proxyPackageVersion", "package not found");
                    }
                }
                if (!this.zzu && !listZzk.isEmpty()) {
                    i = 17;
                } else if (!this.zzs && z5) {
                    i = 15;
                } else if (this.zzp) {
                    i = 9;
                } else {
                    i = 6;
                }
                final int i5 = i;
                futureZzG = zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzw
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.zza.zzal(i5, str5, str3, billingFlowParams, bundle);
                    }
                }, 5000L, null, this.zze, zzF());
            } else {
                bundle.putString("skuPackageName", skuDetails.zzd());
            }
            z5 = z4;
            str = null;
            if (!android.text.TextUtils.isEmpty(str)) {
                bundle.putString("accountName", str);
            }
            intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!android.text.TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                java.lang.String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra2);
                bundle.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
            }
            if (!this.zzu) {
                if (!this.zzs) {
                    if (this.zzp) {
                        i = 9;
                    } else {
                        i = 6;
                    }
                } else if (this.zzp) {
                    i = 9;
                } else {
                    i = 6;
                }
            } else if (!this.zzs) {
                if (this.zzp) {
                    i = 9;
                } else {
                    i = 6;
                }
            } else if (this.zzp) {
                i = 9;
            } else {
                i = 6;
            }
            final int i6 = i;
            futureZzG = zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzw
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zzal(i6, str5, str3, billingFlowParams, bundle);
                }
            }, 5000L, null, this.zze, zzF());
        } else {
            j = jNextLong;
            z = zZzd;
            futureZzG = zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzx
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zzam(productId, productType);
                }
            }, 5000L, null, this.zze, zzF());
        }
        try {
            if (futureZzG == null) {
                com.google.android.gms.internal.play_billing.zzie zzieVar8 = com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                com.android.billingclient.api.BillingResult billingResult8 = com.android.billingclient.api.zzcj.zzc;
                zzbg(zzieVar8, 2, billingResult8, j, z);
                zzm(billingResult8);
                return billingResult8;
            }
            android.os.Bundle bundle2 = (android.os.Bundle) futureZzG.get(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle2, "BillingClient");
            java.lang.String strZzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundle2, "BillingClient");
            if (iZzb != 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to buy item, Error response code: " + iZzb);
                com.android.billingclient.api.BillingResult billingResultZza = com.android.billingclient.api.zzcj.zza(iZzb, strZzj);
                try {
                    if (bundle2 == null || (obj = bundle2.get("LOG_REASON")) == null) {
                        zzieVarZzb = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
                    } else if (obj instanceof java.lang.Integer) {
                        zzieVarZzb = com.google.android.gms.internal.play_billing.zzie.zzb(((java.lang.Integer) obj).intValue());
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        zzieVarZzb = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(java.lang.String.valueOf(th.getMessage())));
                    zzieVarZzb = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
                }
                if (zzieVarZzb == com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED) {
                    zzieVarZzb = com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                com.google.android.gms.internal.play_billing.zzie zzieVar9 = zzieVarZzb;
                if (bundle2 == null) {
                    string = str;
                } else {
                    try {
                        string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(java.lang.String.valueOf(th2.getMessage())));
                        string = str;
                    }
                }
                zzbh(zzieVar9, 2, billingResultZza, string, j, z);
                zzm(billingResultZza);
                return billingResultZza;
            }
            android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
            intent2.putExtra("BUY_INTENT", (android.app.PendingIntent) bundle2.getParcelable("BUY_INTENT"));
            j2 = j;
            try {
                intent2.putExtra("billingClientTransactionId", j2);
                z2 = z;
                try {
                    intent2.putExtra("wasServiceAutoReconnected", z2);
                    activity.startActivity(intent2);
                    return com.android.billingclient.api.zzcj.zzi;
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    com.google.android.gms.internal.play_billing.zzie zzieVar10 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    com.android.billingclient.api.BillingResult billingResult9 = com.android.billingclient.api.zzcj.zzk;
                    zzbh(zzieVar10, 2, billingResult9, com.android.billingclient.api.zzcg.zza(e), j2, z2);
                    zzm(billingResult9);
                    return billingResult9;
                } catch (java.util.concurrent.TimeoutException e2) {
                    e = e2;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    com.google.android.gms.internal.play_billing.zzie zzieVar11 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    com.android.billingclient.api.BillingResult billingResult10 = com.android.billingclient.api.zzcj.zzk;
                    zzbh(zzieVar11, 2, billingResult10, com.android.billingclient.api.zzcg.zza(e), j2, z2);
                    zzm(billingResult10);
                    return billingResult10;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    com.google.android.gms.internal.play_billing.zzie zzieVar12 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    com.android.billingclient.api.BillingResult billingResult11 = com.android.billingclient.api.zzcj.zzj;
                    zzbh(zzieVar12, 2, billingResult11, com.android.billingclient.api.zzcg.zza(e), j2, z2);
                    zzm(billingResult11);
                    return billingResult11;
                }
            } catch (java.util.concurrent.CancellationException e4) {
                e = e4;
                z2 = z;
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                com.google.android.gms.internal.play_billing.zzie zzieVar13 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                com.android.billingclient.api.BillingResult billingResult12 = com.android.billingclient.api.zzcj.zzk;
                zzbh(zzieVar13, 2, billingResult12, com.android.billingclient.api.zzcg.zza(e), j2, z2);
                zzm(billingResult12);
                return billingResult12;
            } catch (java.util.concurrent.TimeoutException e5) {
                e = e5;
                z2 = z;
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                com.google.android.gms.internal.play_billing.zzie zzieVar14 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                com.android.billingclient.api.BillingResult billingResult13 = com.android.billingclient.api.zzcj.zzk;
                zzbh(zzieVar14, 2, billingResult13, com.android.billingclient.api.zzcg.zza(e), j2, z2);
                zzm(billingResult13);
                return billingResult13;
            } catch (java.lang.Exception e6) {
                e = e6;
                z2 = z;
            }
        } catch (java.util.concurrent.CancellationException e7) {
            e = e7;
            z2 = z;
            j2 = j;
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            com.google.android.gms.internal.play_billing.zzie zzieVar15 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
            com.android.billingclient.api.BillingResult billingResult14 = com.android.billingclient.api.zzcj.zzk;
            zzbh(zzieVar15, 2, billingResult14, com.android.billingclient.api.zzcg.zza(e), j2, z2);
            zzm(billingResult14);
            return billingResult14;
        } catch (java.util.concurrent.TimeoutException e8) {
            e = e8;
            z2 = z;
            j2 = j;
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            com.google.android.gms.internal.play_billing.zzie zzieVar16 = com.google.android.gms.internal.play_billing.zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
            com.android.billingclient.api.BillingResult billingResult15 = com.android.billingclient.api.zzcj.zzk;
            zzbh(zzieVar16, 2, billingResult15, com.android.billingclient.api.zzcg.zza(e), j2, z2);
            zzm(billingResult15);
            return billingResult15;
        } catch (java.lang.Exception e9) {
            e = e9;
            z2 = z;
            j2 = j;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, final com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws org.json.JSONException {
                com.android.billingclient.api.BillingClientImpl.zzs(this.zza, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzap
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzN(this.zza, productDetailsResponseListener);
            }
        }, zzan(), zzF()) == null) {
            com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
            zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, billingResultZzaq);
            productDetailsResponseListener.onProductDetailsResponse(billingResultZzaq, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams queryPurchasesParams, final com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        if (zzG(new com.android.billingclient.api.zzaw(this, purchasesResponseListener, queryPurchasesParams.zza(), false), 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzat
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzI(this.zza, purchasesResponseListener);
            }
        }, zzan(), zzF()) == null) {
            com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
            zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, billingResultZzaq);
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzaq, com.google.android.gms.internal.play_billing.zzbt.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final com.android.billingclient.api.BillingResult showInAppMessages(final android.app.Activity activity, com.android.billingclient.api.InAppMessageParams inAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener) {
        if (!zzaW(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS)) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
            return com.android.billingclient.api.zzcj.zzj;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support showing in-app messages.");
            return com.android.billingclient.api.zzcj.zzs;
        }
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        android.os.IBinder windowToken = viewFindViewById.getWindowToken();
        android.graphics.Rect rect = new android.graphics.Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final android.os.Bundle bundle = new android.os.Bundle();
        androidx.core.app.BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        java.lang.String str = this.zzd;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        android.os.Handler handler = this.zze;
        final com.android.billingclient.api.zzax zzaxVar = new com.android.billingclient.api.zzax(this, handler, inAppMessageResponseListener);
        zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzas
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzu(this.zza, bundle, activity, zzaxVar);
                return null;
            }
        }, 5000L, null, handler, zzF());
        return com.android.billingclient.api.zzcj.zzi;
    }

    final synchronized java.util.concurrent.ExecutorService zzF() {
        if (this.zzH == null) {
            this.zzH = java.util.concurrent.Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new com.android.billingclient.api.zzav(this));
        }
        return this.zzH;
    }

    public final void zzag(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    final com.android.billingclient.api.zzbo zzg(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams) throws org.json.JSONException {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbt zzbtVarZza = queryProductDetailsParams.zza();
        int size = zzbtVarZza.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            java.util.ArrayList<com.android.billingclient.api.QueryProductDetailsParams.Product> arrayList3 = new java.util.ArrayList(zzbtVarZza.subList(i, i2 > size ? size : i2));
            java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList4.add(((com.android.billingclient.api.QueryProductDetailsParams.Product) arrayList3.get(i3)).zza());
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            java.lang.String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    return zzao(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z = this.zzw && this.zzD.isEnabledForPrepaidPlans();
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                android.os.Bundle bundleZzj = zzamVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), strZzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzf(str, this.zzd, arrayList3, null, null, com.google.android.gms.internal.play_billing.zza.zza(z, true, false, true, false, true), this.zzI.longValue()));
                if (bundleZzj == null) {
                    return zzao(com.android.billingclient.api.zzcj.zzB, com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzj.containsKey("DETAILS_LIST")) {
                    int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzj, "BillingClient");
                    java.lang.String strZzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundleZzj, "BillingClient");
                    if (iZzb == 0) {
                        return zzao(com.android.billingclient.api.zzcj.zza(6, strZzj), com.google.android.gms.internal.play_billing.zzie.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzao(com.android.billingclient.api.zzcj.zza(iZzb, strZzj), com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                java.util.ArrayList<java.lang.String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzao(com.android.billingclient.api.zzcj.zzB, com.google.android.gms.internal.play_billing.zzie.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                int size3 = stringArrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    try {
                        com.android.billingclient.api.ProductDetails productDetails = new com.android.billingclient.api.ProductDetails(stringArrayList.get(i4));
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (org.json.JSONException e) {
                        return zzao(com.android.billingclient.api.zzcj.zza(6, "Error trying to decode SkuDetails."), com.google.android.gms.internal.play_billing.zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                java.util.ArrayList<java.lang.String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new java.util.ArrayList();
                try {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    if (stringArrayList2 == null) {
                        for (com.android.billingclient.api.QueryProductDetailsParams.Product product : arrayList3) {
                            java.util.Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new com.android.billingclient.api.UnfetchedProduct(new org.json.JSONObject().put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                    break;
                                }
                                com.android.billingclient.api.ProductDetails productDetails2 = (com.android.billingclient.api.ProductDetails) it.next();
                                if (product.zza().equals(productDetails2.getProductId()) && product.zzb().equals(productDetails2.getProductType())) {
                                    break;
                                }
                            }
                        }
                    } else {
                        java.util.Iterator<java.lang.String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            com.android.billingclient.api.UnfetchedProduct unfetchedProduct = new com.android.billingclient.api.UnfetchedProduct(it2.next());
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i = i2;
                } catch (org.json.JSONException e2) {
                    return zzao(com.android.billingclient.api.zzcj.zza(6, "Error trying to decode SkuDetails."), com.google.android.gms.internal.play_billing.zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                }
            } catch (android.os.DeadObjectException e3) {
                return zzao(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (java.lang.Exception e4) {
                return zzao(com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new com.android.billingclient.api.zzbo(0, "", arrayList, arrayList2);
    }

    final com.android.billingclient.api.zzch zzj() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.android.billingclient.api.BillingResult zzm(final com.android.billingclient.api.BillingResult billingResult) {
        if (java.lang.Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.zzP(this.zza, billingResult);
            }
        });
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog(final android.app.Activity activity, final com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzaW(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS)) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
            zzbd(zzieVar, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzD;
            zzbd(zzieVar2, 16, billingResult2);
            return billingResult2;
        }
        android.os.Handler handler = this.zze;
        final com.android.billingclient.api.zzay zzayVar = new com.android.billingclient.api.zzay(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzy
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzz(this.zza, alternativeBillingOnlyInformationDialogListener, activity, zzayVar);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaM(alternativeBillingOnlyInformationDialogListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzF()) != null) {
            return com.android.billingclient.api.zzcj.zzi;
        }
        com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
        zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 16, billingResultZzaq);
        return billingResultZzaq;
    }

    @Override // com.android.billingclient.api.BillingClient
    public com.android.billingclient.api.BillingResult showExternalOfferInformationDialog(final android.app.Activity activity, final com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzaW(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS)) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
            zzbd(zzieVar, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn't support external offer.");
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.EXTERNAL_OFFER_NOT_SUPPORTED;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzt;
            zzbd(zzieVar2, 25, billingResult2);
            return billingResult2;
        }
        android.os.Handler handler = this.zze;
        final com.android.billingclient.api.zzaz zzazVar = new com.android.billingclient.api.zzaz(this, handler, externalOfferInformationDialogListener);
        if (zzG(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzan
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                com.android.billingclient.api.BillingClientImpl.zzB(this.zza, externalOfferInformationDialogListener, activity, zzazVar);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzao
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaK(externalOfferInformationDialogListener, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzF()) != null) {
            return com.android.billingclient.api.zzcj.zzi;
        }
        com.android.billingclient.api.BillingResult billingResultZzaq = zzaq();
        zzbd(com.google.android.gms.internal.play_billing.zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 25, billingResultZzaq);
        return billingResultZzaq;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(com.android.billingclient.api.BillingClientStateListener billingClientStateListener) {
        zzaU(billingClientStateListener, 0);
    }

    private BillingClientImpl(android.content.Context context, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, java.lang.String str, java.lang.String str2, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zza = new java.lang.Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = str;
        this.zzd = zzaw();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (com.android.billingclient.api.zzch) null, builder);
    }

    private BillingClientImpl(java.lang.String str) {
        this.zza = new java.lang.Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = str;
        this.zzd = zzaw();
    }

    BillingClientImpl(java.lang.String str, android.content.Context context, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zza = new java.lang.Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        java.lang.Long lValueOf = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.zzI = lValueOf;
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = com.android.billingclient.BuildConfig.VERSION_NAME;
        java.lang.String strZzaw = zzaw();
        this.zzd = strZzaw;
        this.zzg = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zziq zziqVarZzc = com.google.android.gms.internal.play_billing.zzis.zzc();
        zziqVarZzc.zzs(com.android.billingclient.BuildConfig.VERSION_NAME);
        if (strZzaw != null) {
            zziqVarZzc.zzt(strZzaw);
        }
        zziqVarZzc.zzq(this.zzg.getPackageName());
        zziqVarZzc.zzn(lValueOf.longValue());
        zziqVarZzc.zzr(builder.zza);
        zziqVarZzc.zza(android.os.Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new com.android.billingclient.api.zzcl(this.zzg, (com.google.android.gms.internal.play_billing.zzis) zziqVarZzc.zze());
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbl zzblVar = builder.zzb;
        this.zzE = builder.zza;
    }

    private void initialize(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, java.lang.String str, com.android.billingclient.api.zzch zzchVar, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zziq zziqVarZzc = com.google.android.gms.internal.play_billing.zzis.zzc();
        zziqVarZzc.zzs(str);
        java.lang.String str2 = this.zzd;
        if (str2 != null) {
            zziqVarZzc.zzt(str2);
        }
        zziqVarZzc.zzq(this.zzg.getPackageName());
        zziqVarZzc.zzn(this.zzI.longValue());
        zziqVarZzc.zzr(builder.zza);
        zziqVarZzc.zza(android.os.Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (zzchVar != null) {
            this.zzh = zzchVar;
        } else {
            this.zzh = new com.android.billingclient.api.zzcl(this.zzg, (com.google.android.gms.internal.play_billing.zzis) zziqVarZzc.zze());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzh);
        this.zzD = pendingPurchasesParams;
        this.zzF = userChoiceBillingListener != null;
        com.google.android.gms.internal.play_billing.zzbl zzblVar = builder.zzb;
        this.zzE = builder.zza;
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.zzco zzcoVar, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zza = new java.lang.Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        java.lang.Long lValueOf = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.zzI = lValueOf;
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = com.android.billingclient.BuildConfig.VERSION_NAME;
        java.lang.String strZzaw = zzaw();
        this.zzd = strZzaw;
        this.zzg = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zziq zziqVarZzc = com.google.android.gms.internal.play_billing.zzis.zzc();
        zziqVarZzc.zzs(com.android.billingclient.BuildConfig.VERSION_NAME);
        if (strZzaw != null) {
            zziqVarZzc.zzt(strZzaw);
        }
        zziqVarZzc.zzq(this.zzg.getPackageName());
        zziqVarZzc.zzn(lValueOf.longValue());
        zziqVarZzc.zzr(builder.zza);
        zziqVarZzc.zza(android.os.Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new com.android.billingclient.api.zzcl(this.zzg, (com.google.android.gms.internal.play_billing.zzis) zziqVarZzc.zze());
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, null, null, null, null, this.zzh);
        this.zzD = pendingPurchasesParams;
        this.zzg.getPackageName();
        com.google.android.gms.internal.play_billing.zzbl zzblVar = builder.zzb;
        this.zzE = builder.zza;
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.zzb zzbVar, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        this.zza = new java.lang.Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = com.android.billingclient.BuildConfig.VERSION_NAME;
        this.zzd = zzaw();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (com.android.billingclient.api.zzb) null, com.android.billingclient.BuildConfig.VERSION_NAME, (com.android.billingclient.api.zzch) null, builder);
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, com.android.billingclient.BuildConfig.VERSION_NAME, null, userChoiceBillingListener, null, null, builder);
    }
}
