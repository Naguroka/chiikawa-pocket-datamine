package gatewayprotocol.v1;

/* JADX INFO: compiled from: TransactionEventRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventRequestKt {
    public static final gatewayprotocol.v1.TransactionEventRequestKt INSTANCE = new gatewayprotocol.v1.TransactionEventRequestKt();

    /* JADX INFO: compiled from: TransactionEventRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002=>B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0001J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020'J\u0006\u0010*\u001a\u00020'J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J%\u0010.\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\u0005\u001a\u00020 H\u0007¢\u0006\u0002\b/J+\u00100\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020 02H\u0007¢\u0006\u0002\b3J\u001d\u00104\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0007¢\u0006\u0002\b5J&\u00106\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\u0005\u001a\u00020 H\u0087\n¢\u0006\u0002\b7J,\u00106\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020 02H\u0087\n¢\u0006\u0002\b8J.\u00109\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020 H\u0087\u0002¢\u0006\u0002\b<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006?"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;)V", "value", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "appStore", "getAppStore", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "setAppStore", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;)V", "", "customStore", "getCustomStore", "()Ljava/lang/String;", "setCustomStore", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "transactionData", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "getTransactionData", "()Lcom/google/protobuf/kotlin/DslList;", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "clearAppStore", "", "clearCustomStore", "clearDynamicDeviceInfo", "clearStaticDeviceInfo", "hasDynamicDeviceInfo", "", "hasStaticDeviceInfo", "add", "addTransactionData", "addAll", "values", "", "addAllTransactionData", "clear", "clearTransactionData", "plusAssign", "plusAssignTransactionData", "plusAssignAllTransactionData", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "setTransactionData", "Companion", "TransactionDataProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: TransactionEventRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.TransactionEventRequestKt.Dsl _create(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.TransactionEventRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionEventRequestBuild, "_builder.build()");
            return transactionEventRequestBuild;
        }

        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType getAppStore() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final void setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppStore(value);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final java.lang.String getCustomStore() {
            java.lang.String customStore = this._builder.getCustomStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final void setCustomStore(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        /* JADX INFO: compiled from: TransactionEventRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TransactionDataProxy extends com.google.protobuf.kotlin.DslProxy {
            private TransactionDataProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getTransactionData() {
            java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionDataList, "_builder.getTransactionDataList()");
            return new com.google.protobuf.kotlin.DslList(transactionDataList);
        }

        public final /* synthetic */ void addTransactionData(com.google.protobuf.kotlin.DslList dslList, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTransactionData(value);
        }

        public final /* synthetic */ void plusAssignTransactionData(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestKt.Dsl.TransactionDataProxy> dslList, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addTransactionData(dslList, value);
        }

        public final /* synthetic */ void addAllTransactionData(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void plusAssignAllTransactionData(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestKt.Dsl.TransactionDataProxy> dslList, java.lang.Iterable<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void setTransactionData(com.google.protobuf.kotlin.DslList dslList, int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionData(i, value);
        }

        public final /* synthetic */ void clearTransactionData(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTransactionData();
        }
    }

    private TransactionEventRequestKt() {
    }
}
