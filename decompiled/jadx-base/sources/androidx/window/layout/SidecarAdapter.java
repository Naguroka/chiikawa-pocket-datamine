package androidx.window.layout;

/* JADX INFO: compiled from: SidecarAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0002J(\u0010\f\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0014J\u0018\u0010\u0010\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\bJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "(Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "isEqualSidecarDeviceState", "", "first", "Landroidx/window/sidecar/SidecarDeviceState;", "second", "isEqualSidecarDisplayFeature", "Landroidx/window/sidecar/SidecarDisplayFeature;", "isEqualSidecarDisplayFeatures", "", "isEqualSidecarWindowLayoutInfo", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "translate", "Landroidx/window/layout/DisplayFeature;", "feature", "deviceState", "translate$window_release", "Landroidx/window/layout/WindowLayoutInfo;", "extensionInfo", "state", "sidecarDisplayFeatures", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SidecarAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarAdapter.Companion INSTANCE = new androidx.window.layout.SidecarAdapter.Companion(null);
    private static final java.lang.String TAG = "SidecarAdapter";
    private final androidx.window.core.SpecificationComputer.VerificationMode verificationMode;

    /* JADX WARN: Multi-variable type inference failed */
    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SidecarAdapter(androidx.window.core.SpecificationComputer.VerificationMode verificationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(androidx.window.core.SpecificationComputer.VerificationMode verificationMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.window.core.SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }

    public final java.util.List<androidx.window.layout.DisplayFeature> translate(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures, androidx.window.sidecar.SidecarDeviceState deviceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            androidx.window.layout.DisplayFeature displayFeatureTranslate$window_release = translate$window_release((androidx.window.sidecar.SidecarDisplayFeature) it.next(), deviceState);
            if (displayFeatureTranslate$window_release != null) {
                arrayList.add(displayFeatureTranslate$window_release);
            }
        }
        return arrayList;
    }

    public final androidx.window.layout.WindowLayoutInfo translate(androidx.window.sidecar.SidecarWindowLayoutInfo extensionInfo, androidx.window.sidecar.SidecarDeviceState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        if (extensionInfo == null) {
            return new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList());
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new androidx.window.layout.WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(extensionInfo), sidecarDeviceState));
    }

    public final boolean isEqualSidecarDeviceState(androidx.window.sidecar.SidecarDeviceState first, androidx.window.sidecar.SidecarDeviceState second) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        return companion.getSidecarDevicePosture$window_release(first) == companion.getSidecarDevicePosture$window_release(second);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(androidx.window.sidecar.SidecarWindowLayoutInfo first, androidx.window.sidecar.SidecarWindowLayoutInfo second) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(first), companion.getSidecarDisplayFeatures(second));
    }

    private final boolean isEqualSidecarDisplayFeatures(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> first, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!isEqualSidecarDisplayFeature(first.get(i), second.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    private final boolean isEqualSidecarDisplayFeature(androidx.window.sidecar.SidecarDisplayFeature first, androidx.window.sidecar.SidecarDisplayFeature second) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(first.getRect(), second.getRect());
    }

    public final androidx.window.layout.DisplayFeature translate$window_release(androidx.window.sidecar.SidecarDisplayFeature feature, androidx.window.sidecar.SidecarDeviceState deviceState) {
        androidx.window.layout.HardwareFoldingFeature.Type fold;
        androidx.window.layout.FoldingFeature.State state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        androidx.window.core.SpecificationComputer.Companion companion = androidx.window.core.SpecificationComputer.INSTANCE;
        java.lang.String TAG2 = TAG;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) androidx.window.core.SpecificationComputer.Companion.startSpecification$default(companion, feature, TAG2, this.verificationMode, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", new kotlin.jvm.functions.Function1<androidx.window.sidecar.SidecarDisplayFeature, java.lang.Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(require, "$this$require");
                boolean z = true;
                if (require.getType() != 1 && require.getType() != 2) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).require("Feature bounds must not be 0", new kotlin.jvm.functions.Function1<androidx.window.sidecar.SidecarDisplayFeature, java.lang.Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(require, "$this$require");
                return java.lang.Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
            }
        }).require("TYPE_FOLD must have 0 area", new kotlin.jvm.functions.Function1<androidx.window.sidecar.SidecarDisplayFeature, java.lang.Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(require, "$this$require");
                boolean z = true;
                if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).require("Feature be pinned to either left or top", new kotlin.jvm.functions.Function1<androidx.window.sidecar.SidecarDisplayFeature, java.lang.Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(require, "$this$require");
                return java.lang.Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
            }
        }).compute();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int sidecarDevicePosture$window_release = INSTANCE.getSidecarDevicePosture$window_release(deviceState);
        if (sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1) {
            return null;
        }
        if (sidecarDevicePosture$window_release == 2) {
            state = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
        } else {
            if (sidecarDevicePosture$window_release != 3 && sidecarDevicePosture$window_release == 4) {
                return null;
            }
            state = androidx.window.layout.FoldingFeature.State.FLAT;
        }
        android.graphics.Rect rect = feature.getRect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new androidx.window.layout.HardwareFoldingFeature(new androidx.window.core.Bounds(rect), fold, state);
    }

    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getRawSidecarDevicePosture", "", "sidecarDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "getSidecarDevicePosture", "getSidecarDevicePosture$window_release", "getSidecarDisplayFeatures", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "info", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "setSidecarDevicePosture", "", "posture", "setSidecarDisplayFeatures", "displayFeatures", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.List<androidx.window.sidecar.SidecarDisplayFeature> getSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
            try {
                try {
                    java.util.List<androidx.window.sidecar.SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
                } catch (java.lang.NoSuchFieldError unused) {
                    java.lang.Object objInvoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new java.lang.Class[0]).invoke(info, new java.lang.Object[0]);
                    if (objInvoke != null) {
                        return (java.util.List) objInvoke;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }

        public final void setSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(info, displayFeatures);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        public final int getSidecarDevicePosture$window_release(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        public final int getRawSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                try {
                    java.lang.Object objInvoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", new java.lang.Class[0]).invoke(sidecarDeviceState, new java.lang.Object[0]);
                    if (objInvoke != null) {
                        return ((java.lang.Integer) objInvoke).intValue();
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final void setSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int posture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = posture;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(posture));
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
    }
}
