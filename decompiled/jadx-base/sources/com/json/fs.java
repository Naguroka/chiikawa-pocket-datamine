package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\n\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\n\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0016"}, d2 = {"Lcom/ironsource/fs;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/xr;", "tools", "Lcom/ironsource/nr;", "request", "Lcom/ironsource/sr;", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "encryptedResponse", "", "hasCompression", "reason", "Lcom/ironsource/ir;", "Lcom/ironsource/mr;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fs {
    private final com.json.ir a(java.lang.String reason) {
        return reason != null ? new com.json.ir(2110, reason) : new com.json.ir(com.json.ir.d, "noServerResponse");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.json.sr a(android.content.Context context, com.json.xr tools, com.json.nr request) {
        try {
            java.lang.String strA = tools.a(context);
            if (android.text.TextUtils.isEmpty(strA)) {
                strA = tools.b(context);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            java.lang.String strSendPostRequest = com.json.mediationsdk.server.HttpFunctions.sendPostRequest(com.json.mediationsdk.server.ServerURL.buildInitURL(context, request.d(), request.f(), strA, null, true, null, false), com.json.li.a().toString(), new com.ironsource.mediationsdk.p.c() { // from class: com.ironsource.fs$$ExternalSyntheticLambda0
                @Override // com.ironsource.mediationsdk.p.c
                public final void a(java.lang.String str) {
                    com.json.fs.a(objectRef, str);
                }
            });
            if (strSendPostRequest == null) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.warning("serverResponseString is null");
                return new com.json.sr(a((java.lang.String) objectRef.element));
            }
            if (tools.c()) {
                com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                org.json.JSONObject jSONObject = new org.json.JSONObject(strSendPostRequest);
                java.lang.String encryptedResponse = jSONObject.optString(com.json.hs.n);
                if (android.text.TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new com.json.sr(new com.json.ir(2100, com.json.lr.FALSE_AVAILABILITY_REASON_NO_RESPONSE_KEY));
                }
                boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                strSendPostRequest = a(encryptedResponse, zOptBoolean);
                if (android.text.TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    tools.d();
                    return new com.json.sr(new com.json.ir(com.json.ir.f, com.json.lr.FALSE_AVAILABILITY_REASON_DECRYPTION_FAILED));
                }
            }
            com.json.hs hsVar = new com.json.hs(context, request.d(), request.f(), strSendPostRequest);
            hsVar.a(com.ironsource.hs.a.SERVER);
            if (hsVar.p()) {
                return new com.json.sr(new com.json.or(hsVar));
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning("response invalid - return null");
            return new com.json.sr(new com.json.ir(com.json.ir.e, "serverResponseIsNotValid"));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning("exception = " + e);
            return new com.json.sr(e instanceof org.json.JSONException ? new com.json.ir(com.json.ir.e, "serverResponseIsNotValid") : new com.json.ir(510, "internal error"));
        }
    }

    private final java.lang.String a(java.lang.String encryptedResponse, boolean hasCompression) {
        java.lang.String strDecryptAndDecompress = hasCompression ? com.json.mediationsdk.utils.IronSourceAES.decryptAndDecompress(com.json.jb.b().c(), encryptedResponse) : com.json.mediationsdk.utils.IronSourceAES.decode(com.json.jb.b().c(), encryptedResponse);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strDecryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strDecryptAndDecompress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(kotlin.jvm.internal.Ref.ObjectRef reason, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "$reason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        reason.element = errorMessage;
    }

    private final com.json.sr b(android.content.Context context, com.json.xr tools, com.json.nr request) {
        com.json.sr srVarA = a(context, tools, request);
        if (srVarA.c()) {
            return srVarA;
        }
        com.json.mediationsdk.logger.IronSourceLoggerManager logger = com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger();
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        com.json.hs hsVarA = tools.a(context, request.d());
        if (hsVarA == null) {
            return srVarA;
        }
        com.json.sr srVar = new com.json.sr(new com.json.or(hsVarA));
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(ironSourceTag, com.json.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(request.d(), request.f()) + ": " + srVar.getSdkInitResponse(), 1);
        tools.e();
        return srVar;
    }

    public final void a(android.content.Context context, com.json.nr request, com.json.xr tools, com.json.mr listener) {
        com.json.ir error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        java.lang.String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.getGlobalDataWriter().i(request.f());
        com.json.sr srVarB = b(context, tools, request);
        if (srVarB.getSdkInitResponse() != null) {
            com.json.gr grVar = new com.json.gr(srVarB.getSdkInitResponse());
            if (srVarB.c()) {
                listener.a(grVar);
                return;
            }
            error = new com.json.ir(com.json.ir.e, "serverResponseIsNotValid");
        } else {
            error = srVarB.getError();
            if (error == null) {
                error = new com.json.ir(510, "unknown error");
            }
        }
        listener.a(error);
    }
}
