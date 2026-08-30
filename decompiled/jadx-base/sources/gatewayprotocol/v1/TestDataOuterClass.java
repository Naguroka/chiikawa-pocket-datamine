package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class TestDataOuterClass {

    public interface TestDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getForceCampaignId();

        com.google.protobuf.ByteString getForceCampaignIdBytes();

        java.lang.String getForceCountry();

        com.google.protobuf.ByteString getForceCountryBytes();

        java.lang.String getForceCountrySubdivision();

        com.google.protobuf.ByteString getForceCountrySubdivisionBytes();

        int getForceExchangeTestMode();

        boolean hasForceCampaignId();

        boolean hasForceCountry();

        boolean hasForceCountrySubdivision();

        boolean hasForceExchangeTestMode();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private TestDataOuterClass() {
    }

    public static final class TestData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.TestDataOuterClass.TestData, gatewayprotocol.v1.TestDataOuterClass.TestData.Builder> implements gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder {
        private static final gatewayprotocol.v1.TestDataOuterClass.TestData DEFAULT_INSTANCE;
        public static final int FORCE_CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int FORCE_COUNTRY_FIELD_NUMBER = 2;
        public static final int FORCE_COUNTRY_SUBDIVISION_FIELD_NUMBER = 3;
        public static final int FORCE_EXCHANGE_TEST_MODE_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.TestDataOuterClass.TestData> PARSER;
        private int bitField0_;
        private int forceExchangeTestMode_;
        private java.lang.String forceCampaignId_ = "";
        private java.lang.String forceCountry_ = "";
        private java.lang.String forceCountrySubdivision_ = "";

        private TestData() {
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public boolean hasForceCampaignId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public java.lang.String getForceCampaignId() {
            return this.forceCampaignId_;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public com.google.protobuf.ByteString getForceCampaignIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.forceCampaignId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCampaignId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.forceCampaignId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceCampaignId() {
            this.bitField0_ &= -2;
            this.forceCampaignId_ = getDefaultInstance().getForceCampaignId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCampaignIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.forceCampaignId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public boolean hasForceCountry() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public java.lang.String getForceCountry() {
            return this.forceCountry_;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public com.google.protobuf.ByteString getForceCountryBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.forceCountry_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCountry(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.forceCountry_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceCountry() {
            this.bitField0_ &= -3;
            this.forceCountry_ = getDefaultInstance().getForceCountry();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCountryBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.forceCountry_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public boolean hasForceCountrySubdivision() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public java.lang.String getForceCountrySubdivision() {
            return this.forceCountrySubdivision_;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public com.google.protobuf.ByteString getForceCountrySubdivisionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.forceCountrySubdivision_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCountrySubdivision(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.forceCountrySubdivision_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceCountrySubdivision() {
            this.bitField0_ &= -5;
            this.forceCountrySubdivision_ = getDefaultInstance().getForceCountrySubdivision();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceCountrySubdivisionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.forceCountrySubdivision_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public boolean hasForceExchangeTestMode() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
        public int getForceExchangeTestMode() {
            return this.forceExchangeTestMode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceExchangeTestMode(int i) {
            this.bitField0_ |= 8;
            this.forceExchangeTestMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceExchangeTestMode() {
            this.bitField0_ &= -9;
            this.forceExchangeTestMode_ = 0;
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TestDataOuterClass.TestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData.Builder newBuilder(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
            return DEFAULT_INSTANCE.createBuilder(testData);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.TestDataOuterClass.TestData, gatewayprotocol.v1.TestDataOuterClass.TestData.Builder> implements gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.TestDataOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.TestDataOuterClass.TestData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public boolean hasForceCampaignId() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).hasForceCampaignId();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public java.lang.String getForceCampaignId() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCampaignId();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public com.google.protobuf.ByteString getForceCampaignIdBytes() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCampaignIdBytes();
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCampaignId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCampaignId(str);
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder clearForceCampaignId() {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).clearForceCampaignId();
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCampaignIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCampaignIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public boolean hasForceCountry() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).hasForceCountry();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public java.lang.String getForceCountry() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCountry();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public com.google.protobuf.ByteString getForceCountryBytes() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCountryBytes();
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCountry(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCountry(str);
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder clearForceCountry() {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).clearForceCountry();
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCountryBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCountryBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public boolean hasForceCountrySubdivision() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).hasForceCountrySubdivision();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public java.lang.String getForceCountrySubdivision() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCountrySubdivision();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public com.google.protobuf.ByteString getForceCountrySubdivisionBytes() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceCountrySubdivisionBytes();
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCountrySubdivision(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCountrySubdivision(str);
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder clearForceCountrySubdivision() {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).clearForceCountrySubdivision();
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceCountrySubdivisionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceCountrySubdivisionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public boolean hasForceExchangeTestMode() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).hasForceExchangeTestMode();
            }

            @Override // gatewayprotocol.v1.TestDataOuterClass.TestDataOrBuilder
            public int getForceExchangeTestMode() {
                return ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).getForceExchangeTestMode();
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder setForceExchangeTestMode(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).setForceExchangeTestMode(i);
                return this;
            }

            public gatewayprotocol.v1.TestDataOuterClass.TestData.Builder clearForceExchangeTestMode() {
                copyOnWrite();
                ((gatewayprotocol.v1.TestDataOuterClass.TestData) this.instance).clearForceExchangeTestMode();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.TestDataOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.TestDataOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.TestDataOuterClass.TestData();
                case 2:
                    return new gatewayprotocol.v1.TestDataOuterClass.TestData.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဋ\u0003", new java.lang.Object[]{"bitField0_", "forceCampaignId_", "forceCountry_", "forceCountrySubdivision_", "forceExchangeTestMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.TestDataOuterClass.TestData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.TestDataOuterClass.TestData.class) {
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
            gatewayprotocol.v1.TestDataOuterClass.TestData testData = new gatewayprotocol.v1.TestDataOuterClass.TestData();
            DEFAULT_INSTANCE = testData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.TestDataOuterClass.TestData.class, testData);
        }

        public static gatewayprotocol.v1.TestDataOuterClass.TestData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.TestDataOuterClass.TestData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.TestDataOuterClass$1, reason: invalid class name */
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
