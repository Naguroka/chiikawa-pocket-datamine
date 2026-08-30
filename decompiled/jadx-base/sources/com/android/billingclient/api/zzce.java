package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzce extends com.android.billingclient.api.BillingClientImpl {
    private final android.content.Context zza;
    private volatile int zzb;
    private volatile com.google.android.gms.internal.play_billing.zzau zzc;
    private volatile com.android.billingclient.api.zzcc zzd;
    private volatile java.util.concurrent.ScheduledExecutorService zze;

    zzce(java.lang.String str, android.content.Context context, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    private final synchronized void zzaA() {
        zzaG(27);
        try {
            try {
                com.android.billingclient.api.zzcd zzcdVar = null;
                if (this.zzd != null && this.zzc != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.zza.unbindService(this.zzd);
                    this.zzd = new com.android.billingclient.api.zzcc(this, zzcdVar);
                }
                this.zzc = null;
                if (this.zze != null) {
                    this.zze.shutdownNow();
                    this.zze = null;
                }
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
            this.zzb = 3;
        } catch (java.lang.Throwable th) {
            this.zzb = 3;
            throw th;
        }
    }

    private final synchronized void zzaB() {
        if (zzat()) {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            zzaG(26);
            return;
        }
        if (this.zzb == 1) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.zzb == 3) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_CLIENT_CLOSED, 26, com.android.billingclient.api.zzcj.zza(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.zzb = 1;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
        this.zzd = new com.android.billingclient.api.zzcc(this, null);
        android.content.Intent intent = new android.content.Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        android.content.Context context = this.zza;
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzieVar = com.google.android.gms.internal.play_billing.zzie.INTENT_SERVICE_NOT_FOUND;
        } else {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                java.lang.String str2 = resolveInfo.serviceInfo.name;
                if (!java.util.Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzieVar = com.google.android.gms.internal.play_billing.zzie.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                    android.content.Intent intent2 = new android.content.Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.zzd, 1)) {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzieVar = com.google.android.gms.internal.play_billing.zzie.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.zzb = 0;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
        zzaF(zzieVar, 26, com.android.billingclient.api.zzcj.zza(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzaC(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.BillingResult zzaD(int i, int i2) {
        com.android.billingclient.api.BillingResult billingResultZza = com.android.billingclient.api.zzcj.zza(i2, "Billing override value was set by a license tester.");
        zzaF(com.google.android.gms.internal.play_billing.zzie.LICENSE_TESTER_BILLING_OVERRIDE, i, billingResultZza);
        return billingResultZza;
    }

    private final com.google.android.gms.internal.play_billing.zzcz zzaE(final int i) {
        if (zzat()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzbv
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final java.lang.Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return com.android.billingclient.api.zzce.zzav(this.zza, i, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, com.android.billingclient.api.zzcj.zza(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.zzcu.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaF(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult) {
        int i2 = com.android.billingclient.api.zzcg.zza;
        zzj().zza((com.google.android.gms.internal.play_billing.zzhx) java.util.Objects.requireNonNull(com.android.billingclient.api.zzcg.zzb(zzieVar, i, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), "ApiFailure should not be null"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaG(int i) {
        int i2 = com.android.billingclient.api.zzcg.zza;
        zzj().zzf((com.google.android.gms.internal.play_billing.zzib) java.util.Objects.requireNonNull(com.android.billingclient.api.zzcg.zzc(i, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), "ApiSuccess should not be null"));
    }

    private final void zzaH(int i, androidx.core.util.Consumer consumer, java.lang.Runnable runnable) {
        com.google.android.gms.internal.play_billing.zzcu.zzc(com.google.android.gms.internal.play_billing.zzcu.zzb(zzaE(i), 28500L, java.util.concurrent.TimeUnit.MILLISECONDS, zzaz()), new com.android.billingclient.api.zzca(this, i, consumer, runnable), zzF());
    }

    public static /* synthetic */ java.lang.Object zzav(com.android.billingclient.api.zzce zzceVar, int i, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        java.lang.String str;
        try {
            zzceVar.zzc.getClass();
            com.google.android.gms.internal.play_billing.zzau zzauVar = zzceVar.zzc;
            java.lang.String packageName = zzceVar.zza.getPackageName();
            if (i == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i == 4) {
                str = "CONSUME_ASYNC";
            } else if (i != 5) {
                str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzauVar.zza(packageName, str, new com.android.billingclient.api.zzcb(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (java.lang.Exception e) {
            zzceVar.zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzay(com.google.android.gms.internal.play_billing.zzcz zzczVar) {
        try {
            return ((java.lang.Integer) zzczVar.get(28500L, java.util.concurrent.TimeUnit.MILLISECONDS)).intValue();
        } catch (java.util.concurrent.TimeoutException e) {
            zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (java.lang.Exception e2) {
            if (e2 instanceof java.lang.InterruptedException) {
                java.lang.Thread.currentThread().interrupt();
            }
            zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    private final synchronized java.util.concurrent.ScheduledExecutorService zzaz() {
        if (this.zze == null) {
            this.zze = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        }
        return this.zze;
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, final com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        java.util.Objects.requireNonNull(acknowledgePurchaseResponseListener);
        zzaH(3, new androidx.core.util.Consumer() { // from class: com.android.billingclient.api.zzbw
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((com.android.billingclient.api.BillingResult) obj);
            }
        }, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzbx
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final com.android.billingclient.api.ConsumeParams consumeParams, final com.android.billingclient.api.ConsumeResponseListener consumeResponseListener) {
        zzaH(4, new androidx.core.util.Consumer() { // from class: com.android.billingclient.api.zzbt
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                consumeResponseListener.onConsumeResponse((com.android.billingclient.api.BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.consumeAsync(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaA();
        super.endConnection();
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final com.android.billingclient.api.BillingResult launchBillingFlow(final android.app.Activity activity, final com.android.billingclient.api.BillingFlowParams billingFlowParams) {
        androidx.core.util.Consumer consumer = new androidx.core.util.Consumer() { // from class: com.android.billingclient.api.zzby
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                super/*com.android.billingclient.api.BillingClientImpl*/.zzm((com.android.billingclient.api.BillingResult) obj);
            }
        };
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzbz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return super/*com.android.billingclient.api.BillingClientImpl*/.launchBillingFlow(activity, billingFlowParams);
            }
        };
        int iZzay = zzay(zzaE(2));
        if (zzaC(iZzay)) {
            com.android.billingclient.api.BillingResult billingResultZzaD = zzaD(2, iZzay);
            consumer.accept(billingResultZzaD);
            return billingResultZzaD;
        }
        try {
            return (com.android.billingclient.api.BillingResult) callable.call();
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzh;
            zzaF(zzieVar, 2, billingResult);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An internal error occurred.", e);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, final com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) {
        zzaH(7, new androidx.core.util.Consumer() { // from class: com.android.billingclient.api.zzbr
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                com.android.billingclient.api.QueryProductDetailsResult queryProductDetailsResult = new com.android.billingclient.api.QueryProductDetailsResult(new java.util.ArrayList(), new java.util.ArrayList());
                productDetailsResponseListener.onProductDetailsResponse((com.android.billingclient.api.BillingResult) obj, queryProductDetailsResult);
            }
        }, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void startConnection(com.android.billingclient.api.BillingClientStateListener billingClientStateListener) {
        zzaB();
        super.startConnection(billingClientStateListener);
    }

    public final synchronized boolean zzat() {
        return (this.zzb != 2 || this.zzc == null || this.zzd == null) ? false : true;
    }

    zzce(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.zzco zzcoVar, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, null, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    zzce(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.zzb zzbVar, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        super((java.lang.String) null, pendingPurchasesParams, context, purchasesUpdatedListener, (com.android.billingclient.api.zzb) null, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    zzce(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzch zzchVar, java.util.concurrent.ExecutorService executorService, com.android.billingclient.api.BillingClient.Builder builder) {
        super((java.lang.String) null, pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, builder);
        this.zzb = 0;
        this.zza = context;
    }
}
