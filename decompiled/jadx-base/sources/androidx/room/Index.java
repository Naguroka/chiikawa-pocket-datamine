package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Index {
    java.lang.String name() default "";

    boolean unique() default false;

    java.lang.String[] value();
}
