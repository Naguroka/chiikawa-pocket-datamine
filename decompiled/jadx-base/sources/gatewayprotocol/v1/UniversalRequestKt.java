package gatewayprotocol.v1;

/* JADX INFO: compiled from: UniversalRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt;", "", "()V", "payload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializepayload", "sharedData", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "-initializesharedData", "Dsl", "PayloadKt", "SharedDataKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UniversalRequestKt {
    public static final gatewayprotocol.v1.UniversalRequestKt INSTANCE = new gatewayprotocol.v1.UniversalRequestKt();

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;)V", "value", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "getSharedData", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "clearPayload", "", "clearSharedData", "hasPayload", "", "hasSharedData", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.UniversalRequestKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.UniversalRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest _build() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestBuild, "_builder.build()");
            return universalRequestBuild;
        }

        public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final void setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSharedData(value);
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payload, "_builder.getPayload()");
            return payload;
        }

        public final void setPayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }
    }

    private UniversalRequestKt() {
    }

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SharedDataKt {
        public static final gatewayprotocol.v1.UniversalRequestKt.SharedDataKt INSTANCE = new gatewayprotocol.v1.UniversalRequestKt.SharedDataKt();

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001`B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010H\u001a\u00020IH\u0001J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0006\u0010M\u001a\u00020KJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u0006\u0010Q\u001a\u00020KJ\u0006\u0010R\u001a\u00020KJ\u0006\u0010S\u001a\u00020KJ\u0006\u0010T\u001a\u00020KJ\u0006\u0010U\u001a\u00020VJ\u0006\u0010W\u001a\u00020VJ\u0006\u0010X\u001a\u00020VJ\u0006\u0010Y\u001a\u00020VJ\u0006\u0010Z\u001a\u00020VJ\u0006\u0010[\u001a\u00020VJ\u0006\u0010\\\u001a\u00020VJ\u0006\u0010]\u001a\u00020VJ\u0006\u0010^\u001a\u00020VJ\u0006\u0010_\u001a\u00020VR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010<\u001a\u0004\u0018\u00010\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010?\u001a\u0004\u0018\u00010\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u0004\u0018\u00010\u001e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010E\u001a\u0004\u0018\u00010**\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006a"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;)V", "value", "Lcom/google/protobuf/Timestamp;", "appStartTime", "getAppStartTime", "()Lcom/google/protobuf/Timestamp;", "setAppStartTime", "(Lcom/google/protobuf/Timestamp;)V", "Lcom/google/protobuf/ByteString;", "currentState", "getCurrentState", "()Lcom/google/protobuf/ByteString;", "setCurrentState", "(Lcom/google/protobuf/ByteString;)V", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsent", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "setDeveloperConsent", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "sdkStartTime", "getSdkStartTime", "setSdkStartTime", "sessionToken", "getSessionToken", "setSessionToken", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "developerConsentOrNull", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "piiOrNull", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "testDataOrNull", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "clearAppStartTime", "", "clearCurrentState", "clearDeveloperConsent", "clearLimitedSessionToken", "clearPii", "clearSdkStartTime", "clearSessionToken", "clearTestData", "clearTimestamps", "clearWebviewVersion", "hasAppStartTime", "", "hasCurrentState", "hasDeveloperConsent", "hasLimitedSessionToken", "hasPii", "hasSdkStartTime", "hasSessionToken", "hasTestData", "hasTimestamps", "hasWebviewVersion", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: UniversalRequestKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedDataBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedDataBuild, "_builder.build()");
                return sharedDataBuild;
            }

            public final com.google.protobuf.ByteString getSessionToken() {
                com.google.protobuf.ByteString sessionToken = this._builder.getSessionToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
                return sessionToken;
            }

            public final void setSessionToken(com.google.protobuf.ByteString value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSessionToken(value);
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            public final void setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTimestamps(value);
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
                gatewayprotocol.v1.PiiOuterClass.Pii pii = this._builder.getPii();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pii, "_builder.getPii()");
                return pii;
            }

            public final void setPii(gatewayprotocol.v1.PiiOuterClass.Pii value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPii(value);
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final gatewayprotocol.v1.PiiOuterClass.Pii getPiiOrNull(gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
                return gatewayprotocol.v1.UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            public final void setDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeveloperConsent(value);
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
                return gatewayprotocol.v1.UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final com.google.protobuf.ByteString getCurrentState() {
                com.google.protobuf.ByteString currentState = this._builder.getCurrentState();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentState, "_builder.getCurrentState()");
                return currentState;
            }

            public final void setCurrentState(com.google.protobuf.ByteString value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentState(value);
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
                gatewayprotocol.v1.TestDataOuterClass.TestData testData = this._builder.getTestData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(testData, "_builder.getTestData()");
                return testData;
            }

            public final void setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTestData(value);
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final gatewayprotocol.v1.TestDataOuterClass.TestData getTestDataOrNull(gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
                return gatewayprotocol.v1.UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final com.google.protobuf.Timestamp getAppStartTime() {
                com.google.protobuf.Timestamp appStartTime = this._builder.getAppStartTime();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appStartTime, "_builder.getAppStartTime()");
                return appStartTime;
            }

            public final void setAppStartTime(com.google.protobuf.Timestamp value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAppStartTime(value);
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final com.google.protobuf.Timestamp getSdkStartTime() {
                com.google.protobuf.Timestamp sdkStartTime = this._builder.getSdkStartTime();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sdkStartTime, "_builder.getSdkStartTime()");
                return sdkStartTime;
            }

            public final void setSdkStartTime(com.google.protobuf.Timestamp value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSdkStartTime(value);
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            public final void setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLimitedSessionToken(value);
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dsl, "<this>");
                return gatewayprotocol.v1.UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }
        }

        private SharedDataKt() {
        }
    }

    /* JADX INFO: renamed from: -initializesharedData, reason: not valid java name */
    public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData m1292initializesharedData(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayloadKt {
        public static final gatewayprotocol.v1.UniversalRequestKt.PayloadKt INSTANCE = new gatewayprotocol.v1.UniversalRequestKt.PayloadKt();

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001_B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u00020GH\u0001J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u00020IJ\u0006\u0010L\u001a\u00020IJ\u0006\u0010M\u001a\u00020IJ\u0006\u0010N\u001a\u00020IJ\u0006\u0010O\u001a\u00020IJ\u0006\u0010P\u001a\u00020IJ\u0006\u0010Q\u001a\u00020IJ\u0006\u0010R\u001a\u00020IJ\u0006\u0010S\u001a\u00020IJ\u0006\u0010T\u001a\u00020UJ\u0006\u0010V\u001a\u00020UJ\u0006\u0010W\u001a\u00020UJ\u0006\u0010X\u001a\u00020UJ\u0006\u0010Y\u001a\u00020UJ\u0006\u0010Z\u001a\u00020UJ\u0006\u0010[\u001a\u00020UJ\u0006\u0010\\\u001a\u00020UJ\u0006\u0010]\u001a\u00020UJ\u0006\u0010^\u001a\u00020UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006`"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;)V", "value", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequest", "getAdDataRefreshRequest", "()Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "setAdDataRefreshRequest", "(Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;)V", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "getAdPlayerConfigRequest", "()Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "setAdPlayerConfigRequest", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;)V", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequest", "getAdRequest", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "setAdRequest", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequest", "getDiagnosticEventRequest", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "setDiagnosticEventRequest", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;)V", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequest", "getGetTokenEventRequest", "()Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "setGetTokenEventRequest", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;)V", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", "getInitializationCompletedEventRequest", "()Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "setInitializationCompletedEventRequest", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "getInitializationRequest", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;)V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvent", "getOperativeEvent", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "setOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequest", "getPrivacyUpdateRequest", "()Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "setPrivacyUpdateRequest", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;)V", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", "getTransactionEventRequest", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "setTransactionEventRequest", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;)V", "valueCase", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "clearAdDataRefreshRequest", "", "clearAdPlayerConfigRequest", "clearAdRequest", "clearDiagnosticEventRequest", "clearGetTokenEventRequest", "clearInitializationCompletedEventRequest", "clearInitializationRequest", "clearOperativeEvent", "clearPrivacyUpdateRequest", "clearTransactionEventRequest", "clearValue", "hasAdDataRefreshRequest", "", "hasAdPlayerConfigRequest", "hasAdRequest", "hasDiagnosticEventRequest", "hasGetTokenEventRequest", "hasInitializationCompletedEventRequest", "hasInitializationRequest", "hasOperativeEvent", "hasPrivacyUpdateRequest", "hasTransactionEventRequest", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion(null);
            private final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            public /* synthetic */ Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            /* JADX INFO: compiled from: UniversalRequestKt.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                    return new gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl(builder, null);
                }
            }

            public final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payloadBuild = this._builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            public final void setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationRequest(value);
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final gatewayprotocol.v1.AdRequestOuterClass.AdRequest getAdRequest() {
                gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            public final void setAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdRequest(value);
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(operativeEvent, "_builder.getOperativeEvent()");
                return operativeEvent;
            }

            public final void setOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setOperativeEvent(value);
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            public final void setDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDiagnosticEventRequest(value);
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            public final void setAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigRequest(value);
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            public final void setGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGetTokenEventRequest(value);
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            public final void setPrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateRequest(value);
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            public final void setAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshRequest(value);
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            public final void setInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationCompletedEventRequest(value);
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            public final void setTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTransactionEventRequest(value);
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
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
    public final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload m1291initializepayload(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
