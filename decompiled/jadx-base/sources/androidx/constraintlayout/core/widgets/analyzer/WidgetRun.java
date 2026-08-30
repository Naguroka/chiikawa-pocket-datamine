package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    protected androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public int matchConstraintsType;
    androidx.constraintlayout.core.widgets.analyzer.RunGroup runGroup;
    androidx.constraintlayout.core.widgets.ConstraintWidget widget;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimension = new androidx.constraintlayout.core.widgets.analyzer.DimensionDependency(this);
    public int orientation = 0;
    boolean resolved = false;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode start = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode(this);
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode end = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode(this);
    protected androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType mRunType = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    abstract void apply();

    abstract void applyToWidget();

    abstract void clear();

    abstract void reset();

    abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    protected void updateRunEnd(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    protected void updateRunStart(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    public WidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.widget = constraintWidget;
    }

    public boolean isDimensionResolved() {
        return this.dimension.resolved;
    }

    public boolean isCenterConnection() {
        int size = this.start.targets.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.start.targets.get(i2).run != this) {
                i++;
            }
        }
        int size2 = this.end.targets.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.end.targets.get(i3).run != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public long wrapSize(int i) {
        int i2;
        if (!this.dimension.resolved) {
            return 0L;
        }
        long j = this.dimension.value;
        if (isCenterConnection()) {
            i2 = this.start.margin - this.end.margin;
        } else if (i == 0) {
            i2 = this.start.margin;
        } else {
            return j - ((long) this.end.margin);
        }
        return j + ((long) i2);
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintAnchor.mTarget.mOwner;
        int i = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor.mTarget.mType.ordinal()];
        if (i == 1) {
            return constraintWidget.horizontalRun.start;
        }
        if (i == 2) {
            return constraintWidget.horizontalRun.end;
        }
        if (i == 3) {
            return constraintWidget.verticalRun.start;
        }
        if (i == 4) {
            return constraintWidget.verticalRun.baseline;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.verticalRun.end;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    protected void updateRunCenter(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i) {
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode target = getTarget(constraintAnchor);
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            if (!this.dimension.resolved && this.dimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i, i2);
            }
            if (this.dimension.resolved) {
                if (this.dimension.value == i2) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
                float horizontalBiasPercent = i == 0 ? constraintWidget.getHorizontalBiasPercent() : constraintWidget.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.dimension.value) * horizontalBiasPercent)));
                this.end.resolve(this.start.value + this.dimension.value);
            }
        }
    }

    private void resolveDimension(int i, int i2) {
        int i3;
        int i4 = this.matchConstraintsType;
        if (i4 == 0) {
            this.dimension.resolve(getLimitedDimension(i2, i));
            return;
        }
        if (i4 == 1) {
            this.dimension.resolve(java.lang.Math.min(getLimitedDimension(this.dimension.wrapValue, i), i2));
            return;
        }
        if (i4 == 2) {
            androidx.constraintlayout.core.widgets.ConstraintWidget parent = this.widget.getParent();
            if (parent != null) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = i == 0 ? parent.horizontalRun : parent.verticalRun;
                if (widgetRun.dimension.resolved) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
                    this.dimension.resolve(getLimitedDimension((int) ((widgetRun.dimension.value * (i == 0 ? constraintWidget.mMatchConstraintPercentWidth : constraintWidget.mMatchConstraintPercentHeight)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 3) {
            return;
        }
        if (this.widget.horizontalRun.dimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.widget.horizontalRun.matchConstraintsType == 3 && this.widget.verticalRun.dimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.widget.verticalRun.matchConstraintsType == 3) {
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.widget;
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun2 = i == 0 ? constraintWidget2.verticalRun : constraintWidget2.horizontalRun;
        if (widgetRun2.dimension.resolved) {
            float dimensionRatio = this.widget.getDimensionRatio();
            if (i == 1) {
                i3 = (int) ((widgetRun2.dimension.value / dimensionRatio) + 0.5f);
            } else {
                i3 = (int) ((dimensionRatio * widgetRun2.dimension.value) + 0.5f);
            }
            this.dimension.resolve(i3);
        }
    }

    protected final int getLimitedDimension(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            int i3 = this.widget.mMatchConstraintMaxWidth;
            iMax = java.lang.Math.max(this.widget.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                iMax = java.lang.Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            int i4 = this.widget.mMatchConstraintMaxHeight;
            iMax = java.lang.Math.max(this.widget.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                iMax = java.lang.Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i) {
        if (constraintAnchor.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintAnchor.mTarget.mOwner;
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = i == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int i2 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor.mTarget.mType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2, int i) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.margin = i;
        dependencyNode2.dependencies.add(dependencyNode);
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2, int i, androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.targets.add(this.dimension);
        dependencyNode.marginFactor = i;
        dependencyNode.marginDependency = dimensionDependency;
        dependencyNode2.dependencies.add(dependencyNode);
        dimensionDependency.dependencies.add(dependencyNode);
    }

    public long getWrapDimension() {
        if (this.dimension.resolved) {
            return this.dimension.value;
        }
        return 0L;
    }

    public boolean isResolved() {
        return this.resolved;
    }
}
