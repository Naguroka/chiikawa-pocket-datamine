package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.moduleinstall.ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    private static final com.google.android.gms.common.api.Api zae;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zac = clientKey;
        com.google.android.gms.common.moduleinstall.internal.zaq zaqVar = new com.google.android.gms.common.moduleinstall.internal.zaq();
        zad = zaqVar;
        zae = new com.google.android.gms.common.api.Api("ModuleInstall.API", zaqVar, clientKey);
    }

    public zay(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zae, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    static final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad(boolean z, com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(optionalModuleApiArr, "Requested APIs must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(optionalModuleApiArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.google.android.gms.common.api.OptionalModuleApi optionalModuleApi : optionalModuleApiArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(optionalModuleApi, "Requested API must not be null.");
        }
        return com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(java.util.Arrays.asList(optionalModuleApiArr), z);
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr) {
        final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse(true, 0));
        }
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zar.zaa);
        builder.setMethodKey(27301);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zal
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zae(new com.google.android.gms.common.moduleinstall.internal.zar(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr) {
        final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zar.zaa);
        builder.setMethodKey(27302);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zag(new com.google.android.gms.common.moduleinstall.internal.zas(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), apiFeatureRequestZad, null);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr) {
        final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequestZad = zad(true, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse(null));
        }
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zar.zaa);
        builder.setMethodKey(27307);
        builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zan
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zaf(new com.google.android.gms.common.moduleinstall.internal.zaw(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest moduleInstallRequest) {
        final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequestFromModuleInstallRequest = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.fromModuleInstallRequest(moduleInstallRequest);
        final com.google.android.gms.common.moduleinstall.InstallStatusListener listener = moduleInstallRequest.getListener();
        java.util.concurrent.Executor listenerExecutor = moduleInstallRequest.getListenerExecutor();
        if (apiFeatureRequestFromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleInstallResponse(0));
        }
        if (listener == null) {
            com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
            builder.setFeatures(com.google.android.gms.internal.base.zar.zaa);
            builder.setAutoResolveMissingFeatures(true);
            builder.setMethodKey(27304);
            builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zao
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                    ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zag(new com.google.android.gms.common.moduleinstall.internal.zat(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), apiFeatureRequestFromModuleInstallRequest, null);
                }
            });
            return doRead(builder.build());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listener);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = listenerExecutor == null ? registerListener(listener, "InstallStatusListener") : com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(listener, listenerExecutor, "InstallStatusListener");
        final com.google.android.gms.common.moduleinstall.internal.zaab zaabVar = new com.google.android.gms.common.moduleinstall.internal.zaab(listenerHolderRegisterListener);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        com.google.android.gms.common.api.internal.RemoteCall remoteCall = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zag(new com.google.android.gms.common.moduleinstall.internal.zau(this.zaa, atomicReference, (com.google.android.gms.tasks.TaskCompletionSource) obj2, listener), apiFeatureRequestFromModuleInstallRequest, zaabVar);
            }
        };
        com.google.android.gms.common.api.internal.RemoteCall remoteCall2 = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zai(new com.google.android.gms.common.moduleinstall.internal.zav(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), zaabVar);
            }
        };
        com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder2 = com.google.android.gms.common.api.internal.RegistrationMethods.builder();
        builder2.withHolder(listenerHolderRegisterListener);
        builder2.setFeatures(com.google.android.gms.internal.base.zar.zaa);
        builder2.setAutoResolveMissingFeatures(true);
        builder2.register(remoteCall);
        builder2.unregister(remoteCall2);
        builder2.setMethodKey(27305);
        return doRegisterEventListener(builder2.build()).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.moduleinstall.internal.zak
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i = com.google.android.gms.common.moduleinstall.internal.zay.zab;
                java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? com.google.android.gms.tasks.Tasks.forResult((com.google.android.gms.common.moduleinstall.ModuleInstallResponse) atomicReference2.get()) : com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR));
            }
        });
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr) {
        final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zar.zaa);
        builder.setMethodKey(27303);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) obj).getService()).zah(new com.google.android.gms.common.moduleinstall.internal.zax(this.zaa, (com.google.android.gms.tasks.TaskCompletionSource) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(installStatusListener, "InstallStatusListener"), 27306);
    }

    public zay(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zae, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
