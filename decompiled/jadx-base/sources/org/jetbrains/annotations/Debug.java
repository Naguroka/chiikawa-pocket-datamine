package org.jetbrains.annotations;

/* JADX INFO: loaded from: classes6.dex */
public final class Debug {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Renderer {
        java.lang.String childrenArray() default "";

        java.lang.String hasChildren() default "";

        java.lang.String text() default "";
    }

    private Debug() {
        throw new java.lang.AssertionError("Debug should not be instantiated");
    }
}
