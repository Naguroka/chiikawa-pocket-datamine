package gatewayprotocol.v1;

/* JADX INFO: compiled from: DynamicDeviceInfoKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0015\u001a)\u0010\u0016\u001a\u00020\u000f*\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"androidOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "iosOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "getIosOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "networkCapabilityTransportsOrNull", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder;", "getNetworkCapabilityTransportsOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder;)Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "dynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedynamicDeviceInfo", "copy", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DynamicDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo m1258initializedynamicDeviceInfo(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDeviceInfo, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder = dynamicDeviceInfo.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(android2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder = android2.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ios, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder = ios.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }
}
