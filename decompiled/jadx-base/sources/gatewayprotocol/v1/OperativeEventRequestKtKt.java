package gatewayprotocol.v1;

/* JADX INFO: compiled from: OperativeEventRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0018\u001a)\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"campaignStateOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeoperativeEventRequest", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventRequestKtKt {
    /* JADX INFO: renamed from: -initializeoperativeEventRequest, reason: not valid java name */
    public static final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest m1274initializeoperativeEventRequest(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.OperativeEventRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder builderNewBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest copy(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.OperativeEventRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequest, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder = operativeEventRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasSessionCounters()) {
            return operativeEventRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return operativeEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return operativeEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignStateOrNull(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasCampaignState()) {
            return operativeEventRequestOrBuilder.getCampaignState();
        }
        return null;
    }
}
