package gatewayprotocol.v1;

/* JADX INFO: compiled from: UniversalRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010M\u001a\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0087\bø\u0001\u0000¢\u0006\u0002\bT\u001a)\u0010U\u001a\u00020N*\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\u001a)\u0010U\u001a\u00020/*\u00020/2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\u001a)\u0010U\u001a\u00020>*\u00020>2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010&\u001a\u0004\u0018\u00010'*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010*\u001a\u0004\u0018\u00010+*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u0010.\u001a\u0004\u0018\u00010/*\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00103\u001a\u0004\u0018\u000104*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u00107\u001a\u0004\u0018\u000108*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0017\u0010;\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b<\u0010\u0011\"\u0017\u0010=\u001a\u0004\u0018\u00010>*\u0002008F¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0017\u0010A\u001a\u0004\u0018\u00010B*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u0017\u0010E\u001a\u0004\u0018\u00010F*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0017\u0010I\u001a\u0004\u0018\u00010J*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X"}, d2 = {"adDataRefreshRequestOrNull", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;", "getAdDataRefreshRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adPlayerConfigRequestOrNull", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adRequestOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "getAdRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "appStartTimeOrNull", "Lcom/google/protobuf/Timestamp;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;", "getAppStartTimeOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "developerConsentOrNull", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "diagnosticEventRequestOrNull", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getTokenEventRequestOrNull", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "initializationCompletedEventRequestOrNull", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationRequestOrNull", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "operativeEventOrNull", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEventOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "payloadOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "piiOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "privacyUpdateRequestOrNull", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "sdkStartTimeOrNull", "getSdkStartTimeOrNull", "sharedDataOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "getSharedDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "testDataOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "timestampsOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "transactionEventRequestOrNull", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuniversalRequest", "copy", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UniversalRequestKtKt {
    /* JADX INFO: renamed from: -initializeuniversalRequest, reason: not valid java name */
    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest m1293initializeuniversalRequest(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest copy(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequest, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData copy(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = sharedData.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestampsOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTimestamps()) {
            return sharedDataOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final gatewayprotocol.v1.PiiOuterClass.Pii getPiiOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasPii()) {
            return sharedDataOrBuilder.getPii();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasDeveloperConsent()) {
            return sharedDataOrBuilder.getDeveloperConsent();
        }
        return null;
    }

    public static final gatewayprotocol.v1.TestDataOuterClass.TestData getTestDataOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTestData()) {
            return sharedDataOrBuilder.getTestData();
        }
        return null;
    }

    public static final com.google.protobuf.Timestamp getAppStartTimeOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasAppStartTime()) {
            return sharedDataOrBuilder.getAppStartTime();
        }
        return null;
    }

    public static final com.google.protobuf.Timestamp getSdkStartTimeOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasSdkStartTime()) {
            return sharedDataOrBuilder.getSdkStartTime();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasLimitedSessionToken()) {
            return sharedDataOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload copy(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder = payload.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationRequest()) {
            return payloadOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdRequestOuterClass.AdRequest getAdRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRequest()) {
            return payloadOrBuilder.getAdRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasOperativeEvent()) {
            return payloadOrBuilder.getOperativeEvent();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasDiagnosticEventRequest()) {
            return payloadOrBuilder.getDiagnosticEventRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigRequest()) {
            return payloadOrBuilder.getAdPlayerConfigRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasGetTokenEventRequest()) {
            return payloadOrBuilder.getGetTokenEventRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateRequest()) {
            return payloadOrBuilder.getPrivacyUpdateRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshRequest()) {
            return payloadOrBuilder.getAdDataRefreshRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationCompletedEventRequest()) {
            return payloadOrBuilder.getInitializationCompletedEventRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasTransactionEventRequest()) {
            return payloadOrBuilder.getTransactionEventRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasSharedData()) {
            return universalRequestOrBuilder.getSharedData();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasPayload()) {
            return universalRequestOrBuilder.getPayload();
        }
        return null;
    }
}
