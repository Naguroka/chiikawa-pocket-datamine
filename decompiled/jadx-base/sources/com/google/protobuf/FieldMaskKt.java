package com.google.protobuf;

/* JADX INFO: compiled from: FieldMaskKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldMaskKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FieldMaskKt {
    public static final com.google.protobuf.FieldMaskKt INSTANCE = new com.google.protobuf.FieldMaskKt();

    /* JADX INFO: compiled from: FieldMaskKt.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0001J%\u0010\r\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0010J+\u0010\u0011\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0007¢\u0006\u0002\b\u0014J\u001d\u0010\u0015\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b\u0016J&\u0010\u0017\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b\u0018J,\u0010\u0017\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0087\n¢\u0006\u0002\b\u0019J.\u0010\u001a\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl;", "", "_builder", "Lcom/google/protobuf/FieldMask$Builder;", "(Lcom/google/protobuf/FieldMask$Builder;)V", "paths", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/google/protobuf/FieldMaskKt$Dsl$PathsProxy;", "getPaths", "()Lcom/google/protobuf/kotlin/DslList;", "_build", "Lcom/google/protobuf/FieldMask;", "add", "", "value", "addPaths", "addAll", "values", "", "addAllPaths", "clear", "clearPaths", "plusAssign", "plusAssignPaths", "plusAssignAllPaths", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "setPaths", "Companion", "PathsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.FieldMaskKt.Dsl.Companion INSTANCE = new com.google.protobuf.FieldMaskKt.Dsl.Companion(null);
        private final com.google.protobuf.FieldMask.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.FieldMask.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.FieldMask.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldMaskKt$Dsl;", "builder", "Lcom/google/protobuf/FieldMask$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.FieldMaskKt.Dsl _create(com.google.protobuf.FieldMask.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.FieldMaskKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.FieldMask _build() {
            com.google.protobuf.FieldMask fieldMaskBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fieldMaskBuild, "_builder.build()");
            return fieldMaskBuild;
        }

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldMaskKt$Dsl$PathsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class PathsProxy extends com.google.protobuf.kotlin.DslProxy {
            private PathsProxy() {
            }
        }

        public final com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> getPaths() {
            java.util.List<java.lang.String> pathsList = this._builder.getPathsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathsList, "_builder.getPathsList()");
            return new com.google.protobuf.kotlin.DslList<>(pathsList);
        }

        public final /* synthetic */ void addPaths(com.google.protobuf.kotlin.DslList dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addPaths(value);
        }

        public final /* synthetic */ void plusAssignPaths(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> dslList, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addPaths(dslList, value);
        }

        public final /* synthetic */ void addAllPaths(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllPaths(values);
        }

        public final /* synthetic */ void plusAssignAllPaths(com.google.protobuf.kotlin.DslList<java.lang.String, com.google.protobuf.FieldMaskKt.Dsl.PathsProxy> dslList, java.lang.Iterable<java.lang.String> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllPaths(dslList, values);
        }

        public final /* synthetic */ void setPaths(com.google.protobuf.kotlin.DslList dslList, int i, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPaths(i, value);
        }

        public final /* synthetic */ void clearPaths(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearPaths();
        }
    }

    private FieldMaskKt() {
    }
}
