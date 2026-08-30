package androidx.datastore.preferences;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto {

    public interface PreferenceMapOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        boolean containsPreferences(java.lang.String str);

        @java.lang.Deprecated
        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences();

        int getPreferencesCount();

        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap();

        androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value);

        androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str);
    }

    public interface StringSetOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        java.lang.String getStrings(int i);

        androidx.datastore.preferences.protobuf.ByteString getStringsBytes(int i);

        int getStringsCount();

        java.util.List<java.lang.String> getStringsList();
    }

    public interface ValueOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        boolean getBoolean();

        androidx.datastore.preferences.protobuf.ByteString getBytes();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        java.lang.String getString();

        androidx.datastore.preferences.protobuf.ByteString getStringBytes();

        androidx.datastore.preferences.PreferencesProto.StringSet getStringSet();

        androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasBytes();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    public static void registerAllExtensions(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private PreferencesProto() {
    }

    public static final class PreferenceMap extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.PreferenceMap, androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder> implements androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder {
        private static final androidx.datastore.preferences.PreferencesProto.PreferenceMap DEFAULT_INSTANCE;
        private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferences_ = androidx.datastore.preferences.protobuf.MapFieldLite.emptyMapField();

        private PreferenceMap() {
        }

        private static final class PreferencesDefaultEntryHolder {
            static final androidx.datastore.preferences.protobuf.MapEntryLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> defaultEntry = androidx.datastore.preferences.protobuf.MapEntryLite.newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING, "", androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.datastore.preferences.PreferencesProto.Value.getDefaultInstance());

            private PreferencesDefaultEntryHolder() {
            }
        }

        private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> internalGetPreferences() {
            return this.preferences_;
        }

        private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> internalGetMutablePreferences() {
            if (!this.preferences_.isMutable()) {
                this.preferences_ = this.preferences_.mutableCopy();
            }
            return this.preferences_;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public int getPreferencesCount() {
            return internalGetPreferences().size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public boolean containsPreferences(java.lang.String str) {
            str.getClass();
            return internalGetPreferences().containsKey(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences() {
            return getPreferencesMap();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap() {
            return java.util.Collections.unmodifiableMap(internalGetPreferences());
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
            str.getClass();
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> mapFieldLiteInternalGetPreferences = internalGetPreferences();
            return mapFieldLiteInternalGetPreferences.containsKey(str) ? mapFieldLiteInternalGetPreferences.get(str) : value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str) {
            str.getClass();
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> mapFieldLiteInternalGetPreferences = internalGetPreferences();
            if (!mapFieldLiteInternalGetPreferences.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLiteInternalGetPreferences.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getMutablePreferencesMap() {
            return internalGetMutablePreferences();
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseDelimitedFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.PreferenceMap preferenceMap) {
            return DEFAULT_INSTANCE.createBuilder(preferenceMap);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.PreferenceMap, androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder> implements androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder {
            /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.PreferenceMap.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public int getPreferencesCount() {
                return ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap().size();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public boolean containsPreferences(java.lang.String str) {
                str.getClass();
                return ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
            }

            public androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder clearPreferences() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getMutablePreferencesMap().clear();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder removePreferences(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getMutablePreferencesMap().remove(str);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences() {
                return getPreferencesMap();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap() {
                return java.util.Collections.unmodifiableMap(((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
                str.getClass();
                java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap();
                return preferencesMap.containsKey(str) ? preferencesMap.get(str) : value;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap();
                if (!preferencesMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return preferencesMap.get(str);
            }

            public androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder putPreferences(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
                str.getClass();
                value.getClass();
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getMutablePreferencesMap().put(str, value);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder putAllPreferences(java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> map) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getMutablePreferencesMap().putAll(map);
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1 = null;
            switch (androidx.datastore.preferences.PreferencesProto.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.PreferenceMap();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", androidx.datastore.preferences.PreferencesProto.PreferenceMap.PreferencesDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (androidx.datastore.preferences.PreferencesProto.PreferenceMap.class) {
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
            androidx.datastore.preferences.PreferencesProto.PreferenceMap preferenceMap = new androidx.datastore.preferences.PreferencesProto.PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.PreferenceMap.class, preferenceMap);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
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

    public static final class Value extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.Value, androidx.datastore.preferences.PreferencesProto.Value.Builder> implements androidx.datastore.preferences.PreferencesProto.ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final androidx.datastore.preferences.PreferencesProto.Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private java.lang.Object value_;

        private Value() {
        }

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static androidx.datastore.preferences.PreferencesProto.Value.ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static androidx.datastore.preferences.PreferencesProto.Value.ValueCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase() {
            return androidx.datastore.preferences.PreferencesProto.Value.ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((java.lang.Boolean) this.value_).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolean(boolean z) {
            this.valueCase_ = 1;
            this.value_ = java.lang.Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolean() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((java.lang.Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloat(float f) {
            this.valueCase_ = 2;
            this.value_ = java.lang.Float.valueOf(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloat() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((java.lang.Integer) this.value_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteger(int i) {
            this.valueCase_ = 3;
            this.value_ = java.lang.Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInteger() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((java.lang.Long) this.value_).longValue();
            }
            return 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLong(long j) {
            this.valueCase_ = 4;
            this.value_ = java.lang.Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLong() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public java.lang.String getString() {
            return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getStringBytes() {
            return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.valueCase_ == 5 ? (java.lang.String) this.value_ : "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setString(java.lang.String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearString() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public androidx.datastore.preferences.PreferencesProto.StringSet getStringSet() {
            if (this.valueCase_ == 6) {
                return (androidx.datastore.preferences.PreferencesProto.StringSet) this.value_;
            }
            return androidx.datastore.preferences.PreferencesProto.StringSet.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            stringSet.getClass();
            this.value_ = stringSet;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            stringSet.getClass();
            if (this.valueCase_ == 6 && this.value_ != androidx.datastore.preferences.PreferencesProto.StringSet.getDefaultInstance()) {
                this.value_ = androidx.datastore.preferences.PreferencesProto.StringSet.newBuilder((androidx.datastore.preferences.PreferencesProto.StringSet) this.value_).mergeFrom(stringSet).buildPartial();
            } else {
                this.value_ = stringSet;
            }
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringSet() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((java.lang.Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDouble(double d) {
            this.valueCase_ = 7;
            this.value_ = java.lang.Double.valueOf(d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDouble() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasBytes() {
            return this.valueCase_ == 8;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getBytes() {
            if (this.valueCase_ == 8) {
                return (androidx.datastore.preferences.protobuf.ByteString) this.value_;
            }
            return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 8;
            this.value_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytes() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseDelimitedFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.Value value) {
            return DEFAULT_INSTANCE.createBuilder(value);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.Value, androidx.datastore.preferences.PreferencesProto.Value.Builder> implements androidx.datastore.preferences.PreferencesProto.ValueOrBuilder {
            /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.Value.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getValueCase();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearValue() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearValue();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasBoolean() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean getBoolean() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getBoolean();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setBoolean(boolean z) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setBoolean(z);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearBoolean() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearBoolean();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasFloat() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public float getFloat() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getFloat();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setFloat(float f) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setFloat(f);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearFloat() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearFloat();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasInteger() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public int getInteger() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getInteger();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setInteger(int i) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setInteger(i);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearInteger() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearInteger();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasLong() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public long getLong() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getLong();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setLong(long j) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setLong(j);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearLong() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearLong();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasString() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public java.lang.String getString() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public androidx.datastore.preferences.protobuf.ByteString getStringBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getStringBytes();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setString(java.lang.String str) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setString(str);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearString() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearString();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setStringBytes(byteString);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasStringSet() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasStringSet();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public androidx.datastore.preferences.PreferencesProto.StringSet getStringSet() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getStringSet();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setStringSet(stringSet);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet.Builder builder) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setStringSet(builder.build());
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder mergeStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).mergeStringSet(stringSet);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearStringSet() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearStringSet();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasDouble() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public double getDouble() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getDouble();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setDouble(double d) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setDouble(d);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearDouble() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearDouble();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasBytes();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public androidx.datastore.preferences.protobuf.ByteString getBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getBytes();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).setBytes(byteString);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearBytes() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).clearBytes();
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1 = null;
            switch (androidx.datastore.preferences.PreferencesProto.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.Value();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.Value.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", androidx.datastore.preferences.PreferencesProto.StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (androidx.datastore.preferences.PreferencesProto.Value.class) {
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
            androidx.datastore.preferences.PreferencesProto.Value value = new androidx.datastore.preferences.PreferencesProto.Value();
            DEFAULT_INSTANCE = value;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.Value.class, value);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class StringSet extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.StringSet, androidx.datastore.preferences.PreferencesProto.StringSet.Builder> implements androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder {
        private static final androidx.datastore.preferences.PreferencesProto.StringSet DEFAULT_INSTANCE;
        private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> strings_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();

        private StringSet() {
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public java.util.List<java.lang.String> getStringsList() {
            return this.strings_;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public java.lang.String getStrings(int i) {
            return this.strings_.get(i);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getStringsBytes(int i) {
            return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.strings_.get(i));
        }

        private void ensureStringsIsMutable() {
            androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.strings_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.strings_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrings(int i, java.lang.String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStrings(java.lang.String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStrings(java.lang.Iterable<java.lang.String> iterable) {
            ensureStringsIsMutable();
            androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrings() {
            this.strings_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStringsBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
            ensureStringsIsMutable();
            this.strings_.add(byteString.toStringUtf8());
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseDelimitedFrom(java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            return DEFAULT_INSTANCE.createBuilder(stringSet);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.StringSet, androidx.datastore.preferences.PreferencesProto.StringSet.Builder> implements androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder {
            /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.StringSet.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public java.util.List<java.lang.String> getStringsList() {
                return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsList());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public int getStringsCount() {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsCount();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public java.lang.String getStrings(int i) {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStrings(i);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public androidx.datastore.preferences.protobuf.ByteString getStringsBytes(int i) {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsBytes(i);
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder setStrings(int i, java.lang.String str) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).setStrings(i, str);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStrings(java.lang.String str) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).addStrings(str);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addAllStrings(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).addAllStrings(iterable);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder clearStrings() {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).clearStrings();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStringsBytes(androidx.datastore.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).addStringsBytes(byteString);
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.datastore.preferences.PreferencesProto.AnonymousClass1 anonymousClass1 = null;
            switch (androidx.datastore.preferences.PreferencesProto.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.StringSet();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.StringSet.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (androidx.datastore.preferences.PreferencesProto.StringSet.class) {
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
            androidx.datastore.preferences.PreferencesProto.StringSet stringSet = new androidx.datastore.preferences.PreferencesProto.StringSet();
            DEFAULT_INSTANCE = stringSet;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.StringSet.class, stringSet);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
