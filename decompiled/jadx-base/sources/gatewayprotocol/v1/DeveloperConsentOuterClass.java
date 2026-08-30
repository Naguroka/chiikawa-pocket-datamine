package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class DeveloperConsentOuterClass {

    public interface DeveloperConsentOptionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getCustomType();

        com.google.protobuf.ByteString getCustomTypeBytes();

        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getType();

        int getTypeValue();

        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getValue();

        int getValueValue();

        boolean hasCustomType();
    }

    public interface DeveloperConsentOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getOptions(int i);

        int getOptionsCount();

        java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> getOptionsList();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private DeveloperConsentOuterClass() {
    }

    public enum DeveloperConsentType implements com.google.protobuf.Internal.EnumLite {
        DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_TYPE_CUSTOM(1),
        DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
        DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
        DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
        DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
        DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DEVELOPER_CONSENT_TYPE_GDPR_CONSENT_VALUE = 5;
        public static final int DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL_VALUE = 2;
        public static final int DEVELOPER_CONSENT_TYPE_PIPL_CONSENT_VALUE = 3;
        public static final int DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT_VALUE = 4;
        public static final int DEVELOPER_CONSENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT_VALUE = 6;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType>() { // from class: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType findValueByNumber(int i) {
                return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType forNumber(int i) {
            switch (i) {
                case 0:
                    return DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
                case 1:
                    return DEVELOPER_CONSENT_TYPE_CUSTOM;
                case 2:
                    return DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                case 3:
                    return DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                case 4:
                    return DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                case 5:
                    return DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                case 6:
                    return DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DeveloperConsentTypeVerifier.INSTANCE;
        }

        private static final class DeveloperConsentTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DeveloperConsentTypeVerifier();

            private DeveloperConsentTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i) != null;
            }
        }

        DeveloperConsentType(int i) {
            this.value = i;
        }
    }

    public enum DeveloperConsentChoice implements com.google.protobuf.Internal.EnumLite {
        DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_CHOICE_TRUE(1),
        DEVELOPER_CONSENT_CHOICE_FALSE(2),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_CHOICE_FALSE_VALUE = 2;
        public static final int DEVELOPER_CONSENT_CHOICE_TRUE_VALUE = 1;
        public static final int DEVELOPER_CONSENT_CHOICE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice>() { // from class: gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice findValueByNumber(int i) {
                return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice forNumber(int i) {
            if (i == 0) {
                return DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
            }
            if (i == 1) {
                return DEVELOPER_CONSENT_CHOICE_TRUE;
            }
            if (i != 2) {
                return null;
            }
            return DEVELOPER_CONSENT_CHOICE_FALSE;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.DeveloperConsentChoiceVerifier.INSTANCE;
        }

        private static final class DeveloperConsentChoiceVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.DeveloperConsentChoiceVerifier();

            private DeveloperConsentChoiceVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i) != null;
            }
        }

        DeveloperConsentChoice(int i) {
            this.value = i;
        }
    }

    public static final class DeveloperConsentOption extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder> implements gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder {
        public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private java.lang.String customType_ = "";
        private int type_;
        private int value_;

        private DeveloperConsentOption() {
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getType() {
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType developerConsentTypeForNumber = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.forNumber(this.type_);
            return developerConsentTypeForNumber == null ? gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.UNRECOGNIZED : developerConsentTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType developerConsentType) {
            this.type_ = developerConsentType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public boolean hasCustomType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public java.lang.String getCustomType() {
            return this.customType_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public com.google.protobuf.ByteString getCustomTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomType(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomType() {
            this.bitField0_ &= -2;
            this.customType_ = getDefaultInstance().getCustomType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTypeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getValueValue() {
            return this.value_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoiceForNumber = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(this.value_);
            return developerConsentChoiceForNumber == null ? gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.UNRECOGNIZED : developerConsentChoiceForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueValue(int i) {
            this.value_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoice) {
            this.value_ = developerConsentChoice.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            return DEFAULT_INSTANCE.createBuilder(developerConsentOption);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder> implements gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getTypeValue() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getTypeValue();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getType() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getType();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setType(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType developerConsentType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setType(developerConsentType);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).clearType();
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public boolean hasCustomType() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).hasCustomType();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public java.lang.String getCustomType() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getCustomType();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public com.google.protobuf.ByteString getCustomTypeBytes() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getCustomTypeBytes();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomType(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setCustomType(str);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearCustomType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).clearCustomType();
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomTypeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setCustomTypeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getValueValue() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getValueValue();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValueValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setValueValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).getValue();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValue(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoice) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).setValue(developerConsentChoice);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearValue() {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption) this.instance).clearValue();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption();
                case 2:
                    return new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\f", new java.lang.Object[]{"bitField0_", "type_", "customType_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.class) {
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
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption();
            DEFAULT_INSTANCE = developerConsentOption;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.class, developerConsentOption);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.DeveloperConsentOuterClass$1, reason: invalid class name */
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

    public static final class DeveloperConsent extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder> implements gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder {
        private static final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent DEFAULT_INSTANCE;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent> PARSER;
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> options_ = emptyProtobufList();

        private DeveloperConsent() {
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> getOptionsList() {
            return this.options_;
        }

        public java.util.List<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder> getOptionsOrBuilderList() {
            return this.options_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public int getOptionsCount() {
            return this.options_.size();
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getOptions(int i) {
            return this.options_.get(i);
        }

        public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int i) {
            return this.options_.get(i);
        }

        private void ensureOptionsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> protobufList = this.options_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.options_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.set(i, developerConsentOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(developerConsentOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(i, developerConsentOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> iterable) {
            ensureOptionsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.options_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOptions(int i) {
            ensureOptionsIsMutable();
            this.options_.remove(i);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
            return DEFAULT_INSTANCE.createBuilder(developerConsent);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder> implements gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> getOptionsList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).getOptionsList());
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public int getOptionsCount() {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).getOptionsCount();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption getOptions(int i) {
                return ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).getOptions(i);
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder setOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).setOptions(i, developerConsentOption);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder setOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).setOptions(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).addOptions(developerConsentOption);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).addOptions(i, developerConsentOption);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).addOptions(builder.build());
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addOptions(int i, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).addOptions(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder addAllOptions(java.lang.Iterable<? extends gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).addAllOptions(iterable);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder clearOptions() {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).clearOptions();
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder removeOptions(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent) this.instance).removeOptions(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DeveloperConsentOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent();
                case 2:
                    return new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"options_", gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.class) {
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
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent();
            DEFAULT_INSTANCE = developerConsent;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.class, developerConsent);
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
