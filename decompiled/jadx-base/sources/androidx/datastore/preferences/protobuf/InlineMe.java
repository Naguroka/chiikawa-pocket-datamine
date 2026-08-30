package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
@interface InlineMe {
    java.lang.String[] imports() default {};

    java.lang.String replacement();

    java.lang.String[] staticImports() default {};
}
