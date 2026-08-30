package gatewayprotocol.v1;

/* JADX INFO: compiled from: TokenCountersKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"tokenCounters", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/TokenCountersKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetokenCounters", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TokenCountersKtKt {
    /* JADX INFO: renamed from: -initializetokenCounters, reason: not valid java name */
    public static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters m1288initializetokenCounters(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.TokenCountersKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.TokenCountersKt.Dsl.Companion companion = gatewayprotocol.v1.TokenCountersKt.Dsl.INSTANCE;
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters copy(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.TokenCountersKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenCounters, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.TokenCountersKt.Dsl.Companion companion = gatewayprotocol.v1.TokenCountersKt.Dsl.INSTANCE;
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.TokenCountersKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
