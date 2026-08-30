package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class Registrar implements com.google.firebase.components.ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class FIIDInternalAdapter implements com.google.firebase.iid.internal.FirebaseInstanceIdInternal {
        final com.google.firebase.iid.FirebaseInstanceId fiid;

        public FIIDInternalAdapter(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId) {
            this.fiid = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public void addNewTokenListener(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
            this.fiid.addNewTokenListener(newTokenListener);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public void deleteToken(java.lang.String str, java.lang.String str2) throws java.io.IOException {
            this.fiid.deleteToken(str, str2);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public java.lang.String getId() {
            return this.fiid.getId();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public java.lang.String getToken() {
            return this.fiid.getToken();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public com.google.android.gms.tasks.Task<java.lang.String> getTokenTask() {
            java.lang.String token = this.fiid.getToken();
            return token != null ? com.google.android.gms.tasks.Tasks.forResult(token) : this.fiid.getInstanceId().continueWith(com.google.firebase.iid.Registrar$FIIDInternalAdapter$$Lambda$0.$instance);
        }
    }

    static final /* synthetic */ com.google.firebase.iid.FirebaseInstanceId lambda$getComponents$0$Registrar(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.iid.FirebaseInstanceId((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), componentContainer.getProvider(com.google.firebase.platforminfo.UserAgentPublisher.class), componentContainer.getProvider(com.google.firebase.heartbeatinfo.HeartBeatInfo.class), (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class));
    }

    static final /* synthetic */ com.google.firebase.iid.internal.FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.iid.Registrar.FIIDInternalAdapter((com.google.firebase.iid.FirebaseInstanceId) componentContainer.get(com.google.firebase.iid.FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.iid.FirebaseInstanceId.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.platforminfo.UserAgentPublisher.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.heartbeatinfo.HeartBeatInfo.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.installations.FirebaseInstallationsApi.class)).factory(com.google.firebase.iid.Registrar$$Lambda$0.$instance).alwaysEager().build(), com.google.firebase.components.Component.builder(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.iid.FirebaseInstanceId.class)).factory(com.google.firebase.iid.Registrar$$Lambda$1.$instance).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-iid", com.google.firebase.iid.BuildConfig.VERSION_NAME));
    }
}
