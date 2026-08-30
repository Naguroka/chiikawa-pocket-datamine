package gatewayprotocol.v1;

/* JADX INFO: compiled from: StaticDeviceInfoKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u001a)\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u001a)\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"androidOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "iosOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "getIosOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializestaticDeviceInfo", "copy", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StaticDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo m1285initializestaticDeviceInfo(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo copy(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticDeviceInfo, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(android2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ios, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }
}
