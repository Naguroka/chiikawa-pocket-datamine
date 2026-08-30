package gatewayprotocol.v1;

/* JADX INFO: compiled from: InitializationDataKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"initializationRequestOrNull", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationDataOrBuilder;", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationDataOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "sharedDataOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "getSharedDataOrNull", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationDataOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "initializationData", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/InitializationDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinitializationData", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializationDataKtKt {
    /* JADX INFO: renamed from: -initializeinitializationData, reason: not valid java name */
    public static final gatewayprotocol.v1.InitializationDataOuterClass.InitializationData m1265initializeinitializationData(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.InitializationDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.InitializationDataKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.InitializationDataOuterClass.InitializationData copy(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData initializationData, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.InitializationDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.InitializationDataKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder builder = initializationData.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasInitializationRequest()) {
            return initializationDataOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasSharedData()) {
            return initializationDataOrBuilder.getSharedData();
        }
        return null;
    }
}
