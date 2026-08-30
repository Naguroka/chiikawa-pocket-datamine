package gatewayprotocol.v1;

/* JADX INFO: compiled from: UniversalResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt;", "", "()V", "payload", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializepayload", "Dsl", "PayloadKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UniversalResponseKt {
    public static final gatewayprotocol.v1.UniversalResponseKt INSTANCE = new gatewayprotocol.v1.UniversalResponseKt();

    /* JADX INFO: compiled from: UniversalResponseKt.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u0004\u0018\u00010\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;)V", "value", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableData", "getMutableData", "()Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "setMutableData", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;)V", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "mutableDataOrNull", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "clearError", "", "clearMutableData", "clearPayload", "hasError", "", "hasMutableData", "hasPayload", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: UniversalResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.UniversalResponseKt.Dsl _create(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.UniversalResponseKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse _build() {
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponseBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalResponseBuild, "_builder.build()");
            return universalResponseBuild;
        }

        public final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload = this._builder.getPayload();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payload, "_builder.getPayload()");
            return payload;
        }

        public final void setPayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableData() {
            gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData = this._builder.getMutableData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutableData, "_builder.getMutableData()");
            return mutableData;
        }

        public final void setMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMutableData(value);
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableDataOrNull(gatewayprotocol.v1.UniversalResponseKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.UniversalResponseKtKt.getMutableDataOrNull(dsl._builder);
        }

        public final gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "_builder.getError()");
            return error;
        }

        public final void setError(gatewayprotocol.v1.ErrorOuterClass.Error value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final gatewayprotocol.v1.ErrorOuterClass.Error getErrorOrNull(gatewayprotocol.v1.UniversalResponseKt.Dsl dsl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
            return gatewayprotocol.v1.UniversalResponseKtKt.getErrorOrNull(dsl._builder);
        }
    }

    private UniversalResponseKt() {
    }

    /* JADX INFO: compiled from: UniversalResponseKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayloadKt {
        public static final gatewayprotocol.v1.UniversalResponseKt.PayloadKt INSTANCE = new gatewayprotocol.v1.UniversalResponseKt.PayloadKt();

        /* JADX INFO: compiled from: UniversalResponseKt.kt */
        @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0001J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020+J\u0006\u0010/\u001a\u00020+J\u0006\u00100\u001a\u00020+J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u000202J\u0006\u00106\u001a\u000202R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;)V", "value", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponse", "getAdDataRefreshResponse", "()Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "setAdDataRefreshResponse", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;)V", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponse", "getAdPlayerConfigResponse", "()Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "setAdPlayerConfigResponse", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;)V", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponse", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponse", "getInitializationResponse", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "setInitializationResponse", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;)V", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponse", "getPrivacyUpdateResponse", "()Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "setPrivacyUpdateResponse", "(Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;)V", "valueCase", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "clearAdDataRefreshResponse", "", "clearAdPlayerConfigResponse", "clearAdResponse", "clearInitializationResponse", "clearPrivacyUpdateResponse", "clearValue", "hasAdDataRefreshResponse", "", "hasAdPlayerConfigResponse", "hasAdResponse", "hasInitializationResponse", "hasPrivacyUpdateResponse", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: UniversalResponseKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl _create(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload _build() {
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payloadBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse = this._builder.getInitializationResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponse, "_builder.getInitializationResponse()");
                return initializationResponse;
            }

            public final void setInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationResponse(value);
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final gatewayprotocol.v1.AdResponseOuterClass.AdResponse getAdResponse() {
                gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse = this._builder.getAdResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adResponse, "_builder.getAdResponse()");
                return adResponse;
            }

            public final void setAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdResponse(value);
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = this._builder.getAdPlayerConfigResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adPlayerConfigResponse, "_builder.getAdPlayerConfigResponse()");
                return adPlayerConfigResponse;
            }

            public final void setAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigResponse(value);
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = this._builder.getAdDataRefreshResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshResponse, "_builder.getAdDataRefreshResponse()");
                return adDataRefreshResponse;
            }

            public final void setAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshResponse(value);
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = this._builder.getPrivacyUpdateResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse, "_builder.getPrivacyUpdateResponse()");
                return privacyUpdateResponse;
            }

            public final void setPrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateResponse(value);
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            public final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase valueCase = this._builder.getValueCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final void clearValue() {
                this._builder.clearValue();
            }
        }

        private PayloadKt() {
        }
    }

    /* JADX INFO: renamed from: -initializepayload, reason: not valid java name */
    public final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload m1294initializepayload(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
