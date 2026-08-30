package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Database {
    java.lang.Class<?>[] entities();

    boolean exportSchema() default true;

    int version();

    java.lang.Class<?>[] views() default {};
}
