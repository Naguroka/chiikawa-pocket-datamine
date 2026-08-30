package com.google.firebase.sessions;

/* JADX INFO: compiled from: InstallationId.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.InstallationId.Companion INSTANCE = new com.google.firebase.sessions.InstallationId.Companion(null);
    private static final java.lang.String TAG = "InstallationId";
    private final java.lang.String authToken;
    private final java.lang.String fid;

    public /* synthetic */ InstallationId(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* JADX INFO: compiled from: InstallationId.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public final java.lang.Object create(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> continuation) {
            com.google.firebase.sessions.InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r10;
            java.lang.String str;
            ?? r9;
            if (continuation instanceof com.google.firebase.sessions.InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (com.google.firebase.sessions.InstallationId$Companion$create$1) continuation;
                if ((installationId$Companion$create$1.label & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label -= Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new com.google.firebase.sessions.InstallationId$Companion$create$1(this, continuation);
                }
            } else {
                installationId$Companion$create$1 = new com.google.firebase.sessions.InstallationId$Companion$create$1(this, continuation);
            }
            java.lang.Object objAwait = installationId$Companion$create$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = installationId$Companion$create$1.label;
            java.lang.String str2 = "";
            try {
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(objAwait);
                        com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "firebaseInstallations.getToken(false)");
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        objAwait = kotlinx.coroutines.tasks.TasksKt.await(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i == 1) {
                            com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi2 = (com.google.firebase.installations.FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                            kotlin.ResultKt.throwOnFailure(objAwait);
                            firebaseInstallationsApi = firebaseInstallationsApi2;
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.String str3 = (java.lang.String) installationId$Companion$create$1.L$0;
                            kotlin.ResultKt.throwOnFailure(objAwait);
                            firebaseInstallationsApi = str3;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objAwait, "{\n          firebaseInst…ions.id.await()\n        }");
                        str2 = (java.lang.String) objAwait;
                        r9 = firebaseInstallationsApi;
                        return new com.google.firebase.sessions.InstallationId(str2, r9, null);
                    }
                    java.lang.String token2 = ((com.google.firebase.installations.InstallationTokenResult) objAwait).getToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token2, "{\n          firebaseInst…).await().token\n        }");
                    r10 = firebaseInstallationsApi;
                    str = token2;
                } catch (java.lang.Exception e) {
                    android.util.Log.w(com.google.firebase.sessions.InstallationId.TAG, "Error getting authentication token.", e);
                    r10 = firebaseInstallationsApi;
                    str = "";
                }
                com.google.android.gms.tasks.Task<java.lang.String> id = r10.getId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
                installationId$Companion$create$1.L$0 = str;
                installationId$Companion$create$1.label = 2;
                objAwait = kotlinx.coroutines.tasks.TasksKt.await(id, installationId$Companion$create$1);
                firebaseInstallationsApi = str;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objAwait, "{\n          firebaseInst…ions.id.await()\n        }");
                str2 = (java.lang.String) objAwait;
                r9 = firebaseInstallationsApi;
            } catch (java.lang.Exception e2) {
                android.util.Log.w(com.google.firebase.sessions.InstallationId.TAG, "Error getting Firebase installation id .", e2);
                r9 = firebaseInstallationsApi;
            }
            return new com.google.firebase.sessions.InstallationId(str2, r9, null);
        }
    }

    private InstallationId(java.lang.String str, java.lang.String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    public final java.lang.String getFid() {
        return this.fid;
    }
}
