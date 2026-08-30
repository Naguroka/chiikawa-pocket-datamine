package androidx.window.embedding;

/* JADX INFO: compiled from: MatcherUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areActivityOrIntentComponentsMatching", "activity", "Landroid/app/Activity;", "ruleComponent", "Landroid/content/ComponentName;", "areActivityOrIntentComponentsMatching$window_release", "areComponentsMatching", "activityComponent", "areComponentsMatching$window_release", "wildcardMatch", "name", "pattern", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MatcherUtils {
    public static final androidx.window.embedding.MatcherUtils INSTANCE = new androidx.window.embedding.MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final java.lang.String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName activityComponent, android.content.ComponentName ruleComponent) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(ruleComponent.getPackageName(), androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES) && kotlin.jvm.internal.Intrinsics.areEqual(ruleComponent.getClassName(), androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
        }
        java.lang.String string = activityComponent.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityComponent.toString()");
        if (!(!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null))) {
            throw new java.lang.IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(activityComponent.getPackageName(), ruleComponent.getPackageName())) {
            z = true;
        } else {
            java.lang.String packageName = activityComponent.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "activityComponent.packageName");
            java.lang.String packageName2 = ruleComponent.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName2, "ruleComponent.packageName");
            if (wildcardMatch(packageName, packageName2)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(activityComponent.getClassName(), ruleComponent.getClassName())) {
            z2 = true;
        } else {
            java.lang.String className = activityComponent.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "activityComponent.className");
            java.lang.String className2 = ruleComponent.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "ruleComponent.className");
            if (wildcardMatch(className, className2)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z && z2;
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(android.app.Activity activity, android.content.ComponentName ruleComponent) {
        android.content.ComponentName component;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    private final boolean wildcardMatch(java.lang.String name, java.lang.String pattern) {
        java.lang.String str = pattern;
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null)) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(pattern, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (!(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) == kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(pattern, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null))) {
            throw new java.lang.IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        java.lang.String strSubstring = pattern.substring(0, pattern.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return kotlin.text.StringsKt.startsWith$default(name, strSubstring, false, 2, (java.lang.Object) null);
    }
}
