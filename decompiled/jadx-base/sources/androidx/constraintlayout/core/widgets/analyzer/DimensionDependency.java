package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
class DimensionDependency extends androidx.constraintlayout.core.widgets.analyzer.DependencyNode {
    public int wrapValue;

    public DimensionDependency(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun) {
            this.type = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.type = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i;
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : this.dependencies) {
            dependency.update(dependency);
        }
    }
}
