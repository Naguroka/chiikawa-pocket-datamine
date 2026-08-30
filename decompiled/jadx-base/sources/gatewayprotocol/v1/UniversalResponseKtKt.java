package gatewayprotocol.v1;

/* JADX INFO: compiled from: UniversalResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\"\u001a\u00020#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0002\b(H\u0087\bø\u0001\u0000¢\u0006\u0002\b)\u001a)\u0010*\u001a\u00020#*\u00020#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0002\b(H\u0086\bø\u0001\u0000\u001a)\u0010*\u001a\u00020\u001b*\u00020\u001b2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020'0%¢\u0006\u0002\b(H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"adDataRefreshResponseOrNull", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;", "getAdDataRefreshResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adPlayerConfigResponseOrNull", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "getAdPlayerConfigResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adResponseOrNull", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "getAdResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "initializationResponseOrNull", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "getInitializationResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "mutableDataOrNull", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "payloadOrNull", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "privacyUpdateResponseOrNull", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "getPrivacyUpdateResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "universalResponse", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuniversalResponse", "copy", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UniversalResponseKtKt {
    /* JADX INFO: renamed from: -initializeuniversalResponse, reason: not valid java name */
    public static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse m1295initializeuniversalResponse(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalResponseKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse copy(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalResponseKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalResponse, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builder = universalResponse.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload copy(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder = payload.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getInitializationResponseOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationResponse()) {
            return payloadOrBuilder.getInitializationResponse();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdResponseOuterClass.AdResponse getAdResponseOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdResponse()) {
            return payloadOrBuilder.getAdResponse();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigResponse()) {
            return payloadOrBuilder.getAdPlayerConfigResponse();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponseOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshResponse()) {
            return payloadOrBuilder.getAdDataRefreshResponse();
        }
        return null;
    }

    public static final gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateResponse()) {
            return payloadOrBuilder.getPrivacyUpdateResponse();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getPayloadOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasPayload()) {
            return universalResponseOrBuilder.getPayload();
        }
        return null;
    }

    public static final gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableDataOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasMutableData()) {
            return universalResponseOrBuilder.getMutableData();
        }
        return null;
    }

    public static final gatewayprotocol.v1.ErrorOuterClass.Error getErrorOrNull(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasError()) {
            return universalResponseOrBuilder.getError();
        }
        return null;
    }
}
