package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/ironsource/ur;", "Lcom/ironsource/ao;", "Landroid/content/Context;", "context", "Lcom/ironsource/nr;", "initRequest", "Lcom/ironsource/mr;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/gr;", "sdkInitResponse", "c", "Lcom/ironsource/hs;", "serverResponse", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onInitFailed", "Lcom/ironsource/xr;", "b", "Lcom/ironsource/xr;", "tools", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ur implements com.json.ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.ur f3478a = new com.json.ur();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final com.json.xr tools = new com.json.xr();

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ur$a", "Lcom/ironsource/mr;", "Lcom/ironsource/gr;", "sdkConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.mr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mr f3479a;

        a(com.json.mr mrVar) {
            this.f3479a = mrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.gr sdkConfig, com.json.mr listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
            com.json.ur.f3478a.a(sdkConfig, listener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.mr listener, com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error);
        }

        @Override // com.json.mr
        public void a(final com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.json.xr xrVar = com.json.ur.tools;
            final com.json.mr mrVar = this.f3479a;
            xrVar.a(new java.lang.Runnable() { // from class: com.ironsource.ur$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ur.a.a(sdkConfig, mrVar);
                }
            });
        }

        @Override // com.json.mr
        public void a(final com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.xr xrVar = com.json.ur.tools;
            final com.json.mr mrVar = this.f3479a;
            xrVar.d(new java.lang.Runnable() { // from class: com.ironsource.ur$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ur.a.a(mrVar, error);
                }
            });
        }
    }

    private ur() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    private final void a(android.content.Context context, com.json.nr initRequest, final com.json.mr listener, boolean demandOnly) {
        boolean z;
        java.lang.String strF = initRequest.f();
        if (strF != null) {
            z = strF.length() > 0;
        }
        if (z) {
            com.json.mediationsdk.p.m().t(initRequest.f());
        } else {
            initRequest = new com.json.nr(initRequest.d(), com.json.mediationsdk.p.m().o(), kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) initRequest.e()));
        }
        com.json.mediationsdk.p pVarM = com.json.mediationsdk.p.m();
        java.lang.String strD = initRequest.d();
        com.ironsource.mediationsdk.IronSource.AD_UNIT[] ad_unitArr = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) initRequest.e().toArray(new com.ironsource.mediationsdk.IronSource.AD_UNIT[0]);
        final com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = pVarM.a(context, strD, demandOnly, null, this, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) java.util.Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        if (ironSourceErrorA == null || ironSourceErrorA.getErrorCode() == 2020) {
            com.json.tr.f3447a.a(context, initRequest, new com.ironsource.ur.a(listener));
            return;
        }
        if (ironSourceErrorA.getErrorCode() == 2040) {
            com.json.hs hsVarH = com.json.mediationsdk.p.m().h();
            if (hsVarH != null) {
                a(new com.json.gr(new com.json.or(hsVarH)), listener);
                return;
            }
        } else if (ironSourceErrorA.getErrorCode() == 2030) {
            com.json.tr.f3447a.e();
            return;
        }
        tools.d(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ur.a(listener, ironSourceErrorA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.json.gr sdkInitResponse, final com.json.mr listener) {
        if (com.json.mediationsdk.p.m().a(false, sdkInitResponse.d())) {
            tools.d(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.ur.a(listener, sdkInitResponse);
                }
            });
        } else {
            tools.d(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.ur.a(listener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        com.json.tr.f3447a.b(new com.json.ir(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.a(new com.json.ir(com.json.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mr listener, com.json.gr sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mr listener, com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "error");
        listener.a(new com.json.ir(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(android.content.Context context, com.json.nr initRequest, com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        f3478a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.hs serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        com.json.tr.f3447a.a(new com.json.or(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(android.content.Context context, com.json.nr initRequest, com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        com.json.mediationsdk.p pVarM = com.json.mediationsdk.p.m();
        java.lang.String strD = initRequest.d();
        com.ironsource.mediationsdk.IronSource.AD_UNIT[] ad_unitArr = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) initRequest.e().toArray(new com.ironsource.mediationsdk.IronSource.AD_UNIT[0]);
        java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> validAdUnitsList = pVarM.a(context, strD, false, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) java.util.Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        f3478a.a(context, initRequest, listener, true);
    }

    public final void a(final android.content.Context context, final com.json.nr initRequest, final com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ur.b(context, initRequest, listener);
            }
        });
    }

    @Override // com.json.ao
    public void a(final com.json.hs serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        tools.a(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ur.b(serverResponse);
            }
        });
    }

    public final void c(final android.content.Context context, final com.json.nr initRequest, final com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ur.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.json.ao
    public void onInitFailed(final com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        tools.a(new java.lang.Runnable() { // from class: com.ironsource.ur$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ur.a(error);
            }
        });
    }
}
