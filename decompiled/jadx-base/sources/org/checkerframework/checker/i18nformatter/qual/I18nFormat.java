package org.checkerframework.checker.i18nformatter.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.i18nformatter.qual.I18nUnknownFormat.class})
public @interface I18nFormat {
    org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] value();
}
