package com.google.android.gms.common.moduleinstall;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface ModuleInstallClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest moduleInstallRequest);

    com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener);
}
