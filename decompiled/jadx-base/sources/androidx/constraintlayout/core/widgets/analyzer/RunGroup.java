package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun firstRun;
    int groupIndex;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> runs = new java.util.ArrayList<>();

    public RunGroup(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun, int i) {
        this.firstRun = null;
        this.lastRun = null;
        int i2 = index;
        this.groupIndex = i2;
        index = i2 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i;
    }

    public void add(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    private long traverseStart(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, long j) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.analyzer.Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    jMax = java.lang.Math.max(jMax, traverseStart(dependencyNode2, ((long) dependencyNode2.margin) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j + widgetRun.getWrapDimension();
        return java.lang.Math.max(java.lang.Math.max(jMax, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - ((long) widgetRun.end.margin));
    }

    private long traverseEnd(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, long j) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.analyzer.Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    jMin = java.lang.Math.min(jMin, traverseEnd(dependencyNode2, ((long) dependencyNode2.margin) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j - widgetRun.getWrapDimension();
        return java.lang.Math.min(java.lang.Math.min(jMin, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - ((long) widgetRun.start.margin));
    }

    public long computeWrapSize(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i) {
        long wrapDimension;
        int i2;
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = this.firstRun;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) {
            if (((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).orientation != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun)) {
            return 0L;
        }
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = i == 0 ? constraintWidgetContainer.horizontalRun.start : constraintWidgetContainer.verticalRun.start;
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = i == 0 ? constraintWidgetContainer.horizontalRun.end : constraintWidgetContainer.verticalRun.end;
        boolean zContains = this.firstRun.start.targets.contains(dependencyNode);
        boolean zContains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (zContains && zContains2) {
            long jTraverseStart = traverseStart(this.firstRun.start, 0L);
            long jTraverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j = jTraverseStart - wrapDimension2;
            if (j >= (-this.firstRun.end.margin)) {
                j += (long) this.firstRun.end.margin;
            }
            long j2 = ((-jTraverseEnd) - wrapDimension2) - ((long) this.firstRun.start.margin);
            if (j2 >= this.firstRun.start.margin) {
                j2 -= (long) this.firstRun.start.margin;
            }
            float biasPercent = this.firstRun.widget.getBiasPercent(i);
            float f = biasPercent > 0.0f ? (long) ((j2 / biasPercent) + (j / (1.0f - biasPercent))) : 0L;
            wrapDimension = ((long) this.firstRun.start.margin) + ((long) ((f * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f * (1.0f - biasPercent)) + 0.5f));
            i2 = this.firstRun.end.margin;
        } else {
            if (zContains) {
                return java.lang.Math.max(traverseStart(this.firstRun.start, this.firstRun.start.margin), ((long) this.firstRun.start.margin) + wrapDimension2);
            }
            if (zContains2) {
                return java.lang.Math.max(-traverseEnd(this.firstRun.end, this.firstRun.end.margin), ((long) (-this.firstRun.end.margin)) + wrapDimension2);
            }
            wrapDimension = ((long) this.firstRun.start.margin) + this.firstRun.getWrapDimension();
            i2 = this.firstRun.end.margin;
        }
        return wrapDimension - ((long) i2);
    }

    private boolean defineTerminalWidget(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun, int i) {
        if (!widgetRun.widget.isTerminalWidget[i]) {
            return false;
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : widgetRun.start.dependencies) {
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode.run != widgetRun && dependencyNode == dependencyNode.run.start) {
                    if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) {
                        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = ((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).widgets.iterator();
                        while (it.hasNext()) {
                            defineTerminalWidget(it.next(), i);
                        }
                    } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences)) {
                        widgetRun.widget.isTerminalWidget[i] = false;
                    }
                    defineTerminalWidget(dependencyNode.run, i);
                }
            }
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 : widgetRun.end.dependencies) {
            if (dependency2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency2;
                if (dependencyNode2.run != widgetRun && dependencyNode2 == dependencyNode2.run.start) {
                    if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) {
                        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it2 = ((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).widgets.iterator();
                        while (it2.hasNext()) {
                            defineTerminalWidget(it2.next(), i);
                        }
                    } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences)) {
                        widgetRun.widget.isTerminalWidget[i] = false;
                    }
                    defineTerminalWidget(dependencyNode2.run, i);
                }
            }
        }
        return false;
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
        if (z) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z2) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
