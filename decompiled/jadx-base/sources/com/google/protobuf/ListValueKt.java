package com.google.protobuf;

/* JADX INFO: compiled from: ListValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ListValueKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ListValueKt {
    public static final com.google.protobuf.ListValueKt INSTANCE = new com.google.protobuf.ListValueKt();

    /* JADX INFO: compiled from: ListValueKt.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0001J%\u0010\r\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0010J+\u0010\u0011\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b\u0015J&\u0010\u0016\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b\u0017J,\u0010\u0016\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0087\n¢\u0006\u0002\b\u0018J.\u0010\u0019\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl;", "", "_builder", "Lcom/google/protobuf/ListValue$Builder;", "(Lcom/google/protobuf/ListValue$Builder;)V", "values", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Value;", "Lcom/google/protobuf/ListValueKt$Dsl$ValuesProxy;", "getValues", "()Lcom/google/protobuf/kotlin/DslList;", "_build", "Lcom/google/protobuf/ListValue;", "add", "", "value", "addValues", "addAll", "", "addAllValues", "clear", "clearValues", "plusAssign", "plusAssignValues", "plusAssignAllValues", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "setValues", "Companion", "ValuesProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.ListValueKt.Dsl.Companion INSTANCE = new com.google.protobuf.ListValueKt.Dsl.Companion(null);
        private final com.google.protobuf.ListValue.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.ListValue.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.ListValue.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: ListValueKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ListValueKt$Dsl;", "builder", "Lcom/google/protobuf/ListValue$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.ListValueKt.Dsl _create(com.google.protobuf.ListValue.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.ListValueKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.ListValue _build() {
            com.google.protobuf.ListValue listValueBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        /* JADX INFO: compiled from: ListValueKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl$ValuesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class ValuesProxy extends com.google.protobuf.kotlin.DslProxy {
            private ValuesProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getValues() {
            java.util.List<com.google.protobuf.Value> valuesList = this._builder.getValuesList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valuesList, "_builder.getValuesList()");
            return new com.google.protobuf.kotlin.DslList(valuesList);
        }

        public final /* synthetic */ void addValues(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Value value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addValues(value);
        }

        public final /* synthetic */ void plusAssignValues(com.google.protobuf.kotlin.DslList<com.google.protobuf.Value, com.google.protobuf.ListValueKt.Dsl.ValuesProxy> dslList, com.google.protobuf.Value value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addValues(dslList, value);
        }

        public final /* synthetic */ void addAllValues(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllValues(values);
        }

        public final /* synthetic */ void plusAssignAllValues(com.google.protobuf.kotlin.DslList<com.google.protobuf.Value, com.google.protobuf.ListValueKt.Dsl.ValuesProxy> dslList, java.lang.Iterable<com.google.protobuf.Value> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllValues(dslList, values);
        }

        public final /* synthetic */ void setValues(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Value value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setValues(i, value);
        }

        public final /* synthetic */ void clearValues(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearValues();
        }
    }

    private ListValueKt() {
    }
}
