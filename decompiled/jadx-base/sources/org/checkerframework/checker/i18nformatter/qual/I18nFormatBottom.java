package org.checkerframework.checker.i18nformatter.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.TargetLocations({org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_LOWER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_UPPER_BOUND})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.LOWER_BOUND})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.i18nformatter.qual.I18nFormat.class, org.checkerframework.checker.i18nformatter.qual.I18nInvalidFormat.class, org.checkerframework.checker.i18nformatter.qual.I18nFormatFor.class})
public @interface I18nFormatBottom {
}
