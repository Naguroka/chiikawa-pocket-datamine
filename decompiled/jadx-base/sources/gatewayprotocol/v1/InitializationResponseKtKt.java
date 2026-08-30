package gatewayprotocol.v1;

/* JADX INFO: compiled from: InitializationResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;", "getErrorOrNull", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "nativeConfigurationOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfigurationOrNull", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "initializationResponse", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinitializationResponse", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializationResponseKtKt {
    /* JADX INFO: renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse m1268initializeinitializationResponse(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.InitializationResponseKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.InitializationResponseKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationResponseKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builderNewBuilder = gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.InitializationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse copy(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.InitializationResponseKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationResponse, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.InitializationResponseKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationResponseKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builder = initializationResponse.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.InitializationResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }

    public static final gatewayprotocol.v1.ErrorOuterClass.Error getErrorOrNull(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }
}
