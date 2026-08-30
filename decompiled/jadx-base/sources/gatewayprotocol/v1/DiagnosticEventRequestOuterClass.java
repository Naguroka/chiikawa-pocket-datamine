package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class DiagnosticEventRequestOuterClass {

    public interface DiagnosticEventOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean containsIntTags(java.lang.String str);

        boolean containsStringTags(java.lang.String str);

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType();

        int getAdTypeValue();

        java.lang.String getCustomEventType();

        com.google.protobuf.ByteString getCustomEventTypeBytes();

        int getEventId();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType();

        int getEventTypeValue();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, java.lang.Integer> getIntTags();

        int getIntTagsCount();

        java.util.Map<java.lang.String, java.lang.Integer> getIntTagsMap();

        int getIntTagsOrDefault(java.lang.String str, int i);

        int getIntTagsOrThrow(java.lang.String str);

        boolean getIsHeaderBidding();

        java.lang.String getPlacementId();

        com.google.protobuf.ByteString getPlacementIdBytes();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, java.lang.String> getStringTags();

        int getStringTagsCount();

        java.util.Map<java.lang.String, java.lang.String> getStringTagsMap();

        java.lang.String getStringTagsOrDefault(java.lang.String str, java.lang.String str2);

        java.lang.String getStringTagsOrThrow(java.lang.String str);

        double getTimeValue();

        gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    public interface DiagnosticEventRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent getBatch(int i);

        int getBatchCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> getBatchList();
    }

    public interface DiagnosticTagOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getCustomTagType();

        com.google.protobuf.ByteString getCustomTagTypeBytes();

        int getIntValue();

        java.lang.String getStringValue();

        com.google.protobuf.ByteString getStringValueBytes();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType getTagType(int i);

        int getTagTypeCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> getTagTypeList();

        int getTagTypeValue(int i);

        java.util.List<java.lang.Integer> getTagTypeValueList();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private DiagnosticEventRequestOuterClass() {
    }

    public enum DiagnosticEventType implements com.google.protobuf.Internal.EnumLite {
        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType findValueByNumber(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(i);
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
        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DiagnosticEventTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticEventTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DiagnosticEventTypeVerifier();

            private DiagnosticEventTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(i) != null;
            }
        }

        DiagnosticEventType(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticTagType implements com.google.protobuf.Internal.EnumLite {
        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType findValueByNumber(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(i);
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
        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return DIAGNOSTIC_TAG_TYPE_CUSTOM;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.DiagnosticTagTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticTagTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.DiagnosticTagTypeVerifier();

            private DiagnosticTagTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(i) != null;
            }
        }

        DiagnosticTagType(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticEventsSeverity implements com.google.protobuf.Internal.EnumLite {
        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity findValueByNumber(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i);
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
        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
            }
            if (i == 2) {
                return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
            }
            if (i == 3) {
                return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
            }
            if (i == 4) {
                return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
            }
            if (i != 5) {
                return null;
            }
            return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.DiagnosticEventsSeverityVerifier.INSTANCE;
        }

        private static final class DiagnosticEventsSeverityVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.DiagnosticEventsSeverityVerifier();

            private DiagnosticEventsSeverityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i) != null;
            }
        }

        DiagnosticEventsSeverity(int i) {
            this.value = i;
        }
    }

    public enum DiagnosticAdType implements com.google.protobuf.Internal.EnumLite {
        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType findValueByNumber(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(i);
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
        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            }
            if (i != 2) {
                return null;
            }
            return DIAGNOSTIC_AD_TYPE_BANNER;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DiagnosticAdTypeVerifier.INSTANCE;
        }

        private static final class DiagnosticAdTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DiagnosticAdTypeVerifier();

            private DiagnosticAdTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(i) != null;
            }
        }

        DiagnosticAdType(int i) {
            this.value = i;
        }
    }

    public static final class DiagnosticTag extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder {
        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag DEFAULT_INSTANCE;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> tagType_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType>() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType convert(java.lang.Integer num) {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(num.intValue());
                return diagnosticTagTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.UNRECOGNIZED : diagnosticTagTypeForNumber;
            }
        };
        private int bitField0_;
        private int tagTypeMemoizedSerializedSize;
        private java.lang.Object value_;
        private int valueCase_ = 0;
        private com.google.protobuf.Internal.IntList tagType_ = emptyIntList();
        private java.lang.String customTagType_ = "";

        private DiagnosticTag() {
        }

        public enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return STRING_VALUE;
                }
                if (i != 4) {
                    return null;
                }
                return INT_VALUE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        static {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag();
            DEFAULT_INSTANCE = diagnosticTag;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.class, diagnosticTag);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> getTagTypeList() {
            return new com.google.protobuf.Internal.ListAdapter(this.tagType_, tagType_converter_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType getTagType(int i) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(this.tagType_.getInt(i));
            return diagnosticTagTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.UNRECOGNIZED : diagnosticTagTypeForNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public java.util.List<java.lang.Integer> getTagTypeValueList() {
            return this.tagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeValue(int i) {
            return this.tagType_.getInt(i);
        }

        private void ensureTagTypeIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.tagType_;
            if (intList.isModifiable()) {
                return;
            }
            this.tagType_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagType(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagType(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> iterable) {
            ensureTagTypeIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagType() {
            this.tagType_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagTypeValue(int i, int i2) {
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagTypeValue(int i) {
            ensureTagTypeIsMutable();
            this.tagType_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagTypeValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureTagTypeIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().intValue());
            }
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasCustomTagType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public java.lang.String getCustomTagType() {
            return this.customTagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public com.google.protobuf.ByteString getCustomTagTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customTagType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagType(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = getDefaultInstance().getCustomTagType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagTypeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customTagType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 3;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public java.lang.String getStringValue() {
            return this.valueCase_ == 3 ? (java.lang.String) this.value_ : "";
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public com.google.protobuf.ByteString getStringValueBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.valueCase_ == 3 ? (java.lang.String) this.value_ : "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(java.lang.String str) {
            str.getClass();
            this.valueCase_ = 3;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 3;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getIntValue() {
            if (this.valueCase_ == 4) {
                return ((java.lang.Integer) this.value_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(int i) {
            this.valueCase_ = 4;
            this.value_ = java.lang.Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticTag);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getValueCase();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearValue() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).clearValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> getTagTypeList() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getTagTypeList();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeCount() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getTagTypeCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType getTagType(int i) {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getTagType(i);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setTagType(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setTagType(i, diagnosticTagType);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addTagType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).addTagType(diagnosticTagType);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addAllTagType(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).addAllTagType(iterable);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearTagType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).clearTagType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public java.util.List<java.lang.Integer> getTagTypeValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getTagTypeValueList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeValue(int i) {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getTagTypeValue(i);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setTagTypeValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setTagTypeValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addTagTypeValue(int i) {
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).addTagTypeValue(i);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addAllTagTypeValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).addAllTagTypeValue(iterable);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasCustomTagType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).hasCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public java.lang.String getCustomTagType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public com.google.protobuf.ByteString getCustomTagTypeBytes() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getCustomTagTypeBytes();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setCustomTagType(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setCustomTagType(str);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearCustomTagType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).clearCustomTagType();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setCustomTagTypeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setCustomTagTypeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasStringValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).hasStringValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public java.lang.String getStringValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getStringValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public com.google.protobuf.ByteString getStringValueBytes() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getStringValueBytes();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setStringValue(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setStringValue(str);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearStringValue() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).clearStringValue();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setStringValueBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setStringValueBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasIntValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).hasIntValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getIntValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).getIntValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setIntValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).setIntValue(i);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearIntValue() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag) this.instance).clearIntValue();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag();
                case 2:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000", new java.lang.Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.class) {
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

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$1, reason: invalid class name */
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

    public static final class DiagnosticEvent extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adType_;
        private int bitField0_;
        private int eventId_;
        private int eventType_;
        private boolean isHeaderBidding_;
        private double timeValue_;
        private gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps_;
        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> stringTags_ = com.google.protobuf.MapFieldLite.emptyMapField();
        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.Integer> intTags_ = com.google.protobuf.MapFieldLite.emptyMapField();
        private java.lang.String customEventType_ = "";
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String placementId_ = "";

        private DiagnosticEvent() {
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.eventType_);
            return diagnosticEventTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this.eventType_ = diagnosticEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasCustomEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.lang.String getCustomEventType() {
            return this.customEventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public com.google.protobuf.ByteString getCustomEventTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customEventType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventType(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = getDefaultInstance().getCustomEventType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventTypeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customEventType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimestamps() {
            return this.timestamps_ != null;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 != null && timestamps2 != gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps).buildPartial();
            } else {
                this.timestamps_ = timestamps;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimeValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public double getTimeValue() {
            return this.timeValue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeValue(double d) {
            this.bitField0_ |= 2;
            this.timeValue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeValue() {
            this.bitField0_ &= -3;
            this.timeValue_ = 0.0d;
        }

        private static final class StringTagsDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.STRING, "");

            private StringTagsDefaultEntryHolder() {
            }
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetStringTags() {
            return this.stringTags_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableStringTags() {
            if (!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getStringTagsCount() {
            return internalGetStringTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsStringTags(java.lang.String str) {
            str.getClass();
            return internalGetStringTags().containsKey(str);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, java.lang.String> getStringTags() {
            return getStringTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.util.Map<java.lang.String, java.lang.String> getStringTagsMap() {
            return java.util.Collections.unmodifiableMap(internalGetStringTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.lang.String getStringTagsOrDefault(java.lang.String str, java.lang.String str2) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> mapFieldLiteInternalGetStringTags = internalGetStringTags();
            return mapFieldLiteInternalGetStringTags.containsKey(str) ? mapFieldLiteInternalGetStringTags.get(str) : str2;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.lang.String getStringTagsOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> mapFieldLiteInternalGetStringTags = internalGetStringTags();
            if (!mapFieldLiteInternalGetStringTags.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLiteInternalGetStringTags.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, java.lang.String> getMutableStringTagsMap() {
            return internalGetMutableStringTags();
        }

        private static final class IntTagsDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.Integer> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.UINT32, 0);

            private IntTagsDefaultEntryHolder() {
            }
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.Integer> internalGetIntTags() {
            return this.intTags_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.Integer> internalGetMutableIntTags() {
            if (!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsCount() {
            return internalGetIntTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsIntTags(java.lang.String str) {
            str.getClass();
            return internalGetIntTags().containsKey(str);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, java.lang.Integer> getIntTags() {
            return getIntTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.util.Map<java.lang.String, java.lang.Integer> getIntTagsMap() {
            return java.util.Collections.unmodifiableMap(internalGetIntTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrDefault(java.lang.String str, int i) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, java.lang.Integer> mapFieldLiteInternalGetIntTags = internalGetIntTags();
            return mapFieldLiteInternalGetIntTags.containsKey(str) ? mapFieldLiteInternalGetIntTags.get(str).intValue() : i;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, java.lang.Integer> mapFieldLiteInternalGetIntTags = internalGetIntTags();
            if (!mapFieldLiteInternalGetIntTags.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLiteInternalGetIntTags.get(str).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, java.lang.Integer> getMutableIntTagsMap() {
            return internalGetMutableIntTags();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(int i) {
            this.eventId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasImpressionOpportunityId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public com.google.protobuf.ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.bitField0_ &= -5;
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasPlacementId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public java.lang.String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public com.google.protobuf.ByteString getPlacementIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.placementId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.bitField0_ &= -9;
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdTypeForNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(this.adType_);
            return diagnosticAdTypeForNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.UNRECOGNIZED : diagnosticAdTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdTypeValue(int i) {
            this.bitField0_ |= 16;
            this.adType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            this.adType_ = diagnosticAdType.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdType() {
            this.bitField0_ &= -17;
            this.adType_ = 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasIsHeaderBidding() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHeaderBidding(boolean z) {
            this.bitField0_ |= 32;
            this.isHeaderBidding_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHeaderBidding() {
            this.bitField0_ &= -33;
            this.isHeaderBidding_ = false;
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEvent);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventTypeValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getEventTypeValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setEventTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setEventTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getEventType();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setEventType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setEventType(diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearEventType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearEventType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasCustomEventType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.lang.String getCustomEventType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public com.google.protobuf.ByteString getCustomEventTypeBytes() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getCustomEventTypeBytes();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setCustomEventType(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setCustomEventType(str);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearCustomEventType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearCustomEventType();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setCustomEventTypeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setCustomEventTypeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimestamps() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasTimestamps();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getTimestamps();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setTimestamps(timestamps);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setTimestamps(builder.build());
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearTimestamps() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearTimestamps();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimeValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasTimeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public double getTimeValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getTimeValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setTimeValue(double d) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setTimeValue(d);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearTimeValue() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearTimeValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getStringTagsCount() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getStringTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsStringTags(java.lang.String str) {
                str.getClass();
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getStringTagsMap().containsKey(str);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearStringTags() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableStringTagsMap().clear();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder removeStringTags(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableStringTagsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, java.lang.String> getStringTags() {
                return getStringTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.util.Map<java.lang.String, java.lang.String> getStringTagsMap() {
                return java.util.Collections.unmodifiableMap(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getStringTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.lang.String getStringTagsOrDefault(java.lang.String str, java.lang.String str2) {
                str.getClass();
                java.util.Map<java.lang.String, java.lang.String> stringTagsMap = ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getStringTagsMap();
                return stringTagsMap.containsKey(str) ? stringTagsMap.get(str) : str2;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.lang.String getStringTagsOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, java.lang.String> stringTagsMap = ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getStringTagsMap();
                if (!stringTagsMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return stringTagsMap.get(str);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder putStringTags(java.lang.String str, java.lang.String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableStringTagsMap().put(str, str2);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder putAllStringTags(java.util.Map<java.lang.String, java.lang.String> map) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableStringTagsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsCount() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIntTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsIntTags(java.lang.String str) {
                str.getClass();
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIntTagsMap().containsKey(str);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearIntTags() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableIntTagsMap().clear();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder removeIntTags(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableIntTagsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, java.lang.Integer> getIntTags() {
                return getIntTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.util.Map<java.lang.String, java.lang.Integer> getIntTagsMap() {
                return java.util.Collections.unmodifiableMap(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIntTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrDefault(java.lang.String str, int i) {
                str.getClass();
                java.util.Map<java.lang.String, java.lang.Integer> intTagsMap = ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIntTagsMap();
                return intTagsMap.containsKey(str) ? intTagsMap.get(str).intValue() : i;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, java.lang.Integer> intTagsMap = ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIntTagsMap();
                if (!intTagsMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return intTagsMap.get(str).intValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder putIntTags(java.lang.String str, int i) {
                str.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableIntTagsMap().put(str, java.lang.Integer.valueOf(i));
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder putAllIntTags(java.util.Map<java.lang.String, java.lang.Integer> map) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getMutableIntTagsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventId() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getEventId();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setEventId(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setEventId(i);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearEventId() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearEventId();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasImpressionOpportunityId() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasPlacementId() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public java.lang.String getPlacementId() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public com.google.protobuf.ByteString getPlacementIdBytes() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getPlacementIdBytes();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setPlacementId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setPlacementId(str);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearPlacementId() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearPlacementId();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setPlacementIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasAdType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdTypeValue() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getAdTypeValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setAdTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setAdTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getAdType();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setAdType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setAdType(diagnosticAdType);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearAdType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearAdType();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasIsHeaderBidding() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).hasIsHeaderBidding();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean getIsHeaderBidding() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).getIsHeaderBidding();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder setIsHeaderBidding(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).setIsHeaderBidding(z);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder clearIsHeaderBidding() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent) this.instance).clearIsHeaderBidding();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent();
                case 2:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\t\u0004က\u0001\u00052\u00062\u0007\u0004\bည\u0002\tለ\u0003\nဌ\u0004\u000bဇ\u0005", new java.lang.Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.StringTagsDefaultEntryHolder.defaultEntry, "intTags_", gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.IntTagsDefaultEntryHolder.defaultEntry, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.class) {
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
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent();
            DEFAULT_INSTANCE = diagnosticEvent;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.class, diagnosticEvent);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DiagnosticEventRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder {
        public static final int BATCH_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest> PARSER;
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> batch_ = emptyProtobufList();

        private DiagnosticEventRequest() {
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> getBatchList() {
            return this.batch_;
        }

        public java.util.List<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder> getBatchOrBuilderList() {
            return this.batch_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public int getBatchCount() {
            return this.batch_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent getBatch(int i) {
            return this.batch_.get(i);
        }

        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder getBatchOrBuilder(int i) {
            return this.batch_.get(i);
        }

        private void ensureBatchIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> protobufList = this.batch_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.batch_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.set(i, diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(i, diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBatch(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> iterable) {
            ensureBatchIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.batch_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatch() {
            this.batch_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBatch(int i) {
            ensureBatchIsMutable();
            this.batch_.remove(i);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder> implements gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> getBatchList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).getBatchList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public int getBatchCount() {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).getBatchCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent getBatch(int i) {
                return ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).getBatch(i);
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder setBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).setBatch(i, diagnosticEvent);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder setBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).setBatch(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).addBatch(diagnosticEvent);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).addBatch(i, diagnosticEvent);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).addBatch(builder.build());
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).addBatch(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addAllBatch(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).addAllBatch(iterable);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder clearBatch() {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).clearBatch();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder removeBatch(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.instance).removeBatch(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest();
                case 2:
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"batch_", gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class) {
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
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest();
            DEFAULT_INSTANCE = diagnosticEventRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class, diagnosticEventRequest);
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
