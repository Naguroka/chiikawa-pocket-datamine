package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface DatabaseView {
    java.lang.String value() default "";

    java.lang.String viewName() default "";
}
