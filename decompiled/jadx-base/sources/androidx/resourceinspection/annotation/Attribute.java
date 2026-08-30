package androidx.resourceinspection.annotation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface Attribute {

    @java.lang.annotation.Target({})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IntMap {
        int mask() default 0;

        java.lang.String name();

        int value();
    }

    androidx.resourceinspection.annotation.Attribute.IntMap[] intMapping() default {};

    java.lang.String value();
}
