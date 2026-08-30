package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Insert {
    java.lang.Class<?> entity() default java.lang.Object.class;

    int onConflict() default 3;
}
