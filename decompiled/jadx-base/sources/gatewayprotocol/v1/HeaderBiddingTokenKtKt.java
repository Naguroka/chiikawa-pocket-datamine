package gatewayprotocol.v1;

/* JADX INFO: compiled from: HeaderBiddingTokenKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010-\u001a\u00020.2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0002\b3H\u0087\bø\u0001\u0000¢\u0006\u0002\b4\u001a)\u00105\u001a\u00020.*\u00020.2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0002\b3H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0017\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0017\u0010%\u001a\u0004\u0018\u00010&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0017\u0010)\u001a\u0004\u0018\u00010**\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"campaignStateOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "clientInfoOrNull", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "initializationDataOrNull", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "piiOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "testDataOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "timestampsOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "tokenCountersOrNull", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "headerBiddingToken", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeheaderBiddingToken", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HeaderBiddingTokenKtKt {
    /* JADX INFO: renamed from: -initializeheaderBiddingToken, reason: not valid java name */
    public static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken m1263initializeheaderBiddingToken(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.Companion companion = gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.INSTANCE;
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingToken, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.Companion companion = gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.INSTANCE;
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder = headerBiddingToken.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfoOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestampsOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.PiiOuterClass.Pii getPiiOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    public static final gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignStateOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasLimitedSessionToken()) {
            return headerBiddingTokenOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final gatewayprotocol.v1.InitializationDataOuterClass.InitializationData getInitializationDataOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasInitializationData()) {
            return headerBiddingTokenOrBuilder.getInitializationData();
        }
        return null;
    }

    public static final gatewayprotocol.v1.TestDataOuterClass.TestData getTestDataOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTestData()) {
            return headerBiddingTokenOrBuilder.getTestData();
        }
        return null;
    }

    public static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTokenCounters()) {
            return headerBiddingTokenOrBuilder.getTokenCounters();
        }
        return null;
    }
}
