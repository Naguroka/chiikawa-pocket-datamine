package com.google.protobuf;

/* JADX INFO: compiled from: ValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ValueKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ValueKt {
    public static final com.google.protobuf.ValueKt INSTANCE = new com.google.protobuf.ValueKt();

    /* JADX INFO: compiled from: ValueKt.kt */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020/H\u0001J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000201J\u0006\u00103\u001a\u000201J\u0006\u00104\u001a\u000201J\u0006\u00105\u001a\u000201J\u0006\u00106\u001a\u000201J\u0006\u00107\u001a\u000201J\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u00020\u0006J\u0006\u0010:\u001a\u00020\u0006J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u0006\u0010=\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Value$Builder;", "(Lcom/google/protobuf/Value$Builder;)V", "value", "", "boolValue", "getBoolValue", "()Z", "setBoolValue", "(Z)V", "kindCase", "Lcom/google/protobuf/Value$KindCase;", "getKindCase", "()Lcom/google/protobuf/Value$KindCase;", "Lcom/google/protobuf/ListValue;", "listValue", "getListValue", "()Lcom/google/protobuf/ListValue;", "setListValue", "(Lcom/google/protobuf/ListValue;)V", "Lcom/google/protobuf/NullValue;", "nullValue", "getNullValue", "()Lcom/google/protobuf/NullValue;", "setNullValue", "(Lcom/google/protobuf/NullValue;)V", "", "numberValue", "getNumberValue", "()D", "setNumberValue", "(D)V", "", "stringValue", "getStringValue", "()Ljava/lang/String;", "setStringValue", "(Ljava/lang/String;)V", "Lcom/google/protobuf/Struct;", "structValue", "getStructValue", "()Lcom/google/protobuf/Struct;", "setStructValue", "(Lcom/google/protobuf/Struct;)V", "_build", "Lcom/google/protobuf/Value;", "clearBoolValue", "", "clearKind", "clearListValue", "clearNullValue", "clearNumberValue", "clearStringValue", "clearStructValue", "hasBoolValue", "hasListValue", "hasNullValue", "hasNumberValue", "hasStringValue", "hasStructValue", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.ValueKt.Dsl.Companion INSTANCE = new com.google.protobuf.ValueKt.Dsl.Companion(null);
        private final com.google.protobuf.Value.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Value.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Value.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: ValueKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ValueKt$Dsl;", "builder", "Lcom/google/protobuf/Value$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.ValueKt.Dsl _create(com.google.protobuf.Value.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.ValueKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Value _build() {
            com.google.protobuf.Value valueBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild, "_builder.build()");
            return valueBuild;
        }

        public final com.google.protobuf.NullValue getNullValue() {
            com.google.protobuf.NullValue nullValue = this._builder.getNullValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final void setNullValue(com.google.protobuf.NullValue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNullValue(value);
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final void setNumberValue(double d) {
            this._builder.setNumberValue(d);
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final java.lang.String getStringValue() {
            java.lang.String stringValue = this._builder.getStringValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final void setStringValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStringValue(value);
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final void setBoolValue(boolean z) {
            this._builder.setBoolValue(z);
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final com.google.protobuf.Struct getStructValue() {
            com.google.protobuf.Struct structValue = this._builder.getStructValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final void setStructValue(com.google.protobuf.Struct value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStructValue(value);
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final com.google.protobuf.ListValue getListValue() {
            com.google.protobuf.ListValue listValue = this._builder.getListValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final void setListValue(com.google.protobuf.ListValue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setListValue(value);
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final com.google.protobuf.Value.KindCase getKindCase() {
            com.google.protobuf.Value.KindCase kindCase = this._builder.getKindCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final void clearKind() {
            this._builder.clearKind();
        }
    }

    private ValueKt() {
    }
}
