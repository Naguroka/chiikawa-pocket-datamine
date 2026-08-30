package com.google.protobuf;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TypeKt {
    public static final com.google.protobuf.TypeKt INSTANCE = new com.google.protobuf.TypeKt();

    /* JADX INFO: compiled from: TypeKt.kt */
    @kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 H2\u00020\u0001:\u0004HIJKB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0001J\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020(J\u0006\u0010*\u001a\u00020(J\u0006\u0010+\u001a\u00020,J%\u0010-\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0002\b.J%\u0010-\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u000b\u001a\u00020\u0016H\u0007¢\u0006\u0002\b/J%\u0010-\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\b0J+\u00101\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703H\u0007¢\u0006\u0002\b4J+\u00101\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001603H\u0007¢\u0006\u0002\b5J+\u00101\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\f03H\u0007¢\u0006\u0002\b6J\u001d\u00107\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b8J\u001d\u00107\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0006H\u0007¢\u0006\u0002\b9J\u001d\u00107\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0006H\u0007¢\u0006\u0002\b:J&\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b<J,\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703H\u0087\n¢\u0006\u0002\b=J&\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u000b\u001a\u00020\u0016H\u0087\n¢\u0006\u0002\b>J,\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001603H\u0087\n¢\u0006\u0002\b?J&\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087\n¢\u0006\u0002\b@J,\u0010;\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\f03H\u0087\n¢\u0006\u0002\bAJ.\u0010B\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010C\u001a\u00020D2\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\bEJ.\u0010B\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010C\u001a\u00020D2\u0006\u0010\u000b\u001a\u00020\u0016H\u0087\u0002¢\u0006\u0002\bFJ.\u0010B\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010C\u001a\u00020D2\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\bGR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006L"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Type$Builder;", "(Lcom/google/protobuf/Type$Builder;)V", "fields", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Field;", "Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "getFields", "()Lcom/google/protobuf/kotlin/DslList;", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "oneofs", "Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "getOneofs", "options", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "getOptions", "Lcom/google/protobuf/SourceContext;", "sourceContext", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "Lcom/google/protobuf/Syntax;", "syntax", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "_build", "Lcom/google/protobuf/Type;", "clearName", "", "clearSourceContext", "clearSyntax", "hasSourceContext", "", "add", "addFields", "addOptions", "addOneofs", "addAll", "values", "", "addAllFields", "addAllOptions", "addAllOneofs", "clear", "clearFields", "clearOptions", "clearOneofs", "plusAssign", "plusAssignFields", "plusAssignAllFields", "plusAssignOptions", "plusAssignAllOptions", "plusAssignOneofs", "plusAssignAllOneofs", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "setFields", "setOptions", "setOneofs", "Companion", "FieldsProxy", "OneofsProxy", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.TypeKt.Dsl.Companion INSTANCE = new com.google.protobuf.TypeKt.Dsl.Companion(null);
        private final com.google.protobuf.Type.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Type.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Type.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/TypeKt$Dsl;", "builder", "Lcom/google/protobuf/Type$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.TypeKt.Dsl _create(com.google.protobuf.Type.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.TypeKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Type _build() {
            com.google.protobuf.Type typeBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeBuild, "_builder.build()");
            return typeBuild;
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

        /* JADX INFO: compiled from: TypeKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class FieldsProxy extends com.google.protobuf.kotlin.DslProxy {
            private FieldsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getFields() {
            java.util.List<com.google.protobuf.Field> fieldsList = this._builder.getFieldsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fieldsList, "_builder.getFieldsList()");
            return new com.google.protobuf.kotlin.DslList(fieldsList);
        }

        public final /* synthetic */ void addFields(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Field value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addFields(value);
        }

        public final /* synthetic */ void plusAssignFields(com.google.protobuf.kotlin.DslList<com.google.protobuf.Field, com.google.protobuf.TypeKt.Dsl.FieldsProxy> dslList, com.google.protobuf.Field value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addFields(dslList, value);
        }

        public final /* synthetic */ void addAllFields(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllFields(values);
        }

        public final /* synthetic */ void plusAssignAllFields(com.google.protobuf.kotlin.DslList<com.google.protobuf.Field, com.google.protobuf.TypeKt.Dsl.FieldsProxy> dslList, java.lang.Iterable<com.google.protobuf.Field> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllFields(dslList, values);
        }

        public final /* synthetic */ void setFields(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Field value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFields(i, value);
        }

        public final /* synthetic */ void clearFields(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearFields();
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class OneofsProxy extends com.google.protobuf.kotlin.DslProxy {
            private OneofsProxy() {
            }
        }

        public final com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.TypeKt.Dsl.OneofsProxy> getOneofs() {
            java.util.List<java.lang.String> oneofsList = this._builder.getOneofsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oneofsList, "_builder.getOneofsList()");
            return new com.google.protobuf.kotlin.DslList<>(oneofsList);
        }

        public final /* synthetic */ void addOneofs(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addOneofs(value);
        }

        public final /* synthetic */ void plusAssignOneofs(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.TypeKt.Dsl.OneofsProxy> dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addOneofs(dslList, value);
        }

        public final /* synthetic */ void addAllOneofs(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllOneofs(values);
        }

        public final /* synthetic */ void plusAssignAllOneofs(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.TypeKt.Dsl.OneofsProxy> dslList, java.lang.Iterable<java.lang.String> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllOneofs(dslList, values);
        }

        public final /* synthetic */ void setOneofs(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOneofs(i, value);
        }

        public final /* synthetic */ void clearOneofs(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOneofs();
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

        public final /* synthetic */ void plusAssignOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.TypeKt.Dsl.OptionsProxy> dslList, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void addAllOptions(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void plusAssignAllOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.TypeKt.Dsl.OptionsProxy> dslList, java.lang.Iterable<com.google.protobuf.Option> values) {
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

        public final com.google.protobuf.SourceContext getSourceContext() {
            com.google.protobuf.SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final void setSourceContext(com.google.protobuf.SourceContext value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final com.google.protobuf.Syntax getSyntax() {
            com.google.protobuf.Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final void setSyntax(com.google.protobuf.Syntax value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }
    }

    private TypeKt() {
    }
}
