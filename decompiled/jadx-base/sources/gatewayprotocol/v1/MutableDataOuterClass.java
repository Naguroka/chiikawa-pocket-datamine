package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class MutableDataOuterClass {

    public interface MutableDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii getAllowedPii();

        com.google.protobuf.ByteString getCache();

        com.google.protobuf.ByteString getCurrentState();

        com.google.protobuf.ByteString getPrivacy();

        com.google.protobuf.ByteString getPrivacyFsm();

        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

        com.google.protobuf.ByteString getSessionToken();

        boolean hasAllowedPii();

        boolean hasCache();

        boolean hasCurrentState();

        boolean hasPrivacy();

        boolean hasPrivacyFsm();

        boolean hasSessionCounters();

        boolean hasSessionToken();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private MutableDataOuterClass() {
    }

    public static final class MutableData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.MutableDataOuterClass.MutableData, gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder> implements gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder {
        public static final int ALLOWED_PII_FIELD_NUMBER = 13;
        public static final int CACHE_FIELD_NUMBER = 14;
        public static final int CURRENT_STATE_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.MutableDataOuterClass.MutableData DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.MutableDataOuterClass.MutableData> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 11;
        public static final int PRIVACY_FSM_FIELD_NUMBER = 15;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 12;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 10;
        private gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii_;
        private int bitField0_;
        private gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters_;
        private com.google.protobuf.ByteString currentState_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString sessionToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString privacy_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString cache_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString privacyFsm_ = com.google.protobuf.ByteString.EMPTY;

        private MutableData() {
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasCurrentState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public com.google.protobuf.ByteString getCurrentState() {
            return this.currentState_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentState(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.currentState_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentState() {
            this.bitField0_ &= -2;
            this.currentState_ = getDefaultInstance().getCurrentState();
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasSessionToken() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public com.google.protobuf.ByteString getSessionToken() {
            return this.sessionToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.sessionToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionToken() {
            this.bitField0_ &= -3;
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public com.google.protobuf.ByteString getPrivacy() {
            return this.privacy_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.privacy_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.bitField0_ &= -5;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -9;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasAllowedPii() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii = this.allowedPii_;
            return allowedPii == null ? gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.getDefaultInstance() : allowedPii;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii) {
            allowedPii.getClass();
            this.allowedPii_ = allowedPii;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii) {
            allowedPii.getClass();
            gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii2 = this.allowedPii_;
            if (allowedPii2 != null && allowedPii2 != gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.getDefaultInstance()) {
                this.allowedPii_ = gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.newBuilder(this.allowedPii_).mergeFrom(allowedPii).buildPartial();
            } else {
                this.allowedPii_ = allowedPii;
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowedPii() {
            this.allowedPii_ = null;
            this.bitField0_ &= -17;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public com.google.protobuf.ByteString getCache() {
            return this.cache_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCache(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 32;
            this.cache_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCache() {
            this.bitField0_ &= -33;
            this.cache_ = getDefaultInstance().getCache();
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public boolean hasPrivacyFsm() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
        public com.google.protobuf.ByteString getPrivacyFsm() {
            return this.privacyFsm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacyFsm(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 64;
            this.privacyFsm_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacyFsm() {
            this.bitField0_ &= -65;
            this.privacyFsm_ = getDefaultInstance().getPrivacyFsm();
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MutableDataOuterClass.MutableData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder newBuilder(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData) {
            return DEFAULT_INSTANCE.createBuilder(mutableData);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.MutableDataOuterClass.MutableData, gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder> implements gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.MutableDataOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.MutableDataOuterClass.MutableData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasCurrentState() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasCurrentState();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public com.google.protobuf.ByteString getCurrentState() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getCurrentState();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setCurrentState(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setCurrentState(byteString);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearCurrentState() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearCurrentState();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasSessionToken() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasSessionToken();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public com.google.protobuf.ByteString getSessionToken() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getSessionToken();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setSessionToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setSessionToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearSessionToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearSessionToken();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasPrivacy() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasPrivacy();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public com.google.protobuf.ByteString getPrivacy() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getPrivacy();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setPrivacy(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setPrivacy(byteString);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearPrivacy() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearPrivacy();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasSessionCounters() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getSessionCounters();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearSessionCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasAllowedPii() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasAllowedPii();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii getAllowedPii() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getAllowedPii();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setAllowedPii(allowedPii);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setAllowedPii(builder.build());
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder mergeAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).mergeAllowedPii(allowedPii);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearAllowedPii() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearAllowedPii();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasCache() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasCache();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public com.google.protobuf.ByteString getCache() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getCache();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setCache(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setCache(byteString);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearCache() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearCache();
                return this;
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public boolean hasPrivacyFsm() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).hasPrivacyFsm();
            }

            @Override // gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder
            public com.google.protobuf.ByteString getPrivacyFsm() {
                return ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).getPrivacyFsm();
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder setPrivacyFsm(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).setPrivacyFsm(byteString);
                return this;
            }

            public gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder clearPrivacyFsm() {
                copyOnWrite();
                ((gatewayprotocol.v1.MutableDataOuterClass.MutableData) this.instance).clearPrivacyFsm();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.MutableDataOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.MutableDataOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.MutableDataOuterClass.MutableData();
                case 2:
                    return new gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0000\u0001ည\u0000\nည\u0001\u000bည\u0002\fဉ\u0003\rဉ\u0004\u000eည\u0005\u000fည\u0006", new java.lang.Object[]{"bitField0_", "currentState_", "sessionToken_", "privacy_", "sessionCounters_", "allowedPii_", "cache_", "privacyFsm_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.MutableDataOuterClass.MutableData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.MutableDataOuterClass.MutableData.class) {
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
            gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData = new gatewayprotocol.v1.MutableDataOuterClass.MutableData();
            DEFAULT_INSTANCE = mutableData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.MutableDataOuterClass.MutableData.class, mutableData);
        }

        public static gatewayprotocol.v1.MutableDataOuterClass.MutableData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.MutableDataOuterClass.MutableData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.MutableDataOuterClass$1, reason: invalid class name */
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
