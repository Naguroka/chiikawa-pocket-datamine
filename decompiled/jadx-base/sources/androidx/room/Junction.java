package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Junction {
    java.lang.String entityColumn() default "";

    java.lang.String parentColumn() default "";

    java.lang.Class<?> value();
}
