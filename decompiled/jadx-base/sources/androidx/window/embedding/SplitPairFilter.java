package androidx.window.embedding;

/* JADX INFO: compiled from: SplitPairFilter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitPairFilter {
    private final android.content.ComponentName primaryActivityName;
    private final java.lang.String secondaryActivityIntentAction;
    private final android.content.ComponentName secondaryActivityName;

    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    public SplitPairFilter(android.content.ComponentName primaryActivityName, android.content.ComponentName secondaryActivityName, java.lang.String str) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        java.lang.String str2;
        boolean z4;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivityName, "primaryActivityName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        java.lang.String packageName = primaryActivityName.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "primaryActivityName.packageName");
        java.lang.String className = primaryActivityName.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "primaryActivityName.className");
        java.lang.String packageName2 = secondaryActivityName.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName2, "secondaryActivityName.packageName");
        java.lang.String className2 = secondaryActivityName.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "secondaryActivityName.className");
        java.lang.String str4 = packageName;
        boolean z5 = true;
        if (str4.length() == 0) {
            z = false;
        } else {
            if (packageName2.length() == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("Package name must not be empty".toString());
        }
        java.lang.String str5 = className;
        if (str5.length() == 0) {
            z2 = false;
        } else {
            if (className2.length() == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            throw new java.lang.IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str4, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) == packageName.length() - 1)) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null)) {
            i = 2;
            if (kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str5, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) != className.length() - 1) {
                z3 = false;
            }
            if (z3) {
                throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
            str2 = packageName2;
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, i, (java.lang.Object) null) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) == packageName2.length() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            str3 = className2;
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, i, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) != className2.length() - 1) {
                z5 = false;
            }
            if (z5) {
                throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
        }
        i = 2;
        z3 = true;
        if (z3) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        str2 = packageName2;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, i, (java.lang.Object) null)) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z4) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        str3 = className2;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, i, (java.lang.Object) null)) {
            z5 = false;
        }
        if (z5) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public final android.content.ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final android.content.ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final java.lang.String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    public final boolean matchesActivityPair(android.app.Activity primaryActivity, android.app.Activity secondaryActivity) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivity, "secondaryActivity");
        boolean z2 = androidx.window.embedding.MatcherUtils.INSTANCE.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && androidx.window.embedding.MatcherUtils.INSTANCE.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z2;
        }
        if (z2) {
            android.content.Intent intent = secondaryActivity.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "secondaryActivity.intent");
            z = matchesActivityIntentPair(primaryActivity, intent);
        }
        return z;
    }

    public final boolean matchesActivityIntentPair(android.app.Activity primaryActivity, android.content.Intent secondaryActivityIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivityIntent, "secondaryActivityIntent");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) || !androidx.window.embedding.MatcherUtils.INSTANCE.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        java.lang.String str = this.secondaryActivityIntentAction;
        return str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, secondaryActivityIntent.getAction());
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitPairFilter)) {
            return false;
        }
        androidx.window.embedding.SplitPairFilter splitPairFilter = (androidx.window.embedding.SplitPairFilter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public int hashCode() {
        int iHashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        java.lang.String str = this.secondaryActivityIntentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((java.lang.Object) this.secondaryActivityIntentAction) + '}';
    }
}
