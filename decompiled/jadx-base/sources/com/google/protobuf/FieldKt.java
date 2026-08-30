package com.google.protobuf;

/* JADX INFO: compiled from: FieldKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FieldKt {
    public static final com.google.protobuf.FieldKt INSTANCE = new com.google.protobuf.FieldKt();

    /* JADX INFO: compiled from: FieldKt.kt */
    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 P2\u00020\u0001:\u0002PQB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u000207H\u0001J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0006\u0010;\u001a\u000209J\u0006\u0010<\u001a\u000209J\u0006\u0010=\u001a\u000209J\u0006\u0010>\u001a\u000209J\u0006\u0010?\u001a\u000209J\u0006\u0010@\u001a\u000209J\u0006\u0010A\u001a\u000209J%\u0010B\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010\u0005\u001a\u00020)H\u0007¢\u0006\u0002\bCJ+\u0010D\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020)0FH\u0007¢\u0006\u0002\bGJ\u001d\u0010H\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0007¢\u0006\u0002\bIJ&\u0010J\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010\u0005\u001a\u00020)H\u0087\n¢\u0006\u0002\bKJ,\u0010J\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020)0FH\u0087\n¢\u0006\u0002\bLJ.\u0010M\u001a\u000209*\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020)H\u0087\u0002¢\u0006\u0002\bOR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8F¢\u0006\u0006\u001a\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011¨\u0006R"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Field$Builder;", "(Lcom/google/protobuf/Field$Builder;)V", "value", "Lcom/google/protobuf/Field$Cardinality;", "cardinality", "getCardinality", "()Lcom/google/protobuf/Field$Cardinality;", "setCardinality", "(Lcom/google/protobuf/Field$Cardinality;)V", "", "defaultValue", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "jsonName", "getJsonName", "setJsonName", "Lcom/google/protobuf/Field$Kind;", "kind", "getKind", "()Lcom/google/protobuf/Field$Kind;", "setKind", "(Lcom/google/protobuf/Field$Kind;)V", "name", "getName", "setName", "", "number", "getNumber", "()I", "setNumber", "(I)V", "oneofIndex", "getOneofIndex", "setOneofIndex", "options", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", "getOptions", "()Lcom/google/protobuf/kotlin/DslList;", "", "packed", "getPacked", "()Z", "setPacked", "(Z)V", "typeUrl", "getTypeUrl", "setTypeUrl", "_build", "Lcom/google/protobuf/Field;", "clearCardinality", "", "clearDefaultValue", "clearJsonName", "clearKind", "clearName", "clearNumber", "clearOneofIndex", "clearPacked", "clearTypeUrl", "add", "addOptions", "addAll", "values", "", "addAllOptions", "clear", "clearOptions", "plusAssign", "plusAssignOptions", "plusAssignAllOptions", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setOptions", "Companion", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.FieldKt.Dsl.Companion INSTANCE = new com.google.protobuf.FieldKt.Dsl.Companion(null);
        private final com.google.protobuf.Field.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Field.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Field.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: FieldKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldKt$Dsl;", "builder", "Lcom/google/protobuf/Field$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.FieldKt.Dsl _create(com.google.protobuf.Field.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.FieldKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Field _build() {
            com.google.protobuf.Field fieldBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fieldBuild, "_builder.build()");
            return fieldBuild;
        }

        public final com.google.protobuf.Field.Kind getKind() {
            com.google.protobuf.Field.Kind kind = this._builder.getKind();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kind, "_builder.getKind()");
            return kind;
        }

        public final void setKind(com.google.protobuf.Field.Kind value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setKind(value);
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final com.google.protobuf.Field.Cardinality getCardinality() {
            com.google.protobuf.Field.Cardinality cardinality = this._builder.getCardinality();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final void setCardinality(com.google.protobuf.Field.Cardinality value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCardinality(value);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final java.lang.String getName() {
            java.lang.String name = this._builder.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        public final void setName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final java.lang.String getTypeUrl() {
            java.lang.String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final void setTypeUrl(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTypeUrl(value);
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final void setOneofIndex(int i) {
            this._builder.setOneofIndex(i);
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        /* JADX INFO: compiled from: FieldKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class OptionsProxy extends com.google.protobuf.kotlin.DslProxy {
            private OptionsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getOptions() {
            java.util.List<com.google.protobuf.Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optionsList, "_builder.getOptionsList()");
            return new com.google.protobuf.kotlin.DslList(optionsList);
        }

        public final /* synthetic */ void addOptions(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void plusAssignOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.FieldKt.Dsl.OptionsProxy> dslList, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void addAllOptions(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void plusAssignAllOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.FieldKt.Dsl.OptionsProxy> dslList, java.lang.Iterable<com.google.protobuf.Option> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void setOptions(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOptions(i, value);
        }

        public final /* synthetic */ void clearOptions(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final java.lang.String getJsonName() {
            java.lang.String jsonName = this._builder.getJsonName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        public final void setJsonName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setJsonName(value);
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final java.lang.String getDefaultValue() {
            java.lang.String defaultValue = this._builder.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        public final void setDefaultValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDefaultValue(value);
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }
    }

    private FieldKt() {
    }
}
