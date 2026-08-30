package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    int margin;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun run;
    public int value;
    public androidx.constraintlayout.core.widgets.analyzer.Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;
    androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type type = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.UNKNOWN;
    int marginFactor = 1;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency marginDependency = null;
    public boolean resolved = false;
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> dependencies = new java.util.ArrayList();
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> targets = new java.util.ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        this.run = widgetRun;
    }

    public java.lang.String toString() {
        return this.run.widget.getDebugName() + ":" + this.type + "(" + (this.resolved ? java.lang.Integer.valueOf(this.value) : "unresolved") + ") <t=" + this.targets.size() + ":d=" + this.dependencies.size() + ">";
    }

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

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> it = this.targets.iterator();
        while (it.hasNext()) {
            if (!it.next().resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.run.update(this);
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = null;
        int i = 0;
        for (androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 : this.targets) {
            if (!(dependencyNode2 instanceof androidx.constraintlayout.core.widgets.analyzer.DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.resolved) {
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency = this.marginDependency;
            if (dimensionDependency != null) {
                if (!dimensionDependency.resolved) {
                    return;
                } else {
                    this.margin = this.marginFactor * this.marginDependency.value;
                }
            }
            resolve(dependencyNode.value + this.margin);
        }
        androidx.constraintlayout.core.widgets.analyzer.Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }

    public void addDependency(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        this.dependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public java.lang.String name() {
        java.lang.String str;
        java.lang.String debugName = this.run.widget.getDebugName();
        if (this.type == androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT || this.type == androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        return str + ":" + this.type.name();
    }

    public void clear() {
        this.targets.clear();
        this.dependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }
}
