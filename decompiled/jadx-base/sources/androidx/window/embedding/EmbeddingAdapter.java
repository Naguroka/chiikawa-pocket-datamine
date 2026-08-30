package androidx.window.embedding;

/* JADX INFO: compiled from: EmbeddingAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J*\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0082\u0002¢\u0006\u0002\u0010 J*\u0010!\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0082\u0002¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "()V", "translate", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "translateActivityIntentPredicates", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "Landroid/content/Intent;", "splitPairFilters", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateIntentPredicates", "translateParentMetricsPredicate", "Landroid/view/WindowMetrics;", "splitRule", "Landroidx/window/embedding/SplitRule;", "component1", "F", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EmbeddingAdapter {
    public final java.util.List<androidx.window.embedding.SplitInfo> translate(java.util.List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        java.util.List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    private final androidx.window.embedding.SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean zIsEmpty;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (java.lang.NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        java.util.List activities = primaryActivityStack.getActivities();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        androidx.window.embedding.ActivityStack activityStack = new androidx.window.embedding.ActivityStack(activities, zIsEmpty);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (java.lang.NoSuchMethodError unused2) {
        }
        java.util.List activities2 = secondaryActivityStack.getActivities();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new androidx.window.embedding.SplitInfo(activityStack, new androidx.window.embedding.ActivityStack(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    public final java.util.function.Predicate<android.util.Pair<android.app.Activity, android.app.Activity>> translateActivityPairPredicates(final java.util.Set<androidx.window.embedding.SplitPairFilter> splitPairFilters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new java.util.function.Predicate() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda4
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.window.embedding.EmbeddingAdapter.m472translateActivityPairPredicates$lambda1(this.f$0, splitPairFilters, (android.util.Pair) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: translateActivityPairPredicates$lambda-1, reason: not valid java name */
    public static final boolean m472translateActivityPairPredicates$lambda1(androidx.window.embedding.EmbeddingAdapter this$0, java.util.Set splitPairFilters, android.util.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        android.app.Activity activity = (android.app.Activity) this$0.component1(pair);
        android.app.Activity activity2 = (android.app.Activity) this$0.component2(pair);
        java.util.Set set = splitPairFilters;
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((androidx.window.embedding.SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.function.Predicate<android.util.Pair<android.app.Activity, android.content.Intent>> translateActivityIntentPredicates(final java.util.Set<androidx.window.embedding.SplitPairFilter> splitPairFilters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new java.util.function.Predicate() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.window.embedding.EmbeddingAdapter.m471translateActivityIntentPredicates$lambda3(this.f$0, splitPairFilters, (android.util.Pair) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: translateActivityIntentPredicates$lambda-3, reason: not valid java name */
    public static final boolean m471translateActivityIntentPredicates$lambda3(androidx.window.embedding.EmbeddingAdapter this$0, java.util.Set splitPairFilters, android.util.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        android.app.Activity activity = (android.app.Activity) this$0.component1(pair);
        android.content.Intent intent = (android.content.Intent) this$0.component2(pair);
        java.util.Set set = splitPairFilters;
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((androidx.window.embedding.SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.function.Predicate<android.view.WindowMetrics> translateParentMetricsPredicate(final androidx.window.embedding.SplitRule splitRule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new java.util.function.Predicate() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.window.embedding.EmbeddingAdapter.m475translateParentMetricsPredicate$lambda4(splitRule, (android.view.WindowMetrics) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: translateParentMetricsPredicate$lambda-4, reason: not valid java name */
    public static final boolean m475translateParentMetricsPredicate$lambda4(androidx.window.embedding.SplitRule splitRule, android.view.WindowMetrics windowMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitRule, "$splitRule");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    public final java.util.function.Predicate<android.app.Activity> translateActivityPredicates(final java.util.Set<androidx.window.embedding.ActivityFilter> activityFilters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new java.util.function.Predicate() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.window.embedding.EmbeddingAdapter.m473translateActivityPredicates$lambda6(activityFilters, (android.app.Activity) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: translateActivityPredicates$lambda-6, reason: not valid java name */
    public static final boolean m473translateActivityPredicates$lambda6(java.util.Set activityFilters, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        java.util.Set<androidx.window.embedding.ActivityFilter> set = activityFilters;
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        for (androidx.window.embedding.ActivityFilter activityFilter : set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.function.Predicate<android.content.Intent> translateIntentPredicates(final java.util.Set<androidx.window.embedding.ActivityFilter> activityFilters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new java.util.function.Predicate() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda3
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.window.embedding.EmbeddingAdapter.m474translateIntentPredicates$lambda8(activityFilters, (android.content.Intent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: translateIntentPredicates$lambda-8, reason: not valid java name */
    public static final boolean m474translateIntentPredicates$lambda8(java.util.Set activityFilters, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        java.util.Set<androidx.window.embedding.ActivityFilter> set = activityFilters;
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        for (androidx.window.embedding.ActivityFilter activityFilter : set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Set<androidx.window.extensions.embedding.EmbeddingRule> translate(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "rules");
        java.util.Set<? extends androidx.window.embedding.EmbeddingRule> set = rules;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        for (androidx.window.embedding.EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof androidx.window.embedding.SplitPairRule) {
                androidx.window.embedding.SplitPairRule splitPairRule = (androidx.window.embedding.SplitPairRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((androidx.window.embedding.SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof androidx.window.embedding.SplitPlaceholderRule) {
                androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule = (androidx.window.embedding.SplitPlaceholderRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((androidx.window.embedding.SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof androidx.window.embedding.ActivityRule) {
                androidx.window.embedding.ActivityRule activityRule = (androidx.window.embedding.ActivityRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new java.lang.IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) splitPairRuleBuild);
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    private final <F, S> F component1(android.util.Pair<F, S> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(android.util.Pair<F, S> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S) pair.second;
    }
}
