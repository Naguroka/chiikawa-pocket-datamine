package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class JavaFeaturesProto {
    public static final int JAVA_FIELD_NUMBER = 1001;
    public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<androidx.datastore.preferences.protobuf.DescriptorProtos.FeatureSet, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> java_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.newSingularGeneratedExtension(androidx.datastore.preferences.protobuf.DescriptorProtos.FeatureSet.getDefaultInstance(), androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), null, 1001, androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class);

    public interface JavaFeaturesOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        boolean getLegacyClosedEnum();

        androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation();

        boolean hasLegacyClosedEnum();

        boolean hasUtf8Validation();
    }

    private JavaFeaturesProto() {
    }

    public static void registerAllExtensions(androidx.datastore.preferences.protobuf.ExtensionRegistryLite registry) {
        registry.add((androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) java_);
    }

    public static final class JavaFeatures extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
        private static final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        private JavaFeatures() {
        }

        public enum Utf8Validation implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public static final int DEFAULT_VALUE = 1;
            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int VERIFY_VALUE = 2;
            private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> internalValueMap = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation>() { // from class: androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
                @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
                public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation findValueByNumber(int number) {
                    return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(number);
                }
            };
            private final int value;

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @java.lang.Deprecated
            public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation valueOf(int value) {
                return forNumber(value);
            }

            public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation forNumber(int value) {
                if (value == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (value == 1) {
                    return DEFAULT;
                }
                if (value != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> internalGetValueMap() {
                return internalValueMap;
            }

            public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier.INSTANCE;
            }

            private static final class Utf8ValidationVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
                static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier INSTANCE = new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
                public boolean isInRange(int number) {
                    return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(number) != null;
                }
            }

            Utf8Validation(int value) {
                this.value = value;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyClosedEnum(boolean value) {
            this.bitField0_ |= 1;
            this.legacyClosedEnum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyClosedEnum() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
            androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation utf8ValidationForNumber = androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtf8Validation(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation value) {
            this.utf8Validation_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtf8Validation() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream input) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
            /* synthetic */ Builder(androidx.datastore.preferences.protobuf.JavaFeaturesProto.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasLegacyClosedEnum() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasLegacyClosedEnum();
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean getLegacyClosedEnum() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getLegacyClosedEnum();
            }

            public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder setLegacyClosedEnum(boolean value) {
                copyOnWrite();
                ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).setLegacyClosedEnum(value);
                return this;
            }

            public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearLegacyClosedEnum() {
                copyOnWrite();
                ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).clearLegacyClosedEnum();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasUtf8Validation() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasUtf8Validation();
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getUtf8Validation();
            }

            public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder setUtf8Validation(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation value) {
                copyOnWrite();
                ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).setUtf8Validation(value);
                return this;
            }

            public androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearUtf8Validation() {
                copyOnWrite();
                ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).clearUtf8Validation();
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
            androidx.datastore.preferences.protobuf.JavaFeaturesProto.AnonymousClass1 anonymousClass1 = null;
            switch (androidx.datastore.preferences.protobuf.JavaFeaturesProto.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures();
                case 2:
                    return new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new java.lang.Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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
            androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures = new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures();
            DEFAULT_INSTANCE = javaFeatures;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class, javaFeatures);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
