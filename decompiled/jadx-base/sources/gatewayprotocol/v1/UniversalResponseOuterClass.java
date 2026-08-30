package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class UniversalResponseOuterClass {

    public interface UniversalResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableData();

        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getPayload();

        boolean hasError();

        boolean hasMutableData();

        boolean hasPayload();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private UniversalResponseOuterClass() {
    }

    public static final class UniversalResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse, gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder> implements gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder {
        private static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;
        private gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData_;
        private gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload_;

        public interface PayloadOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse();

            gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse();

            gatewayprotocol.v1.AdResponseOuterClass.AdResponse getAdResponse();

            gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getInitializationResponse();

            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse();

            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshResponse();

            boolean hasAdPlayerConfigResponse();

            boolean hasAdResponse();

            boolean hasInitializationResponse();

            boolean hasPrivacyUpdateResponse();
        }

        private UniversalResponse() {
        }

        public static final class Payload extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload, gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder> implements gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            private static final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload DEFAULT_INSTANCE;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload> PARSER = null;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_ = 0;
            private java.lang.Object value_;

            private Payload() {
            }

            public enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                VALUE_NOT_SET(0);

                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                @java.lang.Deprecated
                public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase valueOf(int i) {
                    return forNumber(i);
                }

                public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase forNumber(int i) {
                    if (i == 0) {
                        return VALUE_NOT_SET;
                    }
                    if (i == 1) {
                        return INITIALIZATION_RESPONSE;
                    }
                    if (i == 2) {
                        return AD_RESPONSE;
                    }
                    if (i == 3) {
                        return AD_PLAYER_CONFIG_RESPONSE;
                    }
                    if (i == 4) {
                        return AD_DATA_REFRESH_RESPONSE;
                    }
                    if (i != 5) {
                        return null;
                    }
                    return PRIVACY_UPDATE_RESPONSE;
                }

                public int getNumber() {
                    return this.value;
                }
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                return gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase.forNumber(this.valueCase_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasInitializationResponse() {
                return this.valueCase_ == 1;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                if (this.valueCase_ == 1) {
                    return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.value_;
                }
                return gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = initializationResponse;
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                if (this.valueCase_ == 1 && this.value_ != gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.newBuilder((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.value_).mergeFrom(initializationResponse).buildPartial();
                } else {
                    this.value_ = initializationResponse;
                }
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationResponse() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdResponse() {
                return this.valueCase_ == 2;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.AdResponseOuterClass.AdResponse getAdResponse() {
                if (this.valueCase_ == 2) {
                    return (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.value_;
                }
                return gatewayprotocol.v1.AdResponseOuterClass.AdResponse.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = adResponse;
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                if (this.valueCase_ == 2 && this.value_ != gatewayprotocol.v1.AdResponseOuterClass.AdResponse.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdResponseOuterClass.AdResponse.newBuilder((gatewayprotocol.v1.AdResponseOuterClass.AdResponse) this.value_).mergeFrom(adResponse).buildPartial();
                } else {
                    this.value_ = adResponse;
                }
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdResponse() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdPlayerConfigResponse() {
                return this.valueCase_ == 3;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    return (gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_;
                }
                return gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                if (this.valueCase_ == 3 && this.value_ != gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder((gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_).mergeFrom(adPlayerConfigResponse).buildPartial();
                } else {
                    this.value_ = adPlayerConfigResponse;
                }
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdDataRefreshResponse() {
                return this.valueCase_ == 4;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    return (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_;
                }
                return gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                if (this.valueCase_ == 4 && this.value_ != gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_).mergeFrom(adDataRefreshResponse).buildPartial();
                } else {
                    this.value_ = adDataRefreshResponse;
                }
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasPrivacyUpdateResponse() {
                return this.valueCase_ == 5;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    return (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_;
                }
                return gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = privacyUpdateResponse;
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                if (this.valueCase_ == 5 && this.value_ != gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder((gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_).mergeFrom(privacyUpdateResponse).buildPartial();
                } else {
                    this.value_ = privacyUpdateResponse;
                }
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder newBuilder(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload) {
                return DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload, gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder> implements gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getValueCase();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearValue() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearValue();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasInitializationResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).hasInitializationResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getInitializationResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setInitializationResponse(initializationResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setInitializationResponse(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).mergeInitializationResponse(initializationResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearInitializationResponse() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearInitializationResponse();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).hasAdResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.AdResponseOuterClass.AdResponse getAdResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getAdResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdResponse(adResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdResponse(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).mergeAdResponse(adResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdResponse() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearAdResponse();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdPlayerConfigResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).hasAdPlayerConfigResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getAdPlayerConfigResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdPlayerConfigResponse(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).mergeAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdPlayerConfigResponse() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearAdPlayerConfigResponse();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdDataRefreshResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).hasAdDataRefreshResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getAdDataRefreshResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setAdDataRefreshResponse(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).mergeAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdDataRefreshResponse() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearAdDataRefreshResponse();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasPrivacyUpdateResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).hasPrivacyUpdateResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).getPrivacyUpdateResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setPrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setPrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setPrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).setPrivacyUpdateResponse(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergePrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).mergePrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearPrivacyUpdateResponse() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload) this.instance).clearPrivacyUpdateResponse();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload();
                    case 2:
                        return new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new java.lang.Object[]{"value_", "valueCase_", gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.class, gatewayprotocol.v1.AdResponseOuterClass.AdResponse.class, gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.class, gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                                break;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload = new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload();
                DEFAULT_INSTANCE = payload;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.class, payload);
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasPayload() {
            return this.payload_ != null;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload = this.payload_;
            return payload == null ? gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.getDefaultInstance() : payload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload) {
            payload.getClass();
            this.payload_ = payload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload) {
            payload.getClass();
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload2 = this.payload_;
            if (payload2 != null && payload2 != gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.getDefaultInstance()) {
                this.payload_ = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder(this.payload_).mergeFrom(payload).buildPartial();
            } else {
                this.payload_ = payload;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = null;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasMutableData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableData() {
            gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData = this.mutableData_;
            return mutableData == null ? gatewayprotocol.v1.MutableDataOuterClass.MutableData.getDefaultInstance() : mutableData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this.mutableData_ = mutableData;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData2 = this.mutableData_;
            if (mutableData2 != null && mutableData2 != gatewayprotocol.v1.MutableDataOuterClass.MutableData.getDefaultInstance()) {
                this.mutableData_ = gatewayprotocol.v1.MutableDataOuterClass.MutableData.newBuilder(this.mutableData_).mergeFrom(mutableData).buildPartial();
            } else {
                this.mutableData_ = mutableData;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            gatewayprotocol.v1.ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder newBuilder(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse) {
            return DEFAULT_INSTANCE.createBuilder(universalResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse, gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder> implements gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasPayload() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).hasPayload();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).getPayload();
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setPayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setPayload(payload);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setPayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setPayload(builder.build());
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder mergePayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload payload) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).mergePayload(payload);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder clearPayload() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).clearPayload();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasMutableData() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).hasMutableData();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public gatewayprotocol.v1.MutableDataOuterClass.MutableData getMutableData() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).getMutableData();
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setMutableData(mutableData);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setMutableData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder mergeMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).mergeMutableData(mutableData);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder clearMutableData() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).clearMutableData();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.UniversalResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse();
                case 2:
                    return new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse = new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse();
            DEFAULT_INSTANCE = universalResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.class, universalResponse);
        }

        public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
