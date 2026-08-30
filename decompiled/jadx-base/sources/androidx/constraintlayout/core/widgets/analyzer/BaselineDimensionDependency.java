package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
class BaselineDimensionDependency extends androidx.constraintlayout.core.widgets.analyzer.DimensionDependency {
    public BaselineDimensionDependency(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        super(widgetRun);
    }

    public void update(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode) {
        ((androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) this.run).baseline.margin = this.run.widget.getBaselineDistance();
        this.resolved = true;
    }
}
