package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface VersionedParcelize {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    java.lang.Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    java.lang.String jetifyAs() default "";
}
