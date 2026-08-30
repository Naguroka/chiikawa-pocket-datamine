package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJm\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "baseUrl", "", "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "doConfigFetch", "", "headerOptions", "", "onSuccess", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "onFailure", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settingsUrl", "Ljava/net/URL;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteSettingsFetcher implements com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher {
    private static final java.lang.String FIREBASE_PLATFORM = "android";
    private static final java.lang.String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final com.google.firebase.sessions.ApplicationInfo appInfo;
    private final java.lang.String baseUrl;
    private final kotlin.coroutines.CoroutineContext blockingDispatcher;

    public RemoteSettingsFetcher(com.google.firebase.sessions.ApplicationInfo appInfo, kotlin.coroutines.CoroutineContext blockingDispatcher, java.lang.String baseUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
        this.baseUrl = baseUrl;
    }

    public /* synthetic */ RemoteSettingsFetcher(com.google.firebase.sessions.ApplicationInfo applicationInfo, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i & 4) != 0 ? FIREBASE_SESSIONS_BASE_URL_STRING : str);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $headerOptions;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onFailure;
        final /* synthetic */ kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(java.util.Map<java.lang.String, java.lang.String> map, kotlin.jvm.functions.Function2<? super org.json.JSONObject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$headerOptions = map;
            this.$onSuccess = function2;
            this.$onFailure = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.settings.RemoteSettingsFetcher.this.new AnonymousClass2(this.$headerOptions, this.$onSuccess, this.$onFailure, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.net.URLConnection uRLConnectionOpenConnection = com.google.firebase.sessions.settings.RemoteSettingsFetcher.this.settingsUrl().openConnection();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.json.zb.L);
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.$headerOptions.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        java.io.InputStream inputStream = httpsURLConnection.getInputStream();
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            objectRef.element = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((java.lang.String) objectRef.element);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        org.json.JSONObject jSONObject = new org.json.JSONObject(sb.toString());
                        kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$onSuccess;
                        this.label = 1;
                        if (function2.invoke(jSONObject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.$onFailure;
                        java.lang.String str = "Bad response code: " + responseCode;
                        this.label = 2;
                        if (function3.invoke(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (java.lang.Exception e) {
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function4 = this.$onFailure;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.label = 3;
                if (function4.invoke(message, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public java.lang.Object doConfigFetch(java.util.Map<java.lang.String, java.lang.String> map, kotlin.jvm.functions.Function2<? super org.json.JSONObject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.blockingDispatcher, new com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2(map, function2, function3, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.net.URL settingsUrl() {
        return new java.net.URL(new android.net.Uri.Builder().scheme("https").authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }
}
