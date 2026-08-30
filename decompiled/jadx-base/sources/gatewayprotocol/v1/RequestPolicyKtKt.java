package gatewayprotocol.v1;

/* JADX INFO: compiled from: RequestPolicyKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"retryPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;", "getRetryPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "timeoutPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getTimeoutPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "requestPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/RequestPolicyKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializerequestPolicy", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RequestPolicyKtKt {
    /* JADX INFO: renamed from: -initializerequestPolicy, reason: not valid java name */
    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy m1279initializerequestPolicy(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.RequestPolicyKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.RequestPolicyKt.Dsl.Companion companion = gatewayprotocol.v1.RequestPolicyKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy copy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.RequestPolicyKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPolicy, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.RequestPolicyKt.Dsl.Companion companion = gatewayprotocol.v1.RequestPolicyKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder = requestPolicy.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.RequestPolicyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasRetryPolicy()) {
            return requestPolicyOrBuilder.getRetryPolicy();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasTimeoutPolicy()) {
            return requestPolicyOrBuilder.getTimeoutPolicy();
        }
        return null;
    }
}
